package cacao;

class Solution1 {
//    1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//            4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//            5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//            6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//            7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    public String solution(String new_id) {
        String allSmalls = convertToSmalCase(new_id);
        System.out.println(allSmalls);
        String allApproved = removedDisapproved(allSmalls);
        String noConsecutives = removeConsecutives(allApproved);
        String cleaned = removeTrailingPoints(noConsecutives);
        String a = aIfEmpty(cleaned);
        String fifteen = onlyFifteen(a);
        String result = atLeast3(fifteen);
        return result;
    }

    private String atLeast3(String fifteen) {
        int size = fifteen.length();
        int endIndex = size - 1;
        StringBuilder sb = new StringBuilder();
        sb.append(fifteen);
        while (size < 3) {
            sb.append(fifteen.charAt(endIndex));
            size = size  + 1;
        }
        return sb.toString();
    }

    private String onlyFifteen(String a) {
        int size = a.length();
        if (size > 15) {
            String newString = a.substring(0, 15);
            int end = newString.length() - 1;
            if (String.valueOf(newString.charAt(end)).equals(".")) {
                return newString.substring(0, end);
            }
            return newString;
        }
        return a;
    }

    private String aIfEmpty(String cleaned) {
        if (cleaned.isEmpty()) {
            return "a";
        }
        return cleaned;
    }

    private String removeTrailingPoints(String noConsecutives) {
        int start = 0;
        String result = noConsecutives;
        if (String.valueOf(noConsecutives.charAt(start)).equals(".")) {
            result = noConsecutives.substring(1);
        }
        int end = result.length() - 1;
        if (end < 0) {
            return "";
        }
        if (String.valueOf(result.charAt(end)).equals(".")) {
            result = result.substring(0, end);
        }
        return result;
    }

    private String removeConsecutives(String allApproved) {
        StringBuilder sb = new StringBuilder();
        int size = allApproved.length();
        int index = 0;
        while (index < size) {
            String currentString = String.valueOf(allApproved.charAt(index));
            if (currentString.equals(".")) {
                int count = 1;
                while (index + count < size && String.valueOf(allApproved.charAt(index + count)).equals(".")) {
                    count = count + 1;
                }
                sb.append(currentString);
                index = index + count;
            }
            else {
                sb.append(currentString);
                index = index + 1;
            }
        }
        return sb.toString();
    }

    private String removedDisapproved(String allSmalls) {
        StringBuilder sb = new StringBuilder();
        int size = allSmalls.length();
        for (int i = 0; i < size; i++) {
            String currentString = String.valueOf(allSmalls.charAt(i));
            if (Character.isAlphabetic(currentString.charAt(0)) || Character.isDigit(currentString.charAt(0)) || currentString.equals("-") ||
            currentString.equals("_") || currentString.equals(".")) {
                sb.append(currentString);
            }
        }
        return sb.toString();
    }

    private String convertToSmalCase(String new_id) {
        StringBuilder sb = new StringBuilder();
        int size = new_id.length();
        for (int i = 0; i < size; i++) {
            if (Character.isAlphabetic(new_id.charAt(i))) {
                String currentString = String.valueOf(new_id.charAt(i));
                String converted = currentString.toLowerCase();
                sb.append(converted);
            }
            else {
                sb.append(new_id.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
//        String result = sol.solution("...!@BaT#*..y.abcdefghijklm");
        String result2 = sol.solution("abcdefghijklmn.p");
//        System.out.println(result);
        System.out.println(result2);
    }
}
