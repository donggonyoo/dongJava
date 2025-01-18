package javaStart2.oop_1;

public class MusicPlayer_1 {

	public static void main(String[] args) {
		MusicPlayer music = new MusicPlayer();
		on(music);
		up(music);
		up(music);
		down(music);
		off(music);
		
		
	
	}
	public static void on(MusicPlayer music) {
		music.isOn = true;
		System.out.println("플레이어를 시작합니다 ! \n");
	}
	
	public static void off (MusicPlayer music) {
		music.isOn = false;
		System.out.println("음악플레이어를 종료 !\n");
	}
	
	public static void up(MusicPlayer music) {
		music.volume++;
		System.out.println("볼륨을 증가합니다 ");
		System.out.println("현재볼륨 : "+music.volume+"\n");
	}
	
	public static void down(MusicPlayer music) {
		music.volume--;
		System.out.println("볼륨을 감소시킵니다 ");
		System.out.println("현재볼륨 : "+music.volume+"\n");
	}
	

}
