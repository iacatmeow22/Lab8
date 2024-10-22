package com.example.lab8;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares two strings
     * @param o
     * This is the candidate object to compare to
     * @return
     * Return true or false depending on equality of strings
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City cityEqual = (City) o;
        return city.equals(cityEqual.city) &&
                province.equals(cityEqual.province);
    }
}
