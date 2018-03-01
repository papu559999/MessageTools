package com.javadot.beans;

public class MessageSender {
	
	public void sendMessage(String name, String message) {
		
		System.out.println("Hello "+name+" , your message is in Que... ");
		System.out.println("Hello Mr/Mrs : "+name+" ,Your message is "
						+message+" is sending...");
	}

}
