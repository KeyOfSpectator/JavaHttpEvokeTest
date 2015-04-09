import java.util.HashMap;
import java.util.Map;


/**
 * @author fsc
 *
 */
public class MainTestClass {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
//json转换测试		
		Json_convert.convert2json_test();
		
		Map<String, String> test = new HashMap<String, String>();
		test.put("test_k1", "test_v1");
		test.put("test_k2", "test_v2");
		test.put("test_k3", "test_v3");
		test.put("test_k4", "test_v4");
		
		String JsonString = Json_convert.convert2json(test);
		System.out.println(JsonString);
		
		
//发送 GET 请求
		String s=Http_evoke.sendGet("http://localhost:8080", "key=123&v=456");
		System.out.println(s);
		
//发送 POST 请求
		String sr=Http_evoke.sendPost("http://localhost:8080", JsonString);
		System.out.println(sr);
	}

}
