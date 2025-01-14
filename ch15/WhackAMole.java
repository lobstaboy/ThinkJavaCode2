import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Simulates the arcade game of Whack-A-Mole.
 * https://en.wikipedia.org/wiki/Whac-A-Mole
 */
public class WhackAMole implements ActionListener {

    private Drawing drawing;
    private Toolkit toolkit;

    /**
     * Set up the drawing and window frame.
     */
    public WhackAMole() {

        // create drawing, add polygons
        drawing = new MoleHill(800, 600);
        drawing.add(new Mole(150, 200));
        drawing.add(new Mole(350, 250));
        drawing.add(new Mole(550, 200));

        // set up the window frame
        JFrame frame = new JFrame("Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
        toolkit = frame.getToolkit();
    }

    /**
     * Create and start the timer.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        WhackAMole sim = new WhackAMole();
        Timer timer = new Timer(1000 / 60, sim);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        drawing.nextact();
        drawing.repaint();
        toolkit.sync();
    }

}
