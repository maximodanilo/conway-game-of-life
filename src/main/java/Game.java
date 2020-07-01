public class Game {

    boolean[][] board;
    int height;
    int width;

    public Game(int height, int width) {
        board = new boolean[height][width];
        this.height = height;
        this.width = width;
    }

    public void printBoard(){
        board[0][1] = true;

        for (int y = 0; y < height; y++) {
            System.out.println("");
            for (int x = 0; x < width; x++) {
                if(board[y][x]) {
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
        }
    }
}