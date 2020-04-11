class Car{
  // 3 things we must have
  // 1. instance variables - values that represent the class
  // ex. wheels, seats
  // 2. constructors - make objects using
  // empty and parameterized
  // 3. getters and setters (accessors and mutators) - get and set the value of instance variables
  // 4. (optional) methods - things that the objects can do

  private int wheels;
  private int seats;
  private String color;
  private String maker;
  private double mpg;
  private double tank;

  public Car(){
    this.wheels = 4;
    this.seats = 7;
    this.color = "yellow";
    this.maker = "Honda";
    this.mpg = 20.2;
    this.tank = 25.3;
  }

  public Car(int wheels, int seats, String color, String maker, double mpg, double tank) {
    this.wheels = wheels;
    this.seats = seats;
    this.color = color;
    this.make = maker;
    this.mpg = mpg;
    this.tank = tank;
  }

  public int getWheels(){
    return this.wheels;
  }

  public int getSeats(){
    return this.seats;
  }
  
  public String getColor(){
    return this.color;
  }

  public String getMaker(){
    return this.maker;
  }

  public double getMpg() {
    return this.mpg;
  }

  public double getTank() {
    return this.tank();
  }

  public double range() {
    return this.mpg * this.tank;
  }

  public void drive(double mile) {
    double gallons = miles/this.mpg;
    this.tank = this.tank - gallons;
  }
}