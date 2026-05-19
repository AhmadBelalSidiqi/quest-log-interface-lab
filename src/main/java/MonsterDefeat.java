public class MonsterDefeat implements ScoreEvent {
    private final String monsterName;
    private final int difficultyLevel;
    private final boolean boss;

    public MonsterDefeat(String monsterName, int difficultyLevel, boolean boss) {
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
    }

    @Override
    public String getName() {
        return monsterName;
    }

    @Override
    public int getPoints() {
        if (boss) {
            return (this.difficultyLevel * 50) + 100;
        }
        return this.difficultyLevel * 50;
    }

    @Override
    public String getSummary(){
        return "Defeated "+this.monsterName+" for "+getPoints()+" points";
    }
}
