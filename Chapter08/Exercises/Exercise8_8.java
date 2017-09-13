package Chapter08.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 8.8
 * @Title The Fan class
 */
public class Exercise8_8 {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

class Fan {

    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    public Fan() {
        this.on = false;
        this.speed = SLOW;
        this.radius = 5;
        this.color = "blue";
    }

    @Override
    public String toString() {

        if (on) {
            return "Fan speed: " + this.speed + "\tColor: " + this.color
                    + "\tRadius: " + this.radius;
        } else {
            return "Fan is off\tColor: " + this.color + "\tRadius: " + this.radius;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
