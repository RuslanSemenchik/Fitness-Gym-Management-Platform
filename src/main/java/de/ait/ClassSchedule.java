package de.ait;


import java.util.Objects;

public class ClassSchedule {
    private String id;
    private String classType;
    private String trainerName;
    private String time;
    int room;

    public ClassSchedule(String id, String classType, String trainerName, String dateSchedule, String time, int room) {
        this.id = id;
        this.trainerName = trainerName;
        this.classType = classType;
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

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassSchedule that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}






