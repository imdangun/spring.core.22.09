package spring.core.ch01.ex01;

public class Main {
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		
		Shooter shooter = new Shooter(pistol);
		shooter.fire();
		
		shooter.setGun(rifle);
		shooter.fire();
	}
}
/*
권총 탕탕
소총 탕탕
*/