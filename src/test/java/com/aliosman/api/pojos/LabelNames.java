package com.aliosman.api.pojos;

public class LabelNames {
    private String green;
    private String yellow;
    private String orange;
    private String red;
    private String purple;
    private String blue;
    private String sky;
    private String lime;
    private String pink;
    private String black;

    /**
     * No args constructor for use in serialization
     *
     */
    public LabelNames() {
    }

    /**
     *
     * @param orange
     * @param red
     * @param sky
     * @param pink
     * @param green
     * @param blue
     * @param lime
     * @param yellow
     * @param black
     * @param purple
     */
    public LabelNames(String green, String yellow, String orange, String red, String purple, String blue, String sky, String lime, String pink, String black) {
        super();
        this.green = green;
        this.yellow = yellow;
        this.orange = orange;
        this.red = red;
        this.purple = purple;
        this.blue = blue;
        this.sky = sky;
        this.lime = lime;
        this.pink = pink;
        this.black = black;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    public String getOrange() {
        return orange;
    }

    public void setOrange(String orange) {
        this.orange = orange;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getPurple() {
        return purple;
    }

    public void setPurple(String purple) {
        this.purple = purple;
    }

    public String getBlue() {
        return blue;
    }

    public void setBlue(String blue) {
        this.blue = blue;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public String getLime() {
        return lime;
    }

    public void setLime(String lime) {
        this.lime = lime;
    }

    public String getPink() {
        return pink;
    }

    public void setPink(String pink) {
        this.pink = pink;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }

    @Override
    public String toString() {
        return "LabelNames{" +
                "green='" + green + '\'' +
                ", yellow='" + yellow + '\'' +
                ", orange='" + orange + '\'' +
                ", red='" + red + '\'' +
                ", purple='" + purple + '\'' +
                ", blue='" + blue + '\'' +
                ", sky='" + sky + '\'' +
                ", lime='" + lime + '\'' +
                ", pink='" + pink + '\'' +
                ", black='" + black + '\'' +
                '}';
    }
}