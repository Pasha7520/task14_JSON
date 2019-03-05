package json;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import json.schema.ValidationUtils;
import model.Beer;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUser {

  public static void main(String[] args) throws IOException, ProcessingException {
    File json = new File("Lab_15_JSON/src/main/resources/beerJSON.json");
    File schema = new File("Lab_15_JSON/src/main/resources/beerJSONScheme.json");

    JSONParser parser = new JSONParser();
    if (ValidationUtils.isJsonValid(schema, json)){
      System.out.println("Valid!");
      printList(parser.getBeerList(json));
    }else{
      System.out.println("NOT valid!");
    }


  }

  private static void printList(List<Beer> beers) {
    System.out.println("JSON");
    for (Beer beer : beers) {
      System.out.println(beer);
    }
  }
}
