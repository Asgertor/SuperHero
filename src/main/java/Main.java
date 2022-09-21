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
                3. Search for a superhero
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
                    System.out.printf("%S \n", superHero);
                }
                
            }

            //Superhero search
            else if (userInput == 3){
                System.out.println("Type real name of the superhero you wish to find");
                String searchName = sc.nextLine();
                if (!db.searchSuperheroes(searchName).isEmpty()){
                    System.out.println("Superheroe found!");
                    for (SuperHero s : db.searchSuperheroes(searchName)) {
                        System.out.println(s + "\n");
                    }
                }
                else {
                    System.out.println("Nothing found");
                }

            }
            else {
                System.exit(0);
            }
        }
    }
}

