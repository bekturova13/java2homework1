package com.company;

public class CentralAsia {
    private double area;
    private int population;

    public CentralAsia(double area, int population, ClimateType climateType) {
        this.area = area;
        this.population = population;
        this.climateType = climateType;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public ClimateType getClimateType() {
        return climateType;
    }

    private ClimateType climateType;

}
