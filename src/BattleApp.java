public class BattleApp {
    public static void main(String[] args) {
        double team1EnergyAfterBattle;
        double team2EnergyAfterBattle;

        Team team1 = new Team("Knights");
        team1.add(new Knight("Baron", 100, 100, 100));
        team1.add(new Knight("Baron2", 100, 100, 100));
        team1.add(new KnightCommander("SuperBaron", 150, 150, 150));

        Team team2 = new Team("Orks");
        team2.add(new Ork("Sugbu", 100, 100, 100));
        team2.add(new Ork("Sugbu2", 100, 100, 100));
        team2.add(new OrkCommander("SuperSugbu", 160, 140, 150));

        BattleLogic battleLogic = new BattleLogic();
        System.out.println("Energia drużyn przed bitwą: Drużyna: " + team1.getTeamName()
                + ", Energia: " + battleLogic. );
        team2EnergyAfterBattle = battleLogic.attackSecondTeam(team1, team2);
        team1EnergyAfterBattle = battleLogic.attackSecondTeam(team2,team1);


    }
}
