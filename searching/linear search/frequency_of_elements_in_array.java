/*to print the number of times an element occured in the array*/
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
        int i,inner_count;
        for(i=0;i<n;i++){
            boolean result=true;
            for(int j=i-1;j>=0;j--){
                if(a[i]==a[j]){
                    result=false;
                }
            }
            if(result==false){
                continue;
            }
            inner_count=1;
            for(int j=i+1;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    inner_count++;
                }
            }
            System.out.println("The element "+a[i]+" occurs "+inner_count+" times in the array");
        }
       
    }
}
