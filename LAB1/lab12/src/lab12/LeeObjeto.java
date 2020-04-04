package lab12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class LeeObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("user.out"));
			System.out.println("Recupero el objeto "+new Date());
			Usuario miusuario=(Usuario) in.readObject();
			System.out.println(miusuario);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
