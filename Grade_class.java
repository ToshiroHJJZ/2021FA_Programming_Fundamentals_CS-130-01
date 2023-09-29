public class Grade_class {
	private String name;
	private int lower_bound;

	public Grade_class()
	{
		this.name = " ";
		this.lower_bound = 0;
	}
	public Grade_class(String name, int lower_bound)
	{
		this.name = name;
		this.lower_bound = lower_bound;
	}
	public String get_name()
	{
		return name;
	}
	public int get_lower_bound()
	{
		return lower_bound;
	}
	public void set_name(String name)
	{
	this.name = name;
	}
	public void set_lower_bound(int lower_bound)
	{
	this.lower_bound = lower_bound;
	}
	
	public String toString()
	   {
	      return name + "\t" + lower_bound;
	   }		
}