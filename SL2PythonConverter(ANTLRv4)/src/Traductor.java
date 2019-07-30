import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Traductor extends TraductorSLBaseListener {
    ArrayList<String> tk_ids_declarar_tipos = new ArrayList<>();
    ArrayList<String> tk_ids_declarar_var = new ArrayList<>();
    ArrayList<String> var_input = new ArrayList<>();
    boolean isInput = false;
    String tokenArreglo = "";
    boolean estaEnArreglo = false;


    Pila pila_recursividad_registros_sl_a_clases_python = new Pila();
    RegistrosSL payload_auxiliar_declaracion_tipos_registro;



    int indentacionActual = 0;
    @Override

    public void enterFuente(TraductorSLParser.FuenteContext ctx) { }








    /* ||||||||||||||  TRADUCCION COMPLETA : TITULO PROGRAMA   |||||||||||||| */

    @Override
    public void enterTitulo_programa(TraductorSLParser.Titulo_programaContext ctx) {
        System.out.println("#programa " + ctx.TK_ID());
    }

    /* |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| */








    /* @@@@@@@@@@@@@@  TRADUCCION COMPLETA : DECLARAR CONST   @@@@@@@@@@@@@@@@@@@@@ */

    @Override
    public void enterDeclarar_const(TraductorSLParser.Declarar_constContext ctx) {
        for(int i=0; i < indentacionActual; ++i) {
            System.out.print(" ");
        }
        System.out.print(ctx.TK_ID().getText() + " = ");

    }

    @Override public void exitDeclarar_const(TraductorSLParser.Declarar_constContext ctx) { System.out.println(); }







    /* ETIQUETAS ASOCIADAS AL TOKEN GENERAL */
    @Override
    public void enterCadena(TraductorSLParser.CadenaContext ctx) {
        if(!isInput)
            System.out.print(ctx.TK_CADENA().getText());
        else
            tokenArreglo += ctx.TK_CADENA().getText();
    }

    @Override
    public void enterNumero(TraductorSLParser.NumeroContext ctx) {
        if(!isInput)
            System.out.print( ctx.op==null ? ctx.TK_NUMERO().getText() : ctx.op.getText()  + ctx.TK_NUMERO().getText());
        else
            tokenArreglo += ctx.op==null ? ctx.TK_NUMERO().getText() : ctx.op.getText()  + ctx.TK_NUMERO().getText();
    }

    @Override
    public void enterMi_lvalue(TraductorSLParser.Mi_lvalueContext ctx) {
        if(!isInput)
            System.out.print( (ctx.op==null ? "" : ctx.op.getText() ) );
        else
            tokenArreglo +=  (ctx.op==null ? "" : ctx.op.getText() );
    }


    @Override
    public void enterLogico(TraductorSLParser.LogicoContext ctx) {
        if(!isInput) {
            if(ctx.TK_LOGICO().getText().equals("SI") || ctx.TK_LOGICO().getText().equals("TRUE"))
                System.out.print("True");
            else
                System.out.print("False");
        }else {
            if(ctx.TK_LOGICO().getText().equals("SI") || ctx.TK_LOGICO().getText().equals("TRUE"))
                tokenArreglo += "True";
            else
                tokenArreglo += "False";
        }

    }

    @Override
    public void enterRegistro(TraductorSLParser.RegistroContext ctx) { System.out.print("["); }

    @Override
    public void exitRegistro(TraductorSLParser.RegistroContext ctx) { System.out.print("]"); }

    @Override
    public void enterExpresion_con_parentesis(TraductorSLParser.Expresion_con_parentesisContext ctx) {
        if(!isInput)
            System.out.print("(");
        else
            tokenArreglo += "(";
    }

    @Override
    public void exitExpresion_con_parentesis(TraductorSLParser.Expresion_con_parentesisContext ctx) {
        if(!isInput)
            System.out.print(")");
        else
            tokenArreglo += ")";
    }

    @Override
    public void enterEscribe_not(TraductorSLParser.Escribe_notContext ctx) {
        if(!isInput)
            System.out.print("not ");
        else
            tokenArreglo += "not ";
    }

    @Override
    public void enterLlamado_funcion(TraductorSLParser.Llamado_funcionContext ctx) {
        if(ctx.TK_ID().getText().equals("imprimir"))
            System.out.print("print(");
        else
            System.out.print(ctx.TK_ID().getText() + "(");
    }

    @Override
    public void exitLlamado_funcion(TraductorSLParser.Llamado_funcionContext ctx) {
        System.out.print(")"); }

    @Override
    public void enterLlamado_funcion_input(TraductorSLParser.Llamado_funcion_inputContext ctx) {
        isInput = true;
        tokenArreglo = "";
    }

    @Override
    public void exitLlamado_funcion_input(TraductorSLParser.Llamado_funcion_inputContext ctx) {
        String[] partes = tokenArreglo.split(",");

        for(int i = 0; i < partes.length-1; ++i) {
            if(partes[i].contains("["))
                System.out.println( partes[i].substring(0,partes[i].indexOf("[")) + ".append("+"input()"+")");
            else
                System.out.println(partes[i] + " = input()");
        }
        if(partes[partes.length-1].contains("["))
            System.out.println( partes[partes.length-1].substring(0,partes[partes.length-1].indexOf("[")) + ".append("+"input()"+")");
        else
            System.out.print(partes[partes.length-1] + " = input()" );


        isInput = false;

    }

    @Override
    public void enterOperador(TraductorSLParser.OperadorContext ctx) {
        if(ctx.getText().equals("^") && !isInput)
            System.out.print(" ** ");
        else if(ctx.getText().equals("^") && isInput)
            tokenArreglo += " ** ";
        else if(ctx.getText().equals(",") && !isInput && estaEnArreglo)
            System.out.print("][");
        else if(ctx.getText().equals(",") && isInput && !estaEnArreglo)
            tokenArreglo += ",";
        else if(ctx.getText().equals(",") && isInput && estaEnArreglo)
            tokenArreglo += "][";
        else if(!isInput)
            System.out.print(" " + ctx.getText() + " ");
        else
            tokenArreglo += " " + ctx.getText() + " ";

    }

    @Override
    public void enterSeparador(TraductorSLParser.SeparadorContext ctx) { System.out.print(";"); }



    /* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ */



    /* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  TRADUCCION COMPLETA : DECLARAR TIPOS   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  */


    @Override public void enterDeclarar_tipos(TraductorSLParser.Declarar_tiposContext ctx) {
        for(int i=0; i < indentacionActual; ++i) {
            System.out.print(" ");
        }
        tk_ids_declarar_tipos.add(ctx.TK_ID().getText());
    }


    @Override public void enterLista_dec_tipo(TraductorSLParser.Lista_dec_tipoContext ctx) { tk_ids_declarar_tipos.add(ctx.TK_ID().getText()); }


    @Override public void enterVector_tipo(TraductorSLParser.Vector_tipoContext ctx) {
        while(!tk_ids_declarar_tipos.isEmpty()){tk_ids_declarar_tipos.remove(0);}
    }

    @Override public void enterMatriz_tipo(TraductorSLParser.Matriz_tipoContext ctx) {
        while(!tk_ids_declarar_tipos.isEmpty()){tk_ids_declarar_tipos.remove(0);}
    }

    @Override public void enterTipo_dato_tipo(TraductorSLParser.Tipo_dato_tipoContext ctx) {
        while(!tk_ids_declarar_tipos.isEmpty()){tk_ids_declarar_tipos.remove(0);}
    }


    @Override public void enterExp_registro(TraductorSLParser.Exp_registroContext ctx){
        pila_recursividad_registros_sl_a_clases_python.elementos.add(new RegistrosSL((ArrayList) tk_ids_declarar_tipos.clone()));  // cuando vayamos a comenzar a crear registros entonces creamos un nuevo RegistroSL en la pila
        int length = pila_recursividad_registros_sl_a_clases_python.elementos.size() - 1; // obtenemos el indice del ultimo elemento
        payload_auxiliar_declaracion_tipos_registro = pila_recursividad_registros_sl_a_clases_python.elementos.get(length); // apuntamos con la variable global a ese ultimo elemento
    }

    @Override public void exitExp_registro(TraductorSLParser.Exp_registroContext ctx){

        String cuerpo_clase = generatePythonBodyClass();

        // ITERAR SOBRE LOS PADRES HACIENDO N CLASS
        while(!tk_ids_declarar_tipos.isEmpty()){
            String tk_id_padre = tk_ids_declarar_tipos.remove(0);
            System.out.print("class " + tk_id_padre.substring(0, 1).toUpperCase() + tk_id_padre.substring(1) +":\n");
            System.out.println(cuerpo_clase);
        }
    }




//###########################DECLARAR VAR##########################//


    /* --------------------------------------------------------------------------------- */
    /* METODO PROPIO PARA GENERAR LA TRADUCCIÓN DEL CUERPO DE UNA CLASE */
    public String generatePythonBodyClass(){
        String cuerpo_clase = "\tdef __init__(self";


        int length = pila_recursividad_registros_sl_a_clases_python.elementos.size() - 1; // obtenemos el indice del ultimo elemento
        payload_auxiliar_declaracion_tipos_registro = pila_recursividad_registros_sl_a_clases_python.elementos.remove(length); // eliminamos el tope del a pila y lo guardamos en la variable global

        // ITERAR SOBRE LA LISTA DE LA PILA PARA GENERAR LOS PARAMETROS DEL CONSTRUCTOR
        for (int i = 0; i < payload_auxiliar_declaracion_tipos_registro.tk_id_registros.size(); i++) {
            StringTokenSubList subList = payload_auxiliar_declaracion_tipos_registro.tk_id_registros.get(i);
            for (int j = 0; j < subList.tokens_id.size(); j++) {
                String tk_id = subList.tokens_id.get(j);
                cuerpo_clase +=  ", " + tk_id;
            }
        }
        cuerpo_clase += "):\n";


        // ITERAR SOBRE LA LISTA DE LA PILA PARA OBTENER EL CUERPO
        while(!payload_auxiliar_declaracion_tipos_registro.tk_id_registros.isEmpty()){ // la vaciamos generando la traducción
            StringTokenSubList subList = payload_auxiliar_declaracion_tipos_registro.tk_id_registros.remove(0);
            while(!subList.tokens_id.isEmpty()){
                String tk_id = subList.tokens_id.remove(0);
                cuerpo_clase += "\t\tself." + tk_id + " = " + tk_id + "\n";
            }
        }

        payload_auxiliar_declaracion_tipos_registro = null; // para recolector de basura

        return cuerpo_clase;
    }
    /* --------------------------------------------------------------------------------- */

    /* ======================= COR RECURSIVO DE REGISTROS -> CLASES =============================================== */

    @Override public void enterDeclarar_var_no_rescurive_to_translation(TraductorSLParser.Declarar_var_no_rescurive_to_translationContext ctx) {
        StringTokenSubList stringTokenSubList = new StringTokenSubList();
        payload_auxiliar_declaracion_tipos_registro.tk_id_registros.add(stringTokenSubList);
        stringTokenSubList.tokens_id.add(ctx.TK_ID().getText());// añadimos al ultimo RegistroSL de la pila
    }

    @Override public void enterLista_no_recursive_to_translation(TraductorSLParser.Lista_no_recursive_to_translationContext ctx) {
        payload_auxiliar_declaracion_tipos_registro.tk_id_registros.get(payload_auxiliar_declaracion_tipos_registro.tk_id_registros.size()-1).tokens_id.add(ctx.TK_ID().getText()); // añadimos al ultimo RegistroSL de la pila
    }

    @Override public void enterExp_registro_no_recursive_to_translation(TraductorSLParser.Exp_registro_no_recursive_to_translationContext ctx) {
        ArrayList<String> padre = (ArrayList) payload_auxiliar_declaracion_tipos_registro.tk_id_registros.get(payload_auxiliar_declaracion_tipos_registro.tk_id_registros.size()-1).tokens_id.clone();
        pila_recursividad_registros_sl_a_clases_python.elementos.add(new RegistrosSL(padre)); // cuando vayamos a comenzar a crear registros entonces creamos un nuevo RegistroSL en la pila
        int length = pila_recursividad_registros_sl_a_clases_python.elementos.size() - 1; // obtenemos el indice del ultimo elemento
        payload_auxiliar_declaracion_tipos_registro = pila_recursividad_registros_sl_a_clases_python.elementos.get(length); // apuntamos con la variable global a ese ultimo elemento

    }

    /* CODIGO QUE MUESTRA LA TRADUCCION A UNA CLASE EN UN REGISTRO RECURSIVO */
    @Override public void exitExp_registro_no_recursive_to_translation(TraductorSLParser.Exp_registro_no_recursive_to_translationContext ctx) {
        ArrayList<String> padres = payload_auxiliar_declaracion_tipos_registro.tk_id_padres;

        String cuerpo_clase = generatePythonBodyClass();

        // ITERAR SOBRE LOS PADRES HACIENDO N CLASS
        while(!padres.isEmpty()){
            String tk_id_padre = padres.remove(0);
            System.out.print("class " + tk_id_padre.substring(0, 1).toUpperCase() + tk_id_padre.substring(1) +":\n");
            System.out.println(cuerpo_clase);
        }

        int length = pila_recursividad_registros_sl_a_clases_python.elementos.size() - 1; // obtenemos el indice del ultimo elemento
        payload_auxiliar_declaracion_tipos_registro = pila_recursividad_registros_sl_a_clases_python.elementos.get(length); // eliminamos el tope del a pila y lo guardamos en la variable global
    }


    /* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  */





    /* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  TRADUCCION COMPLETA : DECLARAR VAR   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ */

    @Override
    public void enterDeclarar_var(TraductorSLParser.Declarar_varContext ctx){
        for(int i=0; i < indentacionActual; ++i) {
            System.out.print(" ");
        }
        tk_ids_declarar_var.add(ctx.TK_ID().getText());
    }

    @Override
    public void enterLista(TraductorSLParser.ListaContext ctx){
        tk_ids_declarar_var.add(ctx.TK_ID().getText());
    }


    @Override
    public void enterVector_var(TraductorSLParser.Vector_varContext ctx){
        while (!tk_ids_declarar_var.isEmpty()  ){
            String tk_id = tk_ids_declarar_var.get(0);
            tk_ids_declarar_var.remove(0);
            System.out.println(tk_id + " = []");
        }
    }
    @Override
    public void enterMatriz_var(TraductorSLParser.Matriz_varContext ctx){
        while (!tk_ids_declarar_var.isEmpty()  ){
            String tk_id = tk_ids_declarar_var.get(0);
            tk_ids_declarar_var.remove(0);
            System.out.println(tk_id + " = []");
        }
    }
    @Override
    public void enterTipo_dato_var(TraductorSLParser.Tipo_dato_varContext ctx){
        while (!tk_ids_declarar_var.isEmpty()  ){
            String tk_id = tk_ids_declarar_var.get(0);
            tk_ids_declarar_var.remove(0);

            if(ctx.tipo_dato().getText().equals("numerico"))
                System.out.println(tk_id + " = 0");
            else if(ctx.tipo_dato().getText().equals("cadena"))
                System.out.println(tk_id + " = \"\" ");
            else
                System.out.println(tk_id + " = False");

            // antes era System.out.println(tk_id + " = None");



        }
    }

    @Override public void enterExp_registro_var(TraductorSLParser.Exp_registro_varContext ctx){
        pila_recursividad_registros_sl_a_clases_python.elementos.add(new RegistrosSL((ArrayList) tk_ids_declarar_tipos.clone()));  // cuando vayamos a comenzar a crear registros entonces creamos un nuevo RegistroSL en la pila
        int length = pila_recursividad_registros_sl_a_clases_python.elementos.size() - 1; // obtenemos el indice del ultimo elemento
        payload_auxiliar_declaracion_tipos_registro = pila_recursividad_registros_sl_a_clases_python.elementos.get(length); // apuntamos con la variable global a ese ultimo elemento
    }

    @Override public void exitExp_registro_var(TraductorSLParser.Exp_registro_varContext ctx){

        String cuerpo_clase = generatePythonBodyClass();

        // ITERAR SOBRE LOS PADRES HACIENDO N CLASS
        while(!tk_ids_declarar_var.isEmpty()){
            String tk_id_padre = tk_ids_declarar_var.remove(0);
            System.out.print("class " + tk_id_padre.substring(0, 1).toUpperCase() + tk_id_padre.substring(1) +":\n");
            System.out.println(cuerpo_clase);
        }
    }















    @Override
    public void enterLvalue(TraductorSLParser.LvalueContext ctx)
    {
        if(isInput) {
            //var_input.add(ctx.lvalue_prima() != null ? ctx.TK_ID().getText()+ctx.lvalue_prima().getText() : ctx.TK_ID().getText() );
            tokenArreglo += ctx.TK_ID().getText();
        }

        else
            System.out.print(ctx.TK_ID().getText());
    }


    @Override
    public void enterPara_arreglo(TraductorSLParser.Para_arregloContext ctx) {
        estaEnArreglo = true;
        if(!isInput)
            System.out.print("[");
        else
            tokenArreglo += "[";
    }

    @Override
    public void exitArg_arreglo(TraductorSLParser.Arg_arregloContext ctx) {
        estaEnArreglo = false;
        if(!isInput)
            System.out.print("]");
        else
            tokenArreglo += "]";
    }

    @Override
    public void enterAtributo(TraductorSLParser.AtributoContext ctx) {
        if(!isInput)
            System.out.print("." + ctx.TK_ID().getText());
        else
            tokenArreglo += "." + ctx.TK_ID().getText();
    }

    @Override
    public void enterArg_mult_arreglo(TraductorSLParser.Arg_mult_arregloContext ctx) {
        System.out.print("[" );
    }

    @Override
    public void exitArg_mult_arreglo(TraductorSLParser.Arg_mult_arregloContext ctx) {
        System.out.print("]" );
    }


    @Override
    public void enterMy_const(TraductorSLParser.My_constContext ctx){ }

    @Override
    public void enterVar(TraductorSLParser.VarContext ctx){ }

    @Override
    public void enterTipos(TraductorSLParser.TiposContext ctx){ }









    //SUBRUTINAS
    @Override
    public void enterSubrutinas(TraductorSLParser.SubrutinasContext ctx) {
        indentacionActual += 4;
        System.out.print("\ndef " + ctx.TK_ID() + "(");
    }

    @Override
    public void enterLista_sub(TraductorSLParser.Lista_subContext ctx) {
        System.out.print(ctx.TK_ID().getText());
    }


    @Override
    public void enterLista_sub_separador(TraductorSLParser.Lista_sub_separadorContext ctx) {
        System.out.print(",");
    }

    @Override
    public void enterRetorno(TraductorSLParser.RetornoContext ctx) {
        System.out.println("):");
    }

    @Override
    public void enterFin_final(TraductorSLParser.Fin_finalContext ctx) {
        System.out.println();
    }

    @Override
    public void enterRetorna2(TraductorSLParser.Retorna2Context ctx) {
        for(int i=0; i < indentacionActual; ++i) {
            System.out.print(" ");
        }
        System.out.print("return ");
    }

    @Override
    public void exitRetorno(TraductorSLParser.RetornoContext ctx) {
        indentacionActual -= 4;
    }



    //Main
    //SENTENCIA
    @Override
    public void enterMain(TraductorSLParser.MainContext ctx){
        System.out.print("");}

    @Override
    public void enterCuerpo_main(TraductorSLParser.Cuerpo_mainContext ctx){
        //System.out.println("la identacion actual es : "+indentacionActual);
        for(int i=0; i < indentacionActual; ++i) {
            System.out.print(" ");
        }
    }

    @Override
    public void exitCuerpo_main(TraductorSLParser.Cuerpo_mainContext ctx) {
        System.out.println();
    }

    @Override
    public void enterSentencia(TraductorSLParser.SentenciaContext ctx){
        System.out.print("");
    }
    @Override
    public void exitLvalue_igual(TraductorSLParser.Lvalue_igualContext ctx){
        System.out.print("=");
    }
    public void exitExpresion(TraductorSLParser.ExpresionContext ctx){
        //  System.out.println("");
    }

    //BUCLES
    @Override
    public void enterMientras(TraductorSLParser.MientrasContext ctx){
        System.out.print("while ");
    }

    @Override
    public void exitExpresion_mientras(TraductorSLParser.Expresion_mientrasContext ctx){

        System.out.println(" :");
        indentacionActual+=4;
    }
    @Override
    public void exitMientras(TraductorSLParser.MientrasContext ctx){
        indentacionActual-=4;
    }

    @Override
    public void enterRepetir(TraductorSLParser.RepetirContext ctx){
        System.out.println("while True:");
        indentacionActual+=4;
    }
    @Override
    public void exitRepetir(TraductorSLParser.RepetirContext ctx){

        indentacionActual-=4;
    }

    @Override
    public void enterExpresion_repetir(TraductorSLParser.Expresion_repetirContext ctx){
        System.out.print(String.format("%1$"+indentacionActual+"s", ""));
        System.out.print("if ");

    }
    @Override
    public void exitExpresion_repetir(TraductorSLParser.Expresion_repetirContext ctx){

        System.out.println(":");indentacionActual+=4;
        for(int i=0; i < indentacionActual; ++i) {
            System.out.print(" ");
        }
        System.out.println("break");indentacionActual-=4;
    }

    @Override
    public void enterDesde(TraductorSLParser.DesdeContext ctx){

        System.out.print("for ");
    }
    @Override
    public void exitDesde(TraductorSLParser.DesdeContext ctx){
        indentacionActual-=4;
    }

    @Override
    public void enterAsignaciones_desde(TraductorSLParser.Asignaciones_desdeContext ctx){

    }
    @Override
    public void exitAsignaciones_desde(TraductorSLParser.Asignaciones_desdeContext ctx){
        System.out.print(",");
    }

    @Override
    public void exitLvalue_igual_desde(TraductorSLParser.Lvalue_igual_desdeContext ctx){
        System.out.print(" in range(");
    }

    @Override
    public void enterPaso(TraductorSLParser.PasoContext ctx){

        System.out.print(",");
    }
    @Override
    public void exitExpresion_desde(TraductorSLParser.Expresion_desdeContext ctx){
        System.out.println("):");indentacionActual+=4;
    }

//EVAL


    @Override
    public void enterCaso(TraductorSLParser.CasoContext ctx) {
        System.out.print("if ");
    }

    @Override
    public void enterCuerpo_caso(TraductorSLParser.Cuerpo_casoContext ctx) {
        System.out.println(":");
        indentacionActual +=4;
    }

    @Override
    public void enterCaso_segundo(TraductorSLParser.Caso_segundoContext ctx) {
        System.out.print("elif ");
    }

    @Override
    public void enterCuerpo_caso_segundo(TraductorSLParser.Cuerpo_caso_segundoContext ctx) {
        System.out.println(":");
    }

    @Override
    public void exitCaso(TraductorSLParser.CasoContext ctx) {
        indentacionActual -= 4;
    }


    //CONDICIONALES
    @Override
    public void enterCondicional(TraductorSLParser.CondicionalContext ctx) {
        System.out.print("if ");
    }


    @Override
    public void enterCuerpo_condicional(TraductorSLParser.Cuerpo_condicionalContext ctx) {
        System.out.println(":");
        indentacionActual +=4;
    }


    @Override
    public void enterSino_si(TraductorSLParser.Sino_siContext ctx) {
        indentacionActual-=4;
        for(int i=0; i < indentacionActual; ++i) {
            System.out.print(" ");
        }
        System.out.print("elif ");
    }

    @Override
    public void enterCuerpo_sino_si(TraductorSLParser.Cuerpo_sino_siContext ctx) {
        System.out.println(":");
        indentacionActual+=4;
    }

    @Override
    public void exitCondicional(TraductorSLParser.CondicionalContext ctx) {
        indentacionActual -= 4;
    }



}
