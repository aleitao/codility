package pt.aleitao.codility.frogjmp;

public class Solution {

    public int solution(int X, int Y, int D){

        int result = 0;

        for (int i = X ; i < Y ; i += D){
            result ++;
        }

        return result;
    }

    public int solution2(int X, int Y, int D){

        return (Y - X) / D + ((Y - X) % D == 0 ? 0 : 1 );

    }

}