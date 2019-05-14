package com.mygdx.game;
public class Shoot extends PhysicsActor {
	public float speed;
	float time=1;
	boolean exit;
	float tan_x;
	float tan_y;
	boolean vurulacak;
	boolean controlshouted;
	public Shoot(float speed) {
		super();
		this.speed=speed;
		exit=false;
		vurulacak=true;
		controlshouted=true;
	}
	public boolean isShouted( enemy hedef){
		if(hedef!=null){
			if(getDistance(hedef)<2)
				return true;
			
		}
		return false;
	}
	

}
