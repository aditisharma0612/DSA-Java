import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = null;
        
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> li = new ArrayList<>();    
            li.add(1);
            for (int j = 1; j <= i; j++) {
                if (j < i) li.add(prev.get(j - 1) + prev.get(j));
                else li.add(1);
            }
            list.add(li);
            prev = li;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        Solution sol = new Solution();
        List<List<Integer>> result = sol.generate(numRows);

        // Printing Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
