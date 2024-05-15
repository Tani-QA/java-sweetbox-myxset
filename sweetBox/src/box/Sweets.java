package box;

//свойства сладостей
abstract class Sweets {

    String name;
    double weight;
    double price;
    String uniceParametr;


    public Sweets(String name, double weight, double price, String uniceParametr) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniceParametr = uniceParametr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUniceParametr() {
        return uniceParametr;
    }

    public void setUniceParametr() {
        this.uniceParametr = uniceParametr;
    }
}
