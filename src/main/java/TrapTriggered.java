public class TrapTriggered implements ScoreEvent{
    private final String trapName;
    private final int damage;

    public TrapTriggered(String trapName, int damage) {
        this.trapName = trapName;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return this.trapName;
    }

    @Override
    public int getPoints() {
        return this.damage * -10;
    }

    @Override
    public String getSummary() {
        return "Triggered "+this.getName()+" Trap for " + getPoints()+ " points";
    }
}
