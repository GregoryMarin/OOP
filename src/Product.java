public class Product {
    private String name;
    private String brand;
    private double price;

    double getPrice(){
        return price;
    }

    void setPrice(double inputPrice){
        checkPrice(inputPrice);
    }

    public Product(){
        this("product",  100);
    }

    public Product(String inputName, double inputPrice){
        this("noname", inputName, inputPrice);
    }
    public Product(String brand, String name, double price){
        this.brand = brand;
        checkName(name);
        checkPrice(price);
    }

    private void checkPrice(double inputPrice){
        if (inputPrice <= 0){
            price = 100;
        }
        else {
            price = inputPrice;
        }
    }

    private void checkName(String inputName){
        if (inputName.length() < 5){
            inputName = "product";
        }
        else{
            inputName = inputName;
        }
    }

    String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }
}

