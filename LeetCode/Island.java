public class Island {

  public static void main(String[] args) {

    int [][] testGrid = {[0,0,1,0,0,0,0,1,0,0,0,0,0],
                         [0,0,0,0,0,0,0,1,1,1,0,0,0],
                         [0,1,1,0,1,0,0,0,0,0,0,0,0],
                         [0,1,0,0,1,1,0,0,1,0,1,0,0],
                         [0,1,0,0,1,1,0,0,1,1,1,0,0],
                         [0,0,0,0,0,0,0,0,0,0,1,0,0],
                         [0,0,0,0,0,0,0,1,1,1,0,0,0],
                         [0,0,0,0,0,0,0,1,1,0,0,0,0]};

    System.out.println(maxAreaOfIsland(testGrid));

  }
  public static int maxAreaOfIsland(int[][] grid) {
       int maxArea = 0;
       for(int i = 0; i < grid.length; i++) {
          for(int j = 0; j < grid[i].length; j++) {
              maxArea = Math.max(maxArea,dfs(i,j,grid));
          }

       }
       return maxArea;
   }
   public static int dfs(int x, int y, int[][] grid) {
       if(x >= 0 && x < grid.length && y >= 0 && y < grid[x].length && grid[x][y] == 1) {
           grid[x][y] = 0;
           return 1 + dfs(x-1,y,grid) + dfs(x+1, y, grid) + dfs(x,y-1, grid) + dfs(x,y+1,grid);
       }
       return 0;
   }


}
