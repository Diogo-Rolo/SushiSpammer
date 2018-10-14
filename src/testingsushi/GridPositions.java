package testingsushi;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GridPositions extends AbstractGridPosition{
    Grid grid;
    String boop = "sushitest.png";


    public GridPositions (int col, int row, Grid grid){
        super(col, row, grid);
        Rectangle rectangle = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCELL_SIZE(), grid.getCELL_SIZE());
        rectangle.fill();
        Picture xuxi = new Picture(grid.columnToX(col), grid.rowToY(row), boop);
        xuxi.draw();

    }


}
