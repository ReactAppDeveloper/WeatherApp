package comsol.com.weatherapp.listener;

/**
 * Created by pc on 9/21/2017.
 */
import comsol.com.weatherapp.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}