public class StringCompression {
    public static void main(String[] args) {
        String initialString = "aaabbcccddaabbdc";
        // The output should be
        // ["a","3","b","2","c","3","d","2","a","2","b","2","d","c"] = 14 which is the
        // length of the array
        // Also the challenge here was to keep the Space complexity to O(1)
        char[] charArray = initialString.toCharArray();
        int totalLengthOfArray = 0, i = 0;
        while (i < charArray.length) {
            int j = i;
            while ((j) < charArray.length && charArray[i] == charArray[j]) {
                j++;
            }
            if ((j - i) == 1) {
                totalLengthOfArray = totalLengthOfArray + 1;
            } else {
                totalLengthOfArray = totalLengthOfArray + String.valueOf(j - i).length() + 1;
            }
            i = j;
        }
        System.out.println("Length of the array would be: " + totalLengthOfArray);
    }
}
