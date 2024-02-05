class Director {
  public void makeSportsCar(Builder builder) {
    builder.reset();
    builder.setSeats(2);
    builder.setEngine("Sport Engine");
    builder.setTripComputer(true);
    builder.setGPS(true);
  }

  public void makeSUV(Builder builder) {
    builder.reset();
    builder.setSeats(5);
    builder.setEngine("SUV Engine");
    builder.setTripComputer(true);
    builder.setGPS(true);
  }

  public void makeManual(Builder builder) {
    builder.reset();
    builder.setSeats(0);
    builder.setEngine("Generic Engine");
    builder.setTripComputer(false);
    builder.setGPS(false);
  }

}
