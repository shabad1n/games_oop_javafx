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
        throw new ImpossibleMoveException(
                String.format("Could not way by diagonal from %s to %s", position, dest)
        );
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        for (int i = 0; i < Math.abs(dest.getX() - source.getX()); i++) {
        }
        return true;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

    public static void main(String[] args) {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.isDiagonal(Cell.A8, Cell.H8);
    }
}
