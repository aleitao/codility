package pt.aleitao.codility.countdiv;

public class Solution2 {
    public int solution(int A, int B, int K){

        int result = 0;

        int first = A + (A % K);
        for(int count = first; count <= B; count += K){
            result++;
        }

        return result;
    }
}