/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author Jefferson
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("O Nome Da Rosa", "Humberto Eco", 348, 45, p[0]);
        l[1] = new Livro("Vida póstuma de Bras Cubas", "Graciliano Ramos", 246, 45, p[0]);
        l[2] = new Livro("Drácula", "Vander Cróife", 523, 45, p[1]);
        
        System.out.println(l[0].detalhes());
    }
    
}
