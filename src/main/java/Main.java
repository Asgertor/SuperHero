import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("MENU\n1. new superhero\n9. quit program\n");
        int userinput = sc.nextInt();
        Database db = new Database();
        while (true) {

            if (userinput == 1) {
                System.out.printf("\nCreate new superhero:\n");
                System.out.print("Real name:");
                String realName = sc.next();
                System.out.print("Superhero name:");
                String superHeroName = sc.next();
                System.out.print("Race:");
                String race = sc.next();
                System.out.print("Superpower:");
                String superPower = sc.next();
                System.out.print("Powerlevel:");
                double powerlevel = sc.nextDouble();
                System.out.print("Year of origin:");
                int yearOfOrigin = sc.nextInt();
                db.addSuperHero(realName, superHeroName, race, superPower, powerlevel, yearOfOrigin);
                System.out.println(db.getSuperhero(0));
            } else {
                System.exit(0);
            }
        }
    }
}

