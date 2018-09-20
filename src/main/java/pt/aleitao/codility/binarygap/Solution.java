package pt.aleitao.codility.binarygap;

public class Solution {

    int solution(int N) {

        final Character ZERO = '0';
        final Character ONE = '1';
        int result = 0;
        boolean foundOne = false;

        if (N > 1) {

            int count = 0;
            char[] binaryArray = Integer.toBinaryString(N).toCharArray();

            for (char ch : binaryArray) {

                foundOne = foundOne || ONE.equals(ch);

                if(!foundOne){
                    break;
                }

                if(ZERO.equals(ch)){
                    count ++;
                }else{
                    result = count > result ? count : result;
                    count = 0;
                }

            }
        }

        return result;
    }

    int solution2(int N) {

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
