package org.itstep.qa.constructors.constructor;

public class Rectangle {
    /*
    Задание 1
     */

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
        this.x1 = 0;
        this.y1 = 0;
    }

    public Rectangle() {
        this.x2 = 0;
        this.y2 = 0;
        this.x1 = 0;
        this.y1 = 0;

    }


    public void rectPrint(int x2, int y2) {
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
    }

    public void rectPrint(int x1, int y1, int x2, int y2) {
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
    }

    public void rectPrint() {
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
    }


    public void move(int dx, int dy) {
        x1 = this.x1 + dx;
        x2 = this.x2 + dx;
        y1 = this.y1 + dy;
        y2 = this.y2 + dy;
    }


}
