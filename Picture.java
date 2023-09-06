/**
 * 
 * Draws a Bridge with a Watch Tower and a Tree
 * 
 * 
 * Author: Obdulio Benitez Garcia; G00294642
 * 
 * Date of Project: September 5, 2023
 */

public class Picture
{
    private Circle sun;
    private Square mainWall;
    private Square mainRoof;
    private Square bodyWall;
    private Square mainDoor;
    private Circle mainDoorTop;
    private Square treeTrunk;
    private Triangle treeOne;
    private Triangle treeTwo;
    private Square bodyWallVoid;
    private Circle bridgeVoid;
    private Square mainRoofVoid;
    private Circle circleVoidOne;
    private Circle circleVoidTwo;
    private Square squareVoidOne;
    private Square squareVoidTwo;
    private Square squareVoidThree;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun = new Circle();
        mainWall = new Square();
        mainRoof = new Square();
        bodyWall = new Square();
        mainDoor = new Square();
        mainDoorTop = new Circle();
        treeTrunk = new Square();
        treeOne = new Triangle();
        treeTwo = new Triangle();
        bodyWallVoid = new Square();
        bridgeVoid = new Circle();
        mainRoofVoid = new Square();
        circleVoidOne = new Circle();
        circleVoidTwo = new Circle();
        squareVoidOne = new Square();
        squareVoidTwo = new Square();
        squareVoidThree = new Square();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sun.changeColor("yellow");
            sun.moveHorizontal(-225);
            sun.moveVertical(-60);
            sun.makeVisible();
            
            mainWall.changeSize(160);
            mainWall.makeVisible();
            
            mainDoor.changeColor("white");
            mainDoor.moveHorizontal(60);
            mainDoor.moveVertical(100);
            mainDoor.makeVisible();
            
            mainDoorTop.changeColor("white");
            mainDoorTop.changeSize(60);
            mainDoorTop.moveHorizontal(140);
            mainDoorTop.moveVertical(100);
            mainDoorTop.makeVisible();
            
            bodyWall.changeColor("blue");
            bodyWall.changeSize(250);
            bodyWall.moveHorizontal(-223);
            bodyWall.moveVertical(-90);
            bodyWall.makeVisible();
            
            person.changeSize(30,10);
            person.moveHorizontal(140);
            person.moveVertical(80);
            person.makeVisible();
            
            treeTrunk.changeColor("black");
            treeTrunk.changeSize(10);
            treeTrunk.moveHorizontal(-281);
            treeTrunk.moveVertical(150);
            treeTrunk.makeVisible();
            
            treeOne.changeColor("green");
            treeOne.changeSize(30,35);
            treeOne.moveHorizontal(-176);
            treeOne.moveVertical(100);
            treeOne.makeVisible();
            
            treeTwo.changeColor("green");
            treeTwo.changeSize(30,35);
            treeTwo.moveHorizontal(-176);
            treeTwo.moveVertical(85);
            treeTwo.makeVisible();    
            
            bodyWallVoid.changeColor("white");
            bodyWallVoid.changeSize(250);
            bodyWallVoid.moveHorizontal(-223);
            bodyWallVoid.moveVertical(-200);
            bodyWallVoid.makeVisible();
            
            mainRoof.changeColor("blue");
            mainRoof.changeSize(160);
            mainRoof.moveHorizontal(13);
            mainRoof.moveVertical(-160);
            mainRoof.makeVisible();
            
            mainRoofVoid.changeColor("white");
            mainRoofVoid.changeSize(160);
            mainRoofVoid.moveHorizontal(13);
            mainRoofVoid.moveVertical(-198);
            mainRoofVoid.makeVisible();
            
            circleVoidOne.changeColor("white");
            circleVoidOne.changeSize(40);
            circleVoidOne.moveHorizontal(190);
            circleVoidOne.moveVertical(-30);
            circleVoidOne.makeVisible();
            
            circleVoidTwo.changeColor("white");
            circleVoidTwo.changeSize(40);
            circleVoidTwo.moveHorizontal(115);
            circleVoidTwo.moveVertical(-30);
            circleVoidTwo.makeVisible();
            
            bridgeVoid.changeColor("white");
            bridgeVoid.changeSize(160);
            bridgeVoid.moveHorizontal(-95);
            bridgeVoid.moveVertical(110);
            bridgeVoid.makeVisible();
            
            squareVoidOne.changeColor("white");
            squareVoidOne.changeSize(30);
            squareVoidOne.moveHorizontal(-190);
            squareVoidOne.moveVertical(40);
            squareVoidOne.makeVisible();
            
            squareVoidTwo.changeColor("white");
            squareVoidTwo.changeSize(30);
            squareVoidTwo.moveHorizontal(-113);
            squareVoidTwo.moveVertical(40);
            squareVoidTwo.makeVisible();
            
            squareVoidThree.changeColor("white");
            squareVoidThree.changeSize(30);
            squareVoidThree.moveHorizontal(-40);
            squareVoidThree.moveVertical(40);
            squareVoidThree.makeVisible();
            
            drawn = true;
        }
        
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sun.changeColor("black");
        bodyWall.changeColor("black");
        treeTrunk.changeColor("black");
        treeOne.changeColor("black");
        treeTwo.changeColor("black");
        mainWall.changeColor("black");
        mainRoof.changeColor("black");
        
        mainDoor.changeColor("white");
        mainDoorTop.changeColor("white");
        mainDoorTop.changeColor("white");
        bodyWallVoid.changeColor("white");
        mainRoofVoid.changeColor("white");
        circleVoidOne.changeColor("white");
        circleVoidTwo.changeColor("white");
        bridgeVoid.changeColor("white");
        squareVoidOne.changeColor("white");
        squareVoidTwo.changeColor("white");
        squareVoidThree.changeColor("white");
        
        person.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sun.changeColor("yellow");
        bodyWall.changeColor("blue");
        treeTrunk.changeColor("black");
        treeOne.changeColor("green");
        treeTwo.changeColor("green");
        mainWall.changeColor("red");
        mainRoof.changeColor("blue");
        
        mainDoor.changeColor("white");
        mainDoorTop.changeColor("white");
        mainDoorTop.changeColor("white");
        bodyWallVoid.changeColor("white");
        mainRoofVoid.changeColor("white");
        circleVoidOne.changeColor("white");
        circleVoidTwo.changeColor("white");
        bridgeVoid.changeColor("white");
        squareVoidOne.changeColor("white");
        squareVoidTwo.changeColor("white");
        squareVoidThree.changeColor("white");
        
        person.changeColor("black");
    }
}
