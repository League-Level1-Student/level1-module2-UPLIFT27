package _99_extra._05_minion;

public class Minion {
	
	private String name; 
	private int eyes; 
	private String color; 
	private String master;

		
	public Minion(String name, int eyes, String color, String master)	
	{
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	public String getName()	
	{
		return name;
	}
	public void setName(String newname)
	{
		name = newname;
	}
	public int getEyes()
	{
		return eyes;
	}
	public void seteyes(int neweyes)
	{
		eyes= neweyes;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String newcolor)
	{
		color = newcolor;
	}
	public String getMaster()
	{
		return master;
	}
	public void setMaster(String newMaster)
	{
		master = newMaster;
	}
}
