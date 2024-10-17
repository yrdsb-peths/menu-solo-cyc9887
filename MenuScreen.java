import greenfoot.*;

public class MenuScreen extends World
{
    public MenuScreen()
    {
        super(600, 400, 1);
        
        Button button1 = new Button();
        addObject(button1, 300, 300);
        
        Button button2 = new Button();
        addObject(button2, 300, 100);
    }
}
