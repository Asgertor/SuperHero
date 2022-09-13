import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Database db = new Database();
        while (true) {
            System.out.println("""
                
                Menu options:
                1. New superhero
                2. View current superheroes
                9. quit program
                """);
            int userInput = sc.nextInt();
            sc.nextLine();

            if (userInput == 1) {
                System.out.printf("\nCreate new superhero:\n");
                System.out.print("Real name:");
                String realName = sc.nextLine();
                System.out.print("Superhero name:");
                String superHeroName = sc.nextLine();
                System.out.print("Race:");
                String race = sc.nextLine();
                System.out.print("Superpower:");
                String superPower = sc.nextLine();
                System.out.print("Powerlevel:");
                double powerlevel = sc.nextDouble();
                System.out.print("Year of origin:");
                int yearOfOrigin = sc.nextInt();
                db.addSuperHero(realName, superHeroName, race, superPower, powerlevel, yearOfOrigin);
            }
            else if (userInput == 2) {
                for (SuperHero superHero: db.getAllSuperheroes()) {
                    System.out.println(superHero);
                }
                
            } else {
                System.exit(0);
            }
        }
    }
}

