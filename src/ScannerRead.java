import java.util.Scanner;

public class ScannerRead {
        private Scanner scanner;

        public ScannerRead() {
            scanner = new Scanner(System.in);
        }

        public String ReadEntry() {
            return scanner.nextLine();
        }
    }

