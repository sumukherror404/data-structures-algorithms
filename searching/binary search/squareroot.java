import java.util.Scanner;//importing the Scanner class from java.util package
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the a number to check the squareroot:");
        n=input.nextInt();
        int value=n,res;
        while(true){
            res=Math.abs(value*value - n);
            if(res<=0.1){
                break;
            }
            else if(res>0.1){
                value--;
            }
            else{
                value++;
            }
        }
        System.out.println("The squareroot of the given number is"+value);
    }
}
