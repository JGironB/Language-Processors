grammar TraductorSL;

//SINTACTICO
fuente: (titulo_programa)? (ctv)* main (subrutinas)* {System.out.println("Análisis léxico y sintáctico terminado.");};
titulo_programa: 'programa' TK_ID;

ctv: my_const |
     var |
     tipos;

my_const: 'const' (declarar_const)*;
var: 'var' (declarar_var)*;
tipos: 'tipos' (declarar_tipos)*;

main: 'inicio' (cuerpo_main)* 'fin';

declarar_const: TK_ID '=' expresion (separador)?;
separador: ';'
         ;
expresion: tk_general (cuerpo_operadores)?;
cuerpo_operadores: operador expresion;

operador: '+'
        | '-'
        | '*'
        | '/'
        | '%'
        | '^'
        | 'and'
        | 'or'
        | 'not'
        | '<'
        | '>'
        | '<='
        | '>='
        | '=='
        | '<>'
        | ','
        ;

tk_general: TK_CADENA                     #cadena
          | op=('+' | '-')? TK_NUMERO     #numero
          | 'leer' '(' (arg_input)? ')'   #llamado_funcion_input
          | TK_ID '(' (arg)? ')'          #llamado_funcion
          | op=('+' | '-')? lvalue        #mi_lvalue
          | TK_LOGICO                     #logico
          | '{' (arg)? '}'                #registro
          | '(' expresion ')'             #expresion_con_parentesis
          | 'not' tk_general              #escribe_not
          ;

lvalue: TK_ID (lvalue_prima)?
      ;

lvalue_prima: '[' arg_arreglo ']' (atributo)*  #para_arreglo
            | (atributo)*                      #para_atributo
            ;

arg_arreglo: expresion (arg_mult_arreglo)*
           ;

arg_mult_arreglo: ',' expresion
        ;

arg: expresion (arg_mult)*
   ;

arg_mult: ',' expresion
        ;

arg_input: expresion (arg_mult_input)*
   ;

arg_mult_input: ',' expresion
        ;

atributo: '.' TK_ID (lvalue_prima)?;

declarar_tipos: TK_ID (lista_dec_tipo)* ':' tipo_declaracion_tipo (separador)?;
lista_dec_tipo: ',' TK_ID;
lista: ',' TK_ID;

tipo_declaracion_tipo: 'vector' exp_vector                  #vector_tipo
                    |'matriz' exp_matriz                    #matriz_tipo
                    |'registro' exp_registro                #registro_tipo
                    |tipo_dato                              #tipo_dato_tipo
                    ;

exp_vector: '[' dim (lista_dim)* ']' (tipo_dato | 'registro' exp_registro);

dim: TK_NUMERO |
     '*';

lista_dim: ',' dim;

exp_matriz: '[' dim ',' dim (lista_dim)* ']' (tipo_dato | 'registro' exp_registro);
exp_registro: '{' (declarar_var_no_rescurive_to_translation)* '}';

tipo_dato: 'cadena' |
           'numerico' |
           'logico' |
           TK_ID;

declarar_var: TK_ID (lista)* ':' tipo_declaracion_var (separador)?;

tipo_declaracion_var: 'vector' exp_vector_var              #vector_var
                    | 'matriz' exp_matriz_var              #matriz_var
                    | 'registro' exp_registro_var          #registro_var
                    | tipo_dato                            #tipo_dato_var
                    ;


exp_vector_var: '[' dim_var (lista_dim_var)* ']' (tipo_dato | 'registro' exp_registro_var);
dim_var: TK_NUMERO |
         '*' |
         TK_ID;

lista_dim_var: ',' dim_var;
exp_matriz_var: '[' dim_var ',' dim_var (lista_dim_var)* ']' (tipo_dato | 'registro' exp_registro_var);
exp_registro_var: '{' (declarar_var_no_rescurive_to_translation)* '}';






declarar_var_no_rescurive_to_translation: TK_ID (lista_no_recursive_to_translation)* ':' tipo_declaracion_var_no_rescurive_to_translation (separador)?;
lista_no_recursive_to_translation: ',' TK_ID;

