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
       
       while(snake.mover()){
            lienzo.wait(500);
            lienzo.erase();
            snake.dibujar(lienzo);
        }
        lienzo.drawString("GAME OVER",220, 240);

    }

}

