package com.exercise;

public class sofa extends Wood{
	
	@Override
	public void usage() {
		// TODO Auto-generated method stub
		System.out.println("I used to set");
	}
	
	public static void main(String[] args)
	{
		sofa sitsofa = new sofa();
		sitsofa.shaping();
		sitsofa.usage();
	}

}
