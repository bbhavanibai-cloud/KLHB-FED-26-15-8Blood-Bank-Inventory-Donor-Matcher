import java.util.Scanner;

class Donor {
private String bloodGroup;

Donor(String bloodGroup) {
this.bloodGroup = bloodGroup;
}

public String getBloodGroup() {
return bloodGroup;
}
}

public class DonorMatcher {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

try {
System.out.print("Enter required blood group: ");
String required = sc.nextLine();

System.out.print("Enter donor blood group: ");
String donorGroup = sc.nextLine();

if (required.trim().isEmpty() || donorGroup.trim().isEmpty()) {
throw new Exception("Blood group cannot be empty");
}

Donor donor = new Donor(donorGroup);

if (required.equalsIgnoreCase(donor.getBloodGroup())) {
System.out.println("Blood Group Labels Match");
} else {
System.out.println("Blood Group Labels Do Not Match");
}

} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}

sc.close();
}
}