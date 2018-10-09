package com.example.owner.androidapp1.model;

import java.util.ArrayList;
import java.util.List;

public class database {
    private List<location> locationBacking;
    private int locationSize;

    public database() {
        locationBacking = new ArrayList<>();
    }

    public void addLocation(location newLocation) {
        locationBacking.add(newLocation);
        locationSize++;
    }

    public List<location> getLocationBacking() {
        return locationBacking;
    }
}
