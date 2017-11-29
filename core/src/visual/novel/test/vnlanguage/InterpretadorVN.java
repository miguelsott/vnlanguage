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
        return jogo;
    }
    
    @Override
    public Jogo visitTitulo(VisualNovelParser.TituloContext ctx) {
        return super.visitTitulo(ctx);
    }

    @Override
    public Jogo visitRecurso(VisualNovelParser.RecursoContext ctx) {
        return super.visitRecurso(ctx);
    }

}
