import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONObject;


/** 字符串json操作
 * @author fsc
 *
 */
public class Json_convert {
	
	public static boolean convert2json_test(){
			String json = "{\"name\":\"reiz\"}";
		 	JSONObject jsonObj = JSONObject.fromObject(json);
		    String name = jsonObj.getString("name");
		     
		    jsonObj.put("initial", name.substring(0, 1).toUpperCase());
		    String[] likes = new String[] { "JavaScript", "Skiing", "Apple Pie" };
		    jsonObj.put("likes", likes);
		    Map<String, String> ingredients = new HashMap<String, String>();
		    ingredients.put("apples", "3kg");
		    ingredients.put("sugar", "1kg");
		    ingredients.put("pastry", "2.4kg");
		    ingredients.put("bestEaten", "outdoors");
		    jsonObj.put("ingredients",ingredients);
		     
		    System.out.println(jsonObj);
		    return true;
	}
	
	
	/** 对象转为json
	 * Map<String, String> test = new HashMap<String, String>();
		test.put("test_k1", "test_v1");
		test.put("test_k2", "test_v2");
		test.put("test_k3", "test_v3");
		test.put("test_k4", "test_v4");
		
		Json_convert.convert2json(test);
	 * @author fsc
	 * @param Map<String, String> params
	 * @return jsonStr
	 * 
	 */
	public static String convert2json(Map<String, String> params){
	 	JSONObject jsonObj = new JSONObject();

	 	for( Map.Entry<String, String> entry : params.entrySet() ){
	 		jsonObj.put(entry.getKey() , entry.getValue());
	 	}
	     
	    System.out.println("json Str = " + jsonObj);
	    return jsonObj.toString();
}
}
