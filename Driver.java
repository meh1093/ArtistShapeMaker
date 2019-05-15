/**
 * Created by manuelhernandez on 11/5/17.
 */
public class Driver {
    public static void main(String[] args) {


        //creates artist object////////////////////////
        Artist pabloPicaso = new Artist();
        //creates shapes
        Square squareOb = new Square();
        Triangle triangleOb = new Triangle();
        Circle circleOb = new Circle();
        Star starOb = new Star();


        //Creates lines objects/////////////////////////////////
        StraightLine straightLineOb= new StraightLine();
        CurvedLine curvedLineOb= new CurvedLine();
        ElbowedLine elbowedLineOb = new ElbowedLine();

        //Creates Stringz Object/////////////////////////////

        Stringz stringzOb =new Stringz();

        // "draws" a square, atriangle, acircle star  with the field values inherited from the Shapes superclass//////
        System.out.println(" // \"draws\" a square, atriangle, acircle star  with the field values inherited from the Shapes superclass//////");
        System.out.println();
        pabloPicaso.execute(squareOb);
        pabloPicaso.execute(triangleOb);
        pabloPicaso.execute(circleOb);
        pabloPicaso.execute(circleOb);
        pabloPicaso.execute(starOb);

        //draws a straighline, a curvedLine, a elbowed line with the field values inherited from the Lines superclass//////
        System.out.println(" //draws a straighline, a curvedLine, a elbowed line with the field values inherited from the Lines superclass//////");
        System.out.println();
        pabloPicaso.execute(straightLineOb);
        pabloPicaso.execute(curvedLineOb);
        pabloPicaso.execute(elbowedLineOb);

        //draws a Stringz
        System.out.println(" //draws a Stringz");
        System.out.println();
        pabloPicaso.execute(squareOb);

        // "draws" a square, atriangle, a circle, a star with the field values overwritten in the Square,Circle,Star subclasses//////
        System.out.println(" \"draws\" a square, atriangle, a circle, a star with the field values overwritten in the Square,Circle,Star subclasses//////");
        squareOb.color="purple";
        squareOb.height=2.1;
        squareOb.width=2.1;
        pabloPicaso.execute(squareOb);

        triangleOb.color="black";
        triangleOb.height=3.2;
        triangleOb.width=2.5;
        pabloPicaso.execute(triangleOb);

        circleOb.color="yellow";
        circleOb.width= 1;
        circleOb.height=1;
        pabloPicaso.execute(circleOb);


        starOb.color="Brown";
        starOb.height=12;
        starOb.width=11;;
        pabloPicaso.execute(starOb);

        //draws a straighline, a curvedLine, a elbowed line with the field values inherited from the Shapes superclass//////
        System.out.println("//draws a straighline, a curvedLine, a elbowed line with the field values inherited from the Shapes superclass//////");
        System.out.println();
        straightLineOb.length=12;

        pabloPicaso.execute(straightLineOb);

        curvedLineOb.length= 2;
        pabloPicaso.execute(curvedLineOb);

        elbowedLineOb.length =456.24;
        pabloPicaso.execute(elbowedLineOb);


    }


}
