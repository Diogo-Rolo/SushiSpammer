package testingsushi;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {
    //PROPERTIES
    int cols;
    int rows;
    final int PADDING = 100;
    final int CELL_SIZE = 30;
    Rectangle grid;

    //CONSTRUCTOR
    public Grid (){
        this.cols = 20;
        this.rows = 20;
    }

    //METHODS
    public void init(){
        grid = new Rectangle(PADDING, PADDING, cols * CELL_SIZE, rows * CELL_SIZE);
        grid.draw();
    }

    public int rowToY(int row){
        return row * CELL_SIZE + PADDING;
    }

    public int columnToX(int col){
        return col * CELL_SIZE + PADDING;
    }

    //GETTERS SETTERS


    public int getCols() {
        return cols;
    }

    public int getRows(){
        return rows;
    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
    }

    public int getPADDING() {
        return PADDING;
    }
}
