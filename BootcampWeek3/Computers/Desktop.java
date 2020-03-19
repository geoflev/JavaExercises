public class Desktop extends Computers {

    private boolean hasExtraLight;

    public Desktop(int price) {
        super("Unknown", price);     //gia default Laptop.bazw kai to unknown ekei kai xrisimopoiw ton 2o constuctor tis computer
        hasExtraLight = false; // de xreiazetai alla mporei na mpei.einai default false
    }

    public Desktop(String brand, int price, boolean hasExtraLight) {
        super(brand, price);
        this.hasExtraLight = hasExtraLight;
        setPrice(price);
    }

    @Override
    public void setPrice(int price) {
        if (hasExtraLight) {
            this.price = price + 10;
        }
//        else{
//            this.price = price;
//        }

    }


}
