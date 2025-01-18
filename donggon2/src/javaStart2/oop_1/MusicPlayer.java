package javaStart2.oop_1;
public class MusicPlayer {
	int volume;
	boolean isOn;
	
	public  void on() {
		isOn = true;
		System.out.println("플레이어를 시작합니다 ! \n");
	}
	
	public  void off () {
		isOn = false;
		System.out.println("음악플레이어를 종료 !\n");
	}
	
	public  void up() {
		volume++;
		System.out.println("볼륨을 증가합니다 ");
		System.out.println("현재볼륨 : "+volume+"\n");
	}
	
	public  void down() {
		volume--;
		System.out.println("볼륨을 감소시킵니다 ");
		System.out.println("현재볼륨 : "+volume+"\n");
	}
}

