import java.util.ArrayList;

public class Database {

    private ArrayList<SuperHero> superHeroes = new ArrayList<>();

    public SuperHero getSuperhero(int index) {
        return superHeroes.get(index);
    }

    public void addSuperHero(String name, String superHeroName, String race, String superPower, double powerLevel, int yearOfOrigin) {
        superHeroes.add(new SuperHero(name, superHeroName, race, superPower, powerLevel, yearOfOrigin));
    }
    public ArrayList<SuperHero> getAllSuperheroes(){
        return superHeroes;
    }

    public ArrayList<SuperHero> searchSuperheroes (String name) {
        ArrayList<SuperHero> searchResult = new ArrayList<>();
        for (SuperHero i: superHeroes) {
            if(i.getName().contains(name)) {
                searchResult.add(i);
            }
        }
        return searchResult;
    }
    public void deleteSuperHero(String name){
        int foundIndex = -1;
        for (int i = 0; i < superHeroes.size(); i++) {
            if (superHeroes.get(i).getSuperHeroName().equals(name)) {
                foundIndex = i;
            }
        }
        superHeroes.remove(foundIndex);
    }

}
