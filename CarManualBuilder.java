class CarManualBuilder implements Builder {
  private Manual manual;

  public CarManualBuilder() {
    this.reset();
  }

  public void reset() {
    this.manual = new Manual();
  }

  public void setSeats(int seats) {
    this.manual.setManualSeats("Manual seats information: " + seats);
  }

  public void setEngine(String engine) {
    this.manual.setManualEngine("Manual engine information: " + engine);
  }

  public void setTripComputer(boolean tripComputer) {
    this.manual.setManualTripComputer("Manual trip computer information: " + tripComputer);
  }

  public void setGPS(boolean gps) {
    this.manual.setManualGPS("Manual GPS information: " + gps);
  }

  public Manual getProduct() {
    Manual product = this.manual;
    this.reset();
    return product;
  }
}
