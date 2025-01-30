package de.ait;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Slf4j
public class ScheduleManager {
    private static final Logger log = LoggerFactory.getLogger(ScheduleManager.class);
    private LocalDate schedulesDate;
    private List<ClassSchedule> daySchedules;

    public ScheduleManager(LocalDate schedulesDate) {
        this.schedulesDate = schedulesDate;
        daySchedules = new ArrayList<>();

    }

    public LocalDate getScheduleDate() {
        return schedulesDate;
    }

    public List<ClassSchedule> getDaySchedules() {
        return new ArrayList<ClassSchedule>(daySchedules);
    }

    public void addSchedule(ClassSchedule classSchedule) {
        if (classSchedule == null) {

            System.out.println("Class schedule or date of schedule is null");
            log.warn("Class schedule or date of schedule is null");
        } else if (classSchedule.getId().trim() == null || classSchedule.getId().isEmpty() ||
                classSchedule.getClassType().trim() == null || classSchedule.getClassType().isEmpty() ||
                classSchedule.getTrainerName().trim() == null || classSchedule.getClassType().isEmpty() ||
                classSchedule.getTime().trim() == null || classSchedule.getTime().isEmpty() ||
                classSchedule.getRoom().trim() == null || classSchedule.getRoom().isEmpty()) {

            System.out.println("Id or classType or,trainerName, or time or room is null or empty");
            log.warn("Id or classType or,trainerName, or time or room is null or empty");
        } else if (isTrainerAvailable(classSchedule.getTrainerName(), classSchedule.getTime()) &&
                isRoomAvailable(classSchedule.getTime(), classSchedule.getRoom())) {


            daySchedules.add(classSchedule);
            System.out.println("Class schedule with Id : " + classSchedule.getId() + " for " + getScheduleDate() + " added!");


        }
    }

    public boolean isTrainerAvailable(String trainerName, String time) {
        if (trainerName.trim() == null || trainerName.trim().isEmpty() ||
                time.trim() == null || trainerName.trim().isEmpty()) {

           // System.out.println("Trainer name or time  is null or empty");
            //log.warn("Trainer name or time  is null or empty");
            return false;
        } else {
            for (ClassSchedule classSchedule : daySchedules) {
                if (classSchedule.getTrainerName().trim().equals(trainerName.trim()) &&
                        classSchedule.getTime().trim().equals(time.trim())) {
                   // System.out.println("Trainer : " + trainerName + " at " + time + " is not available ");
                   // log.info("Trainer : " + trainerName + " at " + time + " is not available ");
                    return false;
                }

            }
            //System.out.println("Trainer : " + trainerName + " at " + time + " is available ");
            //log.info("Trainer : " + trainerName + " at " + time + " is  available ");
            return true;
        }
    }

    public boolean isRoomAvailable(String time, String room) {
        if (time.trim() == null || time.trim().isEmpty() ||
                room.trim() == null || room.trim().isEmpty()) {
            //System.out.println("Time or room  is null or empty");
            //log.warn("Time or room  is null or empty");
            return false;
        } else {
            for (ClassSchedule classSchedule : daySchedules) {
                if (classSchedule.getTime().trim().equals(time.trim()) &&
                        classSchedule.getRoom().trim().equals(room.trim())) {
                    //System.out.println("Room : " + room + " at " + time + " is not available ");
                    //log.info("Room : " + room + " at " + time + " is not available ");
                    return false;
                }

            }
            System.out.println("Room : " + room + " at " + time + " is available ");
            log.info("Room : " + room + " at " + time + " is  available ");
            return true;
        }
    }

    public void removeSchedule(String id) {
        if (id.trim() == null || id.trim().isEmpty()) {
            System.out.println("Id :" + id + " is null or empty");
            log.warn("Id :" + id + " is null or empty");
        } else {

            Iterator<ClassSchedule> iterator = daySchedules.iterator();
            while (iterator.hasNext()) {
                ClassSchedule classSchedule = iterator.next();
                if (classSchedule.getId().equals(id)) {
                    iterator.remove();
                    System.out.println("Schedule with Id:" + id + " removed");
                    log.info("Schedule with Id:" + id + " removed");
                    break;
                } else {
                    System.out.println("Schedule with Id:" + id + " not found");
                    log.info("Schedule with Id:" + id + " not found ");
                    break;
                }

            }
        }
    }

    public void editSchedule(String id, String newId, String newClassType, String newTrainerName, String newTime, String newRoom) {
        if (id.trim() == null || id.trim().isEmpty()) {
            System.out.println("Id :" + id + " is null or empty");
            log.warn("Id :" + id + " is null or empty");
        } else {

            for (ClassSchedule classSchedule : daySchedules) {
                if (classSchedule.getId().equals(id)) {
                    classSchedule.setId(newId);
                    classSchedule.setClassType(newClassType);
                    classSchedule.setTrainerName(newTrainerName);
                    classSchedule.setTime(newTime);
                    classSchedule.setRoom(newRoom);

                    System.out.println("Schedule with Id:" + id + " edited");
                    log.info("Schedule with Id:" + id + " edited");
                }

                 else {
                    System.out.println("Schedule with Id:" + id + " not found");
                    log.info("Schedule with Id:" + id + " not found ");
                }

            }
        }
    }

    public void showDaySchedules() {
        System.out.println(" Date of schedules : " + schedulesDate);
        int count = 1;
        for (ClassSchedule classSchedule : daySchedules) {
            System.out.println( count + ". "+ " Id: "+ classSchedule.getId()+ ", class type : "+ classSchedule.getClassType()+", trainer name : "+ classSchedule.getTrainerName()+", time : "+ classSchedule.getTime()+", room: "+ classSchedule.getRoom());
            count++;

           // System.out.println(classSchedule.toString());
        }

    }

    public void generateScheduleReport(LocalDate schedulesDate, String trainerName){


        //List<ClassSchedule>trainerReportList = new ArrayList<>();
        int count =0;
        for (ClassSchedule classSchedule : daySchedules) {
            if (classSchedule.getTrainerName().equals(trainerName)){

                count +=1;
                //trainerReportList.add(classSchedule);
            }

        }
        System.out.println( "Trainer : "+ trainerName+ "  conducted " + count+ " schedules  at " + schedulesDate);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleManager that = (ScheduleManager) o;
        return Objects.equals(schedulesDate, that.schedulesDate) && Objects.equals(daySchedules, that.daySchedules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedulesDate, daySchedules);
    }
}



