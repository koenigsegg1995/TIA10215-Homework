package hw5.hero;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero[] hero = new Hero[2];
		hero[0] = new SwordMan("亞拉岡", 1, 0);
		hero[1] = new ArrowMan("勒苟拉斯", 1, 0);
		
		for(int i = 0; i < hero.length; i++) {
			hero[i].attack();
			hero[i].move();
			hero[i].defend();
		}
	}

}
