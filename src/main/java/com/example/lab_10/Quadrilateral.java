package com.example.lab_10;


public class Quadrilateral {

    protected int x1;
    protected int x2;
    protected int x3;
    protected int x4;
    protected int y1;
    protected int y2;
    protected int y3;
    protected int y4;
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;
    protected double square;
    protected double perimeter;
    protected double diagonal1;
    protected double diagonal2;


    public Quadrilateral(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.setX1(x1);
        this.setX2(x2);
        this.setX3(x3);
        this.setX4(x4);
        this.setY1(y1);
        this.setY2(y2);
        this.setY3(y3);
        this.setY4(y4);

        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
        this.setSideD(sideD);

        this.setDiagonal1(diagonal1);
        this.setDiagonal2(diagonal2);
        this.setPerimeter(perimeter);
        this.setSquare(square);

    }

    public static double getSideLength(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static boolean isQuadliteralExists(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        double sideA = getSideLength(x1, y1, x2, y2);
        double sideB = getSideLength(x3, y3, x2, y2);
        double sideC = getSideLength(x1, y1, x3, y3);
        double sideD = getSideLength(x4, y4, x1, y4);

        return (sideA + sideB + sideC < sideD) || (sideB + sideC + sideD < sideA) || (sideA + sideC + sideD < sideB);

    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public double getSideD() {
        return sideD;
    }

    public void setSideA(double sideA) {
        this.sideA = getLengthA();
    }

    public void setSideB(double sideB) {
        this.sideB = getLengthB();
    }

    public void setSideC(double sideC) {
        this.sideC = getLengthC();
    }

    public void setSideD(double sideD) {
        this.sideD = getLengthD();
    }

    public double getLengthA() {

        return Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
    }

    public double getLengthB() {

        return Math.sqrt(Math.pow((getX3() - getX2()), 2) + Math.pow((getY3() - getY2()), 2));
    }

    public double getLengthC() {

        return Math.sqrt(Math.pow((getX1() - getX3()), 2) + Math.pow((getY1() - getY3()), 2));
    }

    public double getLengthD() {

        return Math.sqrt(Math.pow((getX4() - getX1()), 2) + Math.pow((getY4() - getY1()), 2));
    }

    public double getPerimeter() {

        return getLengthA() + getLengthB() + getLengthC() + getLengthD();
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = getPerimeter();
    }

    public double getDiagonal1() {
        return Math.sqrt(Math.pow(getLengthA(), 2) + Math.pow(getLengthD(), 2));
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = getDiagonal1();
    }

    public double getDiagonal2() {
        return Math.sqrt(Math.pow(getLengthB(), 2) + Math.pow(getLengthC(), 2));
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = getDiagonal2();
    }

    public double getSquare() {
        return getLengthA() * getLengthB();
    }

    public void setSquare(double square) {
        this.square = getSquare();
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", x4=" + x4 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                ", y4=" + y4 +
                "; Side A=" + String.format("%.3f", getLengthA()) +
                "; Side B=" + String.format("%.3f", getLengthB()) +
                "; Side C=" + String.format("%.3f", getLengthC()) +
                "; Side D=" + String.format("%.3f", getLengthD()) +
                "; Perimeter" + String.format("%.3f", getPerimeter()) +
                "; Square=" + String.format("%.3f", getSquare()) +
                "; Diagonal N=" + String.format("%.3f", getDiagonal1()) +
                "; Diagonal M=" + String.format("%.3f", getDiagonal2()) +
                '}';

    }
}
