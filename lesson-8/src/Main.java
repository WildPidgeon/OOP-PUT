import org.junit.Assert;

public class Main {
    public static void main(String[] args){
        Forecast forecast = new Forecast.Fake();
        Weather weather = new Weather(forecast.temperature());
        Assert.assertEquals(21.37f,weather.temperature,0.0f);
    }
}
