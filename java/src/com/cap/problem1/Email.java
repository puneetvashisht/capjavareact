package com.cap.problem1;


class Header {
	String to;
	String from;
	public Header(String to, String from) {
		super();
		this.to = to;
		this.from = from;
	}
	@Override
	public String toString() {
		return "Header [to=" + to + ", from=" + from + "]";
	}
	
	
	
}

public class Email {
	
	Header header;
	String body;
	String greeting;
	
	
	
	
	public Header getHeader() {
		return header;
	}


	public void setHeader(Header header) {
		this.header = header;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public Email() {
		super();
	}


	public Email(Header header, String body, String greeting) {
		super();
		this.header = header;
		this.body = body;
		this.greeting = greeting;
	}
	
	


	@Override
	public String toString() {
		return "Email [header=" + header + ", body=" + body + ", greeting=" + greeting + "]";
	}
	
	

}
