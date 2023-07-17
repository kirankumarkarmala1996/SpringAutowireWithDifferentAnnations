package com.AutowireAnnatation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
//ByName
	
	@Autowired
	@Qualifier("goestheart")
	private Heart heart;

	/*by removeing the setter and constructor methods by using @autowire we can inject the dependency
	 * public Human() { }
	 * 
	 * // @Autowired public Human(Heart heart) { this.heart = heart; }
	 * 
	 * // @Autowired// here we comment and directly we can declear to the veriable
	 * // @Qualifier("goestheart") public void setHeart(Heart heart) { this.heart =
	 * heart; }
	 */

	public void startPumping() {
		if (heart != null) {
			heart.HeartBeating();
		} else {
			System.out.println("heart is dead");
		}
	}

}
