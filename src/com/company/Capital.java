package com.company;

public final class Capital extends Country {
    private int yearOfFoundation;
    private String nameOfMayor;

    public Capital(double area, int population, ClimateType climateType, int districts, String name) {
        super(area, population, climateType, districts, name);
    }

    public Capital(double area, int population, ClimateType climateType, int districts,
                   String name, int yearOfFoundation, String nameOfMayor) {
        super(area, population, climateType, districts, name);
        this.yearOfFoundation = yearOfFoundation;
        this.nameOfMayor = nameOfMayor;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public String getNameOfMayor() {
        return nameOfMayor;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" "+getNameOfMayor()+ " "+ getYearOfFoundation());
    }
}
