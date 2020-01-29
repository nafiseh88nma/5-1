package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);

        BuilderUser builderUser= new BuilderUser();
        System.out.println("id:");
        builderUser.setId(scanner.nextInt());
        System.out.println("name:");
        builderUser.setName(scanner.nextLine());
        System.out.println("password:");
        builderUser.setPass(scanner.nextLine());
        System.out.println("address:");
        builderUser.setAddress(scanner.nextLine());
        System.out.println("number:");
        builderUser.setNumber(scanner.nextInt());
        System.out.println("age:");
        builderUser.setAge(scanner.nextInt());

        System.out.println(builderUser.getId());
        System.out.println(builderUser.getName());
        System.out.println(builderUser.getPass());
        System.out.println(builderUser.getNumber());
        System.out.println(builderUser.getAddress());
        System.out.println(builderUser.getAge());
    }
}
