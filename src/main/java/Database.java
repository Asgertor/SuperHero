import java.util.ArrayList;

public class Database {

    private ArrayList<SuperHero> superHeroes = new ArrayList<>();

    public SuperHero getSuperhero(int index){
        return superHeroes.get(index);
    }
    public void addSuperHero(String name, String superHeroName, String race, String superPower, double powerLevel, int yearOfOrigin ){
        superHeroes.add(new SuperHero(name, superHeroName, race, superPower, powerLevel, yearOfOrigin));
    }
    }

