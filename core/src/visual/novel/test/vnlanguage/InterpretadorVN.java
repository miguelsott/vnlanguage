package visual.novel.test.vnlanguage;

import Model.Jogo;
import Model.Personagem;
import com.badlogic.gdx.Gdx;
import java.util.HashMap;
import java.util.Map;

public class InterpretadorVN extends VisualNovelBaseVisitor<Jogo>{
    
    Jogo jogo;
    Personagem personagem;
    
    public InterpretadorVN() {
        jogo = new Jogo();
    }

    @Override
    public Jogo visitPrograma(VisualNovelParser.ProgramaContext ctx) {
        visitCabecalho(ctx.cabecalho());
        visitCorpo(ctx.corpo());
        return jogo;
    }
    
    @Override
    public Jogo visitTitulo(VisualNovelParser.TituloContext ctx) {
        String titulo = ctx.CADEIA().getText();
        titulo = titulo.replace("\"", "");
        Gdx.graphics.setTitle(titulo);
        return super.visitTitulo(ctx);
    }

    @Override
    public Jogo visitRecurso(VisualNovelParser.RecursoContext ctx) {
        jogo.addPersonagens(new Personagem(ctx.PERSONAGEM().getText()));
        jogo.getPersonagens().get(0).getMap().put("x", ctx.CADEIA().getText());
        return super.visitRecurso(ctx);
    }

}
