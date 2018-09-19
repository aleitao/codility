package pt.aleitao.codility.lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    private Solution2 solutionUnderTest = new Solution2();

    @Test
    public void solution() {
        assertEquals(0, solutionUnderTest.solution(-1));
        assertEquals(2, solutionUnderTest.solution(9));
        assertEquals(4, solutionUnderTest.solution(529));
        assertEquals(1, solutionUnderTest.solution( 20));
        assertEquals(2, solutionUnderTest.solution(9));
        assertEquals(0, solutionUnderTest.solution(15));
        assertEquals(0, solutionUnderTest.solution(32));
        assertEquals(0, solutionUnderTest.solution(6));
        assertEquals(2, solutionUnderTest.solution(328));
        assertEquals(0, solutionUnderTest.solution(Integer.MAX_VALUE));
    }
}