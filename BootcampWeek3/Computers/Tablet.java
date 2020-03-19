public class Tablet extends Computers {

    private boolean hasBluetooth;

    public Tablet(int price) {
        super("Unknown", price);     //gia default Laptop.bazw kai to unknown ekei kai xrisimopoiw ton 2o constuctor tis computer
        hasBluetooth = false; // de xreiazetai alla mporei na mpei.einai default false
    }

    public Tablet(String brand, int price, boolean hasBluetooth) {
        super(brand, price);
        this.hasBluetooth = hasBluetooth;
        setPrice(price);
    }

    @Override
    public void setPrice(int price) {
        if (hasBluetooth) {
            this.price = price + 30; //den exw prosbasi stin price ths Computers giati einai private,ara tin kanw protected
        }
//        else{
//            this.price = price; to bgazw giati kalw to setPrice ston constructor wste na allaksei tin timi an xreiastei
//        }                             diladi an exei wifi to laptop

    }


}
