
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Planner {
    private ArrayList<Node> planner = new ArrayList<>();
    
    public ArrayList <Node> getPlanner() {
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
    public void writeCsv() throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("planer.csv", true), "UTF-8");
        String convertedToString = String.valueOf(getPlanner());
        writer.append(convertedToString);
        writer.append("\n");
        writer.close();
    }
}