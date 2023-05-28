public class Chockolate extends Product{
    /*
    Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад и калории) и включить
    в список продуктов в вендинг машину.
    Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).
     */

    private double size;

    private double colories;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getColories() {
        return colories;
    }

    public void setColories(double colories) {
        this.colories = colories;
    }

    public Chockolate(String brand, String name, double price, double size, double colories) {
        super(brand, name, price);
        this.size = size;
        this.colories = colories;
    }

    public String displayInfo() {
        return String.format("[Brand]%s, [Name]%s = [rub]%f, [size]%f, [grams]%f", brand, name, price, size, colories);
    }
}
