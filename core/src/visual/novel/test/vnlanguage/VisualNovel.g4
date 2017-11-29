grammar VisualNovel;
//comando pra gerar os arquivos: java -jar antlr-4.7-complete.jar -package vnlanguage VisualNovel.g4
//java -jar C:\Users\DwarfMeDown\Documents\VisualNovelTest\core\libs\antlr-4.7-complete.jar -package visual.novel.test.vnlanguage -visitor VisualNovel.g4
/*
programa : cabecalho corpo 'FIM';

cabecalho : titulo personagens cenarios recursos; 

corpo : ;

titulo : 'TITULO:' CADEIA;

personagens : 'PERSONAGENS:' '.';

cenarios : 'CENARIOS:' '.';

recursos : 'RECURSOS:' recurso '.';

recurso: PERSONAGEM '=' CADEIA;

CADEIA : ''' ~('\r' | '\n')* ''';
PERSONAGEM : [A-Z][a-zA-Z_0-9]*;
WS: [ \n\t\r]+ -> skip;
*/

programa : cabecalho corpo 'FIM';

cabecalho : titulo personagens cenarios recursos; 

corpo : cena mais_cenas;

titulo : 'TITULO:' CADEIA;

personagens : 'PERSONAGENS:' PERSONAGEM mais_personagens '.';

cenarios : 'CENARIOS:' CENARIO mais_cenarios '.';

recursos : 'RECURSOS:' recurso mais_recursos '.';

cena : nome_cena narrativa;

nome_cena : '- Cena ' NUM ' -';

mais_cenas : cena mais_cenas
                    |
                    ;

mais_personagens : ',' PERSONAGEM mais_personagens
                               |
                               ;

mais_cenarios : ',' CENARIO mais_cenarios
                        |
                        ;

recurso : estado_personagem '=' CADEIA 
             | CENARIO '=' CADEIA
             | IDENT '(' tipo_som ')' '=' CADEIA 
             ;

mais_recursos : ',' recurso mais_recursos 
                        |
                        ;

narrativa : entrelinhas 
               | dialogo
               | escolha
               |
               ;

estado_personagem : PERSONAGEM '[' EMOCAO ']';

tipo_som : 'musica' | 'barulho';

entrelinhas : novo_cenario
                    | nova_entrada
                    | nova_saida
                    | nova_musica
                    | novo_som;

dialogo : CADEIA
| PERSONAGEM '-' CADEIA;

escolha : 'ESCOLHA:' CADEIA '- va para ' nome_cena mais_escolhas '.';

mais_escolhas : ',' CADEIA '- va para ' nome_cena mais_escolhas
                         |
                         ;

novo_cenario : '(' 'cenario' CENARIO ')';
nova_entrada : '(' 'entra' estado_personagem outro_estado_personagem ')';
nova_saida : '(' 'sai' PERSONAGEM outro_personagem ')';
nova_musica : '(' 'musica' IDENT ')';
novo_som : '(' 'som' IDENT ')';

outro_estado_personagem : 'e' estado_personagem outro_estado_personagem
                               |
                               ;

outro_personagem : 'e' PERSONAGEM outro_personagem
                               |
                               ;

CADEIA: '"' ~('\r' | '\n')* '"';
PERSONAGEM : [A-Z][a-zA-Z_0-9]*;
CENARIO : [a-z][a-zA-Z_0-9]*;
EMOCAO : [a-z_][a-z_]*;
IDENT : [a-zA-Z_][a-zA-Z_0-9]*;  
NUM : [0-9]+;
WS: [ \n\t\r]+ -> skip;
