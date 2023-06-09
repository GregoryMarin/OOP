import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product: products) {
            if(product instanceof BottleOfWater){
                if(((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    public Chockolate getChockolate(double colories){
        for (Product product: products) {
            if(product instanceof Chockolate){
                if(((Chockolate)product).getColories() == colories){
                    return (Chockolate) product;
                }
            }
        }
        return null;
    }
}
