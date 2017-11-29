/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual.novel.test.vnlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ruan
 */
public class SemanticoVN extends VisualNovelBaseVisitor {
    private Map<String, List<String>> TabelaDeSimbolos = new HashMap<String, List<String>>();
    
    /*
        Faz uma busca pela Tabela de Símbolos que é um Map
        Retorna true se o valor está contido na lista ligada à chave, caso
        contrário ou caso não haja uma entrada com a chave passada, retorna false
    */
    private boolean hasValue (String key, String value) {
        if(TabelaDeSimbolos.containsKey(key))
            return TabelaDeSimbolos.get(key).contains(value);
        return false;
    }
    
    @Override
    public Object visitPersonagens(VisualNovelParser.PersonagensContext ctx) {
        String characterName = ctx.PERSONAGEM().getText();
        
        if(!TabelaDeSimbolos.containsKey("personagem")) {
            TabelaDeSimbolos.put("personagem", new ArrayList<String>());
        }

        TabelaDeSimbolos.get("personagem").add(characterName);

        if(ctx.mais_personagens() != null) {
            VisualNovelParser.Mais_personagensContext inCtx = ctx.mais_personagens();
            while(inCtx != null) {
                if(!hasValue("personagem", characterName)) {
                    TabelaDeSimbolos.get("personagem").add(inCtx.PERSONAGEM().getText());
                } else {
                    // erro: nome de personagem já declarado
                }
                inCtx = inCtx.mais_personagens();
            }
        }
        
        return super.visitPersonagens(ctx); 
    }

    @Override
    public Object visitCenarios(VisualNovelParser.CenariosContext ctx) {
        String scenarioName = ctx.CENARIO().getText();
        
        if(!TabelaDeSimbolos.containsKey("cenario")) {
            TabelaDeSimbolos.put("cenario", new ArrayList<String>());
        }
        
        TabelaDeSimbolos.get("cenario").add(scenarioName);

        if(ctx.mais_cenarios()!= null) {
            VisualNovelParser.Mais_cenariosContext inCtx = ctx.mais_cenarios();
            while(inCtx != null) {
                if(!hasValue("cenario", scenarioName)) {
                    TabelaDeSimbolos.get("cenario").add(inCtx.CENARIO().getText());
                } else {
                    // erro: cenário já declarado 
                }
                inCtx = inCtx.mais_cenarios();
            }
        }
       
        return super.visitCenarios(ctx); 
    }
    
    @Override
    public Object visitRecurso(VisualNovelParser.RecursoContext ctx) {
        if(!TabelaDeSimbolos.containsKey("recurso")) {
            TabelaDeSimbolos.put("recurso", new ArrayList<String>());
        }
        // Se o recurso for o estado de um personagem existente
        if(ctx.estado_personagem()!= null) {
            if(hasValue("personagem", ctx.estado_personagem().PERSONAGEM().getText())) {
                if(!hasValue("recurso", ctx.estado_personagem().getText())) {
                    TabelaDeSimbolos.get("recurso").add(ctx.estado_personagem().getText());
                } else {
                    // erro: estado de personagem já declarado
                }
            } else {
                // erro: personagem não declarado
            }
        // Se o recurso for um tipo de áudio
        } else if(ctx.tipo_som() != null) {
            // Caso seja uma música
            if(ctx.tipo_som().getText().equals("musica")) {
                if(!TabelaDeSimbolos.containsKey("musica")) {
                     TabelaDeSimbolos.put("musica", new ArrayList<String>());
                }
                if(!hasValue("recurso", ctx.getText())) {
                    TabelaDeSimbolos.get("recurso").add(ctx.getText());
                    TabelaDeSimbolos.get("musica").add(ctx.IDENT().getText());
                } else {
                    // erro: musica já declarada
                }
            // Caso seja um som
            } else {
                if(!TabelaDeSimbolos.containsKey("som")) {
                     TabelaDeSimbolos.put("som", new ArrayList<String>());
                }
                if(!hasValue("recurso", ctx.IDENT().getText())) {
                    TabelaDeSimbolos.get("recurso").add(ctx.getText());
                    TabelaDeSimbolos.get("som").add(ctx.IDENT().getText());
                } else {
                    // erro: som já declarado
                }
            }
        // Caso o recurso seja um cenário
        } else {
            if(!hasValue("cenario", ctx.CENARIO().getText())) {
                // erro: cenario não declarado
            }
        }
        return super.visitRecurso(ctx); 
    }

