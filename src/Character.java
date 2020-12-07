public class Character {

    private String name;
    private double strengthOfAttack;
    private double strengthOfDefence;
    private double energy;

    public Character(String name, double strengthOfAttack, double strengthOfDefence, double energy) {
        this.name = name;
        this.strengthOfAttack = strengthOfAttack;
        this.strengthOfDefence = strengthOfDefence;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrengthOfAttack() {
        return strengthOfAttack;
    }

    public void setStrengthOfAttack(double strengthOfAttack) {
        this.strengthOfAttack = strengthOfAttack;
    }

    public double getStrengthOfDefence() {
        return strengthOfDefence;
    }

    public void setStrengthOfDefence(double strengthOfDefence) {
        this.strengthOfDefence = strengthOfDefence;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
}
