grammar grammatica;

start: generatore start1 #list;

start1: (',' generatore)* #accept;
generatore:
    '(' expr ')' stella gen1? #nuovaEspressioneParantesi
    | expr stella gen1? #nuovaEspressione
;

gen1: generatore#rigenera|expr3#somma;

stella: '*' #stellaSi | #stellaNO;

expr: FINAl expr1? #conct;

expr1: FINAl expr1?  #chiudo | expr3 #sommaParentesi;

expr3: '+' possibilita#or;

possibilita: generatore #rigenero;

FINAl: [a-zA-Z0-9] | 'epsilon';

WS: [\t\r\n]+ -> skip;
