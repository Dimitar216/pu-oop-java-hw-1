package Game;

import java.awt.*;

public class GameTileDot {
    private double row;
    private double col;
    private int widthOfTile;
    private int heightOfTile;
    private double rowDot;
    private double colDot;
    private Color color;

    protected GameTileDot(double row, double col,double rowDot,double colDot,int widthOfTile,int heightOfTile,Color color){
        this.row          = row;
        this.col          = col;
        this.widthOfTile  = widthOfTile;
        this.heightOfTile = heightOfTile;
        this.color        = color;
        this.rowDot       = rowDot;
        this.colDot       = colDot;

    }

    protected void render(Graphics g){
        int tileX = (int) (this.col * this.widthOfTile);
        int tileY = (int) (this.row * this.heightOfTile);
        int tileDotX = (int) (this.colDot * this.widthOfTile);
        int tileDotY = (int) (this.rowDot * this.heightOfTile);

        g.setColor(this.color);
        g.fillRect(tileX,tileY,this.widthOfTile, this.heightOfTile);
        g.setColor(Color.GRAY);
        g.fillOval(tileDotX,tileDotY,this.widthOfTile/2,(this.heightOfTile/2)-10);
    }
}
