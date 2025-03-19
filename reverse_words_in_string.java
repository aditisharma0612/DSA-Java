import java.util.Scanner;
class Solution{
public String reverse(String s){
    String str[]=s.trim().split("\\s+");
    String ans="";
    for(int i = str.length-1 ;i>0 ; i--){
        ans+=str[i]+" ";
}
return ans+str[0];
}

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();
        String reversed = solution.reverse(input);
        System.out.println("Reversed words: " + reversed);
    }
}
