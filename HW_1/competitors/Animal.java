package HW_1.competitors;

public abstract class Animal implements Competitor {
    protected String type;
    protected String name;

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    protected boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " did a great job with the cross");
        } else {
            System.out.println(type + " " + name + " I couldn't cope with the cross and left the race");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " jumped over the wall");
        } else {
            System.out.println(type + " " + name + " couldn't jump over the wall and dropped out of the race");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " can't swim and goes off the course");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " swam well");
        } else {
            System.out.println(type + " " + name + " couldn't cope with the swim and dropped out of the race");
            onDistance = false;
        }
    }

    @Override
    public void result() {
        System.out.println(type + " " + name + ": " + onDistance);
    }
}
