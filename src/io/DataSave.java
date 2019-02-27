package io;
import java.io.*;

public class DataSave {
        public static void saveProduct(String name,String string) {
            // TODO Auto-generated method stub
            File file = new File(name+".txt");
            System.out.println("Saving");
            try {
                file.createNewFile(); //
            } catch (IOException e) {

                e.printStackTrace();
            }
            byte bt[] = new byte[1024];
            try {
                FileOutputStream in = new FileOutputStream(file);

                        bt = string.getBytes();
                        in.write(bt,0,bt.length);in.write('\r');
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } 

}
