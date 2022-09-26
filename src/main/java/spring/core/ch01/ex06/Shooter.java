package spring.core.ch01.ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired private Pistol pistol;
	@Autowired @Nullable private Rifle rifle;
	
	public void fire() {
		pistol.fire();
		if(rifle != null) rifle.fire();
	}
}
/* 과제:
   rifle 이 있으면 rifle 을 사용하고, 없으면 사용치 않도록 하라.
 */
 
