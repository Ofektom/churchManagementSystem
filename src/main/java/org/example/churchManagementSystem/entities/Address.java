package org.example.churchManagementSystem.entities;

import java.util.Objects;

public class Address {
    private Long homeNumber;
    private String streetName;
    private String city;
    private String State;
    private String Country;
    private String zipCode;

    public Address() {
    }

    public Address(Long homeNumber, String streetName, String city, String state, String country, String zipCode) {
        this.homeNumber = homeNumber;
        this.streetName = streetName;
        this.city = city;
        State = state;
        Country = country;
        this.zipCode = zipCode;
    }

    public Long getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Long homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNumber=" + homeNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(homeNumber, address.homeNumber) && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city) && Objects.equals(State, address.State) && Objects.equals(Country, address.Country) && Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeNumber, streetName, city, State, Country, zipCode);
    }
}
