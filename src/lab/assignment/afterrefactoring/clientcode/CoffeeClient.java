package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.CoffeeTemplate;
import lab.assignment.afterrefactoring.MochaCoffee;

public class CoffeeClient {
    public static void main(String[] args) {
        CoffeeTemplate starbuzz = new AmericanoCoffee();
        starbuzz.brewCoffee();

        System.out.println("********************");

        starbuzz = new MochaCoffee();
        starbuzz.brewCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoCoffee();
        starbuzz.brewCoffee();

    }
}
