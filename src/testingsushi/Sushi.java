package testingsushi;

public class Sushi extends Food {

    public Sushi(SushiTypes type){
        setTimesToBeClicked(type.getTimesToBeClicked());
        setTastyness(type.getTimesToBeClicked());
        setImage(type.getImage());
    }
}