tipo_declaracion_var_no_rescurive_to_translation: 'vector' exp_vector_no_recursive_to_translation
                    | 'matriz' exp_matriz_no_recursive_to_translation
                    | 'registro' exp_registro_no_recursive_to_translation
                    | tipo_dato
                    ;

exp_vector_no_recursive_to_translation: '[' dim_var (lista_dim_var)* ']' (tipo_dato | 'registro' '{' (declarar_var_no_rescurive_to_translation)* '}');
exp_matriz_no_recursive_to_translation: '[' dim_var ',' dim_var (lista_dim_var)* ']' (tipo_dato | 'registro' '{' (declarar_var_no_rescurive_to_translation)* '}');
exp_registro_no_recursive_to_translation: '{' (declarar_var_no_rescurive_to_translation)* '}';






cuerpo_main: sentencia (separador)? |
             bucles |
             condicional |
             eval;

sentencia: (lvalue_igual)? expresion (separador)? |
            ';';
lvalue_igual:lvalue '=';
lvalue_igual_desde:lvalue '=';

bucles: mientras |
        desde |
        repetir;

mientras: 'mientras' '(' expresion_mientras ')' '{' (cuerpo_main)* '}';
expresion_mientras: tk_general (cuerpo_operadores)?;
repetir: 'repetir' (cuerpo_main)* 'hasta' '(' expresion_repetir ')';
expresion_repetir: tk_general (cuerpo_operadores)?;
desde: 'desde' asignaciones_desde 'hasta' expresion_desde '{' (cuerpo_main)* '}';
expresion_desde: expresion (paso)?;
asignaciones_desde: lvalue_igual_desde expresion;
asignaciones: lvalue_igual expresion;
paso: 'paso' expresion;
condicional: 'si' '(' expresion ')' cuerpo_condicional;
cuerpo_condicional:  '{' (cuerpo_main)* (sino_si)* (sino)? '}';
sino_si: 'sino' 'si' '(' expresion ')' cuerpo_sino_si;
cuerpo_sino_si: (cuerpo_main)*;
sino: 'sino' (cuerpo_main)*;
eval: 'eval' '{' caso '}';
caso: 'caso' '(' expresion ')' cuerpo_caso;
cuerpo_caso:  (cuerpo_main)* (caso_prima)?;
caso_prima: caso_segundo |
            sino;
caso_segundo: 'caso' '(' expresion ')' cuerpo_caso_segundo;
cuerpo_caso_segundo: (cuerpo_main)* (caso_prima)?;
subrutinas: 'subrutina' TK_ID '(' (lista_sub)? ')' retorno;
lista_sub: (ref)? TK_ID (lista)* ':' tipo_declaracion_var (lista_sub_separador)?;
ref: 'ref';
lista_sub_separador: (',' | ';') lista_sub;
retorno: 'retorna' (tipo_dato) (ctv)* 'inicio' (cuerpo_main)* retorna2 |
         (ctv)* main;
retorna2: 'retorna' expresion fin_final;
fin_final: 'fin';
//LEXICO
TK_ID: ([a-zA-Z\u00f1\u00d1] | '_') ('a'..'z' | 'A'..'Z'| '0'..'9' | '_' | '\u00f1' | '\u00d1' )*;
TK_CADENA: '"' .*? '"' |
           '\'' .*? '\'';

TK_NUMERO :   [0-9]+ '.' [0-9]* EXPONENT? |
              '.' [0-9]+ EXPONENT? |
              [0-9]+ EXPONENT?;

EXPONENT : ('e'|'E') ('+'|'-') ('0'..'9')+ ;

TK_LOGICO: 'TRUE' | 'FALSE' | 'SI' | 'NO';
COMMULTI : '/*' .*? '*/' -> skip;
COMM: '//' ~[\r\n]* -> skip;
ESP: [ \t\r\n]+ -> skip;

//ALIAS

SUM: '+';
RES: '-';