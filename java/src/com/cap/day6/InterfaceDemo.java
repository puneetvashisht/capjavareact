package com.cap.day6;


interface Greeting{
	//public & abstract methods by default
	void hello();
}

class JapaneseGreeting implements Greeting{

	@Override
	public void hello() {
		System.out.println("Konnichiwa!!");
	}
	
}

class HindiGreeting implements Greeting{

	@Override
	public void hello() {
		System.out.println("Namaste!!");
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		Greeting japaneseGreeting = new JapaneseGreeting();
//		japaneseGreeting.hello();
		
		Greeting hindiGreeting = new HindiGreeting();
//		hindiGreeting.hello();
		
		Greeting greetings[] = {japaneseGreeting, hindiGreeting};
		
		for(Greeting greeting: greetings) {
			greeting.hello();
		}

	}

}
