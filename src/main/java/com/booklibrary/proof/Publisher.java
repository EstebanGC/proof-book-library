package com.booklibrary.proof;


public class Publisher {
    private String name;
    private String address;
    private String foundedYear;

    public Publisher(String name, String address, String foundedYear) {
        this.name = name;
        this.address = address;
        this.foundedYear = foundedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(String foundedYear) {
        this.foundedYear = foundedYear;
    }
}

