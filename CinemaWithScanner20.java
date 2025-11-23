import java.util.Scanner;

public class CinemaWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] audience = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n=== Mini Cinema Menu ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Enter a name: ");
                String name = sc.nextLine();

                int row, column;

                while (true) {
                    System.out.print("Enter row (1-4): ");
                    row = sc.nextInt();

                    System.out.print("Enter column (1-2): ");
                    column = sc.nextInt();
                    sc.nextLine();

                    if (row < 1 || row > 4 || column < 1 || column > 2) {
                        System.out.println("Seat number not available! Please choose again.");
                    } else if (audience[row - 1][column - 1] != null) {
                        System.out.println("Seat is already occupied! Choose another seat.");
                    } else {
                        break; 
                    }
                }

                audience[row - 1][column - 1] = name;
                System.out.println("Audience added successfully!");

            } else if (menu == 2) {
                System.out.println("\n=== Audience List ===");

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (audience[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(audience[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Program ended.");
                break;

            } else {
                System.out.println("Invalid menu!");
            }
        }

        sc.close();
    }
}
