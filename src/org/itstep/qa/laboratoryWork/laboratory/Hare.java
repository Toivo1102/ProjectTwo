package org.itstep.qa.laboratoryWork.laboratory;

public class Hare {
    private int coordinateX;
    private int coordinateY;
    private int changeCoordinateDX;
    private int changeCoordinateDY;
    private int numberJump;
    private int newCoordinateX;
    private int newCoordinateY;

    public Hare(int coordinateX, int coordinateY, int changeCoordinateDX, int changeCoordinateDY, int numberJump) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.changeCoordinateDX = changeCoordinateDX;
        this.changeCoordinateDY = changeCoordinateDY;
        this.numberJump = numberJump;
    }

    public void getJump() {
        newCoordinateX = coordinateX + changeCoordinateDX;
        newCoordinateY = coordinateY + changeCoordinateDY;

    }

    public void change() {
        newCoordinateX = newCoordinateX * numberJump;
        newCoordinateY = newCoordinateY * numberJump;
    }

    public void returnHome() {
        newCoordinateX = coordinateX;
        newCoordinateY = coordinateY;
    }

    public void teleport(int lastcoordinateX, int lastcoordinateY) {
        coordinateX = lastcoordinateX;
        coordinateY = lastcoordinateY;
    }
}
