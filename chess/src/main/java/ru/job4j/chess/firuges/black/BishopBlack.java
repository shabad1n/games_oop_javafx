package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(dest.getX() - position.getX());
        Cell[] steps = new Cell[size];
        int deltaX = dest.getX() - position.getX() > 0 ? 1 : -1;
        int deltaY = dest.getY() - position.getY() > 0 ? 1 : -1;
        int startX = position.getX() + deltaX;
        int startY = position.getY() + deltaY;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(startX, startY);
            startX += deltaX;
            startY += deltaY;
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

    public static void main(String[] args) {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.isDiagonal(Cell.A8, Cell.H8);
        bishopBlack.way(Cell.G5);
    }
}

