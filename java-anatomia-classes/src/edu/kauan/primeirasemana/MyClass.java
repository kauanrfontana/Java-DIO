package edu.kauan.primeirasemana;
public class MyClass {
  
  public static void main (String [] args) {
    String firstName = "Kauan";
    String lastName = "Ramos Fontana";

    System.out.println(nomeCompleto(firstName, lastName));
    
  }

  public static String nomeCompleto (String firstName, String LastName) {
    return "Nome Completo: " + firstName.concat(" ").concat(LastName);
  }
}