package org.itstep.qa.constructor.one;

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

    public Rectangle (int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
        this.x1 = 0;
        this.y1 = 0;
    }

    public Rectangle () {
        this.x2 = 0;
        this.y2 = 0;
        this.x1 = 0;
        this.y1 = 0;

    }


    public int rectPrint(int x1, int y1, int x2, int y2) {
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);

        return rectPrint(x1, y1, x2, y2);
    }

 /*   public int move (int dx,int dy) {
        int x1 = this.x1 + dx;
        int x2 = this.x2 + dx;
        int y1 = this.y1 + dy;
        int y2 = this.y2 + dy;
        return
    }

*/

}
