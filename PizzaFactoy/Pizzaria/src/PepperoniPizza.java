public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory factory;
    public PepperoniPizza(PizzaIngredientFactory factory) { this.factory = factory; }
    void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();
    }
}