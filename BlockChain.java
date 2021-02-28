/* Admas University, School of Post Graduate Studies
Department of Computer Science-Section2
Course Name: Object Oriented Software Development
Project Members:
Seifu Birega        PGMGC/8062/20
Yordanos Woldu      PGMGC/8053/20
Mekonnen Ayalew     PGMGC/3118/20
Simeon G/Yohanes    PGMGC/8067/20
Habtamu Birhan      PGMGC/8023/20
 */
package CBMTS;

import java.util.Arrays;

public class BlockChain {
    
   public static void main(String[] args) {
   
    /*
    Blockchain 
    Hash of firts transaction + transaction
    */
       
    Transaction transaction1 = new Transaction("Geno", "Antu", 15000);
    Transaction transaction2 = new Transaction("Tomy", "Seifu",20000);
    Transaction transaction3 = new Transaction("Helu", "Antu", 25000);
    Transaction transaction4 = new Transaction("Dillu", "Seifu", 30000);
    
   /* System.out.println("Hash Code :" + transaction1.hashCode());
    System.out.println("Hash Code :" + transaction2.hashCode());
    System.out.println("Hash Code :" + transaction3.hashCode());
    System.out.println("Hash Code :" + transaction4.hashCode());*/
    
    Block firstBlock = new Block(0, Arrays.asList(transaction1));
    System.out.println("The First Block is:" +firstBlock.hashCode());
    System.out.println("-------------------------------");
    Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction2));
    System.out.println("The Second Block is:" +secondBlock.hashCode());
    System.out.println("-------------------------------");
    Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction3));
    System.out.println("The Third Block is:" +thirdBlock.hashCode());
    System.out.println("-------------------------------");
    Block fourthBlock = new Block(thirdBlock.hashCode(), Arrays.asList(transaction4));
    System.out.println("The Fourth Block is:" +fourthBlock.hashCode());
    
//firstBlock.hashCode()
               
   } 
}
