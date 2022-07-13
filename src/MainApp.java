import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		// INSTANCIAMOS UN OBJETO TIPO PERSONA Y MOSTRAMOS POR PANTALLA EL VALOR DE LOS ATRIBUTOS DE LA INSTANCIA
		Persona persona = new Persona("39294415L", "Felipe", 57, 'H', 74F, 1.68F);
		JOptionPane.showMessageDialog(null, "DNI: "+persona.getDni()
			+"\nNOMBRE: "+persona.getNombre()+"\nEDAD: "+persona.getEdad()
			+"\nALTURA: "+persona.getAltura()+"\nPESO: "+persona.getPeso(), "CLASE PERSONA", JOptionPane.INFORMATION_MESSAGE);	

		// INSTANCIAMOS UN OBJETO TIPO PASSWORD E INVOCAMOS UN MÉTODO DE DICHO OBJETO PARA GENERAR UN PASSWORD DE FORMA ALEATORIA MOSTRANDOLO POR PANTALLA
		Password password1 = new Password();
		password1.mostrarPasswordGenerado();
			
		// INSTANCIAMOS UN OBJETO TIPO ELECTRODOMÉSTICO MOSTRANDO POR PANTALLA LOS ATRIBUTOS PARAMETRIZADOS Y VALIDADOS EN EL TERCER CONSTRUCTOR
		Electrodomestico electrodomestico = new Electrodomestico(300, "rojo", "b", 10);
		JOptionPane.showMessageDialog(null, "PRECIO BASE"+electrodomestico.getPrecioBase()
				+"\nCOLOR: "+electrodomestico.getColor()
				+"\nCONSUMO ENERGÉTICO: "+electrodomestico.getConsumoEnergetico()
				+"\nPESO: "+electrodomestico.getPeso(), "CLASE ELECTRODOMESTICO", JOptionPane.INFORMATION_MESSAGE);
		
		// INSTANCIAMOS UN OBJETO TIPO SERIE CON EL CONSTRUCTOR DEFAULT Y LO MOSTRAMOS POR PANTALLA
		Serie juegosDelHambre = new Serie();
		JOptionPane.showMessageDialog(null, "TÍTULO: "+juegosDelHambre.getTitulo()
				+"\nTEMPORADA: "+juegosDelHambre.getNumTemporada()
				+"\nENTREGADO: "+juegosDelHambre.isEntregado()
				+"\nGENERO: "+juegosDelHambre.getGenero()
				+"\nCREADOR: "+juegosDelHambre.getCreador()+"\n", "CLASE SERIE", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
