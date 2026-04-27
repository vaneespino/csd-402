//Vanessa Espino
public class Fan {
  // Constants
  public static final int STOPPED = 0;
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;

  // Private fields
  private int speed;
  private boolean on;
  private double radius;
  private String color;

  // Constructors
  public Fan () {
    this.speed = STOPPED;
    this.on = false;
    this.radius = 6;
    this.color = "white";
  }

  public Fan (int speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
  }

  // Getters and setters
  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    if (speed >= STOPPED && speed <= FAST) {
      this.speed = speed;
    } else {
        System.out.println("Invalid speed setting.");
    }
  }

  public boolean isOn() {
    return this.on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  //utility toString method
  public String toString() {
    String str = "speed: " + this.speed + "\n";
    str += "color: " + this.color + "\n";
    str += " radius: " + this.radius + "\n";
    if (this.on) {
      str += "Fan is on";
    } else {
      str += "Fan is off";
    }
    return str;
  }
}