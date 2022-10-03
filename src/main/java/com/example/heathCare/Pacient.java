package com.example.heathCare;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Pacients")
public class Pacient {
	
	@Id
	private String id;
	@Field
	private String name;
	@Field
	private String consulta;
	@Field
	private String numero;
	@Field
	private String comentario;
	
	public Pacient() {}
	
	

	public Pacient(String name, String consulta,String numero, String comentario) {
		this.name = name;
		this.consulta = consulta;
		this.numero = numero;
		this.comentario = comentario;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	
	public String getNumero() {
      return numero;
    }
	
	public void setNumero(String numero) {
      this.numero = numero;
    }
	
	public String getComentario() {
      return comentario;
    }
	
	public void setComentario(String comentario) {
      this.comentario = comentario;
    }

	@Override
	public String toString() {
		return "Pacient [id=" + id + ", name=" + name + ", consulta=" + consulta + "numero: "+numero +"]";
	}
	
}
