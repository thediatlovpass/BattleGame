public class Defender extends Character{
    public Defender(String name, double strengthOfAttack, double strengthOfDefence, double energy, double bonusDefence) {
        super(name, strengthOfAttack, strengthOfDefence, energy);
        this.bonusDefence = bonusDefence;
    }

    private double bonusDefence = 0.2;
}
