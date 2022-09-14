package combate;

public class Champion {

	String name;
	int life;
	int attack;
	int armor;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}

	public void takeDamage(Champion other) {

		int damage = other.attack - this.armor;

		if (damage < 1) {
			damage = 1;
		}

		this.life -= damage;

	}

	public void status() {
		
		if(life<1) {
			System.out.printf("%s: 0 de vida (MORTO)", this.name);
			System.out.println();
		}
		else {
			System.out.printf("%s: %d de vida", this.name, this.life);
			System.out.println();
		}
		
		
	}

}
