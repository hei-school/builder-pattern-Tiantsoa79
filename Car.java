class Car {
  private int seats;
  private String engine;
  private boolean tripComputer;
  private boolean gps;

  public Car() {}
  public Car(int seats, String engine, boolean tripComputer, boolean gps) {
    this.seats = seats;
    this.engine = engine;
    this.tripComputer = tripComputer;
    this.gps = gps;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public boolean hasTripComputer() {
    return tripComputer;
  }

  public void setTripComputer(boolean tripComputer) {
    this.tripComputer = tripComputer;
  }

  public boolean hasGPS() {
    return gps;
  }

  public void setGPS(boolean gps) {
    this.gps = gps;
  }

  @Override
  public String toString() {
    return "Car{" +
      "seats=" + seats +
      ", engine='" + engine + '\'' +
      ", tripComputer=" + tripComputer +
      ", gps=" + gps +
      '}';
  }
}
