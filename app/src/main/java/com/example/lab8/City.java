package com.example.lab8;

public class City implements Comparable{

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

    @Override
    public int compareTo(Object O) {
        City city = (City) O;
        return this.city.compareTo(city.getCityName());
    }
    @Override
    public boolean equals(Object o){
        City city = (City) o;
        return this.getCityName().equals(city.getCityName()) && this.getProvinceName().equals(city.getProvinceName());
    }
}
