import java.util.Scanner;

public class BloodRequest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter patient name ");
String name = input.nextLine();

System.out.print("Enter blood group ");
String blood = input.nextLine();

System.out.print("Enter required units ");
int units = input.nextInt();

if (units > 0) {
System.out.println("Blood request accepted");
System.out.println("Patient name " + name);
System.out.println("Blood group " + blood);
System.out.println("Required units " + units);
} else {
System.out.println("Invalid blood request");
}

input.close();
}
}
