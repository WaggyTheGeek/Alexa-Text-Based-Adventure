package gamelogic;

public class Eventom 
{
    private String message;
    private String action1;
    private String action2;
    private String action3;
    private Player player;
    
    public Eventom (String message, String action1, String action2, String action3, Player player)
    {
        this.message = message;
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.player = player;
    }

    public String getMessage() 
    {
        return message;
    }

    public void setMessage(String message) 
    {
        this.message = message;
    }

    public String getAction1() 
    {
        return action1;
    }

    public void setAction1(String action1) 
    {
        this.action1 = action1;
    }

    public String getAction2() 
    {
        return action2;
    }

    public void setAction2(String action2) 
    {
        this.action2 = action2;
    }

    public String getAction3() 
    {
        return action3;
    }

    public void setAction3(String action3) 
    {
        this.action3 = action3;
    }

    public Player getPlayer() 
    {
        return player;
    }

    public void setPlayer(Player player) 
    {
        this.player = player;
    }
}
