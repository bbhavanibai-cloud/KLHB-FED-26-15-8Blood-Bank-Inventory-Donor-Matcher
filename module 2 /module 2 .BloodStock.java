import java.util.Scanner;
public class BloodStock {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Blood Bank Stock Management");
System.out.print("Enter blood group: ");
String blood = sc.next();//CO-1
System.out.print("Enter number of units: ");
int units = sc.nextInt();//CO-1
System.out.println();
System.out.println("Blood Stock Details");
System.out.println("Blood Group: " + blood);
System.out.println("Available Units: " + units);
sc.close();

}
}
