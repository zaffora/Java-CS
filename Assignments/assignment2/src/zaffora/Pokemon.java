
package zaffora;

public class Pokemon {

	private String name;
	private String type;
	private int hp;
	
	public Pokemon(String name, String type, int hp) {
		super();
		this.name = name;
		this.type = type;
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", hp=" + hp + "]";
	}

}
