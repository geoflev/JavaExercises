import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] friends = new String[4];

        for(int i=0;i<friends.length;i++){
            System.out.println("Tell me your best friends name!");
            friends[i] = scanner.next();
        }
        System.out.println("Your 4 best friends with traditional for are : ");
        for(int i=0;i<friends.length;i++){
            System.out.println(friends[i]);
        }

        System.out.println("Your 4 best friends with enhanced for are : ");
        for(String buddy : friends){
            System.out.println(buddy);
        }

        System.out.println("Your 4 best friends with while are : ");
        int i = 0;
        while(i < friends.length){
            System.out.println(friends[i]);
            i++;
        }

        i = 0;
        System.out.println("Your 4 best friends with do-while are : ");
        do{
            System.out.println(friends[i]);
            i++;
        }while(i < friends.length);
    }
}
