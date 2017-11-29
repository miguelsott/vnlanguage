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
	 * Visit a parse tree produced by {@link VisualNovelParser#cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCena(VisualNovelParser.CenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#nome_cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_cena(VisualNovelParser.Nome_cenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#mais_cenas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_cenas(VisualNovelParser.Mais_cenasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#mais_personagens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_personagens(VisualNovelParser.Mais_personagensContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#mais_cenarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_cenarios(VisualNovelParser.Mais_cenariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#recurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurso(VisualNovelParser.RecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#mais_recursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_recursos(VisualNovelParser.Mais_recursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#narrativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNarrativa(VisualNovelParser.NarrativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#estado_personagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstado_personagem(VisualNovelParser.Estado_personagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#tipo_som}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_som(VisualNovelParser.Tipo_somContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#entrelinhas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrelinhas(VisualNovelParser.EntrelinhasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#dialogo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogo(VisualNovelParser.DialogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#escolha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolha(VisualNovelParser.EscolhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#mais_escolhas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_escolhas(VisualNovelParser.Mais_escolhasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#novo_cenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovo_cenario(VisualNovelParser.Novo_cenarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#nova_entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNova_entrada(VisualNovelParser.Nova_entradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#nova_saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNova_saida(VisualNovelParser.Nova_saidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#nova_musica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNova_musica(VisualNovelParser.Nova_musicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#novo_som}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovo_som(VisualNovelParser.Novo_somContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#outro_estado_personagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutro_estado_personagem(VisualNovelParser.Outro_estado_personagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualNovelParser#outro_personagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutro_personagem(VisualNovelParser.Outro_personagemContext ctx);
}