package c;

public class GlutenFreePizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Gluten Free Pizza");
    }
    public void bake() {
        System.out.println("Baking Gluten Free Pizza");
    }
    public void cut() {
        System.out.println("Cutting Gluten Free Pizza");
    }
    public void box() {
        System.out.println("Boxing Gluten Free Pizza");
    }
}