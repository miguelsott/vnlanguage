// Generated from VisualNovel.g4 by ANTLR 4.7
package visual.novel.test.vnlanguage;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VisualNovelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VisualNovelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(VisualNovelParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecalho(VisualNovelParser.CabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(VisualNovelParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(VisualNovelParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#personagens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonagens(VisualNovelParser.PersonagensContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#cenarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenarios(VisualNovelParser.CenariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#recursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursos(VisualNovelParser.RecursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#recurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurso(VisualNovelParser.RecursoContext ctx);
}