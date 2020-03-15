public class GoToWork {

    public static void main(String[] args) {

        int dayOfTheWeek = Integer.parseToInt(args[0]);
        switch(dayOfTheWeek):

        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
        System.out.println("Go to work!");
        break;
        case 6 :
        case 7 :
        System.out.println("Relaxing day!");
        break;
        default:
        System.out.println("Wrong day of the Week");


    }
}
