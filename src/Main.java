import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RandomGenerator generator = new RandomGenerator();
        ScannerRead scanner = new ScannerRead();

        Difficults difficults = new Difficults();

        int chances, number;
        String difficultOption;
        number = generator.RandomNumber(51);
        System.out.println("Welcome to the Number Guessing Game\n" +
                           "I'm thinking of a number between 1 and 50\n" + " ");

        while(true){
            System.out.println("Please Select de difficulti level: \n" +
                               "1. Easy (10 chances)\n" +
                               "2. Medium (5 chances)\n" +
                               "3. Hard (3 chances)");

            difficultOption = scanner.ReadEntry();

            if (difficultOption.equals("1")){
                chances = 10;
                System.out.println("Great! You have selected the Easy difficult level");
                difficults.Easy(chances, number);
                break;
            }
            else if (difficultOption.equals("2")){
                chances = 5;
                System.out.println("Great! You have selected the Medium difficult level");
                difficults.Medium(chances, number);
                break;
            }
            else if (difficultOption.equals("3")){
                chances = 3;
                System.out.println("Great! You have selected the Hard difficult level");
                difficults.Hard(chances, number);
                break;
            }
            else{
                System.out.println("Insira uma opção válida!");
                continue;
            }
        }
    }
}

