package gamelogic;

public class GameStart 
{
    private static boolean gameWon = false;
    
    public static void main(String[] args) 
    {
        Player player = new Player();
        Eventom[] eventList = new Eventom[10];
        int currentEvent = 0;
        String slot = "";
        // "main menu"
        
        while (true)
        {
            // alexa speak message of event
            // alexa receive action from person
            
            if (slot.equals("quit"))
            {
                // output quit to alexa
                break;
            }
            
            else
            {
                // evaluate action
                // map to next event
                
                
                if (player.getDead() == true)
                {
                    // output dead
                    break;
                }
            
                if (gameWon == true)
                {
                    // output won
                    break;
                }
                
                
            }
        }
    }
        
    public void createEvents (Eventom[] eventList)
    {
        
    }
}