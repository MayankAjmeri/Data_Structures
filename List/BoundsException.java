public class BoundsException extends Exception
{
	public void printerror()
	{
		printStackTrace();
		System.err.println("Out of Bounds!");
	}
}