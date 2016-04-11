package io.paprika.model;

/*import paprika.metrics.Metric;
import paprika.metrics.UnaryMetric;*/

import java.util.*;

/**
 * Created by Geoffrey Hecht on 20/05/14.
 */
public abstract class Entity extends java.util.Observable {
    protected String name;
    protected boolean resolved=true;//By default the entity is resolved
  //  protected List<Metric> metrics = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public List<Metric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
    }

    public void addMetric(UnaryMetric unaryMetric){
        this.metrics.add(unaryMetric);
    }*/

    @Override
    public String toString() {
        return name;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }


}
