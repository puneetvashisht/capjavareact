package com.cap.problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmailOperations {

//	@Test
	public void testValidateEmail() {
		
		Header h = new Header("test@test.com.", "test1@test.com.");
		Email email  = new Email(h, "Hi, How are you?", "Thanking you");
		
		int result = EmailOperations.emailVerify(email);
		assertEquals(2, result);
	
	}
	
	
//	@Test
	public void testValidateOneEmail() {
		
		Header h = new Header("testtestcom", "test1@test.com.");
		Email email  = new Email(h, "Hi, How are you?", "Thanking you");
		
		int result = EmailOperations.emailVerify(email);
		assertEquals(1, result);
	
	}
	
//	@Test
	public void testValidateNoneEmail() {
		
		Header h = new Header("testtestcom", "testtestcom");
		Email email  = new Email(h, "Hi, How are you?", "Thanking you");
		
		int result = EmailOperations.emailVerify(email);
		assertEquals(0, result);
	
	}
	
//	@Test
	public void testBodyEncryption() {
	
		Header h = new Header("testtestcom", "testtestcom");
		Email email  = new Email(h, "ABC", "Thanking you");
		String result = EmailOperations.bodyEncryption(email);
		System.out.println(result);
		assertEquals(result, "DEF");
	}
	
	
//	@Test
	public void testBodyEncryptionEndChars() {
	
		Header h = new Header("testtestcom", "testtestcom");
		Email email  = new Email(h, "xyz", "Thanking you");
		String result = EmailOperations.bodyEncryption(email);
		System.out.println(result);
		assertEquals(result, "abc");
	}
	
	
//	@Test
	public void testBodyEncryptionWithSpace() {
	
		Header h = new Header("testtestcom", "testtestcom");
		Email email  = new Email(h, "A BC", "Thanking you");
		String result = EmailOperations.bodyEncryption(email);
		System.out.println(result);
		assertEquals(result, "D EF");
	}
	
	@Test
	public void testGreetingMessage() {
	
		Header h = new Header("test@testcom", "test@testcom");
		Email email  = new Email(h, "A BC", "Thanking you");
		String result = EmailOperations.greetingMessage(email);
		System.out.println(result);
		assertEquals(result, "Thanking you test");
	}

}
