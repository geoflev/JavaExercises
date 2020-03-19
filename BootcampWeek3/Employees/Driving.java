public interface Driving {

    public final static int speed = 12;

    public abstract void drive();

    public default void slowDown() {                 //sta interface variables o compiler bazei public,final,static
        System.out.println("Slowing down!");         //stis methodous bazei public,abstract
    }

    default void speedUp() {                     //tis kanw default meta to java 8 kai de xrypane oi ypoloipes klaseis
        //pou xrisimopoioun ayto to interface,epeidi de xrisimopoioyme tis override methods
        System.out.println("Speeding up!");     //den klironomountai kai den ginontai override!!!
    }

    public static int getSpeed() {
        return speed;
    }
}
