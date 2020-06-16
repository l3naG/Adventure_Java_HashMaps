package com.lenagasparikova;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;
        this.exits.put("Q", 0);
    }

//    public void addExit(String description, int location) {
//        exits.put(description, location);
//    }

    public String getDescription() {
        return description;
    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }


}
