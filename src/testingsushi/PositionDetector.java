package testingsushi;

public class PositionDetector {
    GridPosition[] positions;
    PointerPosition pointer;
    GridPosition current;

    public PositionDetector(GridPosition[] positions, PointerPosition pointer){
        this.positions = positions;
        this.pointer = pointer;
    }

    public GridPosition checkPosition(){

        for (GridPosition i: positions){
            System.out.println("merda");
            System.out.println(pointer.getCol());
            if (i.getRow() == pointer.getRow() && i.getCol() == pointer.getCol() ){
                current = i;
            }
        }

        /*for (int i = 0; i < positions.length; i++) {
            if (positions[i].getCol()==pointer.getCol() && positions[i].getRow() == pointer.getRow()){
                current = positions[i];
                System.out.println("new position");
            }
        }*/
        return current;
    }
}
