package design_patterns.singleton;

public enum Singleton_enum
{
    INSTANCE;
    public void sayHello()
    {
    	System.out.println("hello from enum,i=" + i);
    }
    private int i = 0;
}