package Chapter15.Ex;

import java.io.File;
import java.nio.file.Files;

public class Ex15_18 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java Ex15_18 DIRECTORY");
            System.exit(0);
        }

        File dir = new File(args[0]);

        if(!dir.exists() || !dir.isDirectory()){
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        File[] Files = dir.listFiles();

        for (File file : Files) {
            String fileName = file.getName();

            String newFileName = "Ex" + fileName;
            newFileName = newFileName.substring(newFileName.length() - 7);
            file.renameTo(new File(dir,newFileName));
        }
    }
}
