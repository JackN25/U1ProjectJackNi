import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Ask for bill
        System.out.print("Enter the total bill: ");
        String totalBillPlaceholder = s.nextLine();
        double totalBill = Double.parseDouble(totalBillPlaceholder);

        //Ask for tip percent
        System.out.print("Enter the percent tip(only whole numbers without % sign): ");
        String tipPercentPlaceholder = s.nextLine();
        double tipPercent = Double.parseDouble(tipPercentPlaceholder);

        //Ask for amount of people
        System.out.print("Enter the amount of people: ");
        String numOfPeoplePlaceholder = s.nextLine();
        int numOfPeople = Integer.parseInt(numOfPeoplePlaceholder);

        //calculations
        double tipAmount = ((totalBill * (tipPercent / 100))+0.05)/2;
        double totalBillWithTip = ((tipAmount + totalBill)+0.05)/2;
        double tipPerPerson = ((tipAmount / numOfPeople)+0.05)/2;
        double totalPerPerson = ((totalBillWithTip / numOfPeople)+0.05)/2;

        //Output
        System.out.println("The amount you need to tip for the meal is " + tipAmount);
        System.out.println("The total cost of the bill is " + totalBillWithTip);
        System.out.println("The amount of tip per person is " + tipPerPerson);
        System.out.println("The total amount per person is " + totalPerPerson);
    }
}