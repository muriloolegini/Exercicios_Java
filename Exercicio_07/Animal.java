package exercicio_07;

import javax.swing.JOptionPane;

public class Animal {
    String nome;
    int idade;
    float altura;
    String especie;

    public Animal(String nome, int idade, float altura, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.especie = especie;
    }

    public Animal() {
        nome = JOptionPane.showInputDialog("Digite o nome do animal:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do animal:"));
        especie = JOptionPane.showInputDialog("Digite a espécie do animal:");
    }
    
    public void ApresentarAnimal(){
        System.out.format("O nome do animal é %s \n", nome);
        System.out.format("A idade do animal é %d anos \n", idade);
        System.out.format("A altura do animal é %.2f \n", altura);
        System.out.format("A espécie do animal é %s \n", especie);
        System.out.println("----------------------------------");
    }
    
    public void FazerBarulho(){
        System.out.println("O animal fez barulho!");
    }
    
    public void Comer(){
        System.out.println("O cachorro está comendo!");
    }
    
    public void Correr(){
        System.out.println("O cachorro está correndo!");
    }
}