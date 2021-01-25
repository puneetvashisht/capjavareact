package com.cap.day6;

interface Sequence{
	
	// final static fields
	int START_VALUE = 100;
	
	int next();
}

class RandomSequence implements Sequence{

	@Override
	public int next() {
		int random = (int) (Math.random() * 100);
		return random;
	}
//	Random number.. 3,6,4,...
}

class IncrementSequence implements Sequence{

	int intitalNumber = START_VALUE;
	@Override
	public int next() {
//		INITIAL = 34;
//		System.out.println(INITIAL);
		return intitalNumber++;
	}
	// incremental sequence .. 1,2,3 .... 
}

class EvenSequence implements Sequence{

	int intitalNumber = START_VALUE;
	@Override
	public int next() {
		int result = intitalNumber * 2;
		intitalNumber++;
		return result;
	}
	// incremental sequence .. 1,2,3 .... 
}

public class SequenceDemo {

	public static void main(String[] args) {
		
		Sequence incrementSeqeunce = new EvenSequence();
		System.out.println(incrementSeqeunce.next());
		System.out.println(incrementSeqeunce.next());
		System.out.println(incrementSeqeunce.next());
		
		Sequence randomSeqeunce = new RandomSequence();
		System.out.println(randomSeqeunce.next());
		System.out.println(randomSeqeunce.next());
		System.out.println(randomSeqeunce.next());
		;
	}

}
