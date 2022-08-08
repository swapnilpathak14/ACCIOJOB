import java.util.*;
import java.lang.*;
import java.io.*;

public class Quicksort2
{
    public static int parition(int arr[], int low, int high){


    }

    public static void quick2sort(int arr[], int low, int high) {

        if(low>=high){

            return;
            int pivot = partition(arr, low, high);

            // below function calls the index in the name of pivot
            quick2sort(arr, low, pivot - 1); // as we already have our pivot element
            quick2sort(arr, pivot + 1, high);
        }
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        
	}
}