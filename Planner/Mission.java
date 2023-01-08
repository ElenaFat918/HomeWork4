

public class Mission {
    Integer id;
    String date;
    String deadline;
    String name;
    String mission;
    

    //id, дату добавления записи, время добавления записи, дедлайн задачи, ФИО автора,
    public Mission(Integer id, String date, String deadline, String name, String mission) {
        this.id = id;
        this.date = date;
        this.deadline = deadline;
        this.name = name;
        this.mission = mission;
    }


    public Integer getId() {
        return id;
    }public String getDate() {
        return date;
    }public String getDeadline() {
        return deadline;
    }public String getName() {
        return name;
    }public String getMission() {
        return mission;
    }


    

    @Override
    public String toString() {
        return id + " " + date + " " + deadline + " " + name  + " " + mission;
    }
}