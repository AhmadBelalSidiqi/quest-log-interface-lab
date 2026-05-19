import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuestLog questLog = new QuestLog();
        String menu = """
                Please chose one of the following:
                1) Add Monster Defeat
                2) Add Treasure Found
                3) Add Trap Triggered
                4) Add Room Explored
                5) View quest Log
                0) Quit
                """;
        boolean running = true;
        do {
            System.out.println(menu);
            String input = scanner.nextLine();
            switch (input){
                case "1" -> {
                    System.out.println("Enter monster name: ");
                    String name = scanner.nextLine();
                    System.out.println("Difficult level(1-5): ");
                    int difficulty = Integer.parseInt(scanner.nextLine());
                    System.out.println("Is it a boss true/false");
                    boolean boss = Boolean.parseBoolean(scanner.nextLine());
                    questLog.addEvent(new MonsterDefeat(name,difficulty,boss));
                }
                case "2"->{
                    System.out.println("Enter treasure name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter rarity (common - rare-  legendary ): ");
                    String rarity = scanner.nextLine();
                    questLog.addEvent(new TreasureFound(name,rarity));
                }
                case "3" ->{
                    System.out.println("Enter trap Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the damage: ");
                    int damage = Integer.parseInt(scanner.nextLine());
                    questLog.addEvent(new TrapTriggered(name,damage));
                }
                case "4" -> {
                    System.out.println("Enter room name:");
                    String name = scanner.nextLine();
                    System.out.println("Is it a secret room true/false:  ");
                    boolean secretRoom = Boolean.parseBoolean(scanner.nextLine());
                    questLog.addEvent(new RoomExplored(name,secretRoom));
                }
                case "5" ->
                    questLog.printSummary();

                case "0"->
                    running = false;
            }


        }while (running);

        System.out.println("Thanks for using our application ");
    /*
    1) What problem did the ScoreEvent interface solve?
    a) With ScoreEvent we handled different type of events that shares a common behavior
    2) Why is QuestLog better with List<ScoreEvent> than with separate lists for each event type?
    a) using list is better cause we store all events in collection set and allow for more flexible programming.
    3) What code had to change when you added TrapTriggered and RoomExplored?
    a) the only code that needed to change was to add new class.
    4) What code did not have to change?
    a) QuestLog and ScoreEvent stayed the same.
    5) Would an abstract class have been better here? Why or why not?
    a) abstract can work, but interface is a better option here, because the common fields they have is
    String name field, and interface is more flexile and easier to expand.


    */


    }
}
