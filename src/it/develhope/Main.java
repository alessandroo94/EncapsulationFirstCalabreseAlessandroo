package it.develhope;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the residents name: ");
        house.setResidentsNames(input.nextLine().split(","));

        System.out.println("Enter the floors number: ");
        house.setFloorsNumber(input.nextInt());

        System.out.println("Enter the address: ");
        house.setAddress(input.next());


        System.out.println(String.format("Floors number: %d, Address: %s, Residents: %s",
                house.getFloorsNumber(), house.getAddress(), String.join(",", house.getResidentsNames())));
