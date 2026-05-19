public class Program {
    public static void main(String[] args) {
        QuestLog questLog = new QuestLog();
        MonsterDefeat m1 = new MonsterDefeat("test goblin",2,false);
        TreasureFound t1 = new TreasureFound("test chest", "common");
        ScoreEvent event1 = new MonsterDefeat("Goblin Captain", 3, false);
        ScoreEvent event2 = new TreasureFound("Sapphire", "rare");
        ScoreEvent r1 = new RoomExplored("king rooms ",false);
        ScoreEvent tr1 = new TrapTriggered("kingsRoomTrap",20);
        questLog.addEvent(m1);
        questLog.addEvent(t1);
        questLog.addEvent(event1);
        questLog.addEvent(event2);
        questLog.addEvent(r1);
        questLog.addEvent(tr1);
        questLog.printSummary();
    }
}
