/* @file TicTacToe.java
@brief Using loops to create a game of Tic Tac Toe.
@author Sara Barker
@date 9/21/2018 */

public class TicTacToe {
    public static void main(String[] args) {

        //set scale to (0,3)
        StdDraw.setScale(-0.2, 3.2);

        // draw the board
        StdDraw.line(0, 0, 0, 3);
        StdDraw.line(0, 0, 3, 0);
        StdDraw.line(3, 0, 3, 3);
        StdDraw.line(0, 3, 3, 3);

        StdDraw.line(1, 0, 1, 3);
        StdDraw.line(2, 0, 2, 3);

        StdDraw.line(0, 1, 3, 1);
        StdDraw.line(0, 2, 3, 2);



        double x;
        double y;

        //integer division
        //create if statement to determine when box is clicked within coordinates
        //odd/even click to determine x/o

        int moves = 0; //no moves to start with

        while (moves < 9) {
            if (StdDraw.isMousePressed()) {

                // true
                System.out.println("mouse clicked!");

                // get mouse location

                x = StdDraw.mouseX(); //returns x coordinate
                y = StdDraw.mouseY();

                // lower left
                if (x>= 0 && x <= 1) {
                    if (y>= 0 && y <= 1) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (0.5, 0.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (0, 0, 1, 1);
                            StdDraw. line (0, 1, 1, 0);
                        }
                    }
                }

                // lower middle
                if (x>= 1 && x <= 2) {
                    if (y>= 0 && y <= 1) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (1.5, 0.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (1, 0, 2, 1);
                            StdDraw. line (1, 1, 2, 0);
                        }
                    }
                }

                // lower right
                if (x>= 2 && x <= 3) {
                    if (y>= 0 && y <= 1) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (2.5, 0.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (2, 0, 3, 1);
                            StdDraw. line (2, 1, 3, 0);
                        }
                    }
                }

                // middle left
                if (x>= 0 && x <= 1) {
                    if (y>= 1 && y <= 2) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (0.5, 1.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (0, 1, 1, 2);
                            StdDraw. line (0, 2, 1, 1);
                        }
                    }
                }

                // middle middle
                if (x>= 1 && x <= 2) {
                    if (y>= 1 && y <= 2) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (1.5, 1.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (1, 1, 2, 2);
                            StdDraw. line (1, 2, 2, 1);
                        }
                    }
                }

                // right middle
                if (x>= 2 && x <= 3) {
                    if (y>= 1 && y <= 2) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (2.5, 1.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (2, 1, 3, 2);
                            StdDraw. line (2, 2, 3, 1);
                        }
                    }
                }

                // top left
                if (x>= 0 && x <= 1) {
                    if (y>= 2 && y <= 3) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (0.5, 2.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (0, 2, 1, 3);
                            StdDraw. line (0, 3, 1, 2);
                        }
                    }
                }

                // top middle
                if (x>= 1 && x <= 2) {
                    if (y>= 2 && y <= 3) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (1.5, 2.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (1, 2, 2, 3);
                            StdDraw. line (1, 3, 2, 2);
                        }
                    }
                }

                // top right
                if (x>= 2 && x <= 3) {
                    if (y>= 2 && y <= 3) {
                        if (moves% 2 == 0) {
                            StdDraw. circle (2.5, 2.5, 0.5);
                        } else if (moves% 2 == 1) {
                            StdDraw. line (2, 2, 3, 3);
                            StdDraw. line (2, 3, 3, 2);
                        }
                    }
                }

                // update the moves
                moves++;
                // pause execution for half second
                StdDraw.pause(500); //500 milliseconds

            }
        }

    }
}