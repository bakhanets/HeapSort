import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreatingFiles {
    public CreatingFiles(){
        try(FileWriter fw=new FileWriter("1.txt",false))
        {

            Random rd=new Random();
            for (int i=0;i<100;i++)
                fw.append(Integer.toString(rd.nextInt(1000))+"\n");
            fw.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        try(FileWriter fw=new FileWriter("2.txt",false))
        {

            Random rd=new Random();
            for (int i=0;i<1000;i++)
                fw.append(Integer.toString(rd.nextInt(1000))+"\n");
            fw.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


        try(FileWriter fw=new FileWriter("3.txt",false))
        {

            Random rd=new Random();
            for (int i=0;i<10000;i++)
                fw.append(Integer.toString(rd.nextInt(1000))+"\n");
            fw.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
