package pt.aleitao.codility.binarygap;

import org.openjdk.jmh.annotations.Benchmark;

public class BenchmarkRunner {

    public static void main(String[] args) throws Exception {

        org.openjdk.jmh.Main.main(args);

    }

    @Benchmark
    public void benchMarkSolution1() {
        Solution benchMarkSolution = new Solution();
        benchMarkSolution.solution(-1);
        benchMarkSolution.solution(9);
        benchMarkSolution.solution(529);
        benchMarkSolution.solution(15);
        benchMarkSolution.solution( 20);
        benchMarkSolution.solution(9);
        benchMarkSolution.solution(32);
        benchMarkSolution.solution(6);
        benchMarkSolution.solution(328);
        benchMarkSolution.solution(Integer.MAX_VALUE);

    }

    @Benchmark
    public void benchMarkSolution2() {
        Solution benchMarkSolution = new Solution();
        benchMarkSolution.solution2(-1);
        benchMarkSolution.solution2(9);
        benchMarkSolution.solution2(529);
        benchMarkSolution.solution2(15);
        benchMarkSolution.solution2( 20);
        benchMarkSolution.solution2(9);
        benchMarkSolution.solution2(32);
        benchMarkSolution.solution2(6);
        benchMarkSolution.solution2(328);
        benchMarkSolution.solution2(Integer.MAX_VALUE);

    }

}
