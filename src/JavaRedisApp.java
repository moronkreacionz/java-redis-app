import redis.clients.jedis.Jedis;

public class JavaRedisApp{

	public static void main(String args [])
	{
		Jedis jedis = new Jedis("redis"); 

		while(true) {
			System.out.println("Serer is running: " + jedis.ping()); 
		}
	}
}
