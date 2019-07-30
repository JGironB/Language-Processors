// Generated from C:/Users/juamp/IdeaProjects/TraductorSL/grammar\TraductorSL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraductorSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraductorSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#fuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuente(TraductorSLParser.FuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#titulo_programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo_programa(TraductorSLParser.Titulo_programaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#ctv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtv(TraductorSLParser.CtvContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#my_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMy_const(TraductorSLParser.My_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(TraductorSLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(TraductorSLParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(TraductorSLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#declarar_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_const(TraductorSLParser.Declarar_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#separador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparador(TraductorSLParser.SeparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(TraductorSLParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#cuerpo_operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_operadores(TraductorSLParser.Cuerpo_operadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(TraductorSLParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cadena}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(TraductorSLParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(TraductorSLParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamado_funcion_input}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamado_funcion_input(TraductorSLParser.Llamado_funcion_inputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamado_funcion}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamado_funcion(TraductorSLParser.Llamado_funcionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mi_lvalue}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMi_lvalue(TraductorSLParser.Mi_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logico}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(TraductorSLParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code registro}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(TraductorSLParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresion_con_parentesis}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_con_parentesis(TraductorSLParser.Expresion_con_parentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escribe_not}
	 * labeled alternative in {@link TraductorSLParser#tk_general}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribe_not(TraductorSLParser.Escribe_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(TraductorSLParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code para_arreglo}
	 * labeled alternative in {@link TraductorSLParser#lvalue_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_arreglo(TraductorSLParser.Para_arregloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code para_atributo}
	 * labeled alternative in {@link TraductorSLParser#lvalue_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_atributo(TraductorSLParser.Para_atributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#arg_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_arreglo(TraductorSLParser.Arg_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#arg_mult_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_mult_arreglo(TraductorSLParser.Arg_mult_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(TraductorSLParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#arg_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_mult(TraductorSLParser.Arg_multContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#arg_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_input(TraductorSLParser.Arg_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#arg_mult_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_mult_input(TraductorSLParser.Arg_mult_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(TraductorSLParser.AtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#declarar_tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_tipos(TraductorSLParser.Declarar_tiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lista_dec_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_dec_tipo(TraductorSLParser.Lista_dec_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(TraductorSLParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vector_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_tipo(TraductorSLParser.Vector_tipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matriz_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz_tipo(TraductorSLParser.Matriz_tipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code registro_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro_tipo(TraductorSLParser.Registro_tipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_dato_tipo}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato_tipo(TraductorSLParser.Tipo_dato_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_vector(TraductorSLParser.Exp_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(TraductorSLParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lista_dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_dim(TraductorSLParser.Lista_dimContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_matriz(TraductorSLParser.Exp_matrizContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_registro(TraductorSLParser.Exp_registroContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(TraductorSLParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#declarar_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_var(TraductorSLParser.Declarar_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vector_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_var(TraductorSLParser.Vector_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matriz_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz_var(TraductorSLParser.Matriz_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code registro_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro_var(TraductorSLParser.Registro_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipo_dato_var}
	 * labeled alternative in {@link TraductorSLParser#tipo_declaracion_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato_var(TraductorSLParser.Tipo_dato_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_vector_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_vector_var(TraductorSLParser.Exp_vector_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#dim_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim_var(TraductorSLParser.Dim_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lista_dim_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_dim_var(TraductorSLParser.Lista_dim_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_matriz_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_matriz_var(TraductorSLParser.Exp_matriz_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_registro_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_registro_var(TraductorSLParser.Exp_registro_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#declarar_var_no_rescurive_to_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_var_no_rescurive_to_translation(TraductorSLParser.Declarar_var_no_rescurive_to_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lista_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_no_recursive_to_translation(TraductorSLParser.Lista_no_recursive_to_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#tipo_declaracion_var_no_rescurive_to_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_declaracion_var_no_rescurive_to_translation(TraductorSLParser.Tipo_declaracion_var_no_rescurive_to_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_vector_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_vector_no_recursive_to_translation(TraductorSLParser.Exp_vector_no_recursive_to_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_matriz_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_matriz_no_recursive_to_translation(TraductorSLParser.Exp_matriz_no_recursive_to_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#exp_registro_no_recursive_to_translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_registro_no_recursive_to_translation(TraductorSLParser.Exp_registro_no_recursive_to_translationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#cuerpo_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_main(TraductorSLParser.Cuerpo_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(TraductorSLParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lvalue_igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue_igual(TraductorSLParser.Lvalue_igualContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lvalue_igual_desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue_igual_desde(TraductorSLParser.Lvalue_igual_desdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#bucles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucles(TraductorSLParser.BuclesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(TraductorSLParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#expresion_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_mientras(TraductorSLParser.Expresion_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(TraductorSLParser.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#expresion_repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_repetir(TraductorSLParser.Expresion_repetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesde(TraductorSLParser.DesdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#expresion_desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_desde(TraductorSLParser.Expresion_desdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#asignaciones_desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones_desde(TraductorSLParser.Asignaciones_desdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(TraductorSLParser.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(TraductorSLParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(TraductorSLParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#cuerpo_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_condicional(TraductorSLParser.Cuerpo_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#sino_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino_si(TraductorSLParser.Sino_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#cuerpo_sino_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_sino_si(TraductorSLParser.Cuerpo_sino_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(TraductorSLParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(TraductorSLParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(TraductorSLParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#cuerpo_caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_caso(TraductorSLParser.Cuerpo_casoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#caso_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso_prima(TraductorSLParser.Caso_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#caso_segundo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso_segundo(TraductorSLParser.Caso_segundoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#cuerpo_caso_segundo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo_caso_segundo(TraductorSLParser.Cuerpo_caso_segundoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#subrutinas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrutinas(TraductorSLParser.SubrutinasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lista_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_sub(TraductorSLParser.Lista_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(TraductorSLParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#lista_sub_separador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_sub_separador(TraductorSLParser.Lista_sub_separadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(TraductorSLParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#retorna2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorna2(TraductorSLParser.Retorna2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorSLParser#fin_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin_final(TraductorSLParser.Fin_finalContext ctx);
}