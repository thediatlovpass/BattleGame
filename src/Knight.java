public class Knight extends GameCharacter{

    private final double BONUS_ATTACK = 0.3;
    private final double BONUS_DEFENCE = 0.3;

    public Knight(String name, double strengthOfAttack, double strengthOfDefence, double energy) {
        super(name, strengthOfAttack, strengthOfDefence, energy);
        strengthOfAttack += BONUS_ATTACK * strengthOfAttack;
        strengthOfDefence += BONUS_DEFENCE * strengthOfDefence;
        super.setStrengthOfAttack(strengthOfAttack);
        super.setStrengthOfDefence(strengthOfDefence);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
