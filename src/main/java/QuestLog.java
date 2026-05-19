import java.util.ArrayList;
import java.util.List;

public class QuestLog {
    private final List<ScoreEvent> events;

    public QuestLog() {
        this.events = new ArrayList<>();
    }

    public void addEvent(ScoreEvent event){
        this.events.add(event);
    }

    public int getTotalScore(){
        int totalScore = 0;
        for(ScoreEvent event : this.events)
            totalScore += event.getPoints();
        return totalScore;
    }

    public ScoreEvent getHighestScoringEvent(){
        if (this.events.isEmpty())
            return null;
        ScoreEvent highestEvent = this.events.get(0);
        for (ScoreEvent event : this.events)
            if (event.getPoints() > highestEvent.getPoints())
                highestEvent = event;
        return highestEvent;
    }

    public ScoreEvent getLowestScoringEvent(){
        if (this.events.isEmpty())
            return null;
        ScoreEvent lowestEvent = this.events.get(0);
        for (ScoreEvent event : this.events)
            if (event.getPoints() < lowestEvent.getPoints())
                lowestEvent = event;
        return lowestEvent;
    }

    public void printSummary(){
        int count = 0;
        System.out.println("------------------------------");
        for (ScoreEvent event : this.events){
            count++;
            System.out.println(count+". "+event.getSummary());
        }
        System.out.println("------------------------------");
        System.out.println("Your total Score is: "+getTotalScore());
        System.out.println("Best event: "+getHighestScoringEvent().getSummary());
        System.out.println("Worst event: "+getLowestScoringEvent().getSummary());
    }
}
