package com.pluralsihght;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder address = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please provide the following formation: ");

        System.out.print("Full name: ");
        address.append(scan.nextLine());
        address.append("\n\nBilling Address:\n");

        System.out.print("Billing Street: ");
        address.append(scan.nextLine());
        address.append("\n");

        System.out.print("Billing City: ");
        address.append(scan.nextLine());
        address.append(", ");

        System.out.print("Billing State: ");
        address.append(scan.nextLine());
        address.append(" ");

        System.out.print("Billing Zip: ");
        address.append(scan.nextLine());
        address.append("\n\nShipping Address:\n");


        String addressString = address.toString();
        System.out.println(addressString);
    }
}