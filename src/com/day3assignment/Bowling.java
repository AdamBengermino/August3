package com.day3assignment;

public class Bowling 
{
	public static void main(String[] args) 

	{
		int throwsPerFrame = 2; 
		int numberOfFrames = 10;
		int Pins = 10; 
		int[] finalScore = new int[10]; 

		for (int i = 0; i < numberOfFrames; i++) 
		{
			int throwOne = (int) (Math.random() * ((numberOfFrames + 1)));
			int pinsLeft = Pins - throwOne; 
			int throwTwo = (int) (Math.random() * ((pinsLeft + 1)));
			int frameScore = (throwOne + throwTwo);
			finalScore[i] = frameScore; 
			
			System.out.println("Your first turn is " + throwOne);
			if(throwOne == 10)
			{
				break; 
			}
			System.out.println("Your second turn is " +  throwTwo);
			System.out.println("Frame score: " + (throwOne + throwTwo));
			System.out.println();
			
		}
			System.out.println("Your final score is " + (finalScore[0] + finalScore[1] + finalScore[2] + finalScore[3] + finalScore[4] + finalScore[5] + finalScore[6] + finalScore[7] + finalScore[8] + finalScore[9]));
		}
}
