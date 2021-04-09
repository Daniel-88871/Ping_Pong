package svanimpe.pong;

public class Sounds
{
    private Sounds() {}
    
    public static final String HIT_WALL = Sounds.class.getResource("/Recursos/hit-wall.m4a").toExternalForm();
    public static final String HIT_PADDLE = Sounds.class.getResource("/Recursos/hit-paddle.m4a").toExternalForm();
    public static final String SCORE_PLAYER = Sounds.class.getResource("/Recursos/score-player.m4a").toExternalForm();
    public static final String SCORE_OPPONENT = Sounds.class.getResource("/Recursos/score-opponent.m4a").toExternalForm();
}
