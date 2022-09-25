
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohammedhamdy32
 */
public class FileItems {
   

   void set_items(String s)
   {
               PrintWriter fin =null; 
       try{
       fin =new PrintWriter(new FileWriter("FileItems.txt"));
      }catch(Exception e)
      {   System.out.println(e);
      }
       fin.println(s);
       fin.close();
       
       }
   String get_items(){
         Scanner input=null;
       try{
          input=new Scanner(new File("FileItems.txt")) ;
       }catch(Exception e){
           System.out.println(e);
       }
       
      return input.nextLine();
       
        
     
   }
   
   
  boolean get_state_open_or_close(){
         Scanner input=null;
       try{
          input=new Scanner(new File("Filestate.txt")) ;
       }catch(Exception e){
           System.out.println(e);
       }
       
       boolean s2=input.nextBoolean();
        //System.out.println(s2);
        return s2;
     
   }
    
     void set_state_open_or_close( boolean b)
   {
       PrintWriter fin =null; 
       try{
       fin =new PrintWriter(new FileWriter("Filestate.txt"));
      }catch(IOException e)
      {   System.out.println(e);
      }
       fin.println(b);
       fin.close();
       
   }
     void set_text_area(String s)
     {
        try{ PrintWriter f1 =new PrintWriter(new FileWriter("TextArea.txt"));
             f1.println(s);
             f1.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
     }
     String get_text_area()
     {
         Scanner input=null;
        try{ input =new Scanner (new File("TextArea.txt"));
        
        }catch(Exception e){
            System.out.println(e);
        }
               return input.nextLine();
        }
     
    
    public static void main(String[] args) {
                FileItems f1=new FileItems();
                f1.set_text_area("hello");
//               f1.set_state_open_or_close(true);
//               System.out.println(f1.get_state_open_or_close());

    }
}
