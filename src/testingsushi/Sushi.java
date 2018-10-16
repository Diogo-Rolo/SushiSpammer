package testingsushi;

public class Sushi extends Food implements Clickables{

    public Sushi(SushiTypes type){
        setTimesToBeClicked(type.getTimesToBeClicked());
        setTastyness(type.getTimesToBeClicked());
        setImage(type.getImage());
    }


}
