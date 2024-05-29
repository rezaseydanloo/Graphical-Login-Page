package User;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;

public class FileAndHashing {

    public void file_hashing (String originalString , String username , String email){

        try {

            FileWriter fw = new FileWriter("store.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            String hashedString = DigestUtils.sha256Hex(originalString);
            bw.newLine();
            bw.append(hashedString + "#" + username + "#" + email );
            bw.close();

        } catch (IOException e) {

            System.out.println(e);
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    public boolean FileReader (String password , String name){

        try {
            FileReader fr = new FileReader("store.txt");
            BufferedReader br = new BufferedReader(fr);
            String [] Line = new String[20];
            String [] Line2 = new String[3];
            int i = 0 ;

            while (br.readLine()!=null){
                Line[i]= br.readLine();
                i++;
            }

            for (int j = 0 ; j<=i-1 ; j++){

                Line2=Line[j].split("#");

                if (name.equals(Line2[1])){
                        if (password.equals(Line2[0])){
                        return true;
                        }

                }
                else if (j==i-2){
                    System.out.println("salam");
                        break;
                    }

                }


            System.out.println("na movafagh");
            return false;


        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    public String hashing (String password ){

        String hashedString = DigestUtils.sha256Hex(password);
        return hashedString;
    }


}
