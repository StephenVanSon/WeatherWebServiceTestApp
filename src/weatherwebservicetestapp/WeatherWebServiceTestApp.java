/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherwebservicetestapp;

import net.webservicex.WeatherForecasts;

/**
 *
 * @author Steve
 */
public class WeatherWebServiceTestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String zip = "61704";
        System.out.println("Min Temp: " + getWeatherByZipCode(zip).getDetails().getWeatherData().get(0).getMinTemperatureC());
        System.out.println("Max Temp: " + getWeatherByZipCode(zip).getDetails().getWeatherData().get(0).getMaxTemperatureC());
        }

    private static WeatherForecasts getWeatherByZipCode(java.lang.String zipCode) {
        net.webservicex.WeatherForecast service = new net.webservicex.WeatherForecast();
        net.webservicex.WeatherForecastSoap port = service.getWeatherForecastSoap();
        return port.getWeatherByZipCode(zipCode);
    }
    
    
    }

    
    

