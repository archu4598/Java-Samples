package com.exercise;

public class chair extends Wood {
	public static void main(String[] args)
	{
		chair sit = new chair();
		
		sit.cutting();
	}

	@Override
	public void usage() {
		// TODO Auto-generated method stub
		
	}
	
	public void cutting() {
		System.out.println("I cut");
	}

}
