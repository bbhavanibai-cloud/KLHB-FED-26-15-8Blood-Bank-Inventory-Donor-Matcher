import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BloodBankReport {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String[] groups = {"A+", "B+", "O+", "AB+"};
int[] units = new int[4];

try {
for (int i = 0; i < groups.length; i++) {
System.out.print("Enter " + groups[i] + " blood units: ");
units[i] = sc.nextInt();
}

System.out.print("Enter blood group to search: ");
sc.nextLine();
String search = sc.nextLine();

boolean found = false;

for (int i = 0; i < groups.length; i++) {
if (groups[i].equalsIgnoreCase(search)) {
System.out.println("Blood Group: " + groups[i]);
System.out.println("Available Units: " + units[i]);
found = true;
break;
}
}

if (!found) {
System.out.println("Blood group not found");
}

Arrays.sort(groups);

FileWriter fw = new FileWriter("BloodBankReport.txt");

fw.write("Blood Bank Report\n");

int total = 0;

for (int i = 0; i < groups.length; i++) {
int index = -1;

for (int j = 0; j < 4; j++) {
if (groups[i].equals(
j == 0 ? "A+" :
j == 1 ? "B+" :
j == 2 ? "O+" : "AB+")) {
index = j;
}
}

fw.write(groups[i] + "\n");
}

for (int i = 0; i < units.length; i++) {
total = total + units[i];
}

fw.write("Total Blood Units: " + total + "\n");
fw.close();

System.out.println("Report saved successfully");
System.out.println("Total Blood Units: " + total);

} catch (IOException e) {
System.out.println("File error: " + e.getMessage());
}

sc.close();
}
}