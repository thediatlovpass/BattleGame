public class BattleLogic {

    public void attackSecondTeam(Team team1, Team team2) {
        calculateStrengthOfAttack(team1, team2);

    }

    private void calculateStrengthOfAttack(Team team1, Team team2) {
        GameCharacter[] characters = team1.getCharacters();
        for (int i = 0; i < characters.length; i++) {


        }
        System.out.println(team1.getCharacters().length);
        System.out.println(team2.getCharacters().length);
    }

}
