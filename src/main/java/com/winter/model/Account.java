package com.winter.model;

//http://blog.csdn.net/forezp/article/details/70833629
public class Account {

    private int id ;
    private String name ;
    private double money;

    public Account() {
    }

    public Account(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
