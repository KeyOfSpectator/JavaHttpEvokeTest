
/**
 * @author fsc
 *
 */
public class MainTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//发送 GET 请求
        String s=Http_evoke.sendGet("http://localhost:8080", "key=123&v=456");
        System.out.println(s);
        
        //发送 POST 请求
        String sr=Http_evoke.sendPost("http://localhost:8080", "key=123&v=456");
        System.out.println(sr);
	}

}
