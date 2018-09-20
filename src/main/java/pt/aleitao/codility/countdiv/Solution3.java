package pt.aleitao.codility.countdiv;

public class Solution3 {
    public int solution(int A, int B, int K){

        //stolen from https://github.com/karimhamdanali/codility/blob/master/src/codility/CountDiv.java
        return B/K - A/K + (A%K == 0 ? 1 : 0);

    }
}
