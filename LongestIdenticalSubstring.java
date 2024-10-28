public class LongestIdenticalSubstring {
    public static void main(String[] args) {
        String str = "aabbbbCCddd";
        Result result = longestIdenticalSubstring(str);
        System.out.println("Index: " + result.index + ", Substring: \"" + result.substring + "\"");
    }

    public static Result longestIdenticalSubstring(String str) {
        int maxIndex = 0, maxLength = 1;
        int currentIndex = 0, currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxIndex = currentIndex;
                }
                currentIndex = i;
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxIndex = currentIndex;
        }

        return new Result(maxIndex, str.substring(maxIndex, maxIndex + maxLength));
    }

    static class Result {
        int index;
        String substring;

        Result(int index, String substring) {
            this.index = index;
            this.substring = substring;
        }
    }
}
