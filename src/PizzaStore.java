public abstract class PizzaStore {

abstract protected Pizza createPizza(String item);

    public PizzaStore() {

    }


    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }
}
