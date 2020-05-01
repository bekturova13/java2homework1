package com.company;

public class Country extends CentralAsia {
    private int districts;
    private String name;

    public Country(double area, int population, ClimateType climateType) {
        super(area, population, climateType);
    }

    public Country(double area, int population, ClimateType climateType, int districts, String name) {
        super(area, population, climateType);
        this.districts = districts;
        this.name = name;
    }

    public int getDistricts() {
        return districts;
    }

    public String getName() {
        return name;
    }
 public void HavingDistricts(int getDistricts, String getName){
     System.out.println(" Country " +getName +" has " + getDistricts);
    }
    public final void CountrysArea(String getName, double getArea){
        System.out.println(" Country " +getName +" area = " +getArea +" districts");
    }
    public void getInfo(){
        System.out.println(getName()+" "+getArea()+" "+ " "+getPopulation()+" " +getClimateType()+ " "+ getDistricts()) ;
    }
}