public class Difficults {
    RandomGenerator generator = new RandomGenerator();
    ScannerRead scanner = new ScannerRead();
    String numberChoice;
    Boolean win = false;
    public void Easy(int chances, int number){

        for (int i = 1; i < chances + 1; i++) {

            System.out.println("Enter you guess: ");
            numberChoice = scanner.ReadEntry();

            int IntNumberChoice = Integer.parseInt(numberChoice);

            if (IntNumberChoice == number){

                System.out.println("You win!");
                win = true;
                break;
            }
            else if (i == 10){
                System.out.println("You lose! The number was: " + number);
                break;
            }
            if (IntNumberChoice < number){

                System.out.println("The number is greater than " + IntNumberChoice );

            }
            else if (IntNumberChoice > number){

                System.out.println("The number is less than " + IntNumberChoice);

            }


        }
    }

    public void Medium(int chances, int number){

        for (int i = 1; i < chances + 1; i++) {

            System.out.println("Enter you guess: ");
            numberChoice = scanner.ReadEntry();

            int IntNumberChoice = Integer.parseInt(numberChoice);

            if (IntNumberChoice == number){

                System.out.println("You win!");
                win = true;
                break;
            }
            else if (i == 5){
                System.out.println("You lose! The number was: " + number);
                break;
            }
            if (IntNumberChoice < number){

                System.out.println("The number is greater than " + IntNumberChoice );

            }
            else if (IntNumberChoice > number){

                System.out.println("The number is less than " + IntNumberChoice);

            }


        }
    }

    public void Hard(int chances, int number){

        for (int i = 1; i < chances + 1; i++) {

            System.out.println("Enter you guess: ");
            numberChoice = scanner.ReadEntry();

            int IntNumberChoice = Integer.parseInt(numberChoice);

            if (IntNumberChoice == number){

                System.out.println("You win!");
                win = true;
                break;
            }
            else if (i == 3){
                System.out.println("You lose! The number was: " + number);
                break;
            }
            if (IntNumberChoice < number){

                System.out.println("The number is greater than " + IntNumberChoice );

            }
            else if (IntNumberChoice > number){

                System.out.println("The number is less than " + IntNumberChoice);

            }
        }
    }
}

