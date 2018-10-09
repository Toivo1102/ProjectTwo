package org.itstep.qa.methods.method;

public class Line {
    String line;

    public String getCensour(String line) {

        return line.replaceAll("бяка", "вырезано цензурой");
    }
}
