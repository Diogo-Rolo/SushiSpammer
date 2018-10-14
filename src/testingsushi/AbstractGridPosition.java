package testingsushi;

public abstract class AbstractGridPosition {
    private int col;
    private int row;
    private Grid grid;

    public AbstractGridPosition(int col, int row, Grid grid){
        this.col = col;
        this.row = row;
        this.grid = grid;
    }

    public void show(){

    }

    public Grid getGrid() {
        return grid;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public void comparePos(GridPositions grid){
        if (this.col == grid.getCol() && this.row == grid.getRow()){
            System.out.println("these are in the same spot");
        } else {
            System.out.println("nope");
        }
    }
}
