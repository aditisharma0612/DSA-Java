import java.util.*;
public class Demo{
    public static int[] misrep(int arr[]){
        int n=arr.length;
        int missing=-1;int rep=-1;
        
        for (int i=1;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if (arr[j]==i) count++;
            }
            if (count==2) rep=i;
            else if (count==0) missing=i;
            
            if (rep!= -1 && missing != -1)
                break;
        }
        int[] ans = {rep, missing};
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = misrep(arr);
        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);

        sc.close();
    }

    }
