/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.calculator;

/**
 *
 * @author Sined
 */
import java.awt.Point;
public class MoveEast {
 
    Point location = new Point(4, 13);
    
    public Point moveEast(Point point)
    {
        point.move((point.x + 1), point.y);
        point.x = (point.x + 1);
        point.y = point.y;
        return point;
    }
    
    public Point moveWest(Point point)
    {
        point.move((point.x - 1), point.y);
        point.x = (point.x - 1);
        point.y = point.y;
        return point;
    }
    
    public Point moveNorth(Point point)
    {
        point.move(point.x, (point.y + 1));
        point.x = point.x;
        point.y = (point.y + 1);
        return point;
    }
    
    public Point moveSouth(Point point)
    {
        point.move(point.x, (point.y - 1));
         point.x = point.x;
        point.y = (point.y - 1);
        return point;
    }
    
    public void MoveRover(int xcoordinate, int ycoordinate, char[] commands)
    {
        Point newPoint = new Point(xcoordinate, ycoordinate);
        for(int i=0; i<commands.length; i++)
        {
        String direction = Character.toString(commands[i]);
        
        MoveEast east = new MoveEast();
        
        if(direction == "E")
        {
            newPoint = east.moveEast(newPoint);
            System.out.print(newPoint.toString());

        }
        if(direction == "W")
        {
            newPoint = east.moveWest(newPoint);
            System.out.print(newPoint.toString());

        }
        if(direction == "N")
        {
            newPoint = east.moveNorth(newPoint);
            System.out.print(newPoint.toString());

        }
        if(direction == "S")
        {
            newPoint = east.moveSouth(newPoint);
            System.out.print(newPoint.toString());

        }
        }
        
        System.out.print("Final Position: " +newPoint.toString());
    }
    
    
}
