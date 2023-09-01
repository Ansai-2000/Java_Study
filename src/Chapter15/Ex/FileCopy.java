package Chapter15.Ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream(".\\src\\Chapter15\\Ex\\FileCopy.java");
            FileOutputStream fos = new FileOutputStream(".\\src\\Chapter15\\Ex\\FileCopy.bak");

            int data = 0;
            while((data=fis.read())!=-1)
                fos.write(data);

            fis.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
