package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        Figure bishopBlack = new BishopBlack(Cell.A6);
        Cell exception = bishopBlack.position();
        Assert.assertEquals(exception, Cell.A6);
    }

    @Test
    public void copyTest() {
        Figure bishopBlack = new BishopBlack(Cell.A6);
        Cell exception = bishopBlack.position();
        Assert.assertEquals(exception, Cell.A6);
        bishopBlack = bishopBlack.copy(Cell.A3);
        exception = bishopBlack.position();
        Assert.assertEquals(exception, Cell.A3);
    }

    @Test(expected = ImpossibleMoveException.class)
        public void wayTest() {
        Figure bishopBlack = new BishopBlack(Cell.A6);
        bishopBlack.way(Cell.A5);
    }
}