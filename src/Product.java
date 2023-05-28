public class Product {
    protected String name;
    protected String brand;
    protected double price;

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

    private void checkName(String name){
        if (name.length() <= 3){
            this.name = "product";
        }
        else{
            this.name = name;
        }
        this.brand = brand;
    }

    public String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }
}

