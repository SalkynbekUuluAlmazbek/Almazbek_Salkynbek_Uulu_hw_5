
public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperSkill;

    public Hero(int theHeroHealth, int theHeroDamage, String theHeroSuperSkill) {
        System.out.println(this);
        this.heroHealth = theHeroHealth;
        this.heroDamage = theHeroDamage;
        this.heroSuperSkill = theHeroSuperSkill;

    }
    public Hero(int theHeroHealth, int theHeroDamage){
        System.out.println(this);
        this.heroHealth = theHeroHealth;
        this.heroDamage = theHeroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperSkill() {
        return heroSuperSkill;
    }
}
