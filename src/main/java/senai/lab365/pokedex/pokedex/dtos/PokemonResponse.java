package senai.lab365.pokedex.pokedex.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import senai.lab365.pokedex.pokedex.enums.TipoEnum;

public class PokemonResponse {

    private int numero;
    private String nome;
    private String descricao;
    private String imagemUrl;
    private TipoEnum tipo;
    private String categoria;
    private String habitat;
    private Double altura;
    private Double peso;
    private boolean capturado;

    @NotNull
    public int getNumero() {
        return numero;
    }

    public void setNumero(@NotNull int numero) {
        this.numero = numero;
    }

    public @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotBlank String nome) {
        this.nome = nome;
    }

    public @NotBlank String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotBlank String descricao) {
        this.descricao = descricao;
    }

    public @NotBlank String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(@NotBlank String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public @NotNull TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(@NotNull TipoEnum tipo) {
        this.tipo = tipo;
    }

    public @NotBlank String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotBlank String categoria) {
        this.categoria = categoria;
    }

    public @NotBlank String getHabitat() {
        return habitat;
    }

    public void setHabitat(@NotBlank String habitat) {
        this.habitat = habitat;
    }

    public @NotNull Double getAltura() {
        return altura;
    }

    public void setAltura(@NotNull Double altura) {
        this.altura = altura;
    }

    public @NotNull Double getPeso() {
        return peso;
    }

    public void setPeso(@NotNull Double peso) {
        this.peso = peso;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
}
