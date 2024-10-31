package builder;

public class RestaurantDemo {
    public static void main(String[] args) {
        Meal meal = new CustomMealBuilder()
            .addAppetizer("Salad")
            .addMainCourse("Steak")
            .addDessert("Ice Cream")
            .build();
        
        System.out.println(meal);
    }
}