/*to count the number of unique elements in the given array*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("enter the size of the array:");
        n=input.nextInt();
        int[] a = new int[n];
        System.out.print("enter the elements in the array:");
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int unique_count=0,i,inner_count;
        for(i=0;i<n;i++){
            inner_count=0;
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    inner_count++;
                    break;
                }
            }
            if(inner_count==0){
                unique_count++;
            }
        }
        System.out.println("There are "+unique_count+" unique elements");
       
    }
}
