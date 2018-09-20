package pt.aleitao.codility.countdiv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solutionUnderTest = new Solution();

    @Test
    public void solution() {
        assertEquals(5, solutionUnderTest.solution(1, 10, 2));
        assertEquals(3, solutionUnderTest.solution(6, 11, 2));
        assertEquals(3, solutionUnderTest.solution(3, 10, 3));
        assertEquals(1, solutionUnderTest.solution(0, 0, 11));
        assertEquals(0, solutionUnderTest.solution(1, 1, 11));
    }

    @Test
    public void solution2() {
        assertEquals(5, solutionUnderTest.solution2(1, 10, 2));
        assertEquals(3, solutionUnderTest.solution2(6, 11, 2));
        assertEquals(3, solutionUnderTest.solution2(3, 10, 3));
        assertEquals(1, solutionUnderTest.solution2(0, 0, 11));
        assertEquals(0, solutionUnderTest.solution2(1, 1, 11));
    }

    @Test
    public void solution3() {
        assertEquals(5, solutionUnderTest.solution3(1, 10, 2));
        assertEquals(3, solutionUnderTest.solution3(6, 11, 2));
        assertEquals(3, solutionUnderTest.solution3(3, 10, 3));
        assertEquals(1, solutionUnderTest.solution3(0, 0, 11));
        assertEquals(0, solutionUnderTest.solution3(1, 1, 11));
        assertEquals(Integer.MAX_VALUE / 2, solutionUnderTest.solution3(1, Integer.MAX_VALUE, 2));
    }


}
