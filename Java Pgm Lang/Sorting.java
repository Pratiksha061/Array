import java.util.*;
public class Sorting{
    public static int SelectionSort(int arr[]){
      
        for(int i=0; i<arr.length-1; i++){
              int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]> arr[j]){
                    minPos=j;
            }
        }
        //swap
        int temp= arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }
    return 0;
    }
     public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[]={5,4,3,1,2};
        SelectionSort(arr);
        PrintArr(arr);
        
    }
}