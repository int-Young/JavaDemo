package com.yll.base;


import java.util.ArrayList;

public class MyTest{
    public static void main(String[] args) {
        Manager yll = new Manager("Yll", 1000);
        Member ls = new Member("ls", 0);
        Member lgx = new Member("ls", 0);
        Member yzc = new Member("yzc", 0);

        ArrayList<Integer> send = yll.send(3, 500);
        ls.receive(send);
        lgx.receive(send);
        yzc.receive(send);

        ls.show();
        lgx.show();
        yzc.show();
    }
}
