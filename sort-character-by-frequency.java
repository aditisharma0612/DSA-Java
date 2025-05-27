    class Solution {
    public String frequencySort(String s) {
    // Step 1: Create a frequency array for ASCII characters
    int[] freq = new int[128];
    char[] ans = new char[s.length()];

    // Step 2: Count the frequency of each character
    for (char c : s.toCharArray()) {
        freq[c]++;
    }

    // Step 3: Sort characters based on frequency
    for (int i = 0; i < s.length(); ) {
        int max = 0;
        int ind = 0;

        // Find the character with the highest remaining frequency
        for (int j = 0; j < 128; j++) {
            if (max < freq[j]) {
                max = freq[j];
                ind = j;
            }
        }

        // Append the character to the result array and decrement its frequency
        while (freq[ind] > 0) {
            ans[i++] = (char) ind;
            freq[ind]--;
        }
    }

    // Step 4: Convert the result array to a string and return it
    return new String(ans);
}
}
