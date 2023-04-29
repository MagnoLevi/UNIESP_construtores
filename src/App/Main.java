package App;

import Classes.ContaBancaria;
import Classes.Livro;
import Classes.Produto;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Rock & Roll is art", "Jack Black", 2023);
        ContaBancaria c1 = new ContaBancaria(2500.0, "Jack Black");
        Produto p1 = new Produto(1, "Guitarra do Jack Black", 900000.0, 1);

        System.out.println(l1);
        System.out.println(c1);
        System.out.println(p1);
    }
}