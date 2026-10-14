import java.util.Scanner;
public class DonorMatcher {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter patient name ");
String patient = input.nextLine();
System.out.print("Enter required blood group ");
String requiredBlood = input.nextLine();
System.out.print("Enter donor name ");
String donor = input.nextLine();
System.out.print("Enter donor blood group ");
String donorBlood = input.nextLine();
if (requiredBlood.equalsIgnoreCase(donorBlood)) {
System.out.println("Blood group match found");
System.out.println("Patient name " + patient);
System.out.println("Donor name " + donor);
System.out.println("Blood group " + donorBlood);
} else {
System.out.println("Blood group does not match");
}
input.close();
}
}