package es.studiumFechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas
{
	public static void main(String[] args)
	{
		// ALTAS, MODIFICACIONES
		// Fecha Europea (Pantalla) --> Fecha Americana (MySQL)
		String fechaEuropea = "12/10/1492";
		String[] arrayEuropea = fechaEuropea.split("/");
		System.out.println("MySQL:"+arrayEuropea[2]+"-"
		+arrayEuropea[1]+"-"+arrayEuropea[0]);
		// INSERT INTO ventas 
		// UPDATE ventas
		
		// CONSULTAS
		// Fecha Americana (MySQL) --> Fecha Europea (Pantalla)
		String fechaAmericana = "2021-03-15";
		String[] arrayAmericana = fechaAmericana.split("-");
		System.out.println("Pantalla:"+arrayAmericana[2]+"/"
		+arrayAmericana[1]+"/"+arrayAmericana[0]);
		
		Date ahora;
		SimpleDateFormat formateador;
		// Mostrar fecha actual tal cual
		ahora = new Date();
		System.out.println("Fecha original: " + ahora);
		// Formateando la fecha
		formateador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println ("Fecha formato europeo: " + formateador.format(ahora));
		formateador = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println ("Fecha formato americano: " + formateador.format(ahora));
	}
}