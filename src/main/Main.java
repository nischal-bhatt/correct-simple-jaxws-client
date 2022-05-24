package main;

import ws.*;

public class Main {

	public static void main(String[] args)
	{
		try {
			DemoImplService d = new DemoImplServiceLocator();
			Demo de = d.getDemoImplPort();
			String x = de.helloworld();
			String y = de.hi("jaane jaana");
			
			System.out.println(x);
			System.out.println(y);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
