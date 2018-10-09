package org.itstep.qa.laboratoryWorkTwo;

import java.util.Random;

public class Bunsh {
    private int coordinateX;
    private int coordinateY;
    private String colorBunsh;


    public void coordinateX() {
        Random random = new Random();
        coordinateX = random.nextInt(99);
    }

    public void coordinateY() {
        Random random = new Random();
        coordinateY = random.nextInt(99);
    }

    public void setColorBunsh(String colorBunsh) {
        this.colorBunsh = colorBunsh;
    }


}
