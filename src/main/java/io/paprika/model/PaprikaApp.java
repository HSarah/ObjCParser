package io.paprika.model;

import java.util.ArrayList;
import java.util.List;


public class PaprikaApp extends Entity{

    private List<PaprikaClass> paprikaClasses;
    private List<PaprikaExternalClass> paprikaExternalClasses;

    private PaprikaApp(String name) {
        this.name = name;
        paprikaClasses = new ArrayList<PaprikaClass>();
        paprikaExternalClasses = new ArrayList<PaprikaExternalClass>();
    }


    public List<PaprikaExternalClass> getPaprikaExternalClasses() {
        return paprikaExternalClasses;
    }


    public void addPaprikaExternalClass(PaprikaExternalClass paprikaExternalClass){
        paprikaExternalClasses.add(paprikaExternalClass);
    }

    public List<PaprikaClass> getPaprikaClasses() {
        return paprikaClasses;
    }


    public void addPaprikaClass(PaprikaClass paprikaClass){
        paprikaClasses.add(paprikaClass);
    }

    public static PaprikaApp createPaprikaApp(String name) {
        return new PaprikaApp(name);
    }



}
