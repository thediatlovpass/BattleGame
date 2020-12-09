public class BattleLogic {

    GameCharacter[] characters;
    double energy;

    public double attackSecondTeam(Team team1, Team team2) {

        double strengthOfAttack = calculateStrengthOfAttack(team1);
        double strengthOfDefence = calculateStrengthOfDefence(team2);
        energy = calculateEnergy(team2);
        return compareStrengths(strengthOfAttack, strengthOfDefence);
    }

    private double compareStrengths(double strengthOfAttack, double strengthOfDefence) {
        if (strengthOfAttack >= strengthOfDefence) {
            energy -= (strengthOfAttack - strengthOfDefence);
            return energy;
        } else
            return energy;
    }

    private double calculateStrengthOfAttack(Team team1) {
        characters = team1.getCharacters();
        double strengthOfAttack = 0;
        for (int i = 0; i < characters.length; i++) {
            strengthOfAttack += characters[i].getStrengthOfAttack();
        }
        return strengthOfAttack;
    }

    private double calculateStrengthOfDefence(Team team2) {
        characters = team2.getCharacters();
        double strengthOfDefence = 0;
        for (int i = 0; i < characters.length; i++) {
            strengthOfDefence += characters[i].getStrengthOfDefence();
        }
        return strengthOfDefence;
    }

    double calculateEnergy(Team team2) {
        characters = team2.getCharacters();
        double energy = 0;
        for (int i = 0; i < characters.length; i++) {
            energy += characters[i].getEnergy();
        }
        return energy;
    }

    void compareEnergies(double team1EnergyAfterBattle, double team2EnergyAfterBattle) {
        if (team1EnergyAfterBattle > team2EnergyAfterBattle) {
            System.out.println("Wygrywa drużyna 1 !!!");
        } else if (team1EnergyAfterBattle == team2EnergyAfterBattle) {
            System.out.println("Remis !!!");
        } else
            System.out.println("Wygrywa drużyna 2 !!!");
    }
}

