package lab.assignment.afterrefactoring;

public class AmericanoCoffee extends CoffeeTemplate{

    protected void addIngredients(){
        System.out.println("Add more hot water");
    }

    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }
}
