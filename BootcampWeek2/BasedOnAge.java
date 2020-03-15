public class BasedOnAge {

      public static void main(String[] args) {

       int age = Integer.parseInt(args[0]);
       if(age < 0 || age > 100)
           System.out.println("Invalid input!");
       else if(age < 16)
           System.out.println("You cant drive yet!");
       else if(age < 18)
           System.out.println("You can drive but not vote!");
       else if(age <= 21)
           System.out.println("You can vote but not drink!");
       else if(age >= 22)
           System.out.println("You can do anything!");
   }

}
