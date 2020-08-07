package com.yll.base;

public class User {
    private String name;//姓名
    private int money;//余额

    public User(String name,int money){
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println(this.name+" has "+this.money+"$");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
