public class Main extends Planner{
  public static void main(String[] args) {
    
    Mission m1 = new Mission(1, "08-01-2023 18:00", "08-01-2023 18:05", "Иванова", "Разработать план мероприятий");
    Mission m2 = new Mission(2, "08-02-2023 1:00", "09-02-2023 20:05", "Петров", "Выполнить анализ устранения ошибок за прошлый год");
  

    System.out.println(m1.getMission()); 
    System.out.println( m2); 

    Planner plan = new Planner();
    plan.appendMissionHighShip(m1);
    plan.appendMissionMediumShip(m2);

    System.out.println("Высокий приоритет: " + new Serch(plan).spend(m2, Priority.high));
    // plan.writeCsv();
}

}