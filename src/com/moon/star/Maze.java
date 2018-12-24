package com.moon.star;

import javax.security.auth.callback.Callback;
import java.util.Stack;

public class Maze {
    public static void main(String[] args){
        System.out.print(aFunc(100));
    }
    public static  long aFunc(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return aFunc(n - 1) + aFunc(n - 2);
        }
    }
}
