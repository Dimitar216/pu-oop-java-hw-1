package Game;

import java.awt.*;

public class GameTile {

    private double row;
    private double col;
    private int widthOfTile;
    private int heightOfTile;
    private Color color;

    protected GameTile(double row, double col,int widthOfTile,int heightOfTile,Color color){
        this.row          = row;
        this.col          = col;
        this.widthOfTile  = widthOfTile;
        this.heightOfTile = heightOfTile;
        this.color        = color;
    }

    protected void render(Graphics g){
        int tileX = (int) (this.col * this.widthOfTile);
        int tileY = (int) (this.row * this.heightOfTile);

        g.setColor(this.color);
        g.fillRect(tileX,tileY,this.widthOfTile, this.heightOfTile);

    }
}