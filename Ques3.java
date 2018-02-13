package questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques3 {
    public static void main(String[] args) {
        String filePath = "D:/test.txt";
        System.out.print(doesFileExist(filePath));
      }

      public static String doesFileExist(String path) {

        BufferedReader br = null;
        FileReader fr = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
          fr = new FileReader(path);
          br = new BufferedReader(fr);
          String sCurrentLine;
          
          br = new BufferedReader(new FileReader(path));

          while ((sCurrentLine = br.readLine()) != null) {
            
          String[] strMass = sCurrentLine.split("–");
            stringBuilder.append(strMass[0] + "\n");
            strMass = strMass[1].split(",");
            if (strMass.length > 1) {
              stringBuilder.append(strMass[0].trim() + "\n" + strMass[1].trim() + "\n");
            } else {
              stringBuilder.append(strMass[0].trim() + "\n");
            }
            
          }
        } catch (IOException e) {
          e.printStackTrace();
        } 
        
        return stringBuilder.toString();
      }
}
}