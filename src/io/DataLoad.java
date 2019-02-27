package io;

import java.io.*;

public class DataLoad {

	public static  String[] whatever(){
		return s;
	}
	public static String[] s;
    public static String[] readFileByLines(String string){
        File file = new File(string+".txt");
        BufferedReader reader = null;
        try{
            System.out.println();
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine())!=null){
             s = tempString.split("\\|");
                System.out.println("line"+line+": "+tempString);
                System.out.println(s[0]);
                line++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null){
                try{
                    reader.close();
                }catch(IOException e1){

                }
            }
        }
		return s;
    }
}
