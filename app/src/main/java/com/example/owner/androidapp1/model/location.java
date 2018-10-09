package com.example.owner.androidapp1.model;


public class location {
    private String locationName;
    private locationType type;
    private double longitude;
    private double latitude;
    private String address;
    private String phoneNumber;

    public location(String locationName, locationType type, double longitude,
                    double latitude, String address, String phoneNumber) {
        this.locationName = locationName;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getLocationName() {
        return locationName;
    }

    public locationType getType() {
        return type;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
