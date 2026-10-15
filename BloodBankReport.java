
import java.util.Scanner;

public class BloodBankReport {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Blood Bank Report");

System.out.print("Enter A+ blood units: ");
int a = sc.nextInt();

System.out.print("Enter B+ blood units: ");
int b = sc.nextInt();

System.out.print("Enter O+ blood units: ");
int o = sc.nextInt();

System.out.print("Enter AB+ blood units: ");
int ab = sc.nextInt();

int total = a + b + o + ab;

System.out.println("A+ Units: " + a);
System.out.println("B+ Units: " + b);
System.out.println("O+ Units: " + o);
System.out.println("AB+ Units: " + ab);
System.out.println("Total Blood Units: " + total);

sc.close();
}
}
