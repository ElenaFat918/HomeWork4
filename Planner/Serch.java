import java.util.ArrayList;

public class Serch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> plans;

    public Serch(Planner planner) {
        plans = planner.getPlanner();
    }

    public ArrayList<String> spend(Mission m, Priority p) {
        for (Node i : plans) { //бегаем по узлам из дерева
            if ( i.p == p) { //достаем атрибуты и сравниваем их
                result.add(i.m.mission); //добавляем в результ список
            }
        }
        return result;
    }

}
