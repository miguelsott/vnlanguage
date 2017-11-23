package Model;

import java.util.HashMap;
import java.util.Map;

public class Personagem {
    private String nome;
    private Map<String, String> map;
    
    public Personagem() {
        map = new HashMap<String, String>();
        nome = "";
    }
    
    public Personagem(String nome) {
        map = new HashMap<String, String>();
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void put(String chave, String valor) {
        map.put(chave, valor);
    }

    public String getNome() {
        return nome;
    }

    public Map getMap() {
        return map;
    }
}
