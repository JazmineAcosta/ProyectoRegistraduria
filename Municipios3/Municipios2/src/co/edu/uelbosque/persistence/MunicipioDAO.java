package co.edu.uelbosque.persistence;

import java.util.ArrayList;

import co.edu.uelbosque.model.Municipio;

public class MunicipioDAO {
	private ArrayList<Municipio> municipios;
	private OperacionArchivo operacion;
	
	public MunicipioDAO() {
		operacion = new OperacionArchivo();
		municipios = operacion.leerCsv();
	}
	
	public void encontrarDireccion(String direccion) {
		for (int i = 0; i < municipios.size(); i++) {
			if(municipios.get(i).getDireccion().equals(direccion)) {
				System.out.println("la direccion se encuentra en\nDepartamento: "+
								municipios.get(i).getNombreDepa()+"\nMunicipio:"+
								municipios.get(i).getNombre()+"\nLugar:"+
								municipios.get(i).getNombreLugar());
			}
		}
	}
	
	public void traerMunicipio() {
		String todos_mun=" ";
		for (int i = 0; i < municipios.size(); i++) {
			todos_mun = municipios.get(i).getNombre();
			int i2=i+1;
			if(i2<municipios.size() && !todos_mun.equals(municipios.get(i2).getNombre())) {
				System.out.println(todos_mun);
			}
		}
		System.out.println(municipios.get(municipios.size()-1).getNombre());
		
	}
	
	
	
	

}
