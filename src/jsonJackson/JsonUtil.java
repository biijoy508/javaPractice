package jsonJackson;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
private static ObjectMapper mapper;
/**
 * static method is like a constructor which is static
 */
static{
    mapper = new ObjectMapper();
}
public static String convertJavaToJson(final Object object){
    String jsonResult = "";
    try {
        jsonResult = mapper.writeValueAsString(object);
    } catch (JsonGenerationException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (JsonMappingException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return jsonResult;
}

/**
 * Using generic object as return type gives flexibility
 * @param str
 * @param cls
 * @return
 */
public static <T>T convertJsonToJava (final String str, final Class<T> cls){
    T result = null;
    try {
        result = mapper.readValue(str, cls);
    } catch (JsonParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (JsonMappingException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return result;
}
}
