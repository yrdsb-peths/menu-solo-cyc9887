import greenfoot.*;

public class MenuScreen extends World
{
    public MenuScreen()
    {
        super(600, 400, 1);

        addObject(new Button(this::goInstructions), 300, 340);
        prepare();
    }

    public void goInstructions()
    {
        Greenfoot.setWorld(new InstructionScreen());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Menu", 40);
        addObject(label,300,100);
    }
}