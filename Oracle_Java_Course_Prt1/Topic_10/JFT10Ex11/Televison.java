public class Televison
{
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on_off = false;
	
	public void setChannel(int newChannel)
	{
		if(on_off && channel >= 1 && channel <= 120)
		{
			this.channel = newChannel;
		}
	}
	
	public int getChannel()
	{
		return this.channel;
	}
	
	public void setVolume(int newVolumeLevel)
	{
		if(on_off && (volumeLevel >=1  && volumeLevel <= 7))
		{
			this.volumeLevel = newVolumeLevel;
		}
	}
	
	public int getVolume()
	{
		return this.volumeLevel;
	}
	
	public void setOn_Off(boolean on_off)
	{
		if(on_off == true)
		{
			this.on_off = true;
		}
		else
		{
			this.on_off = false;
		}
	}
	
	public boolean getOn_Off()
	{
		return on_off;
	}
	
	public void channelUp()
	{
		if(on_off && channel < 120)
		
			channel++;
		
	}
	
	public void channelDown()
	{
		if(on_off  && channel > 1)
		
			channel--;
		
	}
	
	public void volumeUp()
	{
		if(on_off && volumeLevel < 7)
		
			volumeLevel++;
		}
	
	
	public void volumeDown()
	{
		if(on_off && volumeLevel > 1)
		
			volumeLevel--;
		
	}
	
	@Override
	public String toString()
	{
		return "Channel: " + channel + "\n" + "Volume level: " + volumeLevel + "\n" + "On or Off: " + on_off; 
	}
	
	
}