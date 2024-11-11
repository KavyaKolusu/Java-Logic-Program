import java.util.Scanner;
class Count{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,count=0;
System.out.println("enter a number to count no.of digits:");
n=s.nextInt();
while(n!=0){


n=n / 10;
count++;
} 
System.out.println(" the no.of digits: " + count);
}
}
