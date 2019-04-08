package BuilderPattern;

import com.sun.xml.internal.ws.api.model.MEP;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegBurger();
        vegMeal.showItem();
        System.out.println("\n");

        Meal nonVegMeal = mealBuilder.prepareNonVegburger();
        nonVegMeal.showItem();
    }
}
