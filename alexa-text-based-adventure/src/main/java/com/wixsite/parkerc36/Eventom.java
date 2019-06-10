package com.wixsite.parkerc36;

public class Eventom 
{
    private String message;
    private int action1;
    private int action2;
    private int action3;
    private Player player;
    
    public Eventom (String message, int action1, int action2, int action3, Player player)
    {
        this.message = message;
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.player = player;
    }
    
    public Eventom (String message, int action1, int action2, Player player)
    {
        this.message = message;
        this.action1 = action1;
        this.action2 = action2;
        this.player = player;
    }
    
    public Eventom (String message, int action1, Player player)
    {
        this.message = message;
        this.action1 = action1;
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

    public int getAction1() 
    {
        return action1;
    }

    public void setAction1(int action1) 
    {
        this.action1 = action1;
    }

    public int getAction2() 
    {
        return action2;
    }

    public void setAction2(int action2) 
    {
        this.action2 = action2;
    }

    public int getAction3() 
    {
        return action3;
    }

    public void setAction3(int action3) 
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
    
    public String toString()
    {
        return message + "\n" + action1 + "\n" + action2 + "\n" + action3;
    }
}
