package com.company;

/**
 * Created by admin on 11/1/2019.
 */
public class BuilderUser {
    private int id;
    private String name;
    private String pass;
    private String address;
    private int number;
    private int age ;
public BuilderUser(){}
    public int getId() {
        return id;
    }

    public BuilderUser setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BuilderUser setName(String name) {
        this.name = name;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public BuilderUser setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public BuilderUser setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public BuilderUser setNumber(int number) {
        this.number = number;
        return this;
    }

    public int getAge() {
        return age;
    }

    public BuilderUser setAge(int age) {
        this.age = age;
        return this;
    }
}


