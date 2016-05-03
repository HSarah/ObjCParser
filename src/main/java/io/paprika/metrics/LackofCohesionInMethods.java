package io.paprika.metrics;

import io.paprika.model.PaprikaClass;

/**
 * Created by Geoffrey Hecht on 20/05/14.
 * LCOM2 (Chidamber et Kemerer 1991)
 */
public class LackofCohesionInMethods extends UnaryMetric<Integer> {

    private LackofCohesionInMethods(PaprikaClass paprikaClass) {
        this.value = paprikaClass.computeLCOM();
        this.entity = paprikaClass;
        this.name = "lack_of_cohesion_in_methods";
    }

    public static LackofCohesionInMethods createLackofCohesionInMethods(PaprikaClass paprikaClass) {
        LackofCohesionInMethods couplingBetweenObjects = new LackofCohesionInMethods(paprikaClass);
        couplingBetweenObjects.updateEntity();
        return couplingBetweenObjects;
    }
}
