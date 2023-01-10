import java.io.IOException;

public class Main extends Planner {
  public static void main(String[] args) {

    Mission m1 = new Mission("Иванова", 4L, "Разработать план мероприятий");
    Mission m2 = new Mission("Петров", 5L, "Выполнить анализ устранения ошибок за прошлый год");
    Mission m3 = new Mission("Сидоров", 6L, "Проверить качество записей регистратора");
    Mission m4 = new Mission("Козлова", 7L, "Разослать уведомления");
    
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(m4);
   
    System.out.println(m1.getMission());
    System.out.println( m1);

    Planner plan = new Planner();
    plan.appendMissionHighShip(m1);
    plan.appendMissionMediumShip(m2);
    plan.appendMissionLowShip(m3);
    plan.appendMissionMediumShip(m4);
    
    System.out.println("Высокий приоритет: " + new Serch(plan).spend(plan,
    Priority.high));
    System.out.println("Средний приоритет: " + new Serch(plan).spend(plan,
    Priority.medium));
    System.out.println("Низкий приоритет: " + new Serch(plan).spend(plan,
    Priority.low));
   
    try {
      plan.writeCsv();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
   
    try{
      plan.readCsv();
    } catch(IOException e){
      System.out.println(e.getMessage());
    } 
  }   
}
/*
 * С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом
 * и продолжаем погружаться в ООП.
 * Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
Например:
определить уровень приоритетов: низкий, средний, немедленное выполнение
выделить компоненту для хранения данных
выделить компоненту для организации импорта\экспорта данных
Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
данные хранятся в файле csv/jsom/xml
другие компоненты
 */