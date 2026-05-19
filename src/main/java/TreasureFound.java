public class TreasureFound implements ScoreEvent {
    private final String treasureName;
    private final String rarity;

    public TreasureFound(String treasureName, String rarity) {
        this.treasureName = treasureName;
        this.rarity = rarity;
    }

    @Override
    public String getName() {
        return this.treasureName;
    }

    @Override
    public int getPoints(){
      switch (this.rarity.toLowerCase()){
          case "common" -> {
              return 25;
          }
          case "rare" -> {
              return 75;
          }
          case "legendary" -> {
              return 150;
          }
          default -> {
              return 0;
          }
      }
    }

    @Override
    public String getSummary(){
        return "Found " + this.rarity+" "+this.treasureName+"for "+ getPoints()+" points";
    }
}
