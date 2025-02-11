import java.awt.Color;
import java.awt.Graphics;

/**
 * A square at a fixed location that changes color.
 */
public class Cell {

    public static final Color OFF = Color.WHITE;
    public static final Color ON = Color.BLACK;

    private final int x;
    private final int y;
    private final int size;
    private Color color;

    /**
     * Constructs a new cell, initially turned off.
     * 
     * @param x the X coordinate
     * @param y the Y coordinate
     * @param size number of pixels
     */
    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = OFF;
    }

    /**
     * Paints the cell on the screen.
     * 
     * @param g graphics context
     */
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(this.x + 1, this.y + 1, this.size - 1, this.size - 1);
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(this.x, this.y, this.size, this.size);
    }

    /**
     * @return the cell's color
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * @param color the new color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return true if the cell is on
     */
    public boolean isOff() {
        return this.color == OFF;
    }

    /**
     * @return true if the cell is off
     */
    public boolean isOn() {
        return this.color == ON;
    }

    /**
     * Sets the cell's color to OFF.
     */
    public void turnOff() {
        this.color = OFF;
    }

    /**
     * Sets the cell's color to ON.
     */
    public void turnOn() {
        this.color = ON;
    }

}
