package yeah.cstriker1407.design_patterns.factory.abstractfactory;

public class AbstractFactory1
{
	public static void getSender()
	{
		Provider provider = new MailProvider();
		Sender aSender =  provider.produce();
		Sender bSender =  provider.produce();
	}
}


interface Sender
{
	public void send();
}

class Mail implements Sender
{
	@Override
	public void send()
	{
		System.out.println("Mail");
	}
}
class SMS implements Sender
{
	@Override
	public void send()
	{
		System.out.println("SMS");
	}
}




interface Provider
{
	public Sender produce();
}

class MailProvider implements Provider
{
	@Override
	public Sender produce()
	{
		return new Mail();
	}
}
class SMSProvider implements Provider
{
	@Override
	public Sender produce()
	{
		return new SMS();
	}
}

