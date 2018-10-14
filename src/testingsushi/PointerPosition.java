package testingsushi;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class PointerPosition extends AbstractGridPosition {
    Rectangle rectangle;
    Grid grid;

    public PointerPosition(Grid grid) {
        super(1, 1, grid);
        Rectangle rectangle = new Rectangle(grid.columnToX(0), grid.rowToY(0), grid.getCELL_SIZE(), grid.getCELL_SIZE());
        this.rectangle = rectangle;
        rectangle.draw();
        this.grid = grid;
    }




}
