package com.company;

public class Main {

    public static void main(String[] args) {

        Country objectA = new Country(198,5000000,ClimateType.MODERATE);
        Capital objectB = new Capital(68, 80000,ClimateType.DRY,4, "Bishkek");
        Capital objectC = new Capital(65, 30000,ClimateType.DRY,6, "Osh" ,
                1264,"Bakytbekov");

        objectA.getInfo();
        objectB.getInfo();
        objectC.getInfo();
        objectA.CountrysArea("Kazakhstan", 365);
        objectB.HavingDistricts(4,"Bishkek");
    }
}
