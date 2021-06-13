import javax.swing.JFrame;
/**
 * This is a test file to test out JFrame
 *
 * @Eric Chan
 * @05/23/2021
 */
public class JFrame_Test
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        
        frame.setVisible(true);
    }
}
