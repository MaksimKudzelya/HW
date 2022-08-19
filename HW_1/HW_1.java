package HW_1;

import HW_1.competitors.*;
import HW_1.course.*;


public class HW_1 {
    public static void main(String[] args) {

        Course course1 = new Course(new Cross(200), new Wall(1),
                new Cross(700), new Water(4));

        Team team1 = new Team("Team 1", new Human("Gena"), new Cat("Bantik"),
                new Dog("Mrakobes"), new Dog("Jak"));

        Team team2 = new Team("Team 2", new Human("Anton"), new Cat("Rijik"),
                new Dog("Gufi"), new Dog("SkybiDy"));


        course1.doIt(team1);
        course1.doIt(team2);

        System.out.println("\n===== RESULTS =====\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
}
