package Task_1_Test.Scenario_1_Test;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;

public class readJson {

    @DataProvider
    public Object[][] readJson() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;

        {
            try {
                jsonObject = (JSONObject) parser.parse(new FileReader("resources/serchKey.json"));
            } catch (IOException | ParseException e) {
                throw new RuntimeException(e);
            }
        }
       return  (Object[][]) jsonObject.get("searchKey");
    }
}