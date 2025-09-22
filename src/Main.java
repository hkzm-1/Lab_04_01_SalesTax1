//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double itemPrice = 50;
        double salesTax = 0.05;
        double totalCost = 0;
        totalCost = itemPrice * salesTax;
        System.out.println("the price is " + itemPrice);
        System.out.println("the sales tax is " + salesTax);
        System.out.println("the total price is " + totalCost);
    }
}