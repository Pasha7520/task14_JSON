package json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Beer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONParser {
    private ObjectMapper objectMapper;

    public JSONParser() {
        this.objectMapper = new ObjectMapper();
    }

    public List<Beer> getBeerList(File jsonFile){
        Beer[] beers = new Beer[0];
//        List<Beer> beers = new ArrayList<>();
        try{
            beers = objectMapper.readValue(jsonFile, Beer[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Arrays.asList(beers);
    }
}
