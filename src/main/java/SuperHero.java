public class SuperHero {
    private String name;
    private String superHeroName;
    private String race;
    private String superPower;
    private double powerLevel;
    private int yearOfOrigin;

    public SuperHero(String name, String superHeroName, String race, String superPower, double powerLevel, int yearOfOrigin){
        this.name = name;
        this.superHeroName = superHeroName;
        this.race = race;
        this.superPower = superPower;
        this.powerLevel = powerLevel;
        this.yearOfOrigin = yearOfOrigin;
    }
    public SuperHero(String name, String race, String superPower, double powerLevel, int yearOfOrigin){
        this.name = name;
        this.race = race;
        this.superPower = superPower;
        this.powerLevel = powerLevel;
        this.yearOfOrigin = yearOfOrigin;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void set(String superHeroName) {
        this.superHeroName = superHeroName;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }
    public void setYearOfOrigin(int yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }
    public String getName(){
        return name;
    }
    public String getSuperHeroName(){
        return superHeroName;
    }
    public String getRace(){
        return race;
    }
    public String getSuperPower(){
        return superPower;
    }
    public double getPowerLevel(){
        return powerLevel;
    }
    public int getYearOfOrigin(){
        return yearOfOrigin;
    }

    @Override
    public String toString() {
        return  "\nname= " + name +
                "\nsuperHeroName= " + superHeroName +
                "\nrace= " + race +
                "\nsuperPower= " + superPower +
                "\npowerLevel= " + powerLevel +
                "\nyearOfOrigin= " + yearOfOrigin;
    }
}
