package com.yll.base;

import java.util.ArrayList;

public class Manager extends User{

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int count,int totalMoney){
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney - totalMoney);

        int avg = totalMoney/count;
        int mod = totalMoney%count;//除不尽时候的余数
        for (int i=1;i<count;i++)
            redList.add(avg);
        //最后一个红包的特殊处理
        redList.add(avg + mod);

        return redList;
    }

}
