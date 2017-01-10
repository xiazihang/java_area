import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhxia on 10/01/2017.
 */
public class RedisCluster {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("jedis", "this is from jedis");
        System.out.println(jedis.get("jedis"));
        Set<HostAndPort> jedisClusterNodes = new HashSet<>();
        jedisClusterNodes.add(new HostAndPort("127.0.0.1", 7000));
        JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes);
        jedisCluster.set("jedis", "this is jedis");
        System.out.printf(jedisCluster.get("jedis"));
    }
}
