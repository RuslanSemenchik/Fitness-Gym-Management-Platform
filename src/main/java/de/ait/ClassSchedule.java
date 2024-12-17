package de.ait;



public class ClassSchedule {
    String id;
    String classType;
    String trainerName;
    String time;
    int room;

    public ClassSchedule(String classType , String trainerName , String time, int room) {
        this.trainerName = trainerName;
        this.classType = classType;
        this.time = time;
        this.room = room;
    }


    @Override
    public String toString() {
        return "ClassSchedule{" +
                "id=" + id +
                ", classType='" + classType + '\'' +
                ", trainerName='" + trainerName + '\'' +
                ", time='" + time + '\'' +
                ", room=" + room +
                '}';
    }
}




   // public void addClassSchedule ()








// public boolean isTrainerAvailable (String trainerName, String time){






