package com.company.xo_minmax;

public class Main {

	public static void main(String[] args) {

		/*
				{ 'x', 'o', 'o' },
				{ 'x', '_', '_' },
				{ '_', '_', '_' }

				{ 'x', 'o', 'x' },
		        { 'o', 'o', 'x' },
		        { '_', '_', '_' }
		 */
		char board[][] =
		    {
                    { 'o', 'x', 'o' },
                    { '_', 'x', 'x' },
                    { 'x', 'o', 'o' }
		    };
		TicTacToe ticTacToe = new TicTacToe();
        AlphaBeta alphaBeta=new AlphaBeta();


        //Cell bestCell = ticTacToe.bestMove(board);

        Cell bestCell=alphaBeta.bestMove(board);


        System.out.println("The Optimal Move is :");
		System.out.println("Row : " + bestCell.x + ", Col : "+ bestCell.y);
	}

}
