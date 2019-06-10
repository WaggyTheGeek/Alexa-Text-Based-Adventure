package com.wixsite.parkerc36;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class GameStart 
{
    private static boolean gameWon = false;
    
    public static void epic() throws FileNotFoundException 
    {
        Player player = new Player();
        Eventom[] eventList = new Eventom[30];
        createEvents(eventList, player);
        
//        for (int i = 0; i < 30; i++)
//        {
//            System.out.println(eventList[i]);
//        }
        
        int currentEvent = 1;
        // "main menu"
        
        if (true)
        {
            while (true)
            {
                // alexa read message
                eventList[currentEvent].getMessage();
                
                // set index to received action
                
                currentEvent = currentEvent; // set it here
                
                // if received action < -100 end, else play
                if (currentEvent < 100)
                {
                    break;
                }
                
                // if received action is less than 0 than player == dead
                else if (currentEvent < 0)
                {
                    player.setDead(true);
                    currentEvent = 0;
                }
                
                else if (currentEvent > 99)
                {
                    gameWon = true;
                    currentEvent = 0;
                }
                
            }
        }
        
        // alexa says goodbye, program ends

    }
        
    public static void createEvents (Eventom[] eventList, Player player) throws FileNotFoundException
    {
        File f = new File("story_events.txt");
        Scanner s = new Scanner(f);
        Eventom e;
        while(s.hasNextInt())
        {
            int index = s.nextInt() + 1;
            s.nextLine();
            String message = s.nextLine();
            int action1 = s.nextInt() + 1;
            int action2;
            int action3;
            if(s.hasNextInt())
            {
                action2 = s.nextInt() + 1;
                if(s.hasNextInt())
                {
                    action3 = s.nextInt() + 1;
                    e = new Eventom(message, action1, action2, action3, player);
                }
                else
                {
                    e = new Eventom(message, action1, action2, player);
                }
            }
            else
            {
                e = new Eventom(message, action1, player);
            }
            s.nextLine();
            s.nextLine();
            eventList[index] = e;
        }
    }
}