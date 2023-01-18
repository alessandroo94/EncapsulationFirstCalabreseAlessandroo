package it.develhope;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.setAddress("Via Roma");
        house.setFloorsNumber(22);

        String[] resident = {"Alessando", "Pippo"};
        house.setResidentsNames(resident);

        System.out.println(String.format("Address: " + house.getAddress()));
        System.out.println(String.format("Floors Number: " + house.getFloorsNumber()));
        System.out.println(String.format("Resident: " + Arrays.toString(house.getResidentsNames())));
    }
}
