package tv;

public class TV {
	//1. 모든 필드는 private으로 접근제어를 하고, getter만 작성합니다. 
	private int channel;
	private int volume;
	private boolean power;

	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	//2. channer,volume,power의 초기값을 각각 7,20,false로 초기화하는 생성자 작성 
	public TV(int channel, int volume, boolean power){
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	//3. 기본생정자 오버로딩
	public TV() {
		
	}
	//5.void channel(int channel) 메소드 구현(1~255유지)
	public void channel(int channel) {
		
	}

	//4.void power(boolean on) 메소드 구현 
	public boolean power(boolean up) {
	
		return on;
	}
		
	
	//6) void channel( boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감)

	public void channel(boolean channel) {
		
	}
	
	//7.void volume(int volume) 메소드 구현(0~100유지)
	public void volume(int volume) {
		
	}
	
	
	public void volume(boolean volume) {
		
	}
	public void status() {
		
	}
}