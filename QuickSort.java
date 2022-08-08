import java.util.*;


public class QuickSort {

    public static int partition(int arr[], int low, int high){
        int pivot=arr[high]; //Approach: where we take last element as pivot
        int i=low-1; //to track and create space for elements smaller than pivot

        //Traverse the array
        for(int x=low;x<high;x++){
            if(arr[x]<pivot){
                i++; //As spaces continue to create
                //swap
                int temp=arr[i];
                arr[i]=arr[x];
                arr[x]=temp;
            }
        }
        i++;
        int temp1=arr[i]; //to store the pivot element in its correct index
        arr[i]=pivot;
        arr[high]=temp1;

        return i;
    }

    //Uses Divide and Conquer Approach
    public static void quicksort(int arr[],int low, int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            //below function calls the index in the name of pivot
            quicksort(arr, low, pivot-1); //as we already have our pivot element
            quicksort(arr, pivot+1, high);//for elements greater than pivot
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        

        for (int x = 0; x < arr.length; x++) {
            arr[x] = sc.nextInt();
        }
        sc.close();

        quicksort(arr, 0, n-1);
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
        System.out.println();
    }
}
