package com.m0921;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("Chiho") && speed > 0) {
			return "runnning";
		}else {
			return "not runnning";
		}
	}
}







//まとめ、
//mainのfile以外では、privateを使うが(外部から重要な情報をアクセスされない為に)、
//自分のfile内では情報の行き来をさせないとコードを構築できない。
//そこで使うのが、getter()とsetter()メソッドである。
//publicから始まり、getter()にはreturnの戻り値を、setter()には戻り値不要なのでvoidを(thisを忘れずに)
//簡単な方法。右クリック⇨source⇨generate getter setter
