import org.json.JSONArray;
import org.json.JSONObject;

public class Faturamento {
    ublic static void main(String[] args) {
        String jsonString = "{\"faturamento\": [8000, 9000, 8500, 7800, 8200]}";
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray faturamento = jsonObject.getJSONArray("faturamento");

        for (int i = 0; i < faturamento.length(); i++) {
            System.out.println(faturamento.getDouble(i));
        }
    }
}
