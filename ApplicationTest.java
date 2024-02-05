import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

  @Test
  void testSportsCar() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();

    director.makeSportsCar(carBuilder);
    Car sportsCar = carBuilder.getProduct();

    assertEquals(2, sportsCar.getSeats());
    assertEquals("Sport Engine", sportsCar.getEngine());
    assertTrue(sportsCar.hasTripComputer());
    assertTrue(sportsCar.hasGPS());
  }

  @Test
  void testSUV() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();

    director.makeSUV(carBuilder);
    Car suvCar = carBuilder.getProduct();

    assertEquals(5, suvCar.getSeats());
    assertEquals("SUV Engine", suvCar.getEngine());
    assertTrue(suvCar.hasTripComputer());
    assertTrue(suvCar.hasGPS());
  }

  @Test
  void testManual() {
    Director director = new Director();
    CarManualBuilder carManualBuilder = new CarManualBuilder();

    director.makeManual(carManualBuilder);
    Manual manual = carManualBuilder.getProduct();

    assertEquals("Manual seats information: 0", manual.getManualSeats());
    assertEquals("Manual engine information: Generic Engine", manual.getManualEngine());
    assertEquals("Manual trip computer information: false", manual.getManualTripComputer());
    assertEquals("Manual GPS information: false", manual.getManualGPS());
  }
}
