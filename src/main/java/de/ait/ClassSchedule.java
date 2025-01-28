package de.ait;

import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassSchedule {
    private static final Logger log = LoggerFactory.getLogger(ClassSchedule.class);
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

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Id is null or empty");
            log.warn("Id is null or empty");
        } else {
            this.id = id;
        }
    }

    public void setClassType(String classType) {
            if (classType == null || classType.trim().isEmpty()) {
                System.out.println("Class type is null or empty");
                log.warn("Class type is null or empty");
            } else{

        this.classType = classType;
    }
    }


    public void setTrainerName(String trainerName) {
        if (trainerName == null || trainerName.trim().isEmpty()) {
            System.out.println("Trainer name  is null or empty");
            log.warn("Trainer name  is null or empty");
        } else {
            this.trainerName = trainerName;
        }
    }

    public void setTime(String time) {
        if (time == null || time.trim().isEmpty()) {
            System.out.println("Time  is null or empty");
            log.warn("Time  is null or empty");
        } else {
            this.time = time;
        }
    }

    public void setRoom(String room) {
        if (room == null || room.trim().isEmpty()) {
            System.out.println("Room  is null or empty");
            log.warn("Room  is null or empty");
        } else {

            this.room = room;
        }
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
