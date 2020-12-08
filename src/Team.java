public class Team {
    private String teamName;
    private final int MAXAMOUNT_OF_WARRIORS = 3;
    private GameCharacter[] characters = new GameCharacter[3];
    private int currentWarriors;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void add(GameCharacter gameCharacter) {
        if (currentWarriors < MAXAMOUNT_OF_WARRIORS) {
            characters[currentWarriors] = gameCharacter;
            currentWarriors++;
        } else
            System.out.println("Osiągnięto maksymalną liczbę pracowników !!!");
    }
}