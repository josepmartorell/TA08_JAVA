import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Password {
	
	private int longitud;
	private String password;
    private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
	public Password() {
		this.longitud = 8;
		this.password = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;

	}


	public String generarPassword(){
		
		String userData = JOptionPane.showInputDialog(null, "Introduzca la longitud del password que desea crear", 
				"CLASE PASSWORD", JOptionPane.INFORMATION_MESSAGE);
		if (userData == null) {
			System.out.println("CANCELADO");
			System.exit(0);
		}else {
			longitud = Integer.parseInt(userData);		
		}
		
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
 
        for (int i = 0; i < longitud; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            password.append(chars.charAt(randomIndex));
        }
 
        return password.toString();
	}	
	
	public void mostrarPasswordGenerado() {
		
		String passwd = generarPassword();
		JOptionPane.showMessageDialog(null, "PASSWORD GENERADO:\n"+passwd, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(passwd);
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

