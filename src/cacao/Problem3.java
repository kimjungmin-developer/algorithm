package cacao;

import java.util.ArrayList;
import java.util.List;


class Solution3 {
    public int[] solution(String[] info, String[] query) {
        List<List<String>> infoList = new ArrayList<>();
        for (String currentString : info) {
            String[] currentWord = currentString.split(" ");
            List<String> innerList = new ArrayList<>();
            for(String current : currentWord) {
                innerList.add(current);
            }
            infoList.add(innerList);
        }
        String[][] queryQuery = new String[query.length][10];
        for (int i = 0; i < query.length; i++) {
            String currentString = query[i];
            currentString = currentString.replaceAll("\\s+", "");
            int numberIndex = -1;
            for (int a = 0; a < currentString.length(); a++) {
                if (Character.isDigit(currentString.charAt(a))) {
                    numberIndex = a;
                    break;
                }
            }
            int endIndex = currentString.length() - 1;
            String numberString = currentString.substring(numberIndex);
            String stringWithNoNum = currentString.substring(0, numberIndex);
            String[] noAnds = stringWithNoNum.split("and");
            for (int j = 0; j < noAnds.length; j++) {
                queryQuery[i][j] = noAnds[j];
            }
            queryQuery[i][4] = numberString;
        }
        int[] result = new int[queryQuery.length];
        for (int i = 0; i < queryQuery.length; i++) {
            String[] currentStringArray = queryQuery[i];
            result[i] = 0;
            for (List<String> currentListWord : infoList) {
                meetsConditions(result, currentListWord, currentStringArray, i);
            }
        }

        return result;
    }

    private void meetsConditions(int[] result, List<String> currentListWord, String[] currentStringArray, int index) {
        if (currentStringArray[0].equals(currentListWord.get(0)) || currentStringArray[0].equals("-")) {
            if (currentStringArray[1].equals(currentListWord.get(1)) || currentStringArray[1].equals("-")) {
                if (currentStringArray[2].equals(currentListWord.get(2)) || currentStringArray[2].equals("-")) {
                    if (currentStringArray[3].equals(currentListWord.get(3)) || currentStringArray[3].equals("-")) {
                        if (Integer.valueOf(currentStringArray[4]) <= Integer.valueOf(currentListWord.get(4))) {
                            result[index] = result[index] + 1;
                        }
                    }
                }
            }
        }
    }

//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        String[] info = new String[]{"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
//        String[] query = new String[]{"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
//
//        int[] result = sol.solution(info, query);
//        for (int i: result) {
//            System.out.println(i);
//        }
//    }
}
