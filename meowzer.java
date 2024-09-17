public class meowzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] gwapa ={
            {'x', 'x', ' ', ' ', ' ', 'x', 'x'},
            {' ', ' ', 'x', ' ', 'x', ' ', ' '},
            {'x', 'x', ' ', 'x', ' ', 'x', 'x'},
            {'x', ' ', 'x', 'x', 'x', ' ', 'x'},
            {' ','x', ' ', 'x', ' ', 'x', ' '},
            {'x', ' ', ' ', 'x', ' ', ' ', 'x'},
            {'x', ' ', 'x', 'x', 'x', ' ', 'x'},
            {' ', 'x', ' ', 'x', ' ', 'x', ' '},
            
        };
        for(int i = 0; i < gwapa.length; i++){
            for(int j = 0; j < gwapa[i].length; j++){
                System.out.print(gwapa[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}