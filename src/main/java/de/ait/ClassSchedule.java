package de.ait;

public class ClassSchedule {
    private String id;
    private String classType;
    private String trainerName;
    private String time;
    private String room;

    public ClassSchedule(String id, String classType, String trainerName, String time, String room) {
        this.id = id;
        this.classType = classType;
        this.trainerName = trainerName;
        this.time = time;
        this.room = room;

    }

    public String getId() {
        return id;
    }


    public String getClassType() {
        return classType;
    }


    public String getTrainerName() {
        return trainerName;
    }


    public String getTime() {
        return time;
    }


    public String getRoom() {
        return room;
    }


    @Override
    public String toString() {
        return "ClassSchedule{" +
                "id='" + id + '\'' +
                ", classType='" + classType + '\'' +
                ", trainerName='" + trainerName + '\'' +
                ", time='" + time + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

}
