package comsol.com.weatherapp.data;

/**
 * Created by pc on 9/21/2017.
 */
import org.json.JSONObject;

public interface JSONPopulator {
    void populate(JSONObject data);

    JSONObject toJSON();
}
