import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionScreen extends World
{

    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    Label[] pages = new Label[3];
    int currentPage = 0;
    Button next = new Button();
    Button prev = new Button();
    public InstructionScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label1 = new Label("Instructions 1", 40);
        Label label2 = new Label("Instructions 2", 40);
        Label label3 = new Label("Instructions 3", 40);
        
        pages[0] = label1;
        pages[1] = label2;
        pages[2] = label3;
        
        addObject(label1,300, 200);
        addObject(prev, 150, 300);
        addObject(next, 450, 300);
    }
    
        public void act()
    {
        if (Greenfoot.mouseClicked(getObjects(Button.class).get(0))) // Previous button
        {
            prevPage(prev);
        }
        
        if (Greenfoot.mouseClicked(getObjects(Button.class).get(1))) // Next button
        {
            nextPage(next);
        }
    }
    
    private void prevPage(Button button)
    {
        if (Greenfoot.mouseClicked(button))
        {
            if(currentPage > 0)
            {
                removeObject(pages[currentPage]);
                currentPage--;
                addObject(pages[currentPage], 300, 200);
            }
        }
    }
    
    private void nextPage(Button button)
    {
        if (Greenfoot.mouseClicked(button))
        {
            if(currentPage < 2)
            {
                removeObject(pages[currentPage]);
                currentPage++;
                addObject(pages[currentPage], 300, 200);
            }
        }
    }
}
