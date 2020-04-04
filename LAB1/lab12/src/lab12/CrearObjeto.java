package lab12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CrearObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario miusuario=new Usuario("Diego","diego2009");
		System.out.println(miusuario);
		try {
			ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream("user.out"));
			o.writeObject(miusuario);
			o.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
