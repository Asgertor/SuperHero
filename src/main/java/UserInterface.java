import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    Database db = new Database();

    public void initializeProgram() {
        while (true) {
            System.out.println("""
                                                                          
                    Menu options:
                    1. New superhero
                    2. View current superheroes
                    3. Search for a superhero
                    4. Edit superhero
                    
                    9. quit program
                    """);
            int userInput = readInt();
            handleUserInput(userInput);

        }
    }
    public void handleUserInput(int userInput) {
        switch (userInput) {
            case 1 -> createSuperHero();
            case 2 -> viewCurrentSuperheroes();
            case 3 -> searchSuperHero();
            case 4 -> editSuperHero();
            case 9 -> System.exit(0);
        }
    }
    public void createSuperHero(){
        System.out.print("\nCreate new superhero:\n");

        System.out.print("Real name:");
        String realName = sc.nextLine();

        System.out.print("Superhero name:");
        String superHeroName = sc.nextLine();

        System.out.print("Race:");
        String race = sc.nextLine();

        System.out.print("Superpower:");
        String superPower = sc.nextLine();

        System.out.print("Powerlevel:");
        double powerlevel = readDouble();

        System.out.print("Year of origin:");
        int yearOfOrigin = readInt();

        db.addSuperHero(realName, superHeroName, race, superPower, powerlevel, yearOfOrigin);
        System.out.println("\nSuperhero stored!\n");
    }

    public void viewCurrentSuperheroes(){
        System.out.printf("Found %s superheoes!", db.getAllSuperheroes().size());
        for (SuperHero superHero : db.getAllSuperheroes()) {
            System.out.printf("\nHere is a list of them:%s \n", superHero);
        }
    }
    public void searchSuperHero() {
        System.out.println("Type real name of the superhero you wish to find");
        String searchName = sc.nextLine();
        if (!db.searchSuperheroes(searchName).isEmpty()) {
            System.out.println("Superheroes found!");
            for (SuperHero s : db.searchSuperheroes(searchName)) {
                System.out.println(s + "\n");
            }
        } else {
            System.out.println("Nothing found");
        }
    }

    public void editSuperHero() {
        System.out.println("Type in name of superhero you wish to edit: ");
        String searchName = sc.nextLine();
        ArrayList<SuperHero> searchResult = db.searchSuperheroes(searchName);
        if (!searchResult.isEmpty()) {
            System.out.println("Superheroes found\n\n");
            for (int i = 0; i < searchResult.size(); i++) {
                System.out.println(i + 1 + ".\n" + searchResult.get(i));
                System.out.println();
            }
            System.out.println("Type number of superhero you wish to edit");
            int heroNumber = readInt();
            SuperHero editSuperhero = searchResult.get(heroNumber - 1);

            System.out.println("Type new data and press ENTER. If you do not wish to edit data press Enter.");

            System.out.println("Real name: " + editSuperhero.getName());
            String newCivilianName = sc.nextLine();
            if (!newCivilianName.isEmpty()){
                editSuperhero.setName(newCivilianName);
            }

            System.out.println("Superheroname: " + editSuperhero.getSuperHeroName());
            String updatedSuperHeroName = sc.nextLine();
            if (!updatedSuperHeroName.isEmpty()){
                editSuperhero.setSuperHeroName(updatedSuperHeroName);
            }

            System.out.println("Race " + editSuperhero.getRace());
            String updatedRace = sc.nextLine();
            if (!updatedRace.isEmpty()){
                editSuperhero.setRace(updatedRace);
            }

            System.out.println("Superpower: " + editSuperhero.getSuperPower());
            String newSuperpower = sc.nextLine();
            if (!newSuperpower.isEmpty()){
                editSuperhero.setSuperPower(newSuperpower);
            }
            System.out.println("Powerlevel: " + editSuperhero.getPowerLevel());
            String updatedPowerLevel = sc.nextLine();
            if (!updatedPowerLevel.isEmpty()){
                editSuperhero.setPowerLevel(Double.parseDouble(updatedPowerLevel));
            }

            System.out.println("Year of origin: " + editSuperhero.getYearOfOrigin());
            String updatedYearOfOrigin = sc.nextLine();
            if (!updatedYearOfOrigin.isEmpty()){
                editSuperhero.setYearOfOrigin(Integer.parseInt(updatedYearOfOrigin));
            }


            System.out.println("Edit stored:");
            System.out.println();
            System.out.println(editSuperhero);
            System.out.println();

        } else {
            System.out.println("No superhero found with the name: " + searchName + "\n");
        }
    }
    public int readInt() {
        while(!sc.hasNextInt()) {
            String text = sc.nextLine();
            System.out.println();
            System.out.println(text + " is not a whole number. Please try again.");
            System.out.println();
        }
        int temp = sc.nextInt();
        sc.nextLine();
        return temp;
    }
    public double readDouble() {
        while(!sc.hasNextDouble()) {
            String text = sc.nextLine();
            System.out.println();
            System.out.println(text + " is not a decimal number. Please try again.");
            System.out.println();
        }
        double temp = sc.nextDouble();
        sc.nextLine();
        return temp;
    }

    }
