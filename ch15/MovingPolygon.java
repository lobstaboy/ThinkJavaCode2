/**
 * A polygon that moves around the screen.
 */
public class MovingPolygon extends RegularPolygon {

    private int dx;
    private int dy;

    /**
     * Constructs a moving polygon.
     * 
     * @param nsides the number of sides
     * @param length length of each side
     */
    public MovingPolygon(int nsides, int length) {
        super(nsides, length);
        this.dx = 10;
        this.dy = 5;
    }

    /**
     * @param dx how many pixels to move left/right
     */
    public void setDx(int dx) {
        this.dx = dx;
    }

    /**
     * @param dy how many pixels to move up/down
     */
    public void setDy(int dy) {
        this.dy = dy;
    }

    @Override
    public void act() {

        // edge detection
        for (int i = 0; i < npoints; i++) {
            if (xpoints[i] < 0 || xpoints[i] > 800) {
                dx *= -1;
                break;
            }
        }
        for (int i = 0; i < npoints; i++) {
            if (ypoints[i] < 0 || ypoints[i] > 600) {
                dy *= -1;
                break;
            }
        }

        // move one step
        translate(dx, dy);
    }

}
