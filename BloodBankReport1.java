import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class BloodStock {
String bloodGroup;
int units;

BloodStock(String bloodGroup, int units) {
this.bloodGroup = bloodGroup;
this.units = units;
}
}

public class BloodBankReport1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

ArrayList<BloodStock> stock = new ArrayList<>();

stock.add(new BloodStock("A+", 5));
stock.add(new BloodStock("B+", 4));
stock.add(new BloodStock("O+", 8));
stock.add(new BloodStock("AB+", 3));

Collections.sort(stock, (a, b) ->
a.bloodGroup.compareTo(b.bloodGroup));

System.out.println("Blood Bank Report");

stock.forEach(s ->
System.out.println(s.bloodGroup + " Units: " + s.units));

int total = stock.stream()
.mapToInt(s -> s.units)
.sum();

System.out.println("Total Blood Units: " + total);

System.out.print("Enter blood group to search: ");
String search = sc.nextLine();

stock.stream()
.filter(s -> s.bloodGroup.equalsIgnoreCase(search))
.forEach(s -> System.out.println(
"Available Units: " + s.units));

sc.close();
}
}