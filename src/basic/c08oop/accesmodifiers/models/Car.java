package basic.c08oop.accesmodifiers.models;

public class Car {
    private int speed;

    public Car(int speed) {
        this.setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0){
            this.speed = speed;
        } else {
            System.out.println("Velocidad no puede ser menor que 0.");
        }
    }
    public void accelerate(int amount) {
        if (amount > 0) {
            speed += amount;
            if (speed > 120) {
                speed = 120;
            }
        }
    }
    public void brake(int amount) {
        if (amount > 0) {
            speed -= amount;
            if (speed < 0) {
                speed = 0;
            }
        }
    }
}
