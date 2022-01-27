package car;

public class Car implements Runnable{

    private String name;
    private Integer wheels = 4;
    private Integer doors = 4;
    private Integer seats = 5;
    private Integer maxSpeed;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A " + name + " car is a car with: maxSpeed =" + maxSpeed);
        }
    }

    public Car(String name, Integer maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void info() {
        System.out.println("name: "+ name);
        System.out.println("wheels: "+ wheels);
        System.out.println("doors: "+ doors);
        System.out.println("seats: "+ seats);
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
