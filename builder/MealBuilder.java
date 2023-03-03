package builder;

public class MealBuilder {
    public Meal prepareNonVegMeal(){
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new ChickenBurger());
        nonVegMeal.addItem(new Pepsi());
        return nonVegMeal;
    }
    public Meal prepareVegMeal(){
        Meal vegMeal = new Meal();
        vegMeal.addItem(new Vegburger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }  
}
