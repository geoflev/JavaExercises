public class Laptop extends Computers {

    private boolean hasWifi;

    public Laptop(int price) {
        super("Unknown", price);     //gia default Laptop.bazw kai to unknown ekei kai xrisimopoiw ton 2o constuctor tis computer
        hasWifi = false; // de xreiazetai alla mporei na mpei.einai default false
    }

    public Laptop(String brand, int price, boolean hasWifi) {
        super(brand, price);
        this.hasWifi = hasWifi;
        setPrice(price);
    }

    @Override
    public void setPrice(int price) {
        if (hasWifi) {
            this.price = price + 20; //den exw prosbasi stin price ths Computers giati einai private,ara tin kanw protected
        }
//        else{
//            this.price = price; to bgazw giati kalw to setPrice ston constructor wste na allaksei tin timi an xreiastei
//        }                             diladi an exei wifi to laptop


    }


}
