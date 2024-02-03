public class GrazPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("hawaii")) {
            return new GrazHawaiiPizza();

        } else if (item.equals("veggie")) {
            return new GrazVeggiePizza();
        } else {
            return null;
        }
    }
}