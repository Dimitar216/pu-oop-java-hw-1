package Figures;

import java.awt.*;

/**
 * This class creates an instance of a figure on the board and renders it.
 */
public class Leader {
    private double row;
    private double col;
    private int widthOfTile;
    private int heightOfTile;
    private Color color;
    /**
     * Constructor for Leader
     * @param row row position
     * @param col col position
     * @param widthOfTile width of Leader
     * @param heightOfTile height of Leader
     * @param color color of figure
     */
    public Leader(double row, double col,int widthOfTile,int heightOfTile,Color color){
        this.row          = row;
        this.col          = col;
        this.widthOfTile  = widthOfTile;
        this.heightOfTile = heightOfTile;
        this.color        = color;
    }

    /**
     * renders figure on the board based on row/col and width/height.
     * @param g
     */
    public void render(Graphics g){
        int tileX = (int) (this.col * (this.widthOfTile-70));
        int tileY = (int) (this.row * (this.heightOfTile-80));

        g.setColor(this.color);
        g.fillRect(tileX,tileY,this.widthOfTile-70, this.heightOfTile-80);

    }
}