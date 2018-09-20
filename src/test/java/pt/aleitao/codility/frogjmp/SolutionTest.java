package pt.aleitao.codility.frogjmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solutionUnderTest = new Solution();

    @Test
    public void solution() {

        assertEquals(3, solutionUnderTest.solution(10, 85, 30));
        assertEquals(0, solutionUnderTest.solution(10, 10, 30));
        assertEquals(1, solutionUnderTest.solution(10, 11, 30));
        assertEquals(3, solutionUnderTest.solution(10, 100, 30));

    }

    @Test
    public void solution2() {

        assertEquals(3, solutionUnderTest.solution2(10, 85, 30));
        assertEquals(0, solutionUnderTest.solution2(10, 10, 30));
        assertEquals(1, solutionUnderTest.solution2(10, 11, 30));
        assertEquals(3, solutionUnderTest.solution2(10, 100, 30));


    }
}