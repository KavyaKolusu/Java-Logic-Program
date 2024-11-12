import java.util.Scanner;
 class  SumofFirstandLastdigit
{
 
    public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
System.out.println("Enter num:");
int n=s.nextInt();
        int firstdigit = 0;
        int lastdigit = 0;
 
        lastdigit = n%10;
        System.out.println("Last digit: "+lastdigit);
 
        while(n!=0) {
            firstdigit = n%10;
            n /= 10;
        }
int sum=firstdigit+lastdigit;
        System.out.println("First digit: "+firstdigit);
   System.out.println(" Sum of 1st and last digit : " + sum);
    }
}