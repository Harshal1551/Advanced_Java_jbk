package com.tka.controller;

import java.util.List;
import java.util.Scanner;

import com.tka.entity.Player;
import com.tka.service.IplService;

public class IplController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IplService service = new IplService();

        while (true) {

            System.out.println("\n========= IPL MANAGEMENT =========");
            System.out.println("1. Display All Players");
            System.out.println("2. Display GT Players");
            System.out.println("3. Display RR Players");
            System.out.println("4. Search Player By Jersey No");
            System.out.println("5. Add Player");
            System.out.println("6. Update Runs");
            System.out.println("7. Update Wickets");
            System.out.println("8. Delete Player");
            System.out.println("9. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                List<Player> all = service.getAllPlayers();

                System.out.println("-------------------------------------------");

                all.forEach(System.out::println);

                break;

            case 2:

                service.getGTPlayers().forEach(System.out::println);

                break;

            case 3:

                service.getRRPlayers().forEach(System.out::println);

                break;

            case 4:

                System.out.print("Enter Jersey Number : ");
                int jn = sc.nextInt();

                Player p = service.searchPlayer(jn);

                if (p != null)
                    System.out.println(p);
                else
                    System.out.println("Player Not Found");

                break;

            case 5:

                System.out.print("Jersey Number : ");
                int jersey = sc.nextInt();

                sc.nextLine();

                System.out.print("Player Name : ");
                String name = sc.nextLine();

                System.out.print("Runs : ");
                int runs = sc.nextInt();

                System.out.print("Wickets : ");
                int wickets = sc.nextInt();

                sc.nextLine();

                System.out.print("Team Name : ");
                String team = sc.nextLine();

                Player player = new Player(jersey, name, runs, wickets, team);

                int add = service.addPlayer(player);

                if (add > 0)
                    System.out.println("Player Added Successfully");
                else
                    System.out.println("Failed");

                break;

            case 6:

                System.out.print("Enter Jersey No : ");
                int j1 = sc.nextInt();

                System.out.print("Enter New Runs : ");
                int r = sc.nextInt();

                service.updateRuns(j1, r);

                System.out.println("Runs Updated");

                break;

            case 7:

                System.out.print("Enter Jersey No : ");
                int j2 = sc.nextInt();

                System.out.print("Enter New Wickets : ");
                int w = sc.nextInt();

                service.updateWickets(j2, w);

                System.out.println("Wickets Updated");

                break;

            case 8:

                System.out.print("Enter Jersey No : ");
                int j3 = sc.nextInt();

                service.deletePlayer(j3);

                System.out.println("Player Deleted");

                break;

            case 9:

                System.out.println("Thank You");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice");

            }

        }

    }

}