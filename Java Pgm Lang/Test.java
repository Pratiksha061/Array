import java.util.*;
public class Test{
    public static int containsDuplicate( int numbers[]){
        int n= numbers.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if( numbers[i]== numbers[j]){

                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,1};
        System.out.println(containsDuplicate(numbers));
    }
}