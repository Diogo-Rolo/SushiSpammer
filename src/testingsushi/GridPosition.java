package testingsushi;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridPosition extends AbstractGridPosition{
    Grid grid;
    Food food;
    FoodFactory factory = new FoodFactory();
    Picture xuxi;


    public GridPosition(int col, int row, Grid grid){
        super(col, row, grid);
        this.food = factory.createFood();

        xuxi = new Picture(grid.columnToX(col), grid.rowToY(row), food.getImage());
        xuxi.draw();

    }

    public void clickFood(){
        if (food.click()){
            xuxi.delete();
            System.out.println("delete was called");
        }
    }

}
