package gamelogic;

public class Player 
{
    private boolean dead;
    
    public Player()
    {
        dead = false;    
    }
    
    public boolean getDead()
    {
        return dead;
    }
    
    public void setDead(boolean dead)
    {
        this.dead = dead;
    }
}
