public class Product {
    String name;
    String brand;
    double price;

    Product(){
        brand = "noname";
        name = "product";
        price = 100;
    }

    Product(String inputName, double inputPrice){
        brand = "noname";
        name = inputName;
        price = inputPrice;
    }
    Product(String inputBrand, String inputName, double inputPrice){
        brand = inputBrand;
        name = inputName;
        price = inputPrice;
    }
    String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }
}

