package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void noisDiagonalTest()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H5);
    }

    @Test(expected = OccupiedCellException.class)
    public void moveFalseTest()
            throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.D2);
    }

    @Test(expected = FigureNotFoundException.class)
   public void noFigureFindBy()
         throws FigureNotFoundException, OccupiedCellException{
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C2));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.D2);
    }
}