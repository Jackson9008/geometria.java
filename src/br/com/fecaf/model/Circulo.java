package br.com.fecaf.model;

public class Circulo {
    public double raio;
    public double area;
    public double perimetro;
    public String nome;

    public void exibirInformacoes (){
        System.out.println("/---------------------------/");
        System.out.println("O nome é: " + nome);
        System.out.println("O raio é: " + raio);
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/---------------------------/");
    }
    public void calcularDiametro (){
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("/---------------------------/");
        System.out.println("A area do objeto " + nome + " é: " + area);
        System.out.println("/---------------------------/");
    }
    public void calcularArea (){
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("/---------------------------/");
        System.out.println("A area do objeto " + nome + " é: " + area);
        System.out.println("/---------------------------/");
    }
    public void calcularPerimetro (){
        perimetro = 2 * Math.PI * raio;
        System.out.println("/---------------------------/");
        System.out.println("O perimetro do objeto " + nome + " é: " + perimetro);
        System.out.println("/---------------------------/");
    }


}
