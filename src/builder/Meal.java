package builder;

public class Meal {
    private String appetizer;
    private String mainCourse;
    private String dessert;

    public void setAppetizer(String appetizer) { this.appetizer = appetizer; }
    public void setMainCourse(String mainCourse) { this.mainCourse = mainCourse; }
    public void setDessert(String dessert) { this.dessert = dessert; }

    @Override
    public String toString() {
        return "Meal{appetizer='" + appetizer + "', mainCourse='" + mainCourse + "', dessert='" + dessert + "'}";
    }
}