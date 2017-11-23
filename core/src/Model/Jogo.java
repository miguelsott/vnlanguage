package Model;

import java.util.ArrayList;

public class Jogo {
    private String titulo;
    private ArrayList<Personagem> personagens;
    private ArrayList<Cenario> cenarios;
    private ArrayList<Som> sons;
    private ArrayList<Cena> cenas;

    public Jogo() {
        personagens = new ArrayList<Personagem>();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void addPersonagens(Personagem personagem) {
        personagens.add(personagem);
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public ArrayList<Cenario> getCenarios() {
        return cenarios;
    }

    public ArrayList<Som> getSons() {
        return sons;
    }

    public ArrayList<Cena> getCenas() {
        return cenas;
    }
    
}
