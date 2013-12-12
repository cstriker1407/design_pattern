package yeah.cstriker1407.design_patterns;

import yeah.cstriker1407.design_patterns.bridge.BridgeTest;
import yeah.cstriker1407.design_patterns.builder.BuilderTest;
import yeah.cstriker1407.design_patterns.factory.abstractfactory.AbstractFactory1;
import yeah.cstriker1407.design_patterns.observe.ObserveTest;
import yeah.cstriker1407.design_patterns.responsechain.ResponsechainTest;
import yeah.cstriker1407.design_patterns.singleton.Singleton_doublecheck;
import yeah.cstriker1407.design_patterns.singleton.Singleton_enum;
import yeah.cstriker1407.design_patterns.singleton.Singleton_hungry;
import yeah.cstriker1407.design_patterns.singleton.Singleton_lazy;
import yeah.cstriker1407.design_patterns.state.LiftStates;
import yeah.cstriker1407.design_patterns.template.TemplateTest;

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
		
		/* factory */
		System.out.println("factory");
		AbstractFactory1.test();
		
		/* templates */
		TemplateTest.test();
		
		/* Builder */
		System.out.println("Builder");
		BuilderTest.test();
		
		
		/* Builder */
		System.out.println("State");
		LiftStates.normal();
		LiftStates.test();
		
		
		/* Observer */
		ObserveTest.test();
		
		
		/* Responsechain */
		ResponsechainTest.test();
		
		
		/* bridge test */
		BridgeTest.test();
	}
}
