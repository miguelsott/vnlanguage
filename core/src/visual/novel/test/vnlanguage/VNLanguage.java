package visual.novel.test.vnlanguage;

import Model.Jogo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class VNLanguage {
    
    private final static String casoDeTeste = "C:/Users/Ruan/Documents/CC2/vnlanguage/core/src/visual/novel/test/vnlanguage/exemplos/semErro/casoSemErro.txt";
    
    public Jogo run() throws FileNotFoundException, IOException  {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(casoDeTeste));
        System.out.println(input.toString());
        VisualNovelLexer lexer = new VisualNovelLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VisualNovelParser parser = new VisualNovelParser(tokens);
        
        VisualNovelParser.ProgramaContext arvore = parser.programa();

        InterpretadorVN ivn = new InterpretadorVN();
        return ivn.visitPrograma(arvore);
    }   
}
