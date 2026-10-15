import java.util.Scanner;

public class BloodRequest {

static void showRequests(String[] groups, int[] units, int n, int i) {
if (i == n) {
return;
}

System.out.println("Request " + (i + 1));
System.out.println("Blood Group: " + groups[i]);
System.out.println("Required Units: " + units[i]);

showRequests(groups, units, n, i + 1);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of requests: ");
int n = sc.nextInt();
sc.nextLine();

String[] groups = new String[n];
int[] units = new int[n];

for (int i = 0; i < n; i++) {
System.out.println("Request " + (i + 1));

System.out.print("Enter blood group: ");
groups[i] = sc.nextLine();

System.out.print("Enter required units: ");
units[i] = sc.nextInt();
sc.nextLine();
}

System.out.println("Blood Request Report");
showRequests(groups, units, n, 0);

sc.close();
}
}