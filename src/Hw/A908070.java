package Hw;

import java.util.Date;

public class A908070 {
    public static void main(String[] args) {
        Citizen p1=new Citizen("丽柔","温一刀","女",new Date(),"中国上海","410105651230274x");
        Citizen p2=new Citizen("李明","","男",null,"南京","50110119850624273x");
        p2.alias="飞翔鸟";
        p2.birthday=new Date("6/24/85");
        p2.setName("李鸣");
        p1.displayAll();
        p2.displayAll();
    }



}
