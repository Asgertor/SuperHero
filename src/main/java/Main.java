import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SuperHero[] superHeroes = new SuperHero[5];
        Scanner sc = new Scanner(System.in);
        System.out.printf("MENU\nPress 1 for new superhero\nPress 9 to quit program\n");
        int userinput = sc.nextInt();

        if (userinput == 1) {
            System.out.println("Type name, superhero name, race, superpower, powerlevel and originyear");

            for (int i = 0; i < 5; i++) {
                System.out.printf("\nYou have %s supeheroes \nCreate new superhero:\n", i);

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

                superHeroes[i] = new SuperHero(realName, superHeroName, race, superPower, powerlevel, yearOfOrigin);
                System.out.println(superHeroes[i]);
            }
        }

        else {
            return;
        }
        }


        //SuperHero s1 = new SuperHero("Bruce Wayne", "Batman", "Human", "Billionaire", 5, 1921);

//        s1.setPowerLevel(sc.nextInt());
    }

