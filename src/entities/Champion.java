package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion() {
		
	}
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		int damage = (life + armor) - other.attack;
		if (damage > life) {
			life -= 1;
		} else if (damage < 0 ) {
			life = 0;
		} else {
			life = damage;
		}
	}
	
	public String status() {
		if (life == 0) {
			return "(morreu)" ;
		} else {
			return "";
		}
	}
	
}
