grammar VisualNovel;
//comando pra gerar os arquivos: java -jar antlr-4.7-complete.jar -package vnlanguage VisualNovel.g4
//java -jar C:\Users\DwarfMeDown\Documents\VisualNovelTest\core\libs\antlr-4.7-complete.jar -package visual.novel.test.vnlanguage -visitor VisualNovel.g4

programa : cabecalho corpo 'FIM';

cabecalho : titulo personagens cenarios recursos; 

corpo : ;

titulo : 'TITULO:' CADEIA;

personagens : 'PERSONAGENS:' '.';

cenarios : 'CENARIOS:' '.';

recursos : 'RECURSOS:' recurso '.';

recurso: PERSONAGEM '=' CADEIA;

CADEIA : '"' ~('\r' | '\n')* '"';
PERSONAGEM : [A-Z][a-zA-Z_0-9]*;
WS: [ \n\t\r]+ -> skip;