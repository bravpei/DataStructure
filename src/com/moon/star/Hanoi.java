package com.moon.star;

import java.util.Stack;

public class Hanoi {
    private Stack<Integer> x=new Stack<>();
    private Stack<Integer> y=new Stack<>();
    private Stack<Integer> z=new Stack<>();
    //入口函数
    public static void main(String[] args){
        Hanoi h=new Hanoi(30);
        Integer size=h.z.size();
        for(int i=0;i<size;i++){
            System.out.println(h.z.pop());
        }
    }
    //构造函数
    private Hanoi(Integer n){
        for(int i=n;i>0;i--){
            x.push(i);
        }
        //开始启动递归
        hanoi(n,x,y,z);
    }
    //核心递归过程
    private void hanoi(Integer n,Stack<Integer> x,Stack<Integer> y,Stack<Integer> z){
        if(n==1){
            move(x,z);
        }else {
            /*
            * 1.将n-1从x移动到y
            * 2.将n从x移动到z
            * 3.将n-从y移动到z
            * */
            hanoi(n-1,x,z,y); //1
            move(x,z);           //2
            hanoi(n-1,y,x,z); //3
        }
    }
    //从a移动到b
    private void move(Stack<Integer> a,Stack<Integer> b){
        try{
            System.out.println(String.format("Moved %s ",a.peek()));
            b.push(a.pop());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
