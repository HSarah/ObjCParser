package io.paprika.model;

import java.util.ArrayList;
import java.util.List;


public class PaprikaApp extends Entity{

    private ArrayList<PaprikaClass> paprikaClasses;
    private ArrayList<PaprikaExternalClass> paprikaExternalClasses;
    private ArrayList<PaprikaGlobalVariable> paprikaGlobalVariables;
    private ArrayList<PaprikaFunction> paprikaFunctions;

    private PaprikaApp(String name) {
        this.name = name;
        paprikaClasses = new ArrayList<PaprikaClass>();
        paprikaExternalClasses = new ArrayList<PaprikaExternalClass>();
        paprikaGlobalVariables = new ArrayList<>();
        paprikaFunctions = new ArrayList<>();
    }


    public List<PaprikaExternalClass> getPaprikaExternalClasses() {
        return paprikaExternalClasses;
    }


    public void addPaprikaExternalClass(PaprikaExternalClass paprikaExternalClass){
        paprikaExternalClasses.add(paprikaExternalClass);
    }

    public ArrayList<PaprikaClass> getPaprikaClasses() {
        return paprikaClasses;
    }


    public void addPaprikaClass(PaprikaClass paprikaClass){
        paprikaClasses.add(paprikaClass);
    }

    public static PaprikaApp createPaprikaApp(String name) {
        return new PaprikaApp(name);
    }

    public ArrayList<PaprikaGlobalVariable> getPaprikaGlobalVariables() {
        return paprikaGlobalVariables;
    }

    public void addPaprikaGlobalVariable(PaprikaGlobalVariable paprikaGlobalVariable) {
        this.paprikaGlobalVariables.add(paprikaGlobalVariable);
    }

    public void setPaprikaExternalClasses(ArrayList<PaprikaExternalClass> paprikaExternalClasses) {
        this.paprikaExternalClasses = paprikaExternalClasses;
    }

    public void setPaprikaClasses(ArrayList<PaprikaClass> paprikaClasses) {
        this.paprikaClasses = paprikaClasses;
    }

    public void setPaprikaGlobalVariables(ArrayList<PaprikaGlobalVariable> paprikaGlobalVariables) {
        this.paprikaGlobalVariables = paprikaGlobalVariables;
    }

    public ArrayList<PaprikaFunction> getPaprikaFunctions() {
        return paprikaFunctions;
    }

    public void addPaprikaFunction(PaprikaFunction paprikaFunction) {
        this.paprikaFunctions.add(paprikaFunction);
    }
}
