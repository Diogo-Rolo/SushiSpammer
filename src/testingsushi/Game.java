package testingsushi;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game implements KeyboardHandler {

    Grid gameGrid = new Grid();
    PointerPosition pointer;
    GridPositions[] positions;


    public Game() {


        //KEYBOARD SHIT
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        //Spacebar Event Seb
        KeyboardEvent spaceBar = new KeyboardEvent();
        spaceBar.setKey(KeyboardEvent.KEY_SPACE);
        spaceBar.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spaceBar);
    }


    public void init() {


        positions = new GridPositions[gameGrid.rows * gameGrid.cols];
        int x = 0;
        for (int y = 0; y < gameGrid.rows; ) {
            if (x == gameGrid.getCols()) {
                x = 0;
                y++;
            } else {
                positions[y] = new GridPositions(x, y, gameGrid);
                x++;
            }


        }

        pointer = new PointerPosition(gameGrid);


    }

    private void moveLeft() {
        if (pointer.getCol() == 1) {
            return;
        }
        pointer.rectangle.translate(-gameGrid.getCELL_SIZE(), 0);
        pointer.setCol(pointer.getCol() - 1);
    }

    private void moveRight() {
        if (pointer.getCol() >= gameGrid.cols) {
            return;
        }
        pointer.rectangle.translate(gameGrid.CELL_SIZE, 0);
        pointer.setCol(pointer.getCol() + 1);
    }

    private void moveUp() {
        if (pointer.getRow() == 1) {
            return;
        }
        pointer.rectangle.translate(0, -gameGrid.CELL_SIZE);
        pointer.setRow(pointer.getRow() - 1);
    }

    private void moveDown() {
        if (pointer.getRow() >= gameGrid.rows) {
            return;
        }
        pointer.rectangle.translate(0, gameGrid.CELL_SIZE);
        pointer.setRow(pointer.getRow() + 1);
    }


    private void spaceBar() {
        System.out.println("spacebar");
        positions[1].clickFood();
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                moveLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                moveRight();
                break;
            case KeyboardEvent.KEY_UP:
                moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                moveDown();
                break;
            //space event
            case KeyboardEvent.KEY_SPACE:
                spaceBar();
                break;

            default:
                System.out.println("something wrong!");
        }

    }

    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
