package com.m0921;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
//	以下が、Carインスタンスがmainで作られた時のデフォルトになる。
//	new Car(何も渡さない場合)、constructor(without parameter)を探しにいく。
//	この値が、変数mainのcarに渡されることになる。
//	new Car(何か渡した場合)、()に入れたことが優先。入れなかったら以下のdefaultが入る。
//	constructor (without parameter)
	public Car() {
		doors = "opened";
		engine = "on";
		driver = "seated";
		speed = 20;
	}
	
//	new Car(何か渡しす場合)、以下でparameterを渡し、mainのnew Car()に値を入れる。
//	constructor(with parameter)
	public Car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	
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
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
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
