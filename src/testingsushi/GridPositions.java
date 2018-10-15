package testingsushi;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridPositions extends AbstractGridPosition{
    Grid grid;
    Food food;


    public GridPositions (int col, int row, Grid grid){
        super(col, row, grid);
        if (col % 2 == 0){
            food = new Sushi(SushiTypes.MAKI);
        } else {
            food = new Sushi(SushiTypes.URAMAKI);
        }

        Picture xuxi = new Picture(grid.columnToX(col), grid.rowToY(row), food.getImage());
        xuxi.draw();

    }


}
