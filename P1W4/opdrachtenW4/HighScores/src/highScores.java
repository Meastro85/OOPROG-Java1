/**
 * Vincent Verboven
 * 10/10/2022
 */
public class highScores {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        player1.setName("Hasti");
        player2.setName("Jonas");
        player3.setName("Bogdan");
        player1.setScore(1020);
        player2.setScore(610);
        player3.setScore(460);
        System.out.println("HIGHSCORES");
        System.out.println("----------");
        System.out.println(player1.getName() + " " + player1.getScore());
        System.out.println(player2.getName() + " " + player2.getScore());
        System.out.println(player3.getName() + " " + player3.getScore());
    }
}
