package Chapter15.Ex;

import java.io.File;

public class Ex15_16 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java Ex15_16 DIRECTORY");
            System.exit(0);
        }

        File f = new File(args[0]);

        if(!f.exists() || !f.isDirectory()){
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        File[] files = f.listFiles();

        for (File file : files) {
            String fileName = file.getName();
            System.out.println(file.isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
