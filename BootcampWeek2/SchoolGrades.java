public class SchoolGrades {

    public static void main(String[] args) {

        char grade = args[0].charAt(0);
        switch(grade){

            case 'A':
                System.out.println("Perfect");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Pass");
                break;
            case 'D':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }
    }
}
