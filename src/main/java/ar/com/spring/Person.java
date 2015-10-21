package ar.com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	
	private int id;
	private String name;
	private int taxId;
	
	/*
	 * Atributo Adress:
	 * Es el que estamos "Inyectando" a traves de Spring.
	 * Por eso estamos usando @Autowired := que es la anotation
	 * que se usa para inyectar el bean.
	 * */
	private Adress adress;
	
	
	public Person(int id, String name){
		
		System.out.println("Hola dede el Constructor!!!!!!!!!");
		this.id = id;
		this.name = name;		
		
	}
	
	
	public void speak(){
		
		System.out.println("Hola a todo el mundo, soy una persona desde Spring!!!!");
		
	}


	public void setTaxId(int taxId) {
		this.taxId = taxId; 
	}


	@Autowired
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	public void init (){
		
		System.out.println("Hola dede el init!!!!");
		
	}
	
	public void destroy(){
		
		System.out.println("hola desde el Destroy!!!!!");
		
	}
	

	public String toString(){
		
		return "mi id es: " + this.id + " mi nombre es: " + this.name +
				"  Este es mi taxtId:  "  + this.taxId  + 
				"  Esta es mi Adress: " + this.adress;
		
	}
	
	
	

}
