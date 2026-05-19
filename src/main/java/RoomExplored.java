public class RoomExplored implements ScoreEvent {
    private final String roomName;
    private final boolean secretFound;

    public RoomExplored(String roomName, boolean secretFound) {
        this.roomName = roomName;
        this.secretFound = secretFound;
    }

    @Override
    public String getName() {
        return this.roomName;
    }

    @Override
    public int getPoints() {
        if (secretFound)
            return 20+40;
        return 20;
    }

    @Override
    public String getSummary() {
        return "Explored "+this.roomName+" for "+getPoints()+" points";
    }
}
