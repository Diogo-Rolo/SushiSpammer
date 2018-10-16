package testingsushi;

public enum SushiTypes {

    MAKI (5, 10, "sushitest.png"),
    URAMAKI (5, 10, "sushitest2.jpg"),
    SASHIMI (5, 10, "sashimi.jpg"),
    NIGIRI (5, 10, "nigiri.jpg"),
    TEMAKI (5, 10, "temaki.jpg");

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
