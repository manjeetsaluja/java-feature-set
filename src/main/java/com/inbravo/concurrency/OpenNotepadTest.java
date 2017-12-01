package com.inbravo.concurrency;
/**
 * 
 */
import java.io.IOException;

public class OpenNotepadTest {

   
    public static void main(String args[])throws Exception{  
     
      Runtime rs= Runtime.getRuntime();
      try {
      rs.exec("notepad");//will open a new notepad  
    } 
      catch (IOException e) {
        System.out.println(e);
      }
  }
}

