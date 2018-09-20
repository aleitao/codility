package pt.aleitao.codility.countdiv;

public class Solution {

    public int solution(int A, int B, int K){

        int result = 0;

        for(int i = A; i <= B; i++){

            if(i % K == 0){
                result++;
            }

        }

        return result;
    }

    public int solution2(int A, int B, int K){

        int result = 0;

        int first = A + (A % K);
        for(int count = first; count <= B; count += K){
            result++;
        }

        return result;
    }

    public int solution3(int A, int B, int K){

        //stolen from https://github.com/karimhamdanali/codility/blob/master/src/codility/CountDiv.java
        return B/K - A/K + (A%K == 0 ? 1 : 0);

    }

}
