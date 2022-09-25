import java.io.*;
import java.util.Arrays;
public class Stringarray
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String :");
        String st = br.readLine();
        char [] strarray = st.toCharArray();
        Arrays.sort(strarray);
        for(int i = 0; i < strarray.length; i++)
        {
            System.out.print(strarray[i]);
        }

    }
}
