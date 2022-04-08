package Hw;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("1");
        stringList.add("a");
        stringList.add("阿");
        stringList.add("あ");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
