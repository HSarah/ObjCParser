package io.paprika.model;

import org.neo4j.graphdb.Label;

/**
 * Created by Sarra on 24/03/2016.
 */
public enum Elements implements Label {
    Class, Method, Argument, Variable, ExternalClass, ExternalMethod, ExternalArgument;
}
