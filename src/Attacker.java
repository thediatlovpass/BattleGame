public class Attacker extends Character {
    public Attacker(String name, double strengthOfAttack, double strengthOfDefence, double energy, double bonusAttack) {
        super(name, strengthOfAttack, strengthOfDefence, energy);
        this.bonusAttack = bonusAttack;
    }

    private double bonusAttack = 0.2;
}
