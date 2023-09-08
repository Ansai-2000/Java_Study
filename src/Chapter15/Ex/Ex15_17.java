package Chapter15.Ex;

import java.io.File;

public class Ex15_17 {
    static int deletedFiles = 0;
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java Ex15_17 Extension");
            System.exit(0);
        }
        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        String ext = "." + args[0];

        delete(dir,ext);
    }

    private static void delete(File dir, String ext) {
        File[] files = dir.listFiles();

        for (File file : files) {
            if(file.isDirectory()){
                delete(file,ext);
            }else{
                String filename = file.getAbsolutePath();

                if(filename.endsWith(ext)){
                    System.out.println(filename);
                    if(file.delete()){
                        System.out.println(" - 삭제 성공");
                        deletedFiles++;
                    }else
                        System.out.println(" - 삭제 실패");
                }
            }
        }
    }
}
