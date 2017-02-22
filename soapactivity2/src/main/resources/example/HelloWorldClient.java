package example;

import com.daehosting.TemperatureConversionsSoapType;

/**
 * Created by student on 2/20/17.
 * @author O Collins 
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
      //invoke business method
      service.celsiusToFahrenheit();  
  }
}
