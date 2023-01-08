
    import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Planner {
    private ArrayList<Node> planner = new ArrayList<>();
    
    public ArrayList<Node> getPlanner() {
        return planner;
    }
    
    public void appendMissionHighShip(Mission m) {
        planner.add(new Node(m, Priority.high)); 
    }
    public void appendMissionMediumShip(Mission m) {
        planner.add(new Node(m, Priority.medium)); 
    }
    public void appendMissionLowShip(Mission m) {
        planner.add(new Node(m, Priority.low)); 
    }
    public void writeCsv(Planner p) throws IOException {

        FileWriter filePlanner = new FileWriter("planer.csv", true);
        // List<String> list = new ArrayList<>();
        String convertedToString = String.valueOf( p);
        filePlanner.append(convertedToString);
        filePlanner.append("\n");
        filePlanner.close();
      
      }
   
}
