package de.ait;

import java.util.Scanner;

public class ScheduleManager {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;
        ScheduleMethodes scheduleMethodes = new ScheduleMethodes();
        while (run) {
            showMenu(); // Показываем меню
            int choice = scanner.nextInt(); //
            scanner.nextLine();


            switch (choice) {
                case 1 -> {
                    // Добавление нового занятия
                    // Adding a new player
                    System.out.println("New class ID : ");
                    String id = scanner.nextLine().trim(); // Ввод ID
                    System.out.println("Class type : ");
                    String classType = scanner.nextLine().trim();
                    System.out.println("Trainer name : ");
                    String trainerName = scanner.nextLine().trim();
                    System.out.println("Time : ");
                    String time = scanner.nextLine().trim();
                    System.out.println("Room : ");
                    int room = scanner.nextInt();
                    scanner.nextLine();

                    ClassSchedule classSchedule = new ClassSchedule(id,classType,trainerName,time,room);
                    scheduleMethodes.addClassSchedule(classSchedule);



                }

                /*
                case 2 -> {
                    // Размещение ставки игроком
                    // Placing a bet by the player
                    System.out.println("Player ID: ");
                    String playerId = scanner.nextLine(); // Ввод ID игрока
                    System.out.println("Player bet: ");
                    double bet = scanner.nextDouble(); // Ввод суммы ставки
                    casinoSystem.placeBet(playerId, bet); // Размещение ставки
                }
                */

                case 3 -> {
                    // Показать всех игроков
                    // Display all players
                    scheduleMethodes.showInfo();
                }
                case 4 -> {
                    // Завершение работы приложения
                    // Exit the application
                    System.out.println("Close Application");
                    run = false; // Устанавливаем run в false для выхода из цикла
                }


                default -> System.out.println("Invalid choice"); // Сообщение об ошибке при неверном вводе
            }
        }







    }

    public static void showMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Add a new schedule");
        System.out.println("2. Remove an schedule");
        System.out.println("3. View all schedules");
        System.out.println("4. Exit");
        System.out.println("Select an action: ");
    }

}



