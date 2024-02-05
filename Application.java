class Application {

  public static void main(String[] args) {

    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();

    director.makeSportsCar(carBuilder);
    Car sportsCar = carBuilder.getProduct();
    System.out.println("Sports Car: " + sportsCar);


    director.makeSUV(carBuilder);
    Car suvCar = carBuilder.getProduct();
    System.out.println("SUV: " + suvCar);


    CarManualBuilder carManualBuilder = new CarManualBuilder();

    director.makeManual(carManualBuilder);

    Manual manual = carManualBuilder.getProduct();

    System.out.println("Manual: " + manual);
  }
}