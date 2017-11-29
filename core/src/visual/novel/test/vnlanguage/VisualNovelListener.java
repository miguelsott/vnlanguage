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
	 * Enter a parse tree produced by {@link VisualNovelParser#cena}.
	 * @param ctx the parse tree
	 */
	void enterCena(VisualNovelParser.CenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#cena}.
	 * @param ctx the parse tree
	 */
	void exitCena(VisualNovelParser.CenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#nome_cena}.
	 * @param ctx the parse tree
	 */
	void enterNome_cena(VisualNovelParser.Nome_cenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#nome_cena}.
	 * @param ctx the parse tree
	 */
	void exitNome_cena(VisualNovelParser.Nome_cenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#mais_cenas}.
	 * @param ctx the parse tree
	 */
	void enterMais_cenas(VisualNovelParser.Mais_cenasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#mais_cenas}.
	 * @param ctx the parse tree
	 */
	void exitMais_cenas(VisualNovelParser.Mais_cenasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#mais_personagens}.
	 * @param ctx the parse tree
	 */
	void enterMais_personagens(VisualNovelParser.Mais_personagensContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#mais_personagens}.
	 * @param ctx the parse tree
	 */
	void exitMais_personagens(VisualNovelParser.Mais_personagensContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#mais_cenarios}.
	 * @param ctx the parse tree
	 */
	void enterMais_cenarios(VisualNovelParser.Mais_cenariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#mais_cenarios}.
	 * @param ctx the parse tree
	 */
	void exitMais_cenarios(VisualNovelParser.Mais_cenariosContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#mais_recursos}.
	 * @param ctx the parse tree
	 */
	void enterMais_recursos(VisualNovelParser.Mais_recursosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#mais_recursos}.
	 * @param ctx the parse tree
	 */
	void exitMais_recursos(VisualNovelParser.Mais_recursosContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#narrativa}.
	 * @param ctx the parse tree
	 */
	void enterNarrativa(VisualNovelParser.NarrativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#narrativa}.
	 * @param ctx the parse tree
	 */
	void exitNarrativa(VisualNovelParser.NarrativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#estado_personagem}.
	 * @param ctx the parse tree
	 */
	void enterEstado_personagem(VisualNovelParser.Estado_personagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#estado_personagem}.
	 * @param ctx the parse tree
	 */
	void exitEstado_personagem(VisualNovelParser.Estado_personagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#tipo_som}.
	 * @param ctx the parse tree
	 */
	void enterTipo_som(VisualNovelParser.Tipo_somContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#tipo_som}.
	 * @param ctx the parse tree
	 */
	void exitTipo_som(VisualNovelParser.Tipo_somContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#entrelinhas}.
	 * @param ctx the parse tree
	 */
	void enterEntrelinhas(VisualNovelParser.EntrelinhasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#entrelinhas}.
	 * @param ctx the parse tree
	 */
	void exitEntrelinhas(VisualNovelParser.EntrelinhasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#dialogo}.
	 * @param ctx the parse tree
	 */
	void enterDialogo(VisualNovelParser.DialogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#dialogo}.
	 * @param ctx the parse tree
	 */
	void exitDialogo(VisualNovelParser.DialogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#escolha}.
	 * @param ctx the parse tree
	 */
	void enterEscolha(VisualNovelParser.EscolhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#escolha}.
	 * @param ctx the parse tree
	 */
	void exitEscolha(VisualNovelParser.EscolhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#mais_escolhas}.
	 * @param ctx the parse tree
	 */
	void enterMais_escolhas(VisualNovelParser.Mais_escolhasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#mais_escolhas}.
	 * @param ctx the parse tree
	 */
	void exitMais_escolhas(VisualNovelParser.Mais_escolhasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#novo_cenario}.
	 * @param ctx the parse tree
	 */
	void enterNovo_cenario(VisualNovelParser.Novo_cenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#novo_cenario}.
	 * @param ctx the parse tree
	 */
	void exitNovo_cenario(VisualNovelParser.Novo_cenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#nova_entrada}.
	 * @param ctx the parse tree
	 */
	void enterNova_entrada(VisualNovelParser.Nova_entradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#nova_entrada}.
	 * @param ctx the parse tree
	 */
	void exitNova_entrada(VisualNovelParser.Nova_entradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#nova_saida}.
	 * @param ctx the parse tree
	 */
	void enterNova_saida(VisualNovelParser.Nova_saidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#nova_saida}.
	 * @param ctx the parse tree
	 */
	void exitNova_saida(VisualNovelParser.Nova_saidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#nova_musica}.
	 * @param ctx the parse tree
	 */
	void enterNova_musica(VisualNovelParser.Nova_musicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#nova_musica}.
	 * @param ctx the parse tree
	 */
	void exitNova_musica(VisualNovelParser.Nova_musicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#novo_som}.
	 * @param ctx the parse tree
	 */
	void enterNovo_som(VisualNovelParser.Novo_somContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#novo_som}.
	 * @param ctx the parse tree
	 */
	void exitNovo_som(VisualNovelParser.Novo_somContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#outro_estado_personagem}.
	 * @param ctx the parse tree
	 */
	void enterOutro_estado_personagem(VisualNovelParser.Outro_estado_personagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#outro_estado_personagem}.
	 * @param ctx the parse tree
	 */
	void exitOutro_estado_personagem(VisualNovelParser.Outro_estado_personagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualNovelParser#outro_personagem}.
	 * @param ctx the parse tree
	 */
	void enterOutro_personagem(VisualNovelParser.Outro_personagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualNovelParser#outro_personagem}.
	 * @param ctx the parse tree
	 */
	void exitOutro_personagem(VisualNovelParser.Outro_personagemContext ctx);
}