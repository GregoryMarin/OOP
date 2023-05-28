import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

//        Product product1 = new Product("Marclin", "Good Water", -100.12);

//        product1.brand = "Marclin";
//        product1.name = "Bottle of water";
//        product1.price = 100.12;
        // System.out.println(product1.displayInfo());

        BottleOfWater bottleOfWater = new BottleOfWater("LLC Great Mountine", "Water", 120, 1.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("LLC Great Mountine", "Water", 220, 2);
        BottleOfWater bottleOfWater3= new BottleOfWater("LLC Great Mountine", "Water", 120, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("LLC Great Mountine", "Water", 120, 5);
        // System.out.println(bottleOfWater.displayInfo());
        BottleOfMilk bottleOfMilk = new BottleOfMilk("LLC Good deal", "Milk", 140, 2, 3.5);
        // System.out.println(bottleOfMilk.displayInfo());

        Product chockolate = new Chockolate("Nefis Corp", "Snikers", 60, 55, 150 );
        Product chockolate2 = new Chockolate("Nefis Corp", "Mars", 45, 300, 290 );
        Product chockolate3 = new Chockolate("Nefis Corp", "Olimpus", 90, 140, 650 );
        Product chockolate4 = new Chockolate("Nefis Corp", "Snikers", 130, 90, 450 );

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfMilk);
        products.add(chockolate);
        products.add(chockolate2);
        products.add(chockolate3);
        products.add(chockolate4);

//        System.out.println();
        VendingMachine vendingMachine = new VendingMachine(products);
//        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(4);
//        if (bottleOfWaterResult != null){
//            System.out.println("You bought: ");
//            System.out.println(bottleOfWaterResult.displayInfo());
//        }
//        else {
//            System.out.println("Ther's no this bottle in machine!");
//        }

        Chockolate chockolateRes = vendingMachine.getChockolate(290);
        if (chockolateRes != null){
            System.out.println("You bought: ");
            System.out.println(chockolateRes.displayInfo());
        }
        else {
            System.out.println("Ther's no this chockolate in machine!");
        }

    }
}