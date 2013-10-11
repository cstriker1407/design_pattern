package design_patterns;

import design_patterns.singleton.Singleton_doublecheck;
import design_patterns.singleton.Singleton_enum;
import design_patterns.singleton.Singleton_hungry;
import design_patterns.singleton.Singleton_lazy;

public class Main 
{
	public static void main(String[] args)
	{
		/* Singleton */
		System.out.println("直接加载");
		Singleton_hungry.getInstance().sayHello();

		System.out.println("懒加载");
		Singleton_lazy.donth();
		System.out.println("--");
		Singleton_lazy.getInstance().sayHello();
		
		System.out.println("double check");
		Singleton_doublecheck.getInstance().sayHello();

		System.out.println("enum");
		Singleton_enum.INSTANCE.sayHello();
		
		
	}
}
