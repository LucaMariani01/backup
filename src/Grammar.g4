grammar Grammar;

start: espressione COMMA listaCaratteri #list;

listaCaratteri: FINAl listaCaratteri1 #prodCaratteri
    | #prodEpsilonCaratteri;

listaCaratteri1: COMMA listaCaratteri #virgolaCaratteri
    | #virgolaEpsilonCaratteri ;

espressione: terminali espressioneUnione #espressi;

espressioneUnione: '+' terminali espressioneUnione #esprUnione
                    | #epsilonUnione;
kleene: KLEENE #esprKleene
    | #esprEpsilonKleene;

terminali: nuovaEsp esprConc #operatore;
nuovaEsp: '('espressione')' kleene #nuovaEsprParentesi
    | FINAl #carattere;
esprConc: nuovaEsp esprConc #concat
	| #concatEpsilon;

FINAl: [a-z]+('*')?
       | [A-Z]+('*')?
       | [0-9]+('*')?
       | 'epsilon';

KLEENE: '*';
COMMA: ',';
UNION: '+';
WS: [\t\r\n]+ -> skip;
