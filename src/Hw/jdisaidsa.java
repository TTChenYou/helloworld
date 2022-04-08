package Hw;

import java.util.ArrayList;
import java.util.List;

public class jdisaidsa {
    public static void main(String[] args) {
        {
            int i;
            boolean l = true;
            for (i = 2; i <= 100; i++) {
                l = true;
                for (int a = 2; a < i; a++) {
                    if (i % a == 0) {
                        l = false;
                        break;
                    }
                }
                if (l) {
                    System.out.println(i);
                }
            }
        }


        int i;
        for (int x = 2; x <= 100; x++) {
            for (i = 2; i <= x; i++){
                if (x % i == 0)
                    break;
            }
            if (i == x)
                System.out.println(x);
        }
    }


    /**
     * 判断startIndex-endIndex之间有多少个素数，并输出所有素数。
     *
     * @param startIndex 起始数
     * @param endIndex   中止数
     *
     * @return rightNumList 素数リスト
     */
    public List<Integer> test2(int startIndex, int endIndex) {
        // 起始数は１の場合、2に変更する。
        if (startIndex == 1)
            startIndex++;

        List<Integer> rightNumList = new ArrayList<Integer>();

        // 素数フラグの初期化
        boolean rightNumFlg = true;
        for (int i = startIndex; i <= endIndex; i++) {
            rightNumFlg = true;
            for (int j = 2; j < i; j++) {
                // 如果能被整除的情况下
                if(i % j == 0) {
                    // 素数フラグ变成false
                    rightNumFlg = false ;
                    break;
                }
            }
            if (rightNumFlg) {
                // 素数を出力する
                System.out.println(i);
                // 素数リストに插入
                rightNumList.add(i);
            }
        }
        return rightNumList;
    }

    public void int1(int a){}
    public void int1(){}
}



