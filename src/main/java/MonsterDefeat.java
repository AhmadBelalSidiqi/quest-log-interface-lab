public class MonsterDefeat {
    private final String monsterName;
    private final int difficultyLevel;
    private final boolean boss;

    public MonsterDefeat(String monsterName, int difficultyLevel, boolean boss) {
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
    }

    public String getName() {
        return monsterName;
    }

    public int getPoints() {
        if (boss) {
            return (this.difficultyLevel * 50) + 100;
        }
        return this.difficultyLevel * 50;
    }
    public String getSummary(){
        return "Defeated "+this.monsterName+" for "+getPoints()+" points";
    }
}
