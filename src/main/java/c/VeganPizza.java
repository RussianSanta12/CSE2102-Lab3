package c;

public class VeganPizza implements Pizza{

    public void prepare() {
        System.out.println("Preparing Vegan Pizza");
    }
    public void bake() {
        System.out.println("Baking Vegan Pizza");
    }
    public void cut() {
        System.out.println("Cutting Vegan Pizza");
    }
    public void box() {
        System.out.println("Boxing Vegan Pizza");
    }
}