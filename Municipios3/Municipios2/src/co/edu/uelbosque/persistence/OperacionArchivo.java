package co.edu.uelbosque.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.uelbosque.model.Departamento;
import co.edu.uelbosque.model.Municipio;

public class OperacionArchivo {
	private String ruta;
	
	public OperacionArchivo() {
		ruta = "Data/Puestos_de_votacion.csv";
		
	}
	
	public ArrayList<Municipio> leerCsv() {
		ArrayList<Municipio> municipios = new ArrayList<Municipio>();
		 String linea = "";
	        File f = new File(ruta);
	        try {
	            FileReader fr = new FileReader(f);
	            BufferedReader br = new BufferedReader(fr);
	            linea = br.readLine();
	            String[] temp;
	            while (linea != null) {
	                temp = linea.split(";");
	                Municipio municipioAux = new Municipio(temp[0], temp[1], temp[2], temp[3]);
	                municipios.add(municipioAux);
	                linea = br.readLine();
	            }
	            fr.close();
	            System.out.println("Archivo cargado correctamente");
	            return municipios;
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("No se ha podido leer el archivo ");
	            return null;
	        }
	        
	        
	}

	/**
	 * @return the ruta
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	

}