    @Override
    public Object visitCena(VisualNovelParser.CenaContext ctx) {
        if(!TabelaDeSimbolos.containsKey("cena")) {
            TabelaDeSimbolos.put("cena", new ArrayList<String>());
        }
        if(!hasValue("cena", ctx.nome_cena().getText())) {
            TabelaDeSimbolos.get("cena").add(ctx.nome_cena().getText());
        } else {
            // erro: cena já existe
        }
        return super.visitCena(ctx);
    }

    @Override
    public Object visitNovo_cenario(VisualNovelParser.Novo_cenarioContext ctx) {
        if(!hasValue("cenario", ctx.CENARIO().getText())) {
            // erro: cenário não declarado
        }
        return super.visitNovo_cenario(ctx); 
    }

    @Override
    public Object visitNova_entrada(VisualNovelParser.Nova_entradaContext ctx) {
        // Caso o personagem não exista
        if(!hasValue("personagem", ctx.estado_personagem().PERSONAGEM().getText())) {
            // erro: personagem não declarado
        // Caso o recurso do personagem não exista
        } else if(!hasValue("recurso", ctx.estado_personagem().getText())) {
            // erro: recurso de estado de personagem não carregado
        }
        if(ctx.outro_estado_personagem() != null) {
            VisualNovelParser.Outro_estado_personagemContext inCtx = ctx.outro_estado_personagem();
            while(inCtx != null) {
                // Caso o personagem não exista
                if(!hasValue("personagem", inCtx.estado_personagem().PERSONAGEM().getText())) {
                    // erro: personagem não declarado
                // Caso o recurso do personagem não exista
                } else if(!hasValue("recurso", inCtx.estado_personagem().getText())) {
                    // erro: recurso de estado de personagem não carregado
                }
                inCtx = inCtx.outro_estado_personagem();
            }
        }
        return super.visitNova_entrada(ctx); 
    }

    @Override
    public Object visitNova_saida(VisualNovelParser.Nova_saidaContext ctx) {
        // Caso o personagem não exista
        if(!hasValue("personagem", ctx.PERSONAGEM().getText())) {
            // erro: personagem não declarado
        // Caso o recurso do personagem não exista
        }
        
        if(ctx.outro_personagem() != null) {
            VisualNovelParser.Outro_personagemContext inCtx = ctx.outro_personagem();
            while(inCtx != null) {
                // Caso o personagem não exista
                if(!hasValue("personagem", inCtx.PERSONAGEM().getText())) {
                    // erro: personagem não declarado
                // Caso o recurso do personagem não exista
                }
                inCtx = inCtx.outro_personagem();
            }
        }
        return super.visitNova_saida(ctx); 
    }

    @Override
    public Object visitNova_musica(VisualNovelParser.Nova_musicaContext ctx) {
        if(!hasValue("musica", ctx.IDENT().getText())) {
            // erro: musica não carregada
        }
        return super.visitNova_musica(ctx); 
    }

    @Override
    public Object visitNovo_som(VisualNovelParser.Novo_somContext ctx) {
        if(!hasValue("som", ctx.IDENT().getText())) {
            // erro: som não carregado
        }
        return super.visitNovo_som(ctx); 
    }

    @Override
    public Object visitDialogo(VisualNovelParser.DialogoContext ctx) {
        String charName = ctx.PERSONAGEM().getText();
        if(!charName.isEmpty()) {
            if(!hasValue("personagem", charName)) {
                // erro: personagem não declarado
            }
        }
        return super.visitDialogo(ctx); 
    }

    @Override
    public Object visitEscolha(VisualNovelParser.EscolhaContext ctx) {
        if(!hasValue("cena", ctx.nome_cena().getText())) {
            // erro: cena não criada
        }
        if(ctx.mais_escolhas() != null) {
            VisualNovelParser.Mais_escolhasContext inCtx = ctx.mais_escolhas();
            while(inCtx != null) {
                if(!hasValue("cena", inCtx.nome_cena().getText())) {
                    // erro: cena não criada
                }
                inCtx = inCtx.mais_escolhas();
            }
        }
        return super.visitEscolha(ctx); 
    }
    
}
