package jtm.extra09;

public class CrocadileGreedy implements Crocodile {
    
    int moves = 1;
    int candies = 0;

    @Override
    public void move(Board board) {
        MoveStrategy strategy = new MoveGreedy();
        strategy.move(this, board);

    }

    @Override
    public int getMoves() {
        return moves;
    }

    @Override
    public int getCandies() {
        return candies;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    void setCandies(int candies) {
        this.candies = candies;
    }

    void setMoves(int moves) {
        this.moves = moves;
    }
}
