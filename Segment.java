import java.awt.Color;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    // instance variables - replace the example below with your own
    private int xPosicion;
    private int yPosicion;
    public final static int LONGITUD_SEGMENTO = 4;
    private int direccion;
    private Color color;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int xPos, int yPos, Color col, int direc)
    {
        // initialise instance variables
        xPosicion = xPos;
        yPosicion = yPos;
        color = col;
        direccion = direc;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getXPosicion()
    {
        return xPosicion;
    }

    public int xPosicionFinal(){
        int xPosFinal = xPosicion;
        if(getDireccion()== 0){
            xPosFinal = xPosicion + LONGITUD_SEGMENTO;
        }
        else if (getDireccion() == 180){
            xPosFinal = xPosicion - LONGITUD_SEGMENTO;
        }
        return xPosFinal;

    }

    public int getYPosicion()
    {
        return yPosicion;
    }

    public int yPosicionFinal(){

        int yPosFinal = yPosicion;
        if(getDireccion()== 90){
            yPosFinal = yPosicion + LONGITUD_SEGMENTO;
        }
        else if (getDireccion() == 270){
            yPosFinal = yPosicion - LONGITUD_SEGMENTO;
        }
        return yPosFinal;

    }

    public int getDireccion(){
        return direccion;
    }

    public Color getColor(){
        return color;
    }

    public void dibujar(Canvas lienzo){
        lienzo.setForegroundColor(color);
        lienzo.drawLine(xPosicion, yPosicion, xPosicionFinal(), yPosicionFinal());

    }

    public void borrar(Canvas lienzo){
        lienzo.erase();
    }
    
    public boolean colisiona(Segment segmento){
        
        return (xPosicionFinal() == segmento.getXPosicion() && yPosicionFinal() == segmento.getYPosicion() );
            
    }
}
