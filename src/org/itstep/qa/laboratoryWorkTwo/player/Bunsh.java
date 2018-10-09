package org.itstep.qa.laboratoryWorkTwo.player;

import java.util.Random;

public class Bunsh {
    private int coordinateX;
    private int coordinateY;
    private String [] colorBunsh;

    public Bunsh (String[] colorBunsh) {

        this.colorBunsh = colorBunsh;
    }

    public void coordinateX() {
        Random random = new Random();
        coordinateX = random.nextInt(99);
    }

    public void coordinateY() {
        Random random = new Random();
        coordinateY = random.nextInt(99);
    }

    public String color() {
       Random random = new Random();
        int randomIndex = random.nextInt(colorBunsh.length);
        return colorBunsh[randomIndex];
    }


}
