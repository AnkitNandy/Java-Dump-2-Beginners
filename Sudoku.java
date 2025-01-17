import java.util.ArrayList;
import java.util.HashSet;
  
class Sudoku{
    private int[][] sudoku;
    private static final int UNASSIGNED = 0;
    public Sudoku()
    {
        sudoku = new int[9][9];
    }
    Sudoku(int[][] sudoku)
    {
        this.sudoku = sudoku;
    }
    private HashSet< Integer > rowSet = null;
    private HashSet< Integer > colSet = null;
    private HashSet< Integer > boxSet = null;
    private ArrayList< HashSet < Integer > > arrList = new ArrayList< HashSet < Integer > >();
    public boolean isAllowed(int row, int col) {
  
        rowSet = arrList.get(row);
        colSet = arrList.get(9 + col);
  
        int box = 3 * (row / 3) + (col / 3);
        boxSet = arrList.get(18 + box);
  
        return (rowSet.add(sudoku[row][col]) && colSet.add(sudoku[row][col]) && boxSet.add(sudoku[row][col]));
    }
    public boolean isCorrectSolution()
    {
        for (int i = 0; i < 27; i++)
        {
            arrList.add(new HashSet< Integer >());
        }
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if(!isAllowed(i, j) || sudoku[i][j] == UNASSIGNED)
                {
                    return false;
                }
            }
        }
        return true;
    }
}