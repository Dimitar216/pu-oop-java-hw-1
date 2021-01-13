package Figures;

import java.awt.*;

/**
 * This class creates an instance of a figure on the board and renders it.
 */
public class Guard {
    private double row;
    private double col;
    private int widthOfTile;
    private int heightOfTile;
    private Color primaryColor;
    private Color outlineColor;

    /**
     * Constructor for Guard
     * @param row row position
     * @param col col position
     * @param widthOfTile width of Guard
     * @param heightOfTile height of Guard
     * @param primaryColor primary color
     * @param outlineColor outline color
     */
    public Guard(double row, double col,int widthOfTile,int heightOfTile,Color primaryColor,Color outlineColor){
        this.row          = row;
        this.col          = col;
        this.widthOfTile  = widthOfTile;
        this.heightOfTile = heightOfTile;
        this.primaryColor        = primaryColor;
        this.outlineColor       = outlineColor;
    }

    /**
     * renders figure on the board based on row/col and width/height.
     * @param g
     */
    public void render(Graphics g){
        int tileX = (int) (this.col * (this.widthOfTile-100));
        int tileY = (int) (this.row * (this.heightOfTile-100));

        g.setColor(this.outlineColor);
        g.fillOval(tileX,tileY,this.widthOfTile-100, this.heightOfTile-100);

        g.setColor(this.primaryColor);
        g.fillOval(tileX+8,tileY+8,this.widthOfTile-115, this.heightOfTile-115);
    }
}