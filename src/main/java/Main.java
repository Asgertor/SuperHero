import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SuperHero[] superHeroes = new SuperHero[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Type name, superhero name, race, superpower, powerlevel and originyear");

        for (int i = 0; i < 5; i++) {
            System.out.printf("\nYou have %s supeheroes \nCreate new superhero:", i);
            superHeroes[i] = new SuperHero(sc.next(),sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
            System.out.println(superHeroes[i]);
        }

        //SuperHero s1 = new SuperHero("Bruce Wayne", "Batman", "Human", "Billionaire", 5, 1921);

//        s1.setPowerLevel(sc.nextInt());


        System.out.println(superHeroes[1]);



    }
}

