public class VeggiePizza extends Pizza {
    PizzaIngredientFactory factory;
    public VeggiePizza(PizzaIngredientFactory factory) { this.factory = factory; }
    void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        veggies = factory.createVeggies();
    }
}