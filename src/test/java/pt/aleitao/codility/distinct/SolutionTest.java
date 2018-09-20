package pt.aleitao.codility.distinct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solutionUnderTest = new Solution();

    @Test
    void solution() {

        assertEquals(3, solutionUnderTest.solution( new int[]{2,1,1,2,3,1}));
        assertEquals(8, solutionUnderTest.solution( new int[]{1,2,3,4,5,6,7,8}));
        assertEquals(4, solutionUnderTest.solution( new int[]{2,1,1,2,3,1,4}));
        assertEquals(1, solutionUnderTest.solution( new int[]{1,1,1,1,1,1}));

    }
}