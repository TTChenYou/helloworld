package Hw;

/* 这是一个公民类的定义程序
 * 程序的名字是：Citizen.java
 */

import java.util.*;

public class Citizen {
    //以下声明成员变量（属性）
    String name;
    String alias;
    String sex;
    Date birthday;  //这是一个日期类的成员变量
    String homeland;
    String ID;

    public Citizen(String name, String alias, String sex, Date birthday, String homeland, String ID) {
        this.name = name;
        this.alias = alias;
        this.sex = sex;
        this.birthday = birthday;
        this.homeland = homeland;
        this.ID = ID;
    }

    /**
     * 名字的取得
     *
     * @return 名字
     */
    //以下定义成员方法（行为）
    public String getName()  //获取名字方法
    {        //getName()方法体开始
        return name;   //返回名字
    }        //getName()方法体结束

    /***下边是设置名字方法***/
    /**
     * 名字的设定
     *
     * @param name 名字
     */
    public void setName(String name) {       //setName()方法体开始
        this.name = name;
    }      //setName()方法体结束

    /***下边是列出所有属性方法***/
    public void displayAll() {     //displayAll()方法体开始
        System.out.println("姓名：" + name);
        System.out.println("别名：" + alias);
        System.out.println("性别：" + sex);
        System.out.println("出生：" + birthday.toString());
        System.out.println("出生地：" + homeland);
        System.out.println("身份标识：" + ID);
    }   //displayAll()方法体结束
}
