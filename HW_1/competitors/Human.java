package HW_1.competitors;

public class Human implements Competitor {
    protected String name;

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    protected boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 10000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " did a great job with the cross");
        } else {
            System.out.println(name + " I couldn't cope with the cross and left the race");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " well jumped over the wall");
        } else {
            System.out.println(name + " couldn't jump over the wall and dropped out of the race");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " swam well");
        } else {
            System.out.println(name + " couldn't cope with the swim and dropped out of the race");
            active = false;
        }
    }

    @Override
    public void result() {
        System.out.println(name + ": " + active);
    }
}