package io.paprika.analyzer;

import io.paprika.metrics.*;
import io.paprika.model.*;

import java.util.HashMap;

/**
 * Created by Sarra on 02/05/2016.
 */
public class MetricsCalculator {



    public void calculateAppMetrics(PaprikaApp app)
    {
        NumberOfClasses.createNumberOfClasses(app, app.getPaprikaClasses().size());
        int numberOfInterfaces=0;
        for(PaprikaClass c: app.getPaprikaClasses()){
            if(c.isInterface()){
                numberOfInterfaces++;
            }
        }
        NumberOfInterfaces.createNumberOfInterfaces(app,numberOfInterfaces);
        for(PaprikaClass paprikaClass: app.getPaprikaClasses()){
            calculateClassMetrics(paprikaClass);
        }

        calculateGraphMetrics(app);
    }


    public void calculateClassMetrics(PaprikaClass paprikaClass){
        NumberOfMethods.createNumberOfMethods(paprikaClass, paprikaClass.getPaprikaMethods().size());
        NumberOfImplementedInterfaces.createNumberOfImplementedInterfaces(paprikaClass,
                paprikaClass.getInterfaces().size());
        NumberOfAttributes.createNumberOfAttributes(paprikaClass, paprikaClass.getPaprikaVariables().size());
        if(paprikaClass.isInterface())
        {
            IsInterface.createIsInterface(paprikaClass, true);
        }
        LackofCohesionInMethods.createLackofCohesionInMethods(paprikaClass);
        CouplingBetweenObjects.createCouplingBetweenObjects(paprikaClass);
        NumberOfChildren.createNumberOfChildren(paprikaClass);
        for(PaprikaMethod paprikaMethod: paprikaClass.getPaprikaMethods()){
            calculateMethodMetrics(paprikaMethod);
        }
        //this instruction must be called after the loop
        ClassComplexity.createClassComplexity(paprikaClass);
    }

    public void calculateMethodMetrics(PaprikaMethod paprikaMethod){
        NumberOfParameters.createNumberOfParameters(paprikaMethod, paprikaMethod.getArguments().size());
        if(!paprikaMethod.getFunction() && ! paprikaMethod.getPaprikaClass().isInterface()){
            int n = calculateNumberOfDeclaredLocals(paprikaMethod.getStatement());
            NumberOfDeclaredLocals.createNumberOfDeclaredLocals(paprikaMethod,n);
            NumberOfDirectCalls.createNumberOfDirectCalls(paprikaMethod, paprikaMethod.getCalledMethods().size());
        }else{
            NumberOfDirectCalls.createNumberOfDirectCalls(paprikaMethod,0);
            NumberOfDeclaredLocals.createNumberOfDeclaredLocals(paprikaMethod,0);
        }
        if(paprikaMethod.getPaprikaClass().isInterface()){
            IsAbstract.createIsAbstract(paprikaMethod, true);
        }
        //Checking if the method is a constructor
        if(paprikaMethod.getName().equals("init") || paprikaMethod.getName().equals("alloc")){
            IsInit.createIsInit(paprikaMethod, true);
        }
        String methodName;
        boolean isSetter =false;
        boolean isGetter=false;
        //Checking if the method is a setter or a getter
        methodName=paprikaMethod.getName();
        if(methodName.endsWith(":")){
            methodName= paprikaMethod.getName().replace(":","");
        }else{
            methodName=paprikaMethod.getName();
        }
        if(methodName.startsWith("set")) {
            methodName = methodName.replace("set", "");
        }
        for(PaprikaVariable paprikaVariable: paprikaMethod.getPaprikaClass().getPaprikaVariables()){

            if(methodName.equals(paprikaVariable.getName())){
                IsGetter.createIsGetter(paprikaMethod, isGetter);
                break;
            }

            if(methodName.equals(paprikaVariable.getName())){
                IsSetter.createIsSetter(paprikaMethod, isSetter);
                break;
            }

        }



        if(paprikaMethod.getStatic()){
            IsStatic.createIsStatic(paprikaMethod,true);
        }
        NumberOfCallers.createNumberOfCallers(paprikaMethod,0);
        NumberOfLines.createNumberOfLines(paprikaMethod,paprikaMethod.getNumberOfLines());
        CyclomaticComplexity.createCyclomaticComplexity(paprikaMethod, paprikaMethod.getCyclomaticComplexity());
        paprikaMethod.getPaprikaClass().addComplexity(paprikaMethod.getCyclomaticComplexity());
    }


    private int calculateNumberOfDeclaredLocals(PaprikaStatement statement){
        int n= 0 ;
        n= statement.getVariables().size();
        for(PaprikaStatement st : statement.getChildrenStatements()){
            n=+ calculateNumberOfDeclaredLocals(st);
        }

        return n;

    }

    private void calculateGraphMetrics(PaprikaApp app){
        HashMap<PaprikaMethod, Integer> numberOfCallers = new HashMap<>();
        Integer nb;
        for(PaprikaClass paprikaClass: app.getPaprikaClasses()){
            for (PaprikaMethod paprikaMethod: paprikaClass.getPaprikaMethods()){
                if(!numberOfCallers.containsKey(paprikaMethod)){
                    numberOfCallers.put(paprikaMethod,0);
                }

                for(Entity entity: paprikaMethod.getCalledMethods()){
                    if(entity instanceof PaprikaMethod){
                        nb=numberOfCallers.get((PaprikaMethod)entity);
                        if(nb==null){
                            numberOfCallers.put((PaprikaMethod)entity,1);
                        }else{
                            numberOfCallers.put((PaprikaMethod)entity,nb+1);
                        }
                    }
                }
            }
        }

        int depth;
        PaprikaClass paprikaClass2;
        for(PaprikaClass paprikaClass:app.getPaprikaClasses()){
            //calculate Depth Of Inheritance
            paprikaClass2=paprikaClass;
            depth=0;
            while(paprikaClass2.getParent() !=null){
                depth++;
                paprikaClass2=paprikaClass.getParent();
            }
            if(paprikaClass2.getParentName()!=null){
                depth++;
            }
            DepthOfInheritance.createDepthOfInheritance(paprikaClass,depth);
            //calculate number of callers
            for(PaprikaMethod paprikaMethod: paprikaClass.getPaprikaMethods()){
                NumberOfCallers.createNumberOfCallers(paprikaMethod,numberOfCallers.get(paprikaMethod));
            }
        }
    }
}
