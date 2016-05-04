package io.paprika.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class PaprikaClass extends Entity{
    private PaprikaApp paprikaApp;
    private PaprikaClass parent;
    //parent name to cover library case
    private String parentName;
    private int complexity;
    private int children;
    private Set<PaprikaClass> coupled;
    private Set<PaprikaMethod> paprikaMethods;
    private Set<PaprikaVariable> paprikaVariables;
    private Set<PaprikaClass> interfaces;
    private boolean isInterface;
    private ArrayList<String> interfacesNames;
    private PaprikaModifiers modifier ;
    private boolean isAppDelegate;
    private boolean isViewController;
    private int numberOfLinesOfCode;



    public Set<PaprikaVariable> getPaprikaVariables() {
        return paprikaVariables;
    }

    public Set<PaprikaMethod> getPaprikaMethods() {
        return paprikaMethods;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    private PaprikaClass(String name, PaprikaApp paprikaApp) {
        this.setName(name);
        this.paprikaApp = paprikaApp;
        this.complexity = 0;
        this.children = 0;
        this.paprikaMethods  = new HashSet<>(0);
        this.paprikaVariables = new HashSet<>(0);
        this.coupled = new HashSet<>();
        this.interfaces = new HashSet<>();
        this.interfacesNames = new ArrayList<>(0);
        this.isInterface = false;
        this.parentName = null;
        this.modifier = PaprikaModifiers.PUBLIC; // The default visibility is Public
        numberOfLinesOfCode=0;
        //check if it's a ViewController or an AppDelegate
        this.isViewController=false;
        this.isViewController=false;
        String lowerCaseName = name.toLowerCase();
        if(name.contains("viewcontroller")){
            this.isViewController=true;
        }else{
            if(lowerCaseName.contains("appdelegate")){
                this.isAppDelegate=true;
            }
        }

        //TODO add the private class case
    }

    public static PaprikaClass createPaprikaClass(String name, PaprikaApp paprikaApp) {
        PaprikaClass paprikaClass = new PaprikaClass(name, paprikaApp);
        paprikaApp.addPaprikaClass(paprikaClass);
        return paprikaClass;
    }

    public PaprikaClass getParent() {
        return parent;
    }

    public Set<PaprikaClass> getInterfaces(){ return interfaces;}

    public void setParent(PaprikaClass parent) {
        this.parent = parent;
    }

    public void addPaprikaMethod(PaprikaMethod paprikaMethod){
        paprikaMethods.add(paprikaMethod);
    }

    public PaprikaApp getPaprikaApp() {
        return paprikaApp;
    }

    public void setPaprikaApp(PaprikaApp paprikaApp) {
        this.paprikaApp = paprikaApp;
    }

    public void addComplexity(int value){
        complexity += value;
    }

    public void addChildren() { children += 1;}

    public int getComplexity() {
        return complexity;
    }

    public int getChildren() { return children; }

    public void coupledTo(PaprikaClass paprikaClass){
        if(paprikaClass!= this)
        {
            coupled.add(paprikaClass);
        }
    }

    public void implement(PaprikaClass paprikaClass){ interfaces.add(paprikaClass);}

    public int getCouplingValue(){ return coupled.size();}

    public int computeLCOM(){
        Object methods[] = paprikaMethods.toArray();
        int methodCount = methods.length;
        int haveFieldInCommon = 0;
        int noFieldInCommon  = 0;
        for(int i=0; i< methodCount;i++){
            for(int j=i+1; j < methodCount; j++){
                if( ((PaprikaMethod) methods[i]).haveCommonFields((PaprikaMethod) methods[j])){
                    haveFieldInCommon++;
                }else{
                    noFieldInCommon++;
                }
            }
        }
        int LCOM =  noFieldInCommon - haveFieldInCommon;
        return LCOM > 0 ? LCOM : 0;
    }

    public void addPaprikaVariable(PaprikaVariable paprikaVariable) {
        paprikaVariables.add(paprikaVariable);
    }

    public PaprikaVariable findVariable(String name){
        // First we are looking to the field declared by this class (any modifiers)
        for (PaprikaVariable paprikaVariable : paprikaVariables){
            if (paprikaVariable.getName().equals(name)) return paprikaVariable;
        }
        //otherwise we return null
        return null;
    }

    public ArrayList<String> getInterfacesNames() {
        return interfacesNames;
    }
    public void setInterfacesNames(ArrayList<String> list) {
        this.interfacesNames= list;
    }
    public void addInterfaceName(String name) {
        this.interfacesNames.add(name);
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean anInterface) {
        isInterface = anInterface;
    }


    public PaprikaModifiers getModifier() {
        return modifier;
    }

    public void setModifier(PaprikaModifiers modifier) {
        this.modifier = modifier;
    }

    public int getNumberOfLinesOfCode() {
        return numberOfLinesOfCode;
    }

    public void setNumberOfLinesOfCode(int numberOfLinesOfCode) {
        this.numberOfLinesOfCode = numberOfLinesOfCode;
    }

    public boolean isAppDelegate() {
        return isAppDelegate;
    }

    public boolean isViewController() {
        return isViewController;
    }
}
