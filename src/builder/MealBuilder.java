package builder;

public interface MealBuilder {
    MealBuilder addAppetizer(String appetizer);
    MealBuilder addMainCourse(String mainCourse);
    MealBuilder addDessert(String dessert);
    Meal build();
}