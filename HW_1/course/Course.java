package HW_1.course;

import HW_1.competitors.Competitor;
import HW_1.competitors.Team;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Competitor c : team.getCompetitors()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
