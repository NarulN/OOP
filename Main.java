package com.company;
import java.util.Scanner;
import java.lang.Math;
class Point {

    double a1;
    double a2;

    Point(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public void SetPoint1() {
        Scanner myObject = new Scanner(System.in);
        this.a1 = myObject.nextDouble();
    }

    public void SetPoint2() {
        Scanner myObject = new Scanner(System.in);
        this.a2 = myObject.nextDouble();
    }

}

class Main{
    public static void main(String[] args){
        Point X = new Point(0,0);
        Point Y = new Point(0,0);
        X.SetPoint1();
        X.SetPoint2();
        Y.SetPoint1();
        Y.SetPoint2();
        double distance = Math.sqrt(((X.a2-X.a1)*(X.a2-X.a1))+((Y.a2-Y.a1)*(Y.a2-Y.a1)));
        System.out.print(distance);
    }
}
