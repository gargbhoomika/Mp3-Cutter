package mp3_cutter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class cut {

	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the location of original file with its name: ");	
		String basic = sc.nextLine();
		File f1 = new File(basic);
		System.out.println("Enter the name of first half file to create: ");	
		String first = sc.nextLine();
		File f2 = new File("D://"+first);
		System.out.println("Enter the name of second half file to create: ");	
		String second = sc.nextLine();
		File f3 = new File("D://"+second);
		try
		{
			FileInputStream fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			FileOutputStream fs = new FileOutputStream(f3);
			int k=0;
			int len =(int) f1.length();
			while(k<=(len/2)-1)
			{
				fos.write(fis.read());
				k++;
			}
			while(k<=len-1)
			{
				fs.write(fis.read());
				k++;
			}
			fos.close();
			fis.close();
			fs.close();
			System.out.println("Mp3 Cut Successfully in Drive D: ");

		}
		catch(Exception e) {System.out.println(e);}
	}
	
}
