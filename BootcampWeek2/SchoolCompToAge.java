public class SchoolCompToAge {

    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if(age < 5)
            System.out.println("Den pas sxoleio akoma!");
        else if(age <= 12)
            System.out.println("Pas dimotiko!");
        else if(age < 15)
            System.out.println("Pas dymnasio!");
        else if(age < 18)
            System.out.println("Pas lykeio!");
        else if(age < 23)
            System.out.println("Eisai foititis!");
        else
            System.out.println("Den eisai mathitis pia!");
    }
}
