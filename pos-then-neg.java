import java.util.*;
import java.io.*;

class Main {
    public static int[] posneg(int arr[], int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        for (int i=0;i<n;i++){
            if (arr[i]>0) pos.add(arr[i]);
            else
            neg.add(arr[i]);
        }
        for (int i=0;i<n/2;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
        return arr;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter no. the elemenst");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
       
        
        
        int ans[]=posneg(arr,n);
        for(int i=0;i<n;i++)
        System.out.println("value are" + ans[i]);
        
        sc.close();
    }
}
