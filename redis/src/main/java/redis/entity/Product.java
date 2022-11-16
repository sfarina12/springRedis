package redis.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("PRODUCT")
public class Product {
	@Id
	private int id;
	private String name;
	private float cost;
	
	public Product(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
}
