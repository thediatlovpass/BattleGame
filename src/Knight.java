public class Knight extends Character{

    private final double BONUS_ATTACK = 0.2;
    private final double BONUS_DEFENCE = 0.2;

    public Knight(String name, double strengthOfAttack, double strengthOfDefence, double energy) {
        super(name, strengthOfAttack, strengthOfDefence, energy);
        strengthOfAttack = strengthOfAttack * BONUS_ATTACK;
        strengthOfDefence = strengthOfDefence + BONUS_DEFENCE;
    }
}
