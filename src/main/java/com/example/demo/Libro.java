package com.example.demo;

public class Libro {
    String titulo;
    String autor;
    String isbn;

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
