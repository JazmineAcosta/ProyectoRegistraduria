package co.edu.uelbosque.controller;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import co.edu.uelbosque.model.Departamento;
import co.edu.uelbosque.model.Municipio;
import co.edu.uelbosque.persistence.MunicipioDAO;
import co.edu.uelbosque.persistence.OperacionArchivo;

public class Controller {
	MunicipioDAO municipioDAO;
	private String name;

	
	public Controller() {
		municipioDAO = new MunicipioDAO();
		municipioDAO.encontrarDireccion("Carrera 39 No. 80-33");
		System.out.println("Lista de Municipios: ");
		municipioDAO.traerMunicipio();
		//System.out.println("Lista de municipios: "+name);
	}
	

}
