import java.util.Scanner;
public class GetFactorial{
    static void factorial() {
        int fact=1,number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = scanner.nextInt();
        if(number<1){
             System.out.println(number + " is less than 1");
        }else{
              for(int i=1;i<=number;i++){    
                fact=fact*i;    
        }
    }
    System.out.println("Factorial of "+ number +" is: "+ fact);    
}
    public static void main(String[] args){
    factorial();
    }
}









hw\eljb