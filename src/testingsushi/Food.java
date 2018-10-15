package testingsushi;

public abstract class Food implements Clickables{

    //PROPERTIES
    private int timesToBeClicked;
    private int tastyness;
    private String image;

    //METHODS
    @Override
    public void click() {

    }

    public int getTimesToBeClicked() {
        return timesToBeClicked;
    }

    public void setTimesToBeClicked(int timesToBeClicked) {
        this.timesToBeClicked = timesToBeClicked;
    }

    public int getTastyness() {
        return tastyness;
    }

    public void setTastyness(int tastyness) {
        this.tastyness = tastyness;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}
