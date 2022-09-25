
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mohammedhamdy32
 */
public class Separate_items {
    public int size_of_list;
    public String []array_of_list=null;

    String[] get_Items(String s)
    {
      //  System.out.println(array_of_list.length);
          StringTokenizer stk =new StringTokenizer( s,",");
        size_of_list=stk.countTokens();
        array_of_list=new String[size_of_list];
        int i = 0;    
                //System.out.println(array_of_list.length);

        while(stk.hasMoreTokens())
        {
            array_of_list[i]=stk.nextToken();
           // System.out.println(list_items[i]);
            i++;
        }
        
       return array_of_list;
    }
    
    public static void main(String[] args) {
        Separate_items s=new Separate_items();
        System.out.println(s.get_Items("a,s,c"));
    }
    
}
