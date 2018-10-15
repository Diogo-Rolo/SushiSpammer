package testingsushi;

public enum SushiTypes {

    MAKI (5, 10, "sushitest.png"),
    URAMAKI (5, 10, "sushitest2.jpg"),
    SASHIMI (5, 10, "sushitest.png"),
    NIGIRI (5, 10, "sushitest.png"),
    TEMAKI (5, 10, "sushitest.png");

    private int timesToBeClicked;
    private int tastyness;
    private String image;

    SushiTypes (int timesToBeClicked, int tastyness, String image) {
        this.timesToBeClicked = timesToBeClicked;
        this.tastyness = tastyness;
        this.image = image;
    }

    public int getTimesToBeClicked() {
        return timesToBeClicked;
    }

    public int getTastyness() {
        return tastyness;
    }

    public String getImage() {
        return image;
    }

}
