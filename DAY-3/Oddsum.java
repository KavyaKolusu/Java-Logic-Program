import java.util.Scanner;
class Oddsum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i,sum=0;
System.out.print("enter number to get odd numbers from 1 to n:");
int n=s.nextInt();
System.out.println("the odd numbers are:");
for( i=1;i<=n;i++){
if(i%2==1)

System.out.print(i +" \t ");
sum=sum+i;

}
System.out.println("\n"+" sum of odd: "+sum);
}
}