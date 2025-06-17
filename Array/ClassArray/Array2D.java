package Array.ClassArray;

public class Array2D {
    public static void main(String[] args) {
        int[][] marks = {
                {2,3,5},
                {8,9,6}
        };
        for(int i=0;i<marks.length;i++){
            for(int j=0;j< marks.length;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }

}
