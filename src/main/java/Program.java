public class Program {
    public static void main(String[] args) {
        MonsterDefeat m1 = new MonsterDefeat("test goblin",2,false);
        TreasureFound t1 = new TreasureFound("test chest", "common");
        System.out.println("m1 : " + m1.getSummary() +"/ " +m1.getPoints() );
        System.out.println("t1 : " + t1.getSummary() +"/ " +t1.getPoints());

    }
}
