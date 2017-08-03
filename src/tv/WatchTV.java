package tv;

public class WatchTV {

	public static void main(String[] args) {
		//에러를 고치기 
		//값은 메서드로 조절하고,
		
		//2.생성자 초기화 
		TV tv = new TV( 7, 20, false);  	
        
        tv.status();	
        
        tv.power( true );
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false );
        tv.status();
        
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();

        tv.power( false );
        tv.status();      	
	}

}
