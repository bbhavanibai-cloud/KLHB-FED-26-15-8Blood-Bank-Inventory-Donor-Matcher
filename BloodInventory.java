import java.util.Scanner;

public class BloodInventory {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int units;
int count = 0;

while (true) {
System.out.print("Enter blood group (A+, B+, O+, AB+) or STOP to finish: ");
String bloodGroup = sc.nextLine();

if (bloodGroup.equalsIgnoreCase("STOP")) {
break;
}

System.out.print("Enter available units: ");
units = sc.nextInt();
sc.nextLine();

System.out.println("Blood Group: " + bloodGroup);
System.out.println("Available Units: " + units);

if (units < 0) {
System.out.println("Invalid stock quantity");
} else if (units == 0) {
System.out.println("Status: Not Available");
} else if (units <= 5) {
System.out.println("Status: Low Stock");
} else {
System.out.println("Status: Available");
}

count++;
System.out.println("Records Checked: " + count);
}

System.out.println("Blood Inventory Check Finished");
sc.close();
}
}