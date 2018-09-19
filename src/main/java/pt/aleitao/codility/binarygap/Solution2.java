package pt.aleitao.codility.binarygap;

public class Solution2 {

    int solution(int N) {

        int result = 0;

        if (N > 1) {

            String binaryString = Integer.toBinaryString(N);

            String[] split = binaryString.split("1");

            for (String bla : split) {
                if (binaryString.contains("1" + bla + "1")){
                    result = bla.length() > result ? bla.length() : result;
                }
            }
        }

        return result;
    }

}
