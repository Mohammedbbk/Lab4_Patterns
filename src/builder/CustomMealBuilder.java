package builder;

public class CustomMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    public MealBuilder addAppetizer(String appetizer) {
        meal.setAppetizer(appetizer);
        return this;
    }

    public MealBuilder addMainCourse(String mainCourse) {
        meal.setMainCourse(mainCourse);
        return this;
    }

    public MealBuilder addDessert(String dessert) {
        meal.setDessert(dessert);
        return this;
    }

    public Meal build() {
        return meal;
    }
}