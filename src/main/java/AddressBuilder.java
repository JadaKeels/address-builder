package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder address = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please provide the following formation: ");

        System.out.print("Full name: ");
        address.append("\n");
        address.append("===============================\n\n");
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

        System.out.print("Shipping Street: ");
        address.append(scan.nextLine());
        address.append("\n");

        System.out.print("Shipping City: ");
        address.append(scan.nextLine());
        address.append(", ");

        System.out.print("Shipping State: ");
        address.append(scan.nextLine());
        address.append(" ");

        System.out.print("Shipping Zip: ");
        address.append(scan.nextLine());


        String addressString = address.toString();
        System.out.println(addressString);
    }
}