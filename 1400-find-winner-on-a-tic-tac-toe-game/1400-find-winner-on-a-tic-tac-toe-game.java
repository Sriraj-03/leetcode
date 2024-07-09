class Solution {
    public String tictactoe(int[][] moves) {
        int arr[][] = new int[3][3];
        int win[][][] = {
            {{0,0},{0,1},{0,2}},
            {{1,0},{1,1},{1,2}},
            {{2,0},{2,1},{2,2}},
            {{0,0},{1,0},{2,0}},
            {{0,1},{1,1},{2,1}},
            {{0,2},{1,2},{2,2}},
            {{0,0},{1,1},{2,2}},
            {{0,2},{1,1},{2,0}}
        };

        for(int i=0;i<moves.length;i++){
            if(i % 2 == 0){
                arr[moves[i][0]][moves[i][1]] = 1;
            }else{
                arr[moves[i][0]][moves[i][1]] = 2;
            }
        }

        // for(int[] ar : arr){
        //     System.out.println(Arrays.toString(ar));
        // }

        for(int i=0;i<win.length;i++){
            int a = arr[win[i][0][0]][win[i][0][1]];
            int b = arr[win[i][1][0]][win[i][1][1]];
            int c = arr[win[i][2][0]][win[i][2][1]];
            if(a == b && b == c){
                if(a == 1){
                    return "A";
                }if(a == 2){
                    return "B";
                }
            }
        }
        if(moves.length<9){
            return "Pending";
        }
        return "Draw";
    }
}
// class Solution {
//     public String tictactoe(int[][] moves) {
//         // Initialize the 3x3 grid
//         char[][] grid = new char[3][3];
//         int moveCount = 0; // To keep track of total moves

//         // Iterate through the moves
//         for (int i = 0; i < moves.length; i++) {
//             int row = moves[i][0];
//             int col = moves[i][1];
//             char player = (i % 2 == 0) ? 'A' : 'B'; // Alternate between players

//             // Update the grid
//             grid[row][col] = player;
//             moveCount++;

//             // Check for a winner
//             if (checkWinner(grid, row, col, player)) {
//                 return String.valueOf(player);
//             }
//         }

//         // If all cells are filled, return "Draw"
//         if (moveCount == 9) {
//             return "Draw";
//         }

//         // Otherwise, return "Pending"
//         return "Pending";
//     }

//     // Helper method to check if a player has won
//     private boolean checkWinner(char[][] grid, int row, int col, char player) {
//         // Check row
//         for (int i = 0; i < 3; i++) {
//             if (grid[row][i] != player) {
//                 break;
//             }
//             if (i == 2) {
//                 return true;
//             }
//         }

//         // Check column
//         for (int i = 0; i < 3; i++) {
//             if (grid[i][col] != player) {
//                 break;
//             }
//             if (i == 2) {
//                 return true;
//             }
//         }

//         // Check diagonals
//         if (row == col || row + col == 2) {
//             for (int i = 0; i < 3; i++) {
//                 if (grid[i][i] != player) {
//                     break;
//                 }
//                 if (i == 2) {
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }
// }
