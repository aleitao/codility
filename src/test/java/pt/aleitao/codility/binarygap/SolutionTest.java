package pt.aleitao.codility.binarygap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solutionUnderTest = new Solution();

    @Test
    void solution() {
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

    @Test
    public void solution2() {
        assertEquals(0, solutionUnderTest.solution2(-1));
        assertEquals(2, solutionUnderTest.solution2(9));
        assertEquals(4, solutionUnderTest.solution2(529));
        assertEquals(1, solutionUnderTest.solution2( 20));
        assertEquals(2, solutionUnderTest.solution2(9));
        assertEquals(0, solutionUnderTest.solution2(15));
        assertEquals(0, solutionUnderTest.solution2(32));
        assertEquals(0, solutionUnderTest.solution2(6));
        assertEquals(2, solutionUnderTest.solution2(328));
        assertEquals(0, solutionUnderTest.solution2(Integer.MAX_VALUE));
    }

}