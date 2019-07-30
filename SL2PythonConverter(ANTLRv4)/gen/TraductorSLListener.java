// Generated from C:/Users/juamp/IdeaProjects/TraductorSL/grammar\TraductorSL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TraductorSLParser}.
 */
public interface TraductorSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#fuente}.
	 * @param ctx the parse tree
	 */
	void enterFuente(TraductorSLParser.FuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#fuente}.
	 * @param ctx the parse tree
	 */
	void exitFuente(TraductorSLParser.FuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#titulo_programa}.
	 * @param ctx the parse tree
	 */
	void enterTitulo_programa(TraductorSLParser.Titulo_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#titulo_programa}.
	 * @param ctx the parse tree
	 */
	void exitTitulo_programa(TraductorSLParser.Titulo_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#ctv}.
	 * @param ctx the parse tree
	 */
	void enterCtv(TraductorSLParser.CtvContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#ctv}.
	 * @param ctx the parse tree
	 */
	void exitCtv(TraductorSLParser.CtvContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#my_const}.
	 * @param ctx the parse tree
	 */
	void enterMy_const(TraductorSLParser.My_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#my_const}.
	 * @param ctx the parse tree
	 */
	void exitMy_const(TraductorSLParser.My_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(TraductorSLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(TraductorSLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(TraductorSLParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(TraductorSLParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(TraductorSLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(TraductorSLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#declarar_const}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_const(TraductorSLParser.Declarar_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#declarar_const}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_const(TraductorSLParser.Declarar_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#separador}.
	 * @param ctx the parse tree
	 */
	void enterSeparador(TraductorSLParser.SeparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#separador}.
	 * @param ctx the parse tree
	 */
	void exitSeparador(TraductorSLParser.SeparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TraductorSLParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TraductorSLParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#cuerpo_operadores}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_operadores(TraductorSLParser.Cuerpo_operadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#cuerpo_operadores}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_operadores(TraductorSLParser.Cuerpo_operadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(TraductorSLParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(TraductorSLParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cadena}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterCadena(TraductorSLParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cadena}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitCadena(TraductorSLParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numero}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterNumero(TraductorSLParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitNumero(TraductorSLParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamado_funcion_input}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterLlamado_funcion_input(TraductorSLParser.Llamado_funcion_inputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamado_funcion_input}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitLlamado_funcion_input(TraductorSLParser.Llamado_funcion_inputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamado_funcion}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterLlamado_funcion(TraductorSLParser.Llamado_funcionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamado_funcion}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitLlamado_funcion(TraductorSLParser.Llamado_funcionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mi_lvalue}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterMi_lvalue(TraductorSLParser.Mi_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mi_lvalue}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitMi_lvalue(TraductorSLParser.Mi_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logico}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterLogico(TraductorSLParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logico}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitLogico(TraductorSLParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code registro}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(TraductorSLParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code registro}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(TraductorSLParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresion_con_parentesis}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_con_parentesis(TraductorSLParser.Expresion_con_parentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion_con_parentesis}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_con_parentesis(TraductorSLParser.Expresion_con_parentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escribe_not}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void enterEscribe_not(TraductorSLParser.Escribe_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escribe_not}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 */
	void exitEscribe_not(TraductorSLParser.Escribe_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(TraductorSLParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(TraductorSLParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code para_arreglo}
	 * labeled alternative in {@link TraductorSLParser#lvalue_prima}.
	 * @param ctx the parse tree
	 */
	void enterPara_arreglo(TraductorSLParser.Para_arregloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code para_arreglo}
	 * labeled alternative in {@link TraductorSLParser#lvalue_prima}.
	 * @param ctx the parse tree
	 */
	void exitPara_arreglo(TraductorSLParser.Para_arregloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code para_atributo}
	 * labeled alternative in {@link TraductorSLParser#lvalue_prima}.
	 * @param ctx the parse tree
	 */
	void enterPara_atributo(TraductorSLParser.Para_atributoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code para_atributo}
	 * labeled alternative in {@link TraductorSLParser#lvalue_prima}.
	 * @param ctx the parse tree
	 */
	void exitPara_atributo(TraductorSLParser.Para_atributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#arg_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArg_arreglo(TraductorSLParser.Arg_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#arg_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArg_arreglo(TraductorSLParser.Arg_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#arg_mult_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArg_mult_arreglo(TraductorSLParser.Arg_mult_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#arg_mult_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArg_mult_arreglo(TraductorSLParser.Arg_mult_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(TraductorSLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(TraductorSLParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#arg_mult}.
	 * @param ctx the parse tree
	 */
	void enterArg_mult(TraductorSLParser.Arg_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#arg_mult}.
	 * @param ctx the parse tree
	 */
	void exitArg_mult(TraductorSLParser.Arg_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#arg_input}.
	 * @param ctx the parse tree
	 */
	void enterArg_input(TraductorSLParser.Arg_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#arg_input}.
	 * @param ctx the parse tree
	 */
	void exitArg_input(TraductorSLParser.Arg_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#arg_mult_input}.
	 * @param ctx the parse tree
	 */
	void enterArg_mult_input(TraductorSLParser.Arg_mult_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#arg_mult_input}.
	 * @param ctx the parse tree
	 */
	void exitArg_mult_input(TraductorSLParser.Arg_mult_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(TraductorSLParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(TraductorSLParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#declarar_tipos}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_tipos(TraductorSLParser.Declarar_tiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#declarar_tipos}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_tipos(TraductorSLParser.Declarar_tiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lista_dec_tipo}.
	 * @param ctx the parse tree
	 */
	void enterLista_dec_tipo(TraductorSLParser.Lista_dec_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lista_dec_tipo}.
	 * @param ctx the parse tree
	 */
	void exitLista_dec_tipo(TraductorSLParser.Lista_dec_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(TraductorSLParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(TraductorSLParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vector_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void enterVector_tipo(TraductorSLParser.Vector_tipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vector_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void exitVector_tipo(TraductorSLParser.Vector_tipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matriz_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void enterMatriz_tipo(TraductorSLParser.Matriz_tipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matriz_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void exitMatriz_tipo(TraductorSLParser.Matriz_tipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code registro_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void enterRegistro_tipo(TraductorSLParser.Registro_tipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code registro_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void exitRegistro_tipo(TraductorSLParser.Registro_tipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_dato_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato_tipo(TraductorSLParser.Tipo_dato_tipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_dato_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato_tipo(TraductorSLParser.Tipo_dato_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_vector}.
	 * @param ctx the parse tree
	 */
	void enterExp_vector(TraductorSLParser.Exp_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_vector}.
	 * @param ctx the parse tree
	 */
	void exitExp_vector(TraductorSLParser.Exp_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(TraductorSLParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(TraductorSLParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lista_dim}.
	 * @param ctx the parse tree
	 */
	void enterLista_dim(TraductorSLParser.Lista_dimContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lista_dim}.
	 * @param ctx the parse tree
	 */
	void exitLista_dim(TraductorSLParser.Lista_dimContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_matriz}.
	 * @param ctx the parse tree
	 */
	void enterExp_matriz(TraductorSLParser.Exp_matrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_matriz}.
	 * @param ctx the parse tree
	 */
	void exitExp_matriz(TraductorSLParser.Exp_matrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_registro}.
	 * @param ctx the parse tree
	 */
	void enterExp_registro(TraductorSLParser.Exp_registroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_registro}.
	 * @param ctx the parse tree
	 */
	void exitExp_registro(TraductorSLParser.Exp_registroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(TraductorSLParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(TraductorSLParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#declarar_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_var(TraductorSLParser.Declarar_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#declarar_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_var(TraductorSLParser.Declarar_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vector_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void enterVector_var(TraductorSLParser.Vector_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vector_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void exitVector_var(TraductorSLParser.Vector_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matriz_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void enterMatriz_var(TraductorSLParser.Matriz_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matriz_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void exitMatriz_var(TraductorSLParser.Matriz_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code registro_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void enterRegistro_var(TraductorSLParser.Registro_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code registro_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void exitRegistro_var(TraductorSLParser.Registro_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipo_dato_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato_var(TraductorSLParser.Tipo_dato_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo_dato_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato_var(TraductorSLParser.Tipo_dato_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_vector_var}.
	 * @param ctx the parse tree
	 */
	void enterExp_vector_var(TraductorSLParser.Exp_vector_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_vector_var}.
	 * @param ctx the parse tree
	 */
	void exitExp_vector_var(TraductorSLParser.Exp_vector_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#dim_var}.
	 * @param ctx the parse tree
	 */
	void enterDim_var(TraductorSLParser.Dim_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#dim_var}.
	 * @param ctx the parse tree
	 */
	void exitDim_var(TraductorSLParser.Dim_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lista_dim_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_dim_var(TraductorSLParser.Lista_dim_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lista_dim_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_dim_var(TraductorSLParser.Lista_dim_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_matriz_var}.
	 * @param ctx the parse tree
	 */
	void enterExp_matriz_var(TraductorSLParser.Exp_matriz_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_matriz_var}.
	 * @param ctx the parse tree
	 */
	void exitExp_matriz_var(TraductorSLParser.Exp_matriz_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_registro_var}.
	 * @param ctx the parse tree
	 */
	void enterExp_registro_var(TraductorSLParser.Exp_registro_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_registro_var}.
	 * @param ctx the parse tree
	 */
	void exitExp_registro_var(TraductorSLParser.Exp_registro_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#declarar_var_no_rescurive_to_translation}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_var_no_rescurive_to_translation(TraductorSLParser.Declarar_var_no_rescurive_to_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#declarar_var_no_rescurive_to_translation}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_var_no_rescurive_to_translation(TraductorSLParser.Declarar_var_no_rescurive_to_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lista_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void enterLista_no_recursive_to_translation(TraductorSLParser.Lista_no_recursive_to_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lista_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void exitLista_no_recursive_to_translation(TraductorSLParser.Lista_no_recursive_to_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#tipo_declaracion_var_no_rescurive_to_translation}.
	 * @param ctx the parse tree
	 */
	void enterTipo_declaracion_var_no_rescurive_to_translation(TraductorSLParser.Tipo_declaracion_var_no_rescurive_to_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#tipo_declaracion_var_no_rescurive_to_translation}.
	 * @param ctx the parse tree
	 */
	void exitTipo_declaracion_var_no_rescurive_to_translation(TraductorSLParser.Tipo_declaracion_var_no_rescurive_to_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_vector_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void enterExp_vector_no_recursive_to_translation(TraductorSLParser.Exp_vector_no_recursive_to_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_vector_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void exitExp_vector_no_recursive_to_translation(TraductorSLParser.Exp_vector_no_recursive_to_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_matriz_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void enterExp_matriz_no_recursive_to_translation(TraductorSLParser.Exp_matriz_no_recursive_to_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_matriz_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void exitExp_matriz_no_recursive_to_translation(TraductorSLParser.Exp_matriz_no_recursive_to_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#exp_registro_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void enterExp_registro_no_recursive_to_translation(TraductorSLParser.Exp_registro_no_recursive_to_translationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#exp_registro_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 */
	void exitExp_registro_no_recursive_to_translation(TraductorSLParser.Exp_registro_no_recursive_to_translationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#cuerpo_main}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_main(TraductorSLParser.Cuerpo_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#cuerpo_main}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_main(TraductorSLParser.Cuerpo_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(TraductorSLParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(TraductorSLParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lvalue_igual}.
	 * @param ctx the parse tree
	 */
	void enterLvalue_igual(TraductorSLParser.Lvalue_igualContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lvalue_igual}.
	 * @param ctx the parse tree
	 */
	void exitLvalue_igual(TraductorSLParser.Lvalue_igualContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lvalue_igual_desde}.
	 * @param ctx the parse tree
	 */
	void enterLvalue_igual_desde(TraductorSLParser.Lvalue_igual_desdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lvalue_igual_desde}.
	 * @param ctx the parse tree
	 */
	void exitLvalue_igual_desde(TraductorSLParser.Lvalue_igual_desdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#bucles}.
	 * @param ctx the parse tree
	 */
	void enterBucles(TraductorSLParser.BuclesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#bucles}.
	 * @param ctx the parse tree
	 */
	void exitBucles(TraductorSLParser.BuclesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(TraductorSLParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(TraductorSLParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#expresion_mientras}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_mientras(TraductorSLParser.Expresion_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#expresion_mientras}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_mientras(TraductorSLParser.Expresion_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(TraductorSLParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(TraductorSLParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#expresion_repetir}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_repetir(TraductorSLParser.Expresion_repetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#expresion_repetir}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_repetir(TraductorSLParser.Expresion_repetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#desde}.
	 * @param ctx the parse tree
	 */
	void enterDesde(TraductorSLParser.DesdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#desde}.
	 * @param ctx the parse tree
	 */
	void exitDesde(TraductorSLParser.DesdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#expresion_desde}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_desde(TraductorSLParser.Expresion_desdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#expresion_desde}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_desde(TraductorSLParser.Expresion_desdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#asignaciones_desde}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones_desde(TraductorSLParser.Asignaciones_desdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#asignaciones_desde}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones_desde(TraductorSLParser.Asignaciones_desdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(TraductorSLParser.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(TraductorSLParser.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(TraductorSLParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(TraductorSLParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(TraductorSLParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(TraductorSLParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#cuerpo_condicional}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_condicional(TraductorSLParser.Cuerpo_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#cuerpo_condicional}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_condicional(TraductorSLParser.Cuerpo_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void enterSino_si(TraductorSLParser.Sino_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void exitSino_si(TraductorSLParser.Sino_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#cuerpo_sino_si}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_sino_si(TraductorSLParser.Cuerpo_sino_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#cuerpo_sino_si}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_sino_si(TraductorSLParser.Cuerpo_sino_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(TraductorSLParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(TraductorSLParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(TraductorSLParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(TraductorSLParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(TraductorSLParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(TraductorSLParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#cuerpo_caso}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_caso(TraductorSLParser.Cuerpo_casoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#cuerpo_caso}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_caso(TraductorSLParser.Cuerpo_casoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#caso_prima}.
	 * @param ctx the parse tree
	 */
	void enterCaso_prima(TraductorSLParser.Caso_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#caso_prima}.
	 * @param ctx the parse tree
	 */
	void exitCaso_prima(TraductorSLParser.Caso_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#caso_segundo}.
	 * @param ctx the parse tree
	 */
	void enterCaso_segundo(TraductorSLParser.Caso_segundoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#caso_segundo}.
	 * @param ctx the parse tree
	 */
	void exitCaso_segundo(TraductorSLParser.Caso_segundoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#cuerpo_caso_segundo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_caso_segundo(TraductorSLParser.Cuerpo_caso_segundoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#cuerpo_caso_segundo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_caso_segundo(TraductorSLParser.Cuerpo_caso_segundoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#subrutinas}.
	 * @param ctx the parse tree
	 */
	void enterSubrutinas(TraductorSLParser.SubrutinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#subrutinas}.
	 * @param ctx the parse tree
	 */
	void exitSubrutinas(TraductorSLParser.SubrutinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lista_sub}.
	 * @param ctx the parse tree
	 */
	void enterLista_sub(TraductorSLParser.Lista_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lista_sub}.
	 * @param ctx the parse tree
	 */
	void exitLista_sub(TraductorSLParser.Lista_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(TraductorSLParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(TraductorSLParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#lista_sub_separador}.
	 * @param ctx the parse tree
	 */
	void enterLista_sub_separador(TraductorSLParser.Lista_sub_separadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#lista_sub_separador}.
	 * @param ctx the parse tree
	 */
	void exitLista_sub_separador(TraductorSLParser.Lista_sub_separadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(TraductorSLParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(TraductorSLParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#retorna2}.
	 * @param ctx the parse tree
	 */
	void enterRetorna2(TraductorSLParser.Retorna2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#retorna2}.
	 * @param ctx the parse tree
	 */
	void exitRetorna2(TraductorSLParser.Retorna2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TraductorSLParser#fin_final}.
	 * @param ctx the parse tree
	 */
	void enterFin_final(TraductorSLParser.Fin_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraductorSLParser#fin_final}.
	 * @param ctx the parse tree
	 */
	void exitFin_final(TraductorSLParser.Fin_finalContext ctx);
}