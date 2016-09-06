/*
 * Extra tips key points in array
    1.Array in java is static matlab: declared gareko capacity beyond value deyoyo vane compilaitiion error hunxa
    2.Size of array fix hunxa. ra yestlai array create garda nai define garnu parxa. paxe paxe define garda hunnxa
    3.array ko index value start from 0
 */

/**
 *
 * @author simon
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //array declare garne lamo method
        int[] array; //array declared of integer datatypes
        array = new int[5]; //its geta the size of 5
        array[0] =1; //declared first array at index o
        array[1] =4;  //array can be declared upto 4 index means 5
        array[2] =7; 
        array[3] = 4;
        array[4] = 54;
        //displaying the array
        for(int i =0;i<5;i++){
        System.out.println("the arrays are "+array[i]);
        }
        
        
        //array lilst  of string
        String[] merostring;
        merostring = new String[3];
        merostring[0] = "hello";
        merostring[1] = "suman";
        merostring[2] = "kxa sanchai";
        
        //desplayig the scrren
        for(int i =0;i<merostring.length;i++){
        System.out.print(merostring[i]); //new finding print le new line /n include gardiana
        }
        
       
    }
    
}
