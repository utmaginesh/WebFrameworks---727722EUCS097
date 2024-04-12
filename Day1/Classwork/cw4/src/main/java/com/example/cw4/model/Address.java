package com.example.cw4.model;

public class Address {
    public String name;
    public int doorNo;
    public String streetName;
    public int pincode;
    public String area;
    public String district;
    public String state;
    public String country;
    public Address(String name, int doorNo, String streetName, int pincode, String area, String district, String state, String country) {
        this.name = name;
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.pincode = pincode;
        this.area = area;
        this.district = district;
        this.state = state;
        this.country = country;
    }
}
