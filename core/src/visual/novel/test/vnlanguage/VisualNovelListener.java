// Generated from VisualNovel.g4 by ANTLR 4.7
package visual.novel.test.vnlanguage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VisualNovelParser}.
 */
public interface VisualNovelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(VisualNovelParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(VisualNovelParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(VisualNovelParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(VisualNovelParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(VisualNovelParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(VisualNovelParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(VisualNovelParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(VisualNovelParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#personagens}.
	 * @param ctx the parse tree
	 */
	void enterPersonagens(VisualNovelParser.PersonagensContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#personagens}.
	 * @param ctx the parse tree
	 */
	void exitPersonagens(VisualNovelParser.PersonagensContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#cenarios}.
	 * @param ctx the parse tree
	 */
	void enterCenarios(VisualNovelParser.CenariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#cenarios}.
	 * @param ctx the parse tree
	 */
	void exitCenarios(VisualNovelParser.CenariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#recursos}.
	 * @param ctx the parse tree
	 */
	void enterRecursos(VisualNovelParser.RecursosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#recursos}.
	 * @param ctx the parse tree
	 */
	void exitRecursos(VisualNovelParser.RecursosContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#recurso}.
	 * @param ctx the parse tree
	 */
	void enterRecurso(VisualNovelParser.RecursoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#recurso}.
	 * @param ctx the parse tree
	 */
	void exitRecurso(VisualNovelParser.RecursoContext ctx);
}