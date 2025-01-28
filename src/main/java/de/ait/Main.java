package de.ait;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ClassSchedule classSchedule07 = new ClassSchedule("001","yoga","Ivanov","07:00","1");
        ClassSchedule classSchedule08 = new ClassSchedule("002","yoga","Ivanov","08:00","1");
        ClassSchedule classSchedule09 = new ClassSchedule("003","yoga","Ivanov","09:00","1");
        ClassSchedule classSchedule10 = new ClassSchedule("004","yoga","Ivanov","16:00","1");


        ScheduleManager daySchedules01 = new ScheduleManager(LocalDate.of(2025,1,1));

        daySchedules01.addSchedule(classSchedule07);
        daySchedules01.addSchedule(classSchedule08);
        daySchedules01.addSchedule(classSchedule09);
        daySchedules01.showDaySchedules();
        daySchedules01.removeSchedule("009");
        daySchedules01.showDaySchedules();
        daySchedules01.editSchedule("003","003","fitness", "Sidorov","13:00","4");
        daySchedules01.showDaySchedules();
        daySchedules01.addSchedule(classSchedule10);
        daySchedules01.showDaySchedules();
        System.out.println(daySchedules01.getScheduleDate());
        daySchedules01.generateScheduleReport(LocalDate.of(2025,1,1), "Ivanov");

        /*
        ScheduleManager daySchedules02 = new ScheduleManager(LocalDate.of(2025,1,2));
        daySchedules02.addSchedule(classSchedule07);
        daySchedules02.addSchedule(classSchedule08);
        daySchedules02.addSchedule(classSchedule09);
        daySchedules02.showDaySchedules();
        daySchedules02.removeSchedule("009");
        daySchedules02.showDaySchedules();
        daySchedules02.editSchedule("008","004","fitness", "Sidorov","13:00","4");
        daySchedules02.showDaySchedules();
        daySchedules02.addSchedule(classSchedule10);
        daySchedules02.showDaySchedules();
        System.out.println(daySchedules02.getScheduleDate());

        daySchedules01.generateScheduleReport(LocalDate.of(2025,1,1), "Ivanov");

         */

    }
}
