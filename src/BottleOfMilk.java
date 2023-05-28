public class BottleOfMilk extends Product{
    private double volume;  // Объем
    private double fatContent;  // Содержание жирности

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }
    public String displayInfo() {
        return String.format("[Bottle]%s - %s - %f - [Volume]%f, [Fat]%f", brand, name, price, volume, fatContent);
    }
}
