import java.util.Scanner;

public class DonorRegistration {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Donor Registration");

System.out.print("Enter donor name: ");
String name = sc.nextLine();

System.out.print("Enter donor age: ");
int age = sc.nextInt();
sc.nextLine();

System.out.print("Enter blood group: ");
String bloodGroup = sc.nextLine();

System.out.print("Enter units donated: ");
int units = sc.nextInt();

System.out.println("Donor Details");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Blood Group: " + bloodGroup);
System.out.println("Units Donated: " + units);

int totalUnits = units + 0;
System.out.println("Total Units Recorded: " + totalUnits);

sc.close();
}
}