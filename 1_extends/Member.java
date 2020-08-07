package com.yll.base;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //随机获取索引编号
        int index = new Random().nextInt(list.size());
        int get_money = list.remove(index);
        super.setMoney(super.getMoney() + get_money);
    }

}
