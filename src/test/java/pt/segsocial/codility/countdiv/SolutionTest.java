package pt.segsocial.codility.countdiv;

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

}
