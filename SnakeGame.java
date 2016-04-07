import java.util.ArrayList;
/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    private Canvas lienzo;
    private Snake snake;
    private static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;
    private ArrayList<Segment> segmentosSerpiente;

    /*
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Snake game", ANCHO_LIENZO, ALTO_LIENZO);
        segmentosSerpiente = new ArrayList<>();

    }

    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        snake = new Snake(ANCHO_LIENZO,ALTO_LIENZO);
        lienzo.erase();
        snake.dibujar(lienzo);

    }

    public void animateSnake()
    {
        boolean moverse = true;
        while(moverse)
        {
            lienzo.wait(300);
            snake.borrar(lienzo);
            snake.dibujar(lienzo);
            int index = 0;
            for(Segment segmentos:segmentosSerpiente){
                while(moverse && index < segmentosSerpiente.size() -1 ){

                    lienzo.eraseCircle( segmentos.getPosicionFinalX(),segmentos.getPosicionFinalX(),8);

                }

            }
            moverse = snake.mover();

        }
        lienzo.drawString("GAME OVER",220, 240);

    }

}

