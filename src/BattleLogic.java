public class BattleLogic {

    public void attackSecondTeam(Team team1, Team team2) {
        calculateStrengthOfAttack(team1, team2);

    }

    private double calculateStrengthOfAttack(Team team1, Team team2) {
        GameCharacter[] characters = team1.getCharacters();
        double strengthOfAttack = 0;
        for (int i = 0; i < characters.length; i++) {
            strengthOfAttack += characters[i].getStrengthOfAttack();
        }
        return strengthOfAttack;

    }

}
