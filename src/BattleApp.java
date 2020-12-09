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
        team2.add(new OrkCommander("SuperSugbu", 460, 140, 150));

        BattleLogic battleLogic = new BattleLogic();
        System.out.println("Energia drużyn przed bitwą: ");
        System.out.println("Drużyna: " + team1.getTeamName() + ", Energia: " + battleLogic.calculateEnergy(team1));
        System.out.println("Drużyna: " + team2.getTeamName() + ", Energia: " + battleLogic.calculateEnergy(team2));
        team2EnergyAfterBattle = battleLogic.attackSecondTeam(team1, team2);
        team1EnergyAfterBattle = battleLogic.attackSecondTeam(team2, team1);
        System.out.println("Energia drużyn po bitwie: ");
        System.out.println("Drużyna: " + team1.getTeamName() + ", Energia: " + team1EnergyAfterBattle);
        System.out.println("Drużyna: " + team2.getTeamName() + ", Energia: " + team2EnergyAfterBattle);
        battleLogic.compareEnergies(team1EnergyAfterBattle,team2EnergyAfterBattle);

    }
}
