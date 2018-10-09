package org.itstep.qa.laboratoryWorkTwo.player;

import java.util.Random;

public class Mouse {
    private int startCoordinateX;
    private int startCoordinateY;
    private int currentCoordinateX = startCoordinateX;
    private int currentCoordinateY = startCoordinateY;
    private String nameMouse;
    private String colorMouse;

    public Mouse(int startCoordinateX, int startCoordinateY, String nameMouse) {
        this.startCoordinateX = startCoordinateX;
        this.startCoordinateY = startCoordinateY;
        this.nameMouse = nameMouse;
        this.colorMouse = "белый";
    }

    public void getRun() {
        Random random = new Random();
        if (currentCoordinateX + random.nextInt(2) + 1 < 99) {
            currentCoordinateX = currentCoordinateX + random.nextInt(2) + 1;
        } else {
            if (currentCoordinateX - random.nextInt(2) - 1 > 0) {
                currentCoordinateX = currentCoordinateX - random.nextInt(2) - 1;
            } else {
                currentCoordinateX = currentCoordinateX + random.nextInt(2) + 1;
            }
        }
        if (currentCoordinateY + random.nextInt(2) + 1 < 99) {
            currentCoordinateY = currentCoordinateY + random.nextInt(2) + 1;
        } else {
            if (currentCoordinateY - random.nextInt(2) - 1 > 0) {
                currentCoordinateY = currentCoordinateY - random.nextInt(2) - 1;
            } else {
                currentCoordinateY = currentCoordinateY + random.nextInt(2) + 1;
            }
        }
    }

    public void setStartCoordinateTunnel() {
        currentCoordinateX = currentCoordinateX + 5;
        currentCoordinateY = currentCoordinateY + 5;
    }


}
