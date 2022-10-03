package com.example.heathCare;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="Medics")
public class Medic {

    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String especialidade;
    @Field
    private String numero; 
    
    public Medic() {}
    
    
  
    public Medic(String name, String especialidade,String numero, String comentario) {
        this.name = name;
        this.especialidade = especialidade;
        this.numero = numero;
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
  
    public String Especialidade() {
        return especialidade;
    }
  
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getNumero() {
      return numero;
    }
    
    public void setNumero(String numero) {
      this.numero = numero;
    }
    
  
    @Override
    public String toString() {
        return "Medic [id=" + id + ", name=" + name + ", especialidade=" + especialidade + "numero: "+numero +"]";
    }

}
