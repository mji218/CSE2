//Michelle Iskandar
//CSE2 lab12 
//4-17-15

public class RowColumn{
    public static void main(String[] args){
        int [][]array =   increasingMatrix(3,4,true);
        
    }//end main mathod
    public static int[][] increasingMatrix(int width,int height, boolean format){
        int[][] array = new int[width][];
        int a=1;
        for (int i=0; i<width; i++){
            array[i]=new int[height];
            for(int j=0; j<height; j++){
                array[i][j]=a;
                a++;
            }//end height for loop
        }//end width for loop
        for (int i=0; i<width; i++){
           
            for(int j=0; j<height; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        return array;
        
    }//end increasingMatrix method
    /*public static void printMatrix(int[][] array, boolean format){
        
    }//end printMatrix method
    public static int[][] translate(int[][] array){
        
    }//end translate method
    public static void addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb){
        
    }//end addMatrix method */
    
}//end class