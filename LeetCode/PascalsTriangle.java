public class PascalsTriangle {

  public List<List<Integer>> generate(int numRows) {
         ArrayList<List<Integer>> triangle = new ArrayList<List<Integer>>();
         if(numRows == 0){
             return triangle;
         }
         triangle.add(new ArrayList<Integer>());
         triangle.get(0).add(1);

         for(int rowNum = 1; rowNum <= numRows; rowNum++){
             List<Integer> row = new ArrayList<Integer>();
             List<Integer> previous = triangle.get(rowNum-1);
             row.add(1);
             for(int addNum = 1; addNum < rowNum-1; addNum++){
                 row.add(previous.get(addNum-1) + previous.get(addNum));
             }
             row.add(1);
             triangle.add(row);
         }
         triangle.remove(1);

         return triangle.get(numRows-1);
      }

}
