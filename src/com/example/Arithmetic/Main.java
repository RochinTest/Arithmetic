package com.example.Arithmetic;

import java.util.Scanner;

public class Main {
int n;
int n1;

    public static void main(String[] args) {
       Vector obvector = new Vector();
        Lines oblines = new Lines();
        Matrix ob = new Matrix();
        Main obmain = new Main();
        //obmain.makeMatrix(ob);
        // obmain.cellNumber(ob);
       //obmain.matrixScaling(ob);
       //obmain.makeLines(oblines);
      // obmain.printChar(oblines);
        obmain.makeVector(obvector);
        obmain.compareVector(obvector);
    }
    private void compareVector(Vector obvector){
        if(obvector.numvec>2){
        System.out.println("Есть "+ (obvector.numvec)+" векторов, какие будем сравнивать ? (Например: 1 2, 2-3 и.т.д.)" );
        n=input();n1=input();
    }
        obvector.x=obvector.vector[2]-obvector.vector[1];
        obvector.y=obvector.vector[3]-obvector.vector[2];
        obvector.comparison(obvector.x,obvector.y);
    }
    private void makeVector(Vector obvector){
    System.out.println("Введите количество векторов(число должно быть четным)");
    obvector.numvec=input();
    obvector.vector= new int [obvector.numvec*2];
        System.out.println("Введите начало и конец "+obvector.numvec+" векторов");
        for (int i = 0; i < obvector.vector.length; i++) {

            obvector.vector[i]=input();
           // System.out.print(" "+obvector.vector[i]);
        }
    }

private void makeLines(Lines oblines){
        System.out.println();
        System.out.println("Введите количество символов в строке ");
oblines.num=input();
        oblines.lines=new char[oblines.num];
        System.out.println("Введите строку");
    for (int i = 0; i < oblines.num; i++) {
        oblines.lines[i]=inputChar(oblines);
//System.out.print(obLines.lines[i]);
    }

}
private void printChar(Lines obLines){
        System.out.println("Введите номер символа");
       obLines.num= input();
        System.out.println(obLines.lines[obLines.num]);

}
    private void matrixScaling(Matrix ob) {
        System.out.println();
        System.out.println("Введите масштабный коэффициент");
       ob. num = input();
        for (int i = 0; i < ob.numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < ob.numbers[i].length; j++) {
               ob. numbers[i][j] = ob.numbers[i][j] / ob.num;
                System.out.print(" " + ob.numbers[i][j]);
            }
        }
    }

    public void makeMatrix(Matrix ob) {

        System.out.println("Введите размерность матрицы n x m");
        ob.n = input();
        ob.m = input();
        ob.numbers = new int[ob.n][ob.m];
        System.out.println();
        for (int i = 0; i < ob.numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < ob.numbers[i].length; j++) {
                ob.numbers[i][j] =
                        ob.numbers[i][j] = (int) (Math.random() * 10 + 5);
                System.out.print(" " + ob.numbers[i][j]);

            }
        }


    }
    private char inputChar(Lines obLines) {

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            obLines.characters = sc.next().trim().charAt(0);
        }
        return obLines.characters;
    }
    private int input() {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        }
        return num;
    }

    public void cellNumber(Matrix ob) {
        System.out.println();
        System.out.println(" Введите номера ячеек ");
        int cell1 = input();
        int cell2 = input();
        int cell3 = input();
        int cell4 = input();
        ob.x = ob.numbers[cell1][cell2];
        ob.y = ob.numbers[cell3][cell4];

        System.out.println("x= " + ob.x + " y= " + ob.y);
        ob.addition(ob.x, ob.y);
        ob.comparison(ob.x, ob.y);
    }

}
