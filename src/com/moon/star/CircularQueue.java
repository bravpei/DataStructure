package com.moon.star;

import java.util.List;

//循环队列
public class CircularQueue {
    private Integer maxsize;
    private String[] strs;
    private Integer front;
    private Integer rear;
    //测试
    public static void main(String[] args){
        CircularQueue cq=new CircularQueue(10);
        cq.EnQueue("LiuPei");
        System.out.println(cq.length());
    }
    //初始化
    public CircularQueue(Integer maxsize){
        this.maxsize=maxsize+1;
        this.strs=new String[maxsize];
        this.front=0;
        this.rear=0;
    }
    //判读是否为空队列
    public boolean isEmpty(){
        return front.equals(rear);
    }
    //判断队列是否满了
    public boolean isFull(){
        return (rear+1)%maxsize==front;
    }
    //队尾添加元素
    public boolean EnQueue(String str){
        if((rear+1)%maxsize==front) return false;
        strs[rear]=str;
        rear=(rear+1)%maxsize;
        return true;
    }
    //对头删除元素
    public boolean DeQueue(){
        if(rear.equals(front)) return false;
        front=(front+1)%maxsize;
        return true;
    }
    //返回队列的长度
    public Integer length(){
        return ((rear-front+maxsize)%maxsize);
    }
}
