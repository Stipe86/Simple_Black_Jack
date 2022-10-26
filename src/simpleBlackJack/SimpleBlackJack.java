package simpleBlackJack;

import java.util.Scanner;

public class SimpleBlackJack {

    public static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {


        System.out.println("\nWelcome to Stipe86 Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press enter to begin!");

        scan.nextLine();

        int userCard1 = randomCardNumber();
        int userCard2 = randomCardNumber();

        String userCardString1 = randomCardString(userCard1);
        String userCardString2 = randomCardString(userCard2);

        System.out.println("You get a \n"+userCardString1);
        System.out.println("and a \n"+userCardString2);
        int userCardPoint1 = Math.min(userCard1, 10);
        int userCardPoint2 = Math.min(userCard2, 10);
        int userCardPointTotal = userCardPoint1+userCardPoint2;

        System.out.println("Your total is: "+userCardPointTotal);

        System.out.println("Press enter to continue");
        scan.nextLine();

        int compCard1 =randomCardNumber();
        int compCard2 =randomCardNumber();

        String compCardString1 = randomCardString(compCard1);
        String compCardString2 = randomCardString(compCard2);
        String compFacedownCard = faceDown();


        System.out.println("The dealer shows a \n"+compCardString1+"\n and has a card facing down \n"+compFacedownCard);


        int compCardPoint1 = Math.min(compCard1, 10);
        int compCardPoint2 = Math.min(compCard2, 10);
        int compCardPointTotal = compCardPoint1+compCardPoint2;

        System.out.println("The dealer's total is hidden");


        String userOption;
        while (true) {
            userOption = hitOrStay();
            if (userOption.equals("stay")) {break;}
            int userCardHit = randomCardNumber();
            int userCardPointHit = Math.min(userCardHit, 10);
            userCardPointTotal+=userCardPointHit;
            String userCardStringHit=randomCardString(userCardHit);
            System.out.println("You get a \n"+userCardStringHit);
            System.out.println("Your new total is: "+userCardPointTotal);
            if (userCardPointTotal>21) { System.out.println("Bust! You lose"); System.exit(0);}
        }

        System.out.println("Dealer's turn");
        System.out.println("The dealer's cards are\n"+compCardString1+"\n and a \n"+compCardString2);
        System.out.println("The dealer's total is: "+compCardPointTotal);
        while (compCardPointTotal<17) {
            int compCardHit=randomCardNumber();
            int compCardPointHit= Math.min(compCardHit, 10);
            String compCardStringHit=randomCardString(compCardHit);
            compCardPointTotal+=compCardPointHit;
            System.out.println("Dealer gets a \n"+compCardStringHit);
            System.out.println("The dealer's new total is: "+compCardPointTotal);

        }

        if (compCardPointTotal>21)
        {System.out.println("Bust! Dealer loses"); System.exit(0);}

        else   if (userCardPointTotal>compCardPointTotal) {
            System.out.println("You win!");}
        else if (userCardPointTotal<compCardPointTotal) {
            System.out.println("Dealer wins!");}
        else {System.out.println("It's a draw");}



        scan.close();

    }


    public static int randomCardNumber (){
        double c = Math.random()*13;
        c++;
        int rNumb = (int)c;
        return rNumb;
    }

    public static String randomCardString (int randomCardNumber) {

        switch (randomCardNumber) {
            case 1 : return "   _____\n"+
                    "  |A _  |\n"+
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n" ;

            case 2 :return "   _____\n"+
                    "  |2    |\n"+
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n" ;

            case 3 :return "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n"  ;

            case 4 :return  "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n" ;

            case 5 : return "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n"  ;

            case 6 : return "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n"  ;

            case 7 : return  "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n"  ;

            case 8 : return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n" ;

            case 9 : return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n"  ;

            case 10 : return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n" ;

            case 11 : return "   _____\n" +
                    "  |J  ww|\n"+
                    "  | o {)|\n"+
                    "  |o o% |\n"+
                    "  | | % |\n"+
                    "  |__%%[|\n"  ;

            case 12 : return "   _____\n" +
                    "  |Q  ww|\n"+
                    "  | o {(|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%O|\n" ;

            case 13 : return "   _____\n" +
                    "  |K  WW|\n"+
                    "  | o {)|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%>|\n" ;


            default : return "this should never happen";
        }
    }
    public static String faceDown () {

        return
                "   _____\n"+
                        "  |     |\n"+
                        "  |  J  |\n"+
                        "  | JJJ |\n"+
                        "  |  J  |\n"+
                        "  |_____|\n";

    }

    public static String hitOrStay () {
        System.out.println("Would you like to hit or stay?");
        String userOption=scan.nextLine();
        while (!(userOption.equalsIgnoreCase("hit") || userOption.equalsIgnoreCase("stay"))) {
            System.out.println("Please write 'hit' or 'stay'");
            userOption=scan.nextLine();
        }
        return userOption;

    }


}
