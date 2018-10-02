package org.itstep.qa.laboratoryWork.laboratory;

public class House {
    private int width;
    private int longitude;
    private String name;

    public House(int width, int longitude, String name) {
        this.width = width;
        this.longitude = longitude;
        this.name = name;
    }

    public void move (int lastWidht, int lastLongitude) {
        width = width + lastWidht;
        longitude = longitude + lastLongitude;
    }

    public void getinformation (){
        System.out.println(name);
        System.out.println(width);
        System.out.println(longitude);
    }
}
