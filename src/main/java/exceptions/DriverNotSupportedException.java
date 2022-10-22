package exceptions;

public class DriverNotSupportedException extends Exception {

  public DriverNotSupportedException(String browser) {
    super(String.format("Browser %s not supported", browser));
  }

}
