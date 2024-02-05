class Manual {
  private String manualSeats;
  private String manualEngine;
  private String manualTripComputer;
  private String manualGPS;

  public Manual() {}

  public Manual(String manualSeats, String manualEngine, String manualTripComputer, String manualGPS) {
    this.manualSeats = manualSeats;
    this.manualEngine = manualEngine;
    this.manualTripComputer = manualTripComputer;
    this.manualGPS = manualGPS;
  }

  public String getManualSeats() {
    return manualSeats;
  }

  public void setManualSeats(String manualSeats) {
    this.manualSeats = manualSeats;
  }

  public String getManualEngine() {
    return manualEngine;
  }

  public void setManualEngine(String manualEngine) {
    this.manualEngine = manualEngine;
  }

  public String getManualTripComputer() {
    return manualTripComputer;
  }

  public void setManualTripComputer(String manualTripComputer) {
    this.manualTripComputer = manualTripComputer;
  }

  public String getManualGPS() {
    return manualGPS;
  }

  public void setManualGPS(String manualGPS) {
    this.manualGPS = manualGPS;
  }

  @Override
  public String toString() {
    return "Manual{" +manualSeats + '\'' + manualEngine + '\'' + manualTripComputer + '\'' + manualGPS + '\'' +
      '}';
  }
}
