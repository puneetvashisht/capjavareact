package com.cap.problem1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailOperations {

	public static int emailVerify(Email e){
		
		int validateCount = 0;
	
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
	
		 Matcher matcherFrom = pattern.matcher(e.getHeader().from);
		 System.out.println(e.getHeader().from +" : "+ matcherFrom.matches());
		 if(matcherFrom.matches())  validateCount++;
		 
		 Matcher matcherTo = pattern.matcher(e.getHeader().to);
		 if(matcherTo.matches())  validateCount++;
		
		 
		 return validateCount;
	}
	
	public static String bodyEncryption(Email e){
		
		String body = e.body;
		
		char charArray[] = body.toCharArray();
		
		String resultString  = "";
		
		
		for(char c :charArray) {
			int code = 0;
			
			code  = (int)c;
			System.out.println(code);
			if(code>=120 && code<123) {
				code -=23;
			}
			else if(c != ' ')
			{
				code  =+ 3;
			}
			
			 
			resultString += (char)code;

		}
		
		return resultString;
		
	}
	public static String greetingMessage(Email e){
		
			String fromEmail = e.getHeader().from;
			int endIndex = fromEmail.indexOf('@');
			return e.greeting + " " + fromEmail.substring(0, endIndex);

	}
}
