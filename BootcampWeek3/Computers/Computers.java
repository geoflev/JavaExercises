public abstract class Computers {
    private String brand;
    protected int price;
    private static int computersCreated;


    private Computers(int price) {
        this.price = price;
        computersCreated++;
    }

    public Computers(String brand, int price) {
        this(price);        //chain constructor.o panw constructor den xrisimopoieitai opote to bazw private
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) { //private wste na mi mporw na tis allaksw brand apo main
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public abstract void setPrice(int price);

    public static int getComputersCreated() {
        return computersCreated;
    }
}
