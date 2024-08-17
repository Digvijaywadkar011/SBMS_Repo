package in.SBMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.SBMS.Model.Book;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConnFactory() {

		JedisConnectionFactory jct = new JedisConnectionFactory();

		return jct;
	}

	@Bean
	public RedisTemplate<String, Book> redisTemplate() {

		RedisTemplate<String, Book> redisTemplate = new RedisTemplate<String, Book>();

		redisTemplate.setConnectionFactory(jedisConnFactory());

		return redisTemplate;

	}

}
