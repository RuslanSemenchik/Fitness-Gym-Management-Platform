package de.ait;

import java.util.ArrayList;
import java.util.HashMap;

public class ScheduleMethodes {
    public HashMap<String,ClassSchedule> schedule = new HashMap<>();


    public  void showInfo() {
        if (schedule.isEmpty()) {
            System.out.println("No schedules in database");
        } else {

            for (ClassSchedule classSchedule : schedule) {
                System.out.println(classSchedule);
            }
        }
    }

    public void addClassSchedule (ClassSchedule classSchedule) {

        if (schedule.contains(classSchedule)) {
            System.out.println("Schedule ID " + classSchedule.id + " already exists");
        } else {

            schedule.add(classSchedule);
            System.out.println("Schedule ID " + classSchedule.id + " added");
        }
    }

}
