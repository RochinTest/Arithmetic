package com.example.Arithmetic;

public class Vector implements Arithmetic {
    int[] vector;
    int numvec;
int x,y;
    public Vector() {
    }

    @Override
    public void addition(int x, int y) {

    }

    @Override
    public void comparison(int x, int y) {
        System.out.println("Сравниваем вектора");
        if (x > y) {
            System.out.println("Вестор 1 > вектора 2");
        } else System.out.println("Вестор 1 < вектора 2");
    }

    }

