public class WhatSeasonIs {

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);

        switch (month) {

            case 12:
            case 1:
            case 2:
                System.out.println("Its Winter!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Its Spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Its Summer!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Its Autumn!");
                break;

            default:
                System.out.println("Wrong month number!");
                break;
        }


    }
}
