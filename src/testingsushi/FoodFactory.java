package testingsushi;

public class FoodFactory {

    public Food createFood(){
        Food food;
        double what = Math.random() * 100;
        if (what < 15){
            food = new Sushi(SushiTypes.MAKI);
        } else if (what < 30){
            food = new Sushi(SushiTypes.URAMAKI);
        } else if (what < 45){
            food = new Sushi(SushiTypes.SASHIMI);
        } else if (what < 60){
            food = new Sushi(SushiTypes.NIGIRI);
        } else /*if (what < 75)*/{
            food = new Sushi(SushiTypes.TEMAKI);
        }
        return food;
    }
}
