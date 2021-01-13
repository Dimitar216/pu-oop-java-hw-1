package Game;

import Figures.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Gameboard class where everything is initialized and rendered
 */
public class GameBoard extends JFrame {

    private static final Color BROWN = new Color(51,0,0);

    /**
     * constructor
      */
    public GameBoard(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(708,680);
        this.setVisible(true);
    }

    /**
     * Method where all the figures/lines/tiles are initialized and rendered.
     * @param g
     */
    @Override
    public void paint(Graphics g){
        Graphics2D lineDrawer = (Graphics2D) g;
        Line2D line0 = new Line2D.Float(8,0,8,2500);
        Line2D line1 = new Line2D.Float(139,0,139,2500);
        Line2D line2 = new Line2D.Float(279,0,279,2500);
        Line2D line3 = new Line2D.Float(419,0,419,2500);
        Line2D line4 = new Line2D.Float(559,0,559,2500);
        Line2D line5 = new Line2D.Float(699,0,699,2500);
        Line2D line6 = new Line2D.Float(0,31,1300,31);
        Line2D line7 = new Line2D.Float(0,159,1300,159);
        Line2D line8 = new Line2D.Float(0,288,1300,288);
        Line2D line9 = new Line2D.Float(0,416,1300,416);
        Line2D line10 = new Line2D.Float(0,544,1300,544);
        Line2D line11 = new Line2D.Float(0,671,1300,671);


        GameTile redTileOne = new GameTile(0,0,140,160,Color.RED);
        GameTile brownTileOne = new GameTile(0,1,140,160,BROWN);
        GameTile whiteTileOne = new GameTile(0,2,140,160,Color.WHITE);
        GameTile brownTileTwo = new GameTile(0,3,140,160,BROWN);
        GameTile redTileTwo = new GameTile(0,4,140,160,Color.RED);

        GameTile grayTileOne = new GameTile(0.8,0,140,160,Color.GRAY);
        GameTile grayTileTwo = new GameTile(0.8,1,140,160,Color.GRAY);
        GameTile whiteTileTwo = new GameTile(0.8,2,140,160,Color.WHITE);
        GameTile grayTileThree = new GameTile(0.8,3,140,160,Color.GRAY);
        GameTile grayTileFour = new GameTile(0.8,4,140,160,Color.GRAY);

        GameTile whiteTileThree = new GameTile(1.6,0,140,160,Color.WHITE);
        GameTile whiteTileFour = new GameTile(1.6,1,140,160,Color.WHITE);
        GameTileDot whiteCenter = new GameTileDot(1.6,2,1.97,2.245,140,160,Color.WHITE);
        GameTile whiteTileSix = new GameTile(1.6,3,140,160,Color.WHITE);
        GameTile whiteTileSeven = new GameTile(1.6,4,140,160,Color.WHITE);

        GameTile grayTileFive = new GameTile(2.4,0,140,160,Color.GRAY);
        GameTile grayTileSix = new GameTile(2.4,1,140,160,Color.GRAY);
        GameTile whiteTileEight = new GameTile(2.4,2,140,160,Color.WHITE);
        GameTile grayTileSeven = new GameTile(2.4,3,140,160,Color.GRAY);
        GameTile grayTileEight = new GameTile(2.4,4,140,160,Color.GRAY);

        GameTile brownTileThree = new GameTile(3.2,0,140,160,BROWN);
        GameTile redTileThree = new GameTile(3.2,1,140,160,Color.RED);
        GameTile whiteTileNine = new GameTile(3.2,2,140,160,Color.WHITE);
        GameTile redTileFour = new GameTile(3.2,3,140,160,Color.RED);
        GameTile brownTileFour = new GameTile(3.2,4,140,160,BROWN);

        Leader yellowLeader = new Leader(0.7,6.52,160,160,Color.YELLOW);
        Leader greenLeader = new Leader(7.15,0.33,160,160,Color.GREEN);

        Guard yellowGuardOne = new Guard(1.1,0.7,160,160,Color.YELLOW,Color.GREEN);
        Guard yellowGuardTwo = new Guard(1.1,3.0,160,160,Color.YELLOW,Color.GREEN);
        Guard yellowGuardThree = new Guard(1.1,5.3,160,160,Color.YELLOW,Color.GREEN);
        Guard yellowGuardFour = new Guard(1.1,7.6,160,160,Color.YELLOW,Color.GREEN);

        Guard greenGuardOne = new Guard(9.65,3.0,160,160,Color.GREEN,Color.YELLOW);
        Guard greenGuardTwo = new Guard(9.65,5.3,160,160,Color.GREEN,Color.YELLOW);
        Guard greenGuardThree = new Guard(9.65,7.6,160,160,Color.GREEN,Color.YELLOW);
        Guard greenGuardFour = new Guard(9.65,9.9,160,160,Color.GREEN,Color.YELLOW);

        brownTileThree.render(g);
        redTileThree.render(g);
        whiteTileNine.render(g);
        redTileFour.render(g);
        brownTileFour.render(g);

        grayTileFive.render(g);
        grayTileSix.render(g);
        whiteTileEight.render(g);
        grayTileSeven.render(g);
        grayTileEight.render(g);

        whiteTileThree.render(g);
        whiteTileFour.render(g);
        whiteCenter.render(g);
        whiteTileSix.render(g);
        whiteTileSeven.render(g);

        grayTileOne.render(g);
        grayTileTwo.render(g);
        whiteTileTwo.render(g);
        grayTileThree.render(g);
        grayTileFour.render(g);

        redTileOne.render(g);
        brownTileOne.render(g);
        whiteTileOne.render(g);
        brownTileTwo.render(g);
        redTileTwo.render(g);

        g.setColor(Color.BLACK);
        lineDrawer.draw(line0);
        lineDrawer.draw(line1);
        lineDrawer.draw(line2);
        lineDrawer.draw(line3);
        lineDrawer.draw(line4);
        lineDrawer.draw(line5);
        lineDrawer.draw(line6);
        lineDrawer.draw(line7);
        lineDrawer.draw(line8);
        lineDrawer.draw(line9);
        lineDrawer.draw(line10);
        lineDrawer.draw(line11);

        yellowLeader.render(g);
        greenLeader.render(g);

        yellowGuardOne.render(g);
        yellowGuardTwo.render(g);
        yellowGuardThree.render(g);
        yellowGuardFour.render(g);

        greenGuardOne.render(g);
        greenGuardTwo.render(g);
        greenGuardThree.render(g);
        greenGuardFour.render(g);
    }
}