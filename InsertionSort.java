import java.util.*;

public class InsertionSort {

    public static void sort(int[] arr){
        int n=arr.length;

        for(int x=1;x<n;x++){
            //We will iterate from 2nd index
            //Assumming first element is in its sorted position
            int current=arr[x];
            int y=x-1; //y pointer for considering element from the 1st index

            while(y>=0 && arr[y]>current){
                arr[y+1]=arr[y]; //shift the element by 1 position
                y--;
            }
            arr[y+1]=current;
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        sc.close();
        sort(arr);

        for(int x=0;x<arr.length;x++){
            
            System.out.print(arr[x]+" "); 
            
        }  
        
    }
    
}
