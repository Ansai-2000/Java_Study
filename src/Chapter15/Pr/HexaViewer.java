package Chapter15.Pr;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

class HexaViewer {
    public static void main(String[] args) throws IOException{
        if(args.length != 1){
            System.out.println("USAGE: java HexaViewer FILENAME");
            System.exit(0);
        }
        String inputFile = args[0];

        try{
            FileInputStream input = new FileInputStream("UserInfo.ser");
            PrintStream output = new PrintStream(System.out);

            int data = 0;
            int i = 0;
            while((data = input.read())!=-1){
                output.printf("%02X",data);
                if(++i%16==0)
                    output.println();
            }
            input.close();
            output.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
