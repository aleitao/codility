package pt.aleitao.codility.distinct;

class Solution {

    public int solution(int[] A) {

        java.util.Set<Integer> set = new java.util.HashSet<>();

        for (int i : A) {
            set.add(i);
        }

        return set.size();
    }

}