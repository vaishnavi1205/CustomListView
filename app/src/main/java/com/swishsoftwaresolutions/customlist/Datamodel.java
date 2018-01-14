package com.swishsoftwaresolutions.customlist;

/**
 * Created by DELL on 1/4/2018.
 */

public class Datamodel {
    String name;
    String type;

    public Datamodel(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
