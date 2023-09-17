package comsol.com.weatherapp.listener;

/**
 * Created by pc on 9/21/2017.
 */
import comsol.com.weatherapp.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
