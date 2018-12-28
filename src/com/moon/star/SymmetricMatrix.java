package com.moon.star;

import java.io.IOException;
import java.util.Scanner;

//对称矩阵
public class SymmetricMatrix {
    //初始化对称矩阵
    private Integer length;
    private Integer n;
    private Integer[] arr;
    public SymmetricMatrix(Integer n){
        this.n=n;
        this.length=n*(n+1)/2;
        arr=new Integer[length];
        Scanner s=new Scanner(System.in);
        for(Integer i=0;i<length;i++){
            arr[i]=s.nextInt();
        }
    }
    //打印对称矩阵
    public void printMatrix(){
        int k;
        for(Integer i=1;i<=n;i++){
            for(Integer j=1;j<=n;j++){
                if(i>=j) k=i*(i-1)/2+j-1;
                else k=j*(j-1)/2+i-1;
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }
    //入口函数
    public static void main(String[] args){
        SymmetricMatrix sm=new SymmetricMatrix(3);
        sm.printMatrix();
    }
}

