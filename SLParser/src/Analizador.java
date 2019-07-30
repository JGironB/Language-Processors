/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

///NUEVA CLASE
class Token {
    // #########  forma de los tokens: token_ + {numero_real, numero, cadena, menor, menor_o_igual, diferente, igual, igual_igual, mayor, mayor_o_igual, resta, suma, division, id, punto, punto_y_coma, dos_puntos, corch_izq, corch_der, llave_izq, llave_der, coma, exponente, modulo, parent_izq, parent_der}  ############
    public String simbolo;
    public String nombreToken;
    public String expresionToken;
    public int fila, columna;
    public Token(final String simbolo, final String nombreToken, final String expresionToken, final int fila, final int columna){
        this.simbolo = simbolo;
        this.nombreToken = nombreToken;
        this.expresionToken = expresionToken;
        this.fila = fila;
        this.columna = columna;
    }
    public Token(final String nombreToken, final String expresionToken, final int fila, final int columna){
        this.simbolo = "";
        this.nombreToken = nombreToken;
        this.expresionToken = expresionToken;
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public String toString(){
       return "{nombreToken: "+this.nombreToken+" , expresionToken: "+
               this.expresionToken+" , fila: "+this.fila+" , columna: "+this.columna+" }";
    }
}

////////


public class Analizador {

    private static String bufferColaString;
    private static String posible_token;
    private static String[] logicos;
    private static String[] reservadas;
    private static String[] func_primitivas;

    private static int columnaCapturadaInicio;
    private static boolean flagColumnIteratorBreak;
    private static boolean flagRowIteratorBreak;

    public static ArrayList<Token> tokens = new ArrayList<>();

    public static ArrayList<String> leertxt(String direccion){
        ArrayList<String> texto=new ArrayList<String>();
        try{
            BufferedReader bf= new BufferedReader(new FileReader(direccion));
            String bfRead;
            while((bfRead = bf.readLine())!= null ){
                texto.add(bfRead);
            }
        }catch(Exception e){System.out.println("Archivo no encontrado");}
        return texto;
    }


    public static void main(String[] args){
        //ArrayList<String> texto= leertxt(System.getProperty("user.dir")+"\\caso_prueba_fallo_3.txt");
        //AnalizadorLexico(texto);
        //System.out.println(tokens.toString());


        ArrancarAnalizadorLexico("texto.txt");

        
        
        tokens.add(new Token("$","$","$",0,0));
        //for (int i = 0; i < tokens.size(); i++) {
          // System.out.println(tokens.get(i).nombreToken);
       //}
        
        
        
       new AnalizadorSintactico().iniciarSintactico(tokens);
        //System.out.println(ArrancarAnalizadorLexico(System.getProperty("user.dir")+"/../caso_prueba_fallo_3.txt"));
        //System.out.println(ArrancarAnalizadorLexico(System.getProperty("user.dir")+"\\caso_prueba_fallo_3.txt"));
       
    }

    public static ArrayList<Token> ArrancarAnalizadorLexico(final String ruta){ ////////// ##################  METODO PARA CREAR LA LISTA DE TOKENS ##################
        ArrayList<String> texto= leertxt(ruta);
        AnalizadorLexico(texto);
        return tokens;
    }


    private static void AnalizadorLexico(ArrayList<String> filas){

        logicos = new String[]{"FALSE","NO","SI","TRUE"};
        reservadas = new String[]{"and", "archivo", "cadena", "caso", "const", "constantes", "desde", "eval", "fin", "hasta", "inicio", "lib", "libext", "logico", "matriz", "mientras", "not", "numerico", "or",
            "paso", "programa", "ref", "registro", "repetir", "retorna", "si", "sino", "subrutina", "tipos", "var", "variables", "vector"};
        func_primitivas = new String[]{};

        bufferColaString = "";
        posible_token = "";

        columnaCapturadaInicio = -1;
        flagColumnIteratorBreak = false;
        flagRowIteratorBreak = false;

        for (int fila = 0; fila < filas.size(); ++fila) {
            String lineaTexto = filas.get(fila);
            int limite = lineaTexto.length();
            //System.out.println(lineaTexto);

            for (int columna = 0; columna < limite; columna++) {
                char caracter = lineaTexto.charAt(columna);
                //System.out.println("--- caracter: "+caracter+"  p_token:   "+posible_token);
                switch(posible_token){
                    case "":
                        validarCasosEstadoInicial(caracter,fila,columna,limite-1);
                        break;
                    case "division":
                        validarCasoDivision(caracter,fila,columna,limite-1);
                        break;
                    case "suma":
                        validarCasoSuma(caracter,fila,columna,limite-1);
                        break;
                    case "resta":
                        validarCasoResta(caracter,fila,columna,limite-1);
                        break;
                    case "mayor":
                        validarCasoMayor(caracter,fila,columna,limite-1);
                        break;
                    case "igual":
                        validarCasoIgual(caracter,fila,columna,limite-1);
                        break;
                    case "menor":
                        validarCasoMenor(caracter,fila,columna,limite-1);
                        break;
                    case "cadena":
                        validarCasoCadena(caracter,fila,columna,limite-1);
                        break;
                    case "cadena2":
                        validarCasoCadena2(caracter,fila,columna,limite-1);
                        break;
                    case "numero":
                        validarCasoNumerico(caracter,fila,columna,limite-1);
                        break;
                    case "numero_real":
                        validarCasoNumericoReal(caracter,fila,columna,limite-1);
                        break;
                    case "numero_real_epsilon":
                        validarCasoNumericoRealEpsilon(caracter,fila,columna,limite-1);
                        break;
                    case "numero_real_epsilon_completo":
                        validarCasoNumericoRealEpsilonCompleto(caracter,fila,columna,limite-1);
                        break;
                    case "palabra":
                        validarCasoPalabra(caracter,fila,columna,limite-1);
                        break;
                    case "comentario":
                        validarCasoComentarioMultiplesLineas(caracter);
                        break;
                    case "fin_comentario":
                        validarCasoPosibleFinComentarioMultiplesLineas(caracter);
                        break;
                }

                if(flagColumnIteratorBreak){
                    flagColumnIteratorBreak = false;
                    break;
                }
            }
            if(flagRowIteratorBreak)
                break;

        }

    }

    private static void validarCasosEstadoInicial(char caracter,int fila, int columna, int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, false);

        if(generales)
            return;
        columnaCapturadaInicio = columna;

        switch(caracter){
            case '.':
                validarUnicoSimbolo('.',"punto",fila,columna, false);
                break;
            case '/':
                bufferColaString += "/";
                posible_token = "division";
                break;
            case '*':
                validarUnicoSimbolo('*',"asterisco",fila,columna, false);
                break;
            case '+':
                bufferColaString += "+";
                posible_token = "suma";
                break;
            case '-':
                bufferColaString += "-";
                posible_token = "resta";
                break;
            case '>':
                bufferColaString += ">";
                posible_token = "mayor";
                break;
            case '=':
                bufferColaString += "=";
                posible_token = "igual";
                break;
            case '<':
                bufferColaString += "<";
                posible_token = "menor";
                break;
            case '\"':
                bufferColaString += "\"";
                posible_token = "cadena";
                break;
            case '\'':
                bufferColaString += "\'";
                posible_token = "cadena2";
                break;
            default:
                int ascii = (int) caracter;
                int transformacion = (((ascii >= 48 && ascii <= 57) ? 1 : 0)<<1) + (( ( (ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ' ) ? 1 : 0));
                switch(transformacion){
                    case 0: // error
                        dispararError(fila, columna);
                        break;
                    case 1: // es palabra
                        bufferColaString += caracter;
                        posible_token = "palabra";
                        break;
                    case 2:// es numero
                        bufferColaString += caracter;
                        posible_token = "numero";
                        break;
                }
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);

    }

    private static void validarCasoDivision(char caracter,int fila, int columna, int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, false);

        if(generales)
            return;

        switch(caracter){
            case '/':
                flagColumnIteratorBreak = true;
                bufferColaString = "";
                posible_token = "";
                break;
            case '*':
                bufferColaString = "";
                posible_token = "comentario";
                break;




            /* OTROS CASOS GENERALES RESPECTO AL SIGNO DIVISION */
            case '.':
                validarUnicoSimbolo('.',"punto",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString += "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "numero";
                }else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ' ){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    dispararError(fila, columna);
                }
                columnaCapturadaInicio = columna;
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoSuma(char caracter,int fila, int columna , int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, false);

        if(generales)
            return;

        switch(caracter){
            /* OTROS CASOS GENERALES RESPECTO AL SIMBOLO SUMA */
            case '.':
                validarUnicoSimbolo('.',"punto",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarUnicoSimbolo('*',"asterisco",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57){
                    // nuevo
                    validarReiniciarAlEstadoInicial(fila,columna, false);

                    bufferColaString += caracter;
                    posible_token = "numero";

                    //nuevo
                    columnaCapturadaInicio = columna;
                }else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                    columnaCapturadaInicio = columna;
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    dispararError(fila, columna);
                }
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoResta(char caracter,int fila, int columna , int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, false);

        if(generales)
            return;

        switch(caracter){
            /* OTROS CASOS GENERALES RESPECTO AL SIMBOLO RESTA */
            case '.':
                validarUnicoSimbolo('.',"punto",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarUnicoSimbolo('*',"asterisco",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57){
                    // nuevo
                    validarReiniciarAlEstadoInicial(fila,columna, false);

                    bufferColaString += caracter;
                    posible_token = "numero";

                    //nuevo
                    columnaCapturadaInicio = columna;
                }else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                    columnaCapturadaInicio = columna;
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    dispararError(fila, columna);
                }
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoMayor(char caracter,int fila, int columna , int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, false);

        if(generales)
            return;

        switch(caracter){
            case '=':
                bufferColaString += "=";
                posible_token = "mayor_o_igual";
                validarReiniciarAlEstadoInicial(fila,columna, false);
                break;




            /* OTROS CASOS GENERALES RESPECTO AL SIGNO MAYOR */
            case '.':
                validarUnicoSimbolo('.',"punto",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarUnicoSimbolo('*',"asterisco",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "numero";
                }else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    dispararError(fila, columna);
                }
                columnaCapturadaInicio = columna;
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoIgual(char caracter,int fila, int columna , int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, false);

        if(generales)
            return;

        switch(caracter){
            case '=':
                bufferColaString += "=";
                posible_token = "igual_igual";
                validarReiniciarAlEstadoInicial(fila,columna, false);
                break;


            /* OTROS CASOS GENERALES RESPECTO AL SIGNO IGUAL */
            case '.':
                validarUnicoSimbolo('.',"punto",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarUnicoSimbolo('*',"asterisco",fila,columna, false);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarReiniciarAlEstadoInicial(fila,columna, false);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "numero";
                }else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna, false);
                    dispararError(fila, columna);
                }
                columnaCapturadaInicio = columna;
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoMenor(char caracter,int fila, int columna , int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, false);

        if(generales)
            return;

        switch(caracter){
            case '=':
                bufferColaString += "=";
                posible_token = "menor_o_igual";
                validarReiniciarAlEstadoInicial(fila,columna,false);
                break;
            case '>':
                bufferColaString += ">";
                posible_token = "diferente";
                validarReiniciarAlEstadoInicial(fila,columna,false);
                break;


            /* OTROS CASOS GENERALES RESPECTO AL SIGNO MENOR */
            case '.':
                validarUnicoSimbolo('.',"punto",fila,columna,false);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarReiniciarAlEstadoInicial(fila,columna,false);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarUnicoSimbolo('*',"asterisco",fila,columna,false);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarReiniciarAlEstadoInicial(fila,columna,false);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarReiniciarAlEstadoInicial(fila,columna,false);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarReiniciarAlEstadoInicial(fila,columna,false);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarReiniciarAlEstadoInicial(fila,columna,false);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarReiniciarAlEstadoInicial(fila,columna,false);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57){
                    validarReiniciarAlEstadoInicial(fila,columna,false);
                    bufferColaString += caracter;
                    posible_token = "numero";
                }else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarReiniciarAlEstadoInicial(fila,columna,false);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna,false);
                    dispararError(fila, columna);
                }
                columnaCapturadaInicio = columna;
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoCadena(char caracter,int fila, int columna, int limite){

        switch(caracter){
            case '\"':
                bufferColaString += "\"";
                validarReiniciarAlEstadoInicial(fila,columna,true);
                break;
            default:
                //int ascii = (int) caracter;
                //if((int) ascii >= 31 && ascii <= 126)
                //    bufferColaString += caracter;
                //else if(caracter=='ñ' || caracter=='Ñ')
                //    bufferColaString += caracter;
                bufferColaString += caracter;
                break;
        }
        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoCadena2(char caracter,int fila, int columna, int limite){

        switch(caracter){
            case '\'':
                bufferColaString += "\'";
                posible_token = "cadena";
                validarReiniciarAlEstadoInicial(fila,columna,true);
                break;
            default:
                //int ascii = (int) caracter;
                //if((int) ascii >= 31 && ascii <= 126)
                //    bufferColaString += caracter;
                //else if(caracter=='ñ' || caracter=='Ñ')
                //    bufferColaString += caracter;
                bufferColaString += caracter;
                break;
        }
        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoNumerico(char caracter,int fila, int columna, int limite){
        boolean generales = validarCasosGenerales(caracter,fila, columna, true);

        if(generales)
            return;

        switch(caracter){
            /* OTROS CASOS GENERALES RESPECTO A UN NUMERO */
            case '.':
                bufferColaString += ".";
                posible_token = "numero_real";
                break;
            case 'e':
                bufferColaString += "e";
                posible_token = "numero_real_epsilon";
                break;
            case 'E':
                bufferColaString += "E";
                posible_token = "numero_real_epsilon";
                break;
            case '/':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarUnicoSimbolo('*',"asterisco",fila,columna,true);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57)
                    bufferColaString += caracter;
                else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                    columnaCapturadaInicio = columna;
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    dispararError(fila, columna);
                }
                break;
        }


        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoNumericoReal(char caracter,int fila, int columna, int limite){
        boolean generales = validarCasosGeneralesNoPrint(caracter);

        if(generales){
            final String ps_tk_caso_general = posible_token;
            validarSimboloBuffer2('.', "punto", fila, columna, true);

            if(caracter != ' ')
                tokens.add(new Token("token_"+ps_tk_caso_general,"<token_"+ps_tk_caso_general+","+(fila+1)+","+(columna+1)+">",(fila+1),columna));// System.out.println("<token_"+ps_tk_caso_general+","+(fila+1)+","+(columna+1)+">"); ----------------------------------------------------------------------
            return;
        }

        switch(caracter){
            /* OTROS CASOS GENERALES RESPECTO A UN NUMERO */
            case 'e':
                bufferColaString += "e";
                posible_token = "numero_real_epsilon";
                break;
            case 'E':
                bufferColaString += "E";
                posible_token = "numero_real_epsilon";
                break;
            case '.':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarUnicoSimbolo('.',"punto",fila,columna,true);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarUnicoSimbolo('*',"asterisco",fila,columna,true);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarSimboloBuffer2('.', "punto", fila, columna, true);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57)
                    bufferColaString += caracter;
                else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarSimboloBuffer2('.', "punto", fila, columna, true);
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                    columnaCapturadaInicio = columna;
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    dispararError(fila, columna);
                }
                break;
        }


        if(columna == limite){ // ultimo caracter de linea leido, es diferente al metodo comprobacionFinalLinea()
            switch(posible_token){
                case "": break;
                case "cadena":break;
                case "cadena2":break;
                case "palabra":
                    if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                    palabraValidada(fila,columna);
                    bufferColaString = "";
                    posible_token = "";
                    break;
                case "numero_real":
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    break;
                default:
                    validarReiniciarAlEstadoInicial(fila,columna,false);
                    break;
            }
        }
    }
    private static void validarSimboloBuffer2(char simbolo, String nombre_simbolo,int fila, int columna, boolean flag){
        if(bufferColaString.charAt(bufferColaString.length()-1) == simbolo){
            bufferColaString = bufferColaString.substring(0, bufferColaString.length()-1);
            posible_token = "numero";
            validarReiniciarAlEstadoInicial(fila,columna,true);
            if(flag)
                tokens.add(new Token("token_"+nombre_simbolo,"<token_"+nombre_simbolo+","+(fila+1)+","+(columna)+">",(fila+1),columna));// System.out.println("<token_"+nombre_simbolo+","+(fila+1)+","+(columna)+">"); ---------------------------------------------------------------------------
            else
                tokens.add(new Token("token_id","<id,e"+","+(fila+1)+","+(columna)+">",(fila+1),columna));// System.out.println("<id,e"+","+(fila+1)+","+(columna)+">");  ------------------------------------------------------------------------------------
        }else
            validarReiniciarAlEstadoInicial(fila,columna,true);
    }
    private static void validarCasoNumericoRealEpsilon(char caracter,int fila, int columna, int limite){
        boolean generales = validarCasosGeneralesNoPrint(caracter);

        if(generales){
            final String ps_tk_caso_general = posible_token;
            validarSimboloBuffer2('e', "e", fila, columna, false);

            if(caracter != ' ')
                tokens.add(new Token("token_"+ps_tk_caso_general,"<token_"+ps_tk_caso_general+","+(fila+1)+","+(columna+1)+">",(fila+1),(columna+1)));// System.out.println("<token_"+ps_tk_caso_general+","+(fila+1)+","+(columna+1)+">");  -------------------------------------------------------------------------------------
            return;
        }

        switch(caracter){
            /* OTROS CASOS GENERALES RESPECTO A UN NUMERO */
            case '.':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarUnicoSimbolo('.',"punto",fila,columna,true);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarUnicoSimbolo('*',"asterisco",fila,columna,true);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                bufferColaString += "+";
                posible_token = "numero_real_epsilon_completo";
                break;
            case '-':
                bufferColaString += "-";
                posible_token = "numero_real_epsilon_completo";
                break;
            case '>':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarSimboloBuffer2('e', "e", fila, columna, false);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57){
                    validarSimboloBuffer2('e', "e", fila, columna, false);
                    columnaCapturadaInicio = columna;
                    posible_token = "numero";
                    bufferColaString += caracter;
                }else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarSimboloBuffer2('e', "e", fila, columna, false);
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                    columnaCapturadaInicio = columna;
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    dispararError(fila, columna);
                }
                break;
        }


        if(columna == limite){ // ultimo caracter de linea leido
            switch(posible_token){
                case "": break;
                case "cadena":break;
                case "cadena2":break;
                case "palabra":
                    if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                    palabraValidada(fila,columna);
                    bufferColaString = "";
                    posible_token = "";
                    break;
                case "numero":
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    break;
                default:
                    validarReiniciarAlEstadoInicial(fila,columna,false);
                    break;
            }
        }
    }
    private static void validarCasoNumericoRealEpsilonCompleto(char caracter,int fila, int columna, int limite){
        boolean generales = validarCasosGeneralesNoPrint(caracter);

        if(generales){
            final String ps_tk_caso_general = posible_token;
            validarEpsilonBuffer3(fila, columna);

            if(caracter != ' ')
                tokens.add(new Token("token_"+ps_tk_caso_general,"<token_"+ps_tk_caso_general+","+(fila+1)+","+(columna+1)+">",(fila+1),(columna+1)));// System.out.println("<token_"+ps_tk_caso_general+","+(fila+1)+","+(columna+1)+">");  -------------------------------------------------------------------------
            return;
        }

        switch(caracter){
            /* OTROS CASOS GENERALES RESPECTO A UN NUMERO */
            case '.':
                validarEpsilonBuffer3(fila, columna);
                validarUnicoSimbolo('.',"punto",fila,columna,true);
                columnaCapturadaInicio = columna;
                break;
            case '/':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                validarEpsilonBuffer3(fila, columna);
                validarUnicoSimbolo('*',"asterisco",fila,columna,true);
                columnaCapturadaInicio = columna;
                break;
            case '+':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                validarEpsilonBuffer3(fila, columna);
                validarReiniciarAlEstadoInicial(fila,columna,true);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if(ascii >= 48 && ascii <= 57)
                    bufferColaString += caracter;
                else if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122) || caracter=='ñ' || caracter=='Ñ'){
                    validarEpsilonBuffer3(fila, columna);
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    bufferColaString += caracter;
                    posible_token = "palabra";
                    columnaCapturadaInicio = columna;
                }else{
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    dispararError(fila, columna);
                }
                break;
        }


        if(columna == limite){ // ultimo caracter de linea leido
            switch(posible_token){
                case "": break;
                case "cadena":break;
                case "cadena2":break;
                case "palabra":
                    if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                    palabraValidada(fila,columna);
                    bufferColaString = "";
                    posible_token = "";
                    break;
                case "numero_real_epsilon_completo":
                    posible_token = "numero";
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    break;
                default:
                    validarReiniciarAlEstadoInicial(fila,columna,false);
                    break;
            }
        }
    }
    private static void validarEpsilonBuffer3(int fila, int columna){
        char last_char = bufferColaString.charAt(bufferColaString.length()-1);
        if(last_char == '+' || last_char == '-'){
            bufferColaString = bufferColaString.substring(0, bufferColaString.length()-2);
            posible_token = "numero";
            validarReiniciarAlEstadoInicial(fila,columna,true);
            tokens.add(new Token("token_id","<id,e"+","+(fila+1)+","+(columna-1)+">",(fila+1),(columna-1)));// System.out.println("<id,e"+","+(fila+1)+","+(columna-1)+">"); -------------------------------------------------------------------------------------------------------
            tokens.add(new Token("token_"+(last_char == '+' ? "suma" : "resta"),"<token_"+(last_char == '+' ? "suma" : "resta")+","+(fila+1)+","+(columna)+">",(fila+1),columna));// System.out.println("<token_"+(last_char == '+' ? "suma" : "resta")+","+(fila+1)+","+(columna)+">"); -----------------------------------------------------------------
        }else{
            posible_token = "numero";
            validarReiniciarAlEstadoInicial(fila,columna,true);
        }
    }

    private static void validarCasoPalabra(char caracter,int fila, int columna, int limite){
        boolean generales = validarCasosGeneralesNoPrint(caracter);

        if(generales){

            if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _

            palabraValidada(fila,columna);

            if(caracter != ' ')
                tokens.add(new Token("token_"+posible_token,"<token_"+posible_token+","+(fila+1)+","+(columna+1)+">",(fila+1),(columna+1)));// System.out.println("<token_"+posible_token+","+(fila+1)+","+(columna+1)+">");
            bufferColaString = "";
            posible_token = "";
            return;
        }

        switch(caracter){
            /* OTROS CASOS GENERALES RESPECTO A UNA PALABRA */
            case '.':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                tokens.add(new Token("token_punto","<token_punto,"+(fila+1)+","+(columna+1)+">",(fila+1),(columna+1)));// System.out.println("<token_punto,"+(fila+1)+","+(columna+1)+">"); --------------------------------------------------------------------------------------
                bufferColaString = "";
                posible_token = "";
                columnaCapturadaInicio = columna;
                break;
            case '/':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = "/";
                posible_token = "division";
                columnaCapturadaInicio = columna;
                break;
            case '*':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                tokens.add(new Token("token_asterisco","<token_asterisco,"+(fila+1)+","+(columna+1)+">",(fila+1),(columna+1)));// System.out.println("<token_asterisco,"+(fila+1)+","+(columna+1)+">"); ---------------------------------------------------------------------------------
                bufferColaString = "";
                posible_token = "";
                columnaCapturadaInicio = columna;
                break;
            case '+':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = "+";
                posible_token = "suma";
                columnaCapturadaInicio = columna;
                break;
            case '-':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = "-";
                posible_token = "resta";
                columnaCapturadaInicio = columna;
                break;
            case '>':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = ">";
                posible_token = "mayor";
                columnaCapturadaInicio = columna;
                break;
            case '=':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = "=";
                posible_token = "igual";
                columnaCapturadaInicio = columna;
                break;
            case '<':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = "<";
                posible_token = "menor";
                columnaCapturadaInicio = columna;
                break;
            case '\"':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = "\"";
                posible_token = "cadena";
                columnaCapturadaInicio = columna;
                break;
            case '\'':
                if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                palabraValidada(fila,columna);
                bufferColaString = "\'";
                posible_token = "cadena2";
                columnaCapturadaInicio = columna;
                break;
            default:
                int ascii = (int) caracter;
                if((ascii >= 65 && ascii <= 90 || ascii == 95)||(ascii >= 97 && ascii <= 122)||(ascii >= 48 && ascii <= 57) || caracter=='ñ' || caracter=='Ñ')
                    bufferColaString += caracter;
                else{
                    palabraValidada(fila,columna);
                    dispararError(fila, columna);
                }
                break;
        }

        comprobacionFinalLinea(fila, columna, limite);
    }
    private static void validarCasoComentarioMultiplesLineas(char caracter){
        switch(caracter){
            case '*':
                posible_token = "fin_comentario";
                break;
        }
    }
    private static void validarCasoPosibleFinComentarioMultiplesLineas(char caracter){
        switch(caracter){
            case '/':
                posible_token = "";
                break;
            default:
                posible_token = "comentario";
        }
    }



    private static boolean validarCasosGenerales(char caracter,int fila, int columna, boolean flag){
        switch(caracter){
            case ' ':
                validarReiniciarAlEstadoInicial(fila, columna, flag);
                return true;
            case ';':
                validarUnicoSimbolo(';',"punto_y_coma",fila,columna, flag);
                return true;
            case ':':
                validarUnicoSimbolo(':',"dos_puntos",fila,columna, flag);
                return true;
            case '[':
                validarUnicoSimbolo('[',"corch_izq",fila,columna, flag);
                return true;
            case ']':
                validarUnicoSimbolo(']',"corch_der",fila,columna, flag);
                return true;
            case '{':
                validarUnicoSimbolo('{',"llave_izq",fila,columna, flag);
                return true;
            case '}':
                validarUnicoSimbolo('}',"llave_der",fila,columna, flag);
                return true;
            case ',':
                validarUnicoSimbolo(',',"coma",fila,columna, flag);
                return true;
            case '^':
                validarUnicoSimbolo('^',"exponente",fila,columna, flag);
                return true;
            case '%':
                validarUnicoSimbolo('%',"modulo",fila,columna, flag);
                return true;
            case '(':
                validarUnicoSimbolo('(',"parent_izq",fila,columna, flag);
                return true;
            case ')':
                validarUnicoSimbolo(')',"parent_der",fila,columna, flag);
                return true;
        }
        return false;
    }
    private static boolean validarCasosGeneralesNoPrint(char caracter){
        switch(caracter){
            case ' ': return true;
            case ';': posible_token="punto_y_coma"; return true;
            case ':': posible_token="dos_puntos"; return true;
            case '[': posible_token="corch_izq"; return true;
            case ']': posible_token="corch_der"; return true;
            case '{': posible_token="llave_izq"; return true;
            case '}': posible_token="llave_der"; return true;
            case ',': posible_token="coma"; return true;
            case '^': posible_token="exponente"; return true;
            case '%': posible_token="modulo"; return true;
            case '(': posible_token="parent_izq"; return true;
            case ')': posible_token="parent_der"; return true;
        }
        return false;
    }

    private static void palabraValidada(int fila, int columna){

        if(Arrays.binarySearch(logicos, bufferColaString) >= 0)
            tokens.add(new Token("token_logico","<token_logico,"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">",(fila+1),(columnaCapturadaInicio+1)));// System.out.println("<token_logico,"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">");-------------------------------------------------------
        else if(Arrays.binarySearch(reservadas, bufferColaString) >= 0)
            tokens.add(new Token(bufferColaString,"<"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">",(fila+1),(columnaCapturadaInicio+1)));// System.out.println("<"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">"); -------------------------------------------------------------------------------
        else if(Arrays.binarySearch(func_primitivas, bufferColaString) >= 0)
            tokens.add(new Token(bufferColaString,"<"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">",(fila+1),(columnaCapturadaInicio+1)));// System.out.println("<"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">"); ----------------------------------------------------------------------------------
        else
            tokens.add(new Token("token_id","<id,"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">",(fila+1),(columnaCapturadaInicio+1)));// System.out.println("<id,"+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">"); ---------------------------------------------------------------------------
    }
    private static void validarUnicoSimbolo(char caracter, String nombre,int fila, int columna, boolean flag){
        validarReiniciarAlEstadoInicial(fila, columna, flag);
        tokens.add(new Token("token_"+nombre,"<token_"+nombre+","+(fila+1)+","+(columna+1)+">",(fila+1),(columna+1)));// System.out.println("<token_"+nombre+","+(fila+1)+","+(columna+1)+">");---------------------------------------------------------------------------------
    }
    private static void validarReiniciarAlEstadoInicial(int fila, int columna, boolean flag){
        if(!posible_token.isEmpty()){
            if(flag)
                tokens.add(new Token("token_"+posible_token,"<token_"+posible_token+","+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">",(fila+1),(columnaCapturadaInicio+1)));// System.out.println("<token_"+posible_token+","+bufferColaString+","+(fila+1)+","+(columnaCapturadaInicio+1)+">"); ------------------------------------------------------
            else
                tokens.add(new Token("token_"+posible_token,"<token_"+posible_token+","+(fila+1)+","+(columnaCapturadaInicio+1)+">",(fila+1),(columnaCapturadaInicio+1)));// System.out.println("<token_"+posible_token+","+(fila+1)+","+(columnaCapturadaInicio+1)+">");------------------------------------------------------------------
            bufferColaString = "";
            posible_token = "";
        }
    }
    private static void comprobacionFinalLinea(int fila, int columna, int limite){
        if(columna == limite){ // ultimo caracter de linea leido
            switch(posible_token){
                case "": break;
                case "cadena":
                    dispararError(fila, columna);
                    break;
                case "cadena2":
                    dispararError(fila, columna);
                    break;
                case "comentario":break;
                case "palabra":
                    if(tokenRayaPisoNoValido()){dispararError(fila, columna);return;} // unicamente se leyo raya al piso _
                    palabraValidada(fila,columna);
                    bufferColaString = "";
                    posible_token = "";
                    break;
                case "numero":
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    break;
                case "numero_real":
                    bufferColaString += "0";
                    validarReiniciarAlEstadoInicial(fila,columna,true);
                    break;
                case "numero_real_epsilon":
                    validarSimboloBuffer2('e', "e", fila, columna+1, false);
                    break;
                default:
                    validarReiniciarAlEstadoInicial(fila,columna,false);
                    break;
            }
        }
    }
    private static void dispararError(int fila, int columna){
        bufferColaString = "";
        posible_token = "";
        flagColumnIteratorBreak = true;
        flagRowIteratorBreak = true;
        tokens.add(new Token("error","Error lexico(linea:"+(fila+1)+" , posicion:"+columna+")",(fila+1),columna));// System.out.println("Error lexico(linea:"+(fila+1)+" , posicion:"+columna+")");
    }

    private static boolean tokenRayaPisoNoValido(){
        if(bufferColaString.equals("_"))
            return true;
        return false;
    }
}










//COMIENZA SINTACTICO XDDDDDDDD
class AnalizadorSintactico {

  public ArrayList<Token> tokens;
  public Token tokenActual;
public int pp=0;
  void emparejar(String tokenEsperado) {
	  System.out.println("Se emparejo......."+tokenActual.nombreToken);
    if(tokenActual.nombreToken.equals(tokenEsperado)) {
    	
      tokenActual = tokens.get(pp); pp++;}
    
    else {errorSintaxis(tokenEsperado);}
  }

  void errorSintaxis(String ... tokens){
    System.out.println("Se encontro " + tokenActual.nombreToken + " " + tokenActual.fila+ " " +tokenActual.columna + ". Se esperaba: ");
    for(String s: tokens)
      System.out.println(" \"" + s + "\",");

    	System.exit(1);
    	
  }

  public void iniciarSintactico(ArrayList<Token> tokens) {
	this.tokens = tokens;
    tokenActual = tokens.remove(0);
    
    FUENTE();
    
    if(!tokenActual.nombreToken.equals("$"))
    	errorSintaxis("$");
    else
    	System.out.println("El analisis sintactico ha finalizado exitosamente.");
  }

  ///VARIABLES NO TERMINALES


void FUENTE(){System.out.println("FUENTE");
  if( tokenActual.nombreToken.equals("programa") || tokenActual.nombreToken.equals("const") || tokenActual.nombreToken.equals("var") ||
		  tokenActual.nombreToken.equals("tipos") || tokenActual.nombreToken.equals("inicio")){
TITULO_PROGRAMA();CTV();MAIN();SUBRUTINAS();

  } else {
	  
	  errorSintaxis("programa", "const", "var", "tipos", "inicio");
  }

}

void TITULO_PROGRAMA(){System.out.println("TITULO_PROGRAMA");
  if(tokenActual.nombreToken.equals( "programa" )){
emparejar("programa");emparejar("token_id");
  } else if( tokenActual.nombreToken.equals("const") || tokenActual.nombreToken.equals("var") || tokenActual.nombreToken.equals("tipos") ||tokenActual.nombreToken.equals( "inicio")){

  } else  {
	  
	  errorSintaxis("programa","const","var", "tipos","inicio");
  }

}
void CTV(){System.out.println("CTV");
  if( tokenActual.nombreToken.equals("const")){
CONST();CTV();
  } else if(tokenActual.nombreToken.equals( "var")){
VAR();CTV();
  } else if( tokenActual.nombreToken.equals("tipos")){
TIPOS();CTV();
  } else if( tokenActual.nombreToken.equals("inicio")){

  } else  {
	  
	  errorSintaxis("const","var","tipos","inicio");
  }
}

void CONST(){System.out.println("CONST");
  if(tokenActual.nombreToken.equals( "const")){
emparejar("const");DECLARAR_CONST();
  } else  {
	  errorSintaxis("const");
  }
}

void VAR(){System.out.println("VAR");
  if(tokenActual.nombreToken.equals( "var")){
emparejar("var");DECLARAR_VAR();
  } else {
	  
	  errorSintaxis("var");
  }
}

void TIPOS(){System.out.println("TIPOS");
  if( tokenActual.nombreToken.equals("tipos")){
emparejar("tipos");DECLARAR_TIPOS();
  } else {
	  errorSintaxis("tipos");
  }
}
void MAIN() {System.out.println("MAIN");
  if(tokenActual.nombreToken.equals( "inicio")){
emparejar("inicio");CUERPO_MAIN();emparejar("fin");
  } else {
	  errorSintaxis("inicio");
  }
}

void DECLARAR_CONST(){System.out.println("DECLARAR_CONST");
  if( tokenActual.nombreToken.equals("token_id")){
LVALUE();emparejar("token_igual");EXPRESION();SEPARADOR();DECLARAR_CONST();
  } else if( tokenActual.nombreToken.equals( "const") || tokenActual.nombreToken.equals("var") || tokenActual.nombreToken.equals("tipos") ||tokenActual.nombreToken.equals( "inicio")){

  } else { 
	  errorSintaxis("token_id","const","var","tipos","inicio");
  }
}

void LVALUE(){System.out.println("LVALUE");
 if( tokenActual.nombreToken.equals("token_id")){
emparejar("token_id");LVALUE_PRIMA();
  } else  {
	  
	  errorSintaxis("token_id");
  }
}

void LVALUE_PRIMA(){System.out.println("LVALUE_PRIMA");
if(tokenActual.nombreToken.equals( "token_corch_izq")){
emparejar("token_corch_izq");ARG();emparejar("token_corch_der");
  } else if(tokenActual.nombreToken.equals( "token_punto") || tokenActual.nombreToken.equals("token_igual") || tokenActual.nombreToken.equals("token_suma") ||tokenActual.nombreToken.equals( "token_resta") ||tokenActual.nombreToken.equals("token_asterisco") || tokenActual.nombreToken.equals("token_division") ||tokenActual.nombreToken.equals( "token_modulo") ||tokenActual.nombreToken.equals( "token_exponente") ||tokenActual.nombreToken.equals( "and") ||tokenActual.nombreToken.equals( "or") ||tokenActual.nombreToken.equals( "not") 
  ||tokenActual.nombreToken.equals( "token_menor") || tokenActual.nombreToken.equals("token_mayor") ||tokenActual.nombreToken.equals( "token_menor_o_igual") || tokenActual.nombreToken.equals("token_mayor_o_igual")
  ||tokenActual.nombreToken.equals( "token_igual_igual") ||tokenActual.nombreToken.equals( "token_diferente") ||tokenActual.nombreToken.equals( "token_parent_der") ||tokenActual.nombreToken.equals( "token_coma") ||tokenActual.nombreToken.equals("token_corch_der") ||tokenActual.nombreToken.equals( "token_llave_der") ||tokenActual.nombreToken.equals(
  "token_punto_y_coma") ||tokenActual.nombreToken.equals( "token_id") ||tokenActual.nombreToken.equals( "mientras") ||tokenActual.nombreToken.equals( "repetir") ||tokenActual.nombreToken.equals(
  "desde") ||tokenActual.nombreToken.equals( "eval") ||tokenActual.nombreToken.equals( "si") ||tokenActual.nombreToken.equals( "fin") ||tokenActual.nombreToken.equals( "retorna") ||tokenActual.nombreToken.equals( "sino")
  ||tokenActual.nombreToken.equals("caso") ||tokenActual.nombreToken.equals( "paso") || tokenActual.nombreToken.equals("token_llave_izq") || tokenActual.nombreToken.equals( "token_coma")){
ATRIBUTO();
  } else  {
	  errorSintaxis("token_corch_izq","token_punto","token_igual", "token_suma" , "token_resta" ,"token_asterisco", "token_division" ,"token_modulo" , "token_exponente" , "and" , "or" , "not" 
  , "token_menor" , "token_mayor" , "token_menor_o_igual" , "token_mayor_o_igual"
  , "token_igual_igual" , "token_diferente" , "token_parent_der" , "token_coma" ,"token_corch_der" , "token_llave_der" ,
  "token_punto_y_coma" , "token_id" , "mientras" , "repetir",
  "desde" , "eval" , "si" , "fin" , "retorna" , "sino"
  ,"caso" , "paso" , "token_llave_izq", "token_coma"); }
}
void EXPRESION(){System.out.println("EXPRESION");
 if(tokenActual.nombreToken.equals("token_suma") || tokenActual.nombreToken.equals("token_resta") || tokenActual.nombreToken.equals("not") || tokenActual.nombreToken.equals("token_cadena") || tokenActual.nombreToken.equals("token_numero") || tokenActual.nombreToken.equals("token_numero_real") ||tokenActual.nombreToken.equals("token_logico") ||tokenActual.nombreToken.equals( "token_llave_izq") || tokenActual.nombreToken.equals( "token_id") || tokenActual.nombreToken.equals( "token_parent_izq") ){
    TK_GENERAL();CUERPO_OPERADORES();
  }else  { 
	  errorSintaxis("token_suma", "token_resta", "token_cadena","token_numero","token_numero_real","token_logico" , "token_llave_izq" , "token_id", "token_parent_izq", "not");
  }

}
void CUERPO_OPERADORES(){System.out.println("CUERPO_OPERADORES");
  if(tokenActual.nombreToken.equals("token_suma") || tokenActual.nombreToken.equals("token_resta") ||tokenActual.nombreToken.equals("token_asterisco") ||tokenActual.nombreToken.equals( "token_division") ||tokenActual.nombreToken.equals( "token_modulo") ||tokenActual.nombreToken.equals( "token_exponente") ||tokenActual.nombreToken.equals( "and") ||tokenActual.nombreToken.equals( "or") ||tokenActual.nombreToken.equals( "not" )
  ||tokenActual.nombreToken.equals( "token_menor") ||tokenActual.nombreToken.equals( "token_mayor") ||tokenActual.nombreToken.equals( "token_menor_o_igual") || tokenActual.nombreToken.equals("token_mayor_o_igual")
  ||tokenActual.nombreToken.equals( "token_igual_igual") ||tokenActual.nombreToken.equals( "token_diferente") || tokenActual.nombreToken.equals( "token_coma")){
OPERADOR();EXPRESION();
  }else if(tokenActual.nombreToken.equals("token_punto_y_coma") ||tokenActual.nombreToken.equals("token_id") ||tokenActual.nombreToken.equals("mientras") ||tokenActual.nombreToken.equals("repetir") ||tokenActual.nombreToken.equals(
  "desde") ||tokenActual.nombreToken.equals("eval") ||tokenActual.nombreToken.equals("si") ||tokenActual.nombreToken.equals("fin") ||tokenActual.nombreToken.equals("token_llave_der") ||tokenActual.nombreToken.equals("retorna") ||tokenActual.nombreToken.equals(
  "sino") ||tokenActual.nombreToken.equals("caso") ||tokenActual.nombreToken.equals("paso") ||tokenActual.nombreToken.equals("token_llave_izq") ||
  tokenActual.nombreToken.equals("const")||
  tokenActual.nombreToken.equals("var")||
  tokenActual.nombreToken.equals("inicio")||
  tokenActual.nombreToken.equals("tipos") ||  tokenActual.nombreToken.equals("hasta") ||  tokenActual.nombreToken.equals("token_parent_der")){
    
  }else {
	  
	  errorSintaxis("tipos","inicio","const","var","token_suma", "token_resta", "token_asterisco", "token_division", "token_modulo", "token_exponente", "and",
			  "or", "not", "token_menor", "token_mayor", "token_menor_o_igual", "token_mayor_o_igual", "token_igua_igual", "token_diferente",
			  "token_punto_y_coma", "token_id", "mientras", "repetir", "desde", "eval", "si", "fin", "token_llave_der", "retorna",
			  "sino", "caso", "paso", "token_llave_izq", "token_llave_izq", "token_coma", "hasta", "token_parent_der");
  }

}
void OPERADOR(){System.out.println("OPERADOR");
  if(tokenActual.nombreToken.equals("token_suma")){
emparejar("token_suma");
  }else if(tokenActual.nombreToken.equals("token_resta")){
emparejar("token_resta");
  }else if(tokenActual.nombreToken.equals("token_asterisco")){
emparejar("token_asterisco");
  }else if(tokenActual.nombreToken.equals("token_division")){
emparejar("token_division");
  }else if(tokenActual.nombreToken.equals("token_coma")){
emparejar("token_coma");
  }
  else if(tokenActual.nombreToken.equals("token_modulo")){
emparejar("token_modulo");
  }else if(tokenActual.nombreToken.equals("token_exponente")){
emparejar("token_exponente");
  }else if(tokenActual.nombreToken.equals("and")){
emparejar("and");
  }else if(tokenActual.nombreToken.equals("or")){
emparejar("or");
  }else if(tokenActual.nombreToken.equals("not")){
emparejar("not");
  }else if(tokenActual.nombreToken.equals("token_menor")){
emparejar("token_menor");
  }else if(tokenActual.nombreToken.equals("token_mayor")){
emparejar("token_mayor");
  }else if(tokenActual.nombreToken.equals("token_menor_o_igual")){
emparejar("token_menor_o_igual");
  }else if(tokenActual.nombreToken.equals("token_mayor_o_igual")){
emparejar("token_mayor_o_igual");
  }else if(tokenActual.nombreToken.equals("token_igual_igual")){
emparejar("token_igual_igual");
  }else if(tokenActual.nombreToken.equals("token_diferente")){
emparejar("token_diferente");
  }else {
	  
	  errorSintaxis("token_suma" , "token_resta" ,"token_asterisco", "token_division" ,"token_modulo" , "token_exponente" , "and" , "or" , "not" 
  , "token_menor" , "token_mayor" , "token_menor_o_igual" , "token_mayor_o_igual"
  , "token_igual_igual" , "token_diferente", "token_coma"); }
  
}
void TK_GENERAL(){ System.out.println("TK_GENERAL");
	
  if(tokenActual.nombreToken.equals("token_cadena")){
emparejar("token_cadena");
  }else if(tokenActual.nombreToken.equals("token_parent_izq")){
	  emparejar("token_parent_izq");
	  EXPRESION();
	  emparejar("token_parent_der");
  }else if(tokenActual.nombreToken.equals("token_numero")){
emparejar("token_numero");
  }else if(tokenActual.nombreToken.equals("token_numero_real")){
emparejar("token_numero_real"); 
  }else if(tokenActual.nombreToken.equals("token_logico" )){
emparejar("token_logico");
  }else if(tokenActual.nombreToken.equals("token_llave_izq")){
emparejar("token_llave_izq");ARG();emparejar("token_llave_der");
  }else if(tokenActual.nombreToken.equals("token_id")){
LVALUE_OR_LLAMADO_SUB();
  }else if(tokenActual.nombreToken.equals("not")) {
	  emparejar("not");
	  TK_GENERAL();
  }else if(tokenActual.nombreToken.equals("token_suma")) {
	  emparejar("token_suma");
	  NUMERO();
  }else if(tokenActual.nombreToken.equals("token_resta")) {
	  emparejar("token_resta");
	  NUMERO();
  }
  else  {
	 
	  errorSintaxis("token_cadena","token_numero","token_numero_real","token_logico","token_llave_izq","token_id", "token_parent_izq", "not" );
  }
  
}



void NUMERO() {
	System.out.println("NUMERO");
	if(tokenActual.nombreToken.equals("token_numero")){
		emparejar("token_numero");
		  }else if(tokenActual.nombreToken.equals("token_numero_real")){
		emparejar("token_numero_real"); 
		  }else
			  errorSintaxis("token_numero", "token_numero_real");
		 
}

void LVALUE_OR_LLAMADO_SUB(){System.out.println("LVALUE_OR_LLAMADO_SUB");
  if(tokenActual.nombreToken.equals("token_id")){
    emparejar("token_id");LVALUE_OR_LLAMADO_SUB_PRIMA();
  }else  {
	  
	  errorSintaxis("token_id");
  }
}
void LVALUE_OR_LLAMADO_SUB_PRIMA(){System.out.println("LVALUE_OR_LLAMADO_SUB_PRIMA");
  if(tokenActual.nombreToken.equals("token_punto") ||tokenActual.nombreToken.equals( "token_corch_izq" ) || tokenActual.nombreToken.equals( "token_suma") ||tokenActual.nombreToken.equals( "token_resta") ||tokenActual.nombreToken.equals("token_asterisco") ||tokenActual.nombreToken.equals( "token_division") ||tokenActual.nombreToken.equals( "token_modulo") ||tokenActual.nombreToken.equals( "token_exponente") ||tokenActual.nombreToken.equals( "and") ||tokenActual.nombreToken.equals( "or") || tokenActual.nombreToken.equals("not") 
  ||tokenActual.nombreToken.equals( "token_menor") ||tokenActual.nombreToken.equals( "token_mayor") ||tokenActual.nombreToken.equals( "token_menor_o_igual") ||tokenActual.nombreToken.equals( "token_mayor_o_igual")
  ||tokenActual.nombreToken.equals( "token_igual_igual") || tokenActual.nombreToken.equals("token_diferente") || tokenActual.nombreToken.equals("token_parent_der") ||tokenActual.nombreToken.equals( "token_coma") ||tokenActual.nombreToken.equals("token_corch_der") ||tokenActual.nombreToken.equals( "token_llave_der") ||tokenActual.nombreToken.equals(
  "token_punto_y_coma") ||tokenActual.nombreToken.equals( "token_id") ||tokenActual.nombreToken.equals( "mientras") ||tokenActual.nombreToken.equals( "repetir") ||tokenActual.nombreToken.equals(
  "desde") ||tokenActual.nombreToken.equals( "eval") ||tokenActual.nombreToken.equals( "si") ||tokenActual.nombreToken.equals( "fin") ||tokenActual.nombreToken.equals( "retorna") || tokenActual.nombreToken.equals("sino")
  ||tokenActual.nombreToken.equals("caso") ||tokenActual.nombreToken.equals( "paso") || tokenActual.nombreToken.equals( "token_llave_izq") || tokenActual.nombreToken.equals( "token_coma")){
LVALUE_PRIMA();
  }else if(tokenActual.nombreToken.equals("token_parent_izq")){
emparejar("token_parent_izq");ARG();emparejar("token_parent_der");
  }else  {
	  
	 errorSintaxis("token_punto" , "token_corch_izq" , "token_suma" , "token_resta" ,"token_asterisco" , "token_division" , "token_modulo" , "token_exponente" , "and" , "or" , "not" 
  , "token_menor" , "token_mayor" , "token_menor_o_igual" , "token_mayor_o_igual"
  , "token_igual_igual" , "token_diferente" , "token_parent_der" , "token_coma" ,"token_corch_der" , "token_llave_der" ,
  "token_punto_y_coma" , "token_id" , "mientras" , "repetir",
  "desde" , "eval" , "si" , "fin" , "retorna" , "sino"
  ,"caso" , "paso" , "token_llave_izq","token_par_izq", "token_coma");
	 
  }
}

void LLAMADO_SUB(){System.out.println("LLAMADO_SUB");
  if(tokenActual.nombreToken.equals("token_id")){
    emparejar("token_id"); emparejar("token_parent_izq"); ARG(); emparejar("token_parent_der");
  }else {
	  
	  errorSintaxis("token_id");
  }
}

void ARG(){
	System.out.println("ARG");
  if(tokenActual.nombreToken.equals("token_suma") || tokenActual.nombreToken.equals("token_resta") || tokenActual.nombreToken.equals("not") || tokenActual.nombreToken.equals("token_cadena") ||tokenActual.nombreToken.equals("token_numero") ||tokenActual.nombreToken.equals("token_numero_real") || tokenActual.nombreToken.equals("token_logico")|| tokenActual.nombreToken.equals("token_llave_izq") || tokenActual.nombreToken.equals("token_id") || tokenActual.nombreToken.equals("token_parent_izq")){
    TK_GENERAL();ARG_MULT();
  }else if(tokenActual.nombreToken.equals("token_parent_der") ||tokenActual.nombreToken.equals( "token_corch_der") ||tokenActual.nombreToken.equals( "token_llave_der")){

  }else  { 
	  System.out.println("ARG"); 
	  errorSintaxis("token_resta", "token_suma", "not", "token_cadena","token_numero","token_numero_real", "token_logico","token_llave_izq","token_id","token_parent_der" , "token_corch_der" , "token_llave_der", "token_parent_izq");
	  }
}
void ARG_MULT(){System.out.println("ARG_MULT");
	
  if(tokenActual.nombreToken.equals("token_coma")){
emparejar("token_coma");TK_GENERAL();ARG_MULT();    
  }else if(tokenActual.nombreToken.equals( "token_parent_der" )|| tokenActual.nombreToken.equals( "token_corch_der") || tokenActual.nombreToken.equals( "token_llave_der")){
    
  }else  { errorSintaxis("token_coma","token_parent_der","token_corch_der","token_llave_der");  }
}
void ATRIBUTO(){System.out.println("ATRIBUTO");
  if(tokenActual.nombreToken.equals("token_punto")){
emparejar("token_punto");emparejar("token_id");ATRIBUTO();
  }else if(tokenActual.nombreToken.equals("token_coma") ||tokenActual.nombreToken.equals("token_corch_der") ||tokenActual.nombreToken.equals("token_llave_der") ||tokenActual.nombreToken.equals("token_parent_der") ||tokenActual.nombreToken.equals("token_igual") ||tokenActual.nombreToken.equals("token_suma") ||tokenActual.nombreToken.equals( "token_resta") ||tokenActual.nombreToken.equals("token_asterisco") || tokenActual.nombreToken.equals("token_division") || tokenActual.nombreToken.equals("token_modulo") ||tokenActual.nombreToken.equals( "token_exponente") ||tokenActual.nombreToken.equals( "and") ||tokenActual.nombreToken.equals( "or") ||tokenActual.nombreToken.equals( "not") 
  ||tokenActual.nombreToken.equals( "token_menor") ||tokenActual.nombreToken.equals( "token_mayor") || tokenActual.nombreToken.equals("token_menor_o_igual") ||tokenActual.nombreToken.equals( "token_mayor_o_igual")
  || tokenActual.nombreToken.equals("token_igual_igual") ||tokenActual.nombreToken.equals( "token_diferente") ||tokenActual.nombreToken.equals("token_punto_y_coma") ||tokenActual.nombreToken.equals("fin") ||tokenActual.nombreToken.equals(
  "retorna") ||tokenActual.nombreToken.equals("sino") || tokenActual.nombreToken.equals("caso") || tokenActual.nombreToken.equals("token_coma") || tokenActual.nombreToken.equals("token_id") ||
  tokenActual.nombreToken.equals("mientras") || tokenActual.nombreToken.equals("repetir") || tokenActual.nombreToken.equals("desde") ||  tokenActual.nombreToken.equals("eval")  || 
  tokenActual.nombreToken.equals("si") || tokenActual.nombreToken.equals("token"
  		+ "token_llave_izq") || tokenActual.nombreToken.equals("paso") || tokenActual.nombreToken.equals("token_id")){

	 
	  
	  
  }else {   errorSintaxis("token_punto","token_coma","token_corch_der","token_llave_der","token_parent_der","token_igual","token_suma" , "token_resta" ,"token_asterisco" , "token_division" , "token_modulo" , "token_exponente" , "and" , "or" , "not" 
  , "token_menor" , "token_mayor" , "token_menor_o_igual" , "token_mayor_o_igual"
  , "token_igual_igual" , "token_diferente","token_punto_y_coma","fin",
  "retorna","sino","caso", "token_coma", "token_id"); }
}
void SEPARADOR(){ System.out.println("SEPARADOR");
  if(tokenActual.nombreToken.equals("token_punto_y_coma")){
    emparejar("token_punto_y_coma");
  }else if(tokenActual.nombreToken.equals("mientras") ||tokenActual.nombreToken.equals("repetir") ||tokenActual.nombreToken.equals("desde") ||tokenActual.nombreToken.equals("eval") ||tokenActual.nombreToken.equals("si") ||tokenActual.nombreToken.equals("token_id")
  || tokenActual.nombreToken.equals("token_llave_der") ||tokenActual.nombreToken.equals("retorna") ||tokenActual.nombreToken.equals("sino") ||tokenActual.nombreToken.equals("caso")||
  tokenActual.nombreToken.equals("inicio")||
  tokenActual.nombreToken.equals("var")||
  tokenActual.nombreToken.equals("tipos")||
  tokenActual.nombreToken.equals("const") || tokenActual.nombreToken.equals("fin")
  ){
    
  }else  { errorSintaxis("const","var","tipos","inicio","token_punto_y_coma","token_punto","mientras","repetir","desde","eval","si","token_id","token_llave_der","retorna","sino","caso", "fin"); }
}

void DECLARAR_TIPOS() {System.out.println("DECLARAR_TIPOS");
  if(tokenActual.nombreToken.equals("token_id")){
emparejar("token_id"); LISTA(); emparejar("token_dos_puntos"); TIPO_DECLARACION_TIPO(); SEPARADOR(); DECLARAR_TIPOS();
  } else if(tokenActual.nombreToken.equals("tipo")||
  tokenActual.nombreToken.equals("inicio")||
  tokenActual.nombreToken.equals("const")||
  tokenActual.nombreToken.equals("var")){

  } else {  errorSintaxis("token_id","tipo","inicio","const","var");  }
}

void LISTA() {System.out.println("LISTA");
  if(tokenActual.nombreToken.equals("token_coma")){
  emparejar("token_coma");emparejar("token_id");LISTA(); 
  }else  if(tokenActual.nombreToken.equals( "const") || tokenActual.nombreToken.equals("var") || tokenActual.nombreToken.equals("tipos") || tokenActual.nombreToken.equals( "inicio") || tokenActual.nombreToken.equals( "token_dos_puntos")){

  }else { errorSintaxis("const" , "var" , "tipos" , "inicio", "token_coma"); }
}
void TIPO_DECLARACION_TIPO() {System.out.println("TIPO_DECLARACION_TIPO");
   if(tokenActual.nombreToken.equals("vector")){
	   emparejar("vector");
     EXP_VECTOR();
   }else  if(tokenActual.nombreToken.equals("matriz")){
	   emparejar("matriz");
EXP_MATRIZ();
   }else  if(tokenActual.nombreToken.equals("registro")){
	   emparejar("registro");
EXP_REGISTRO();
   }else  if(tokenActual.nombreToken.equals("cadena") || tokenActual.nombreToken.equals("numerico") || tokenActual.nombreToken.equals("logico")){
   TIPO_DATO_TIPO();  
   }
  else { errorSintaxis("token_cadena","numerico","logico"
  ,"registro","vector","matriz");  }
}

void EXP_VECTOR() {System.out.println("EXP_VECTOR");
  if(tokenActual.nombreToken.equals("token_corch_izq")){
    emparejar("token_corch_izq");DIM();LISTA_DIM();emparejar("token_corch_der");TIPO_DATO_TIPO();
  }else  { errorSintaxis("token_corch_izq"); }
}

void DIM() {System.out.println("DIM");
  if(tokenActual.nombreToken.equals("token_numero")){ 
    emparejar("token_numero");
  } else if(tokenActual.nombreToken.equals("token_numero_real")){
emparejar("token_numero_real");
  }else if(tokenActual.nombreToken.equals("token_asterisco")){
emparejar("token_asterisco");
  }else {errorSintaxis("token_numero","token_asterisco"); }
}
void LISTA_DIM() {System.out.println("LISTA_DIM");
  if(tokenActual.nombreToken.equals("token_coma")){
emparejar("token_coma");DIM();LISTA_DIM();
  }else if(tokenActual.nombreToken.equals("token_corch_der")){

  }else {
	  errorSintaxis("token_coma","token_corch_der"); }
}

void EXP_MATRIZ() {System.out.println("EXP_MATRIZ");

  if(tokenActual.nombreToken.equals("token_corch_izq")){
    emparejar("token_corch_izq");DIM();emparejar("token_coma");LISTA_DIM();
     emparejar("token_corch_der");TIPO_DATO_TIPO();
  }else {
	  errorSintaxis("token_corch_izq");}
}

void EXP_REGISTRO() {System.out.println("EXP_REGISTRO");
  if(tokenActual.nombreToken.equals("token_llave_izq")){
emparejar("token_llave_izq");DECLARAR_VAR();emparejar("token_llave_der");
  }else {
	  errorSintaxis("token_llave_izq");}
}

void TIPO_DATO_TIPO() {System.out.println("TIPO_DATO_TIPO");
  if(tokenActual.nombreToken.equals("cadena")){
emparejar("cadena");
  }else if(tokenActual.nombreToken.equals("numerico")){
    emparejar("numerico");
  }else if(tokenActual.nombreToken.equals("logico")){
    emparejar("logico");
  }else {
	  errorSintaxis("cadena","numerico","logico");}
}

void DECLARAR_VAR() {System.out.println("DECLARAR_VAR");
  if(tokenActual.nombreToken.equals("token_id")){
emparejar("token_id");System.out.println("LLEGO"); LISTA(); emparejar("token_dos_puntos"); TIPO_DECLARACION_VAR(); SEPARADOR(); DECLARAR_VAR();
  }else if (tokenActual.nombreToken.equals("const") || tokenActual.nombreToken.equals("var") || tokenActual.nombreToken.equals("tipos") ||
		  tokenActual.nombreToken.equals("inicio") || tokenActual.nombreToken.equals("token_llave_der")){}
  else {
   errorSintaxis("token_id", "const","tipos","inicio","var");  }
}

void TIPO_DECLARACION_VAR() {System.out.println("TIPO_DECLARACION_VAR");
  if(tokenActual.nombreToken.equals("vector")){
    emparejar("vector");EXP_VECTOR_VAR();
  }else if(tokenActual.nombreToken.equals("matriz")){
emparejar("matriz");EXP_MATRIZ_VAR();
  }else if(tokenActual.nombreToken.equals("registro")){
emparejar("registro");EXP_REGISTRO_VAR();
  }else if(tokenActual.nombreToken.equals("cadena") || tokenActual.nombreToken.equals("numerico") || tokenActual.nombreToken.equals("logico") || tokenActual.nombreToken.equals("token_id")){
TIPO_DATO_VAR();
  }else { errorSintaxis("vector","matriz","registro","cadena" , "numerico" ,  "logico" , "token_id");  }
}

void EXP_VECTOR_VAR() {System.out.println("EXP_VECTOR_VAR");
  if(tokenActual.nombreToken.equals("token_corch_izq")){
emparejar("token_corch_izq");DIM_VAR();LISTA_DIM_VAR();emparejar("token_corch_der");TIPO_DATO_VAR();
  }else {  errorSintaxis("token_corch_izq"); }
}

void DIM_VAR() { System.out.println("DIM_VAR");
  if(tokenActual.nombreToken.equals("token_numero")){
emparejar("token_numero");
  }else if(tokenActual.nombreToken.equals("token_numero_real")){
emparejar("token_numero_real");
  }else if(tokenActual.nombreToken.equals("token_asterisco")){
emparejar("token_asterisco");
  }else if(tokenActual.nombreToken.equals("token_id")){
    emparejar("token_id");
  }else {  errorSintaxis("token_numero","token_asterisco","token_id"); }
}

void LISTA_DIM_VAR() {System.out.println("LISTA_DIM_VAR");
  if(tokenActual.nombreToken.equals("token_coma")){
    emparejar("token_coma");DIM_VAR();LISTA_DIM_VAR();
  }else if(tokenActual.nombreToken.equals("token_corch_der")){

  }else { errorSintaxis("token_coma","token_corch_der");  }
}

void EXP_MATRIZ_VAR() {System.out.println("EXP_MATRIZ_VAR");
  if(tokenActual.nombreToken.equals("token_corch_izq")){
    emparejar("token_corch_izq");DIM_VAR();emparejar("token_coma"); DIM(); LISTA_DIM_VAR();emparejar("token_corch_der");TIPO_DATO_VAR();
  }
  else { errorSintaxis("token_corch_izq");}
}
void EXP_REGISTRO_VAR() {System.out.println("EXP_REGISTRO_VAR");
  if(tokenActual.nombreToken.equals("token_llave_izq")){
   emparejar("token_llave_izq");DECLARAR_VAR();emparejar("token_llave_der"); 
  }
  else {  errorSintaxis("token_llave_izq");  }
}

void TIPO_DATO_VAR() {System.out.println("TIPO_DATO_VAR");
  if(tokenActual.nombreToken.equals("cadena")){
    emparejar("cadena");
  }
  else if(tokenActual.nombreToken.equals("numerico" )){
emparejar("numerico");
  }

  else if(tokenActual.nombreToken.equals("logico")){
    emparejar("logico");
  }
  else if(tokenActual.nombreToken.equals("token_id")){
   emparejar("token_id"); 
  }
  else {errorSintaxis("numerico","cadena","logico","token_id");  }
}

void CUERPO_MAIN() {System.out.println("CUERPO_MAIN");
  if(tokenActual.nombreToken.equals("token_id") || tokenActual.nombreToken.equals("token_par_izq") || tokenActual.nombreToken.equals("token_cadena") ||
   tokenActual.nombreToken.equals("token_numero") || tokenActual.nombreToken.equals("token_numero_real") || tokenActual.nombreToken.equals("token_logico") ||
    tokenActual.nombreToken.equals("token_llave_izq")){
SENTENCIA();SEPARADOR();CUERPO_MAIN();
    }
  else if(tokenActual.nombreToken.equals("mientras") || tokenActual.nombreToken.equals("repetir") || tokenActual.nombreToken.equals("desde")){
BUCLES();CUERPO_MAIN();
  }
  else if(tokenActual.nombreToken.equals("si")){
CONDICIONAL();CUERPO_MAIN();
  }
  else if(tokenActual.nombreToken.equals("eval")){
   EVAL();CUERPO_MAIN(); 
  }
  else if(tokenActual.nombreToken.equals("fin") || tokenActual.nombreToken.equals("token_llave_der") || tokenActual.nombreToken.equals("retorna")
  || tokenActual.nombreToken.equals("sino") || tokenActual.nombreToken.equals("caso")){

  }
  else  { errorSintaxis("token_id" , "token_par_izq" , "token_cadena" ,
   "token_numero"  , "token_logico" ,
    "token_llave_izq","mientras" , "repetir" , "desde","si","eval", "fin" , "token_llave_der" , "retorna"
  , "sino" , "caso"); } 
}

void SENTENCIA() {System.out.println("SENTENCIA");
  if(tokenActual.nombreToken.equals("token_llave_izq")){
    emparejar("token_llave_izq");ARG();emparejar("token_llave_der");CUERPO_OPERADORES();
  }
  else if(tokenActual.nombreToken.equals("token_logico")){
emparejar("token_logico"); CUERPO_OPERADORES();
  }
  else if(tokenActual.nombreToken.equals("token_numero" )){
emparejar("token_numero");CUERPO_OPERADORES();
  }
  else if(tokenActual.nombreToken.equals("token_numero_real")){
emparejar("token_numero_real");CUERPO_OPERADORES();
  }
  else if(tokenActual.nombreToken.equals("token_cadena")){
emparejar("token_cadena");CUERPO_OPERADORES();
  }
  else if(tokenActual.nombreToken.equals("token_parent_izq")){
emparejar("token_parent_izq");TK_GENERAL();CUERPO_OPERADORES();emparejar("token_parent_der");
  }
  else if(tokenActual.nombreToken.equals("token_id")){
    emparejar("token_id");SENTENCIA_PRIMA();
  }
  else  { errorSintaxis("token_llave_izq","token_logico","token_numero",
  "token_cadena","token_par_izq","token_id"); }
  
}

void SENTENCIA_PRIMA() {
	
	System.out.println("SENTENCIA_PRIMA");
  if(tokenActual.nombreToken.equals("token_parent_izq") ) {
	  
    emparejar("token_parent_izq");
    ARG();
    emparejar("token_parent_der");
    CUERPO_OPERADORES();
  }
  else if(tokenActual.nombreToken.equals("token_corch_izq") || tokenActual.nombreToken.equals("token_punto") || tokenActual.nombreToken.equals("token_igual") ||
  tokenActual.nombreToken.equals("token_suma") || tokenActual.nombreToken.equals("token_coma") || tokenActual.nombreToken.equals("token_resta") || tokenActual.nombreToken.equals("token_asterisco") || tokenActual.nombreToken.equals("token_division") 
  ||  tokenActual.nombreToken.equals("token_modulo") || tokenActual.nombreToken.equals("token_exponente") ||
   tokenActual.nombreToken.equals("token_and") || tokenActual.nombreToken.equals("token_or") || tokenActual.nombreToken.equals("token_not") || tokenActual.nombreToken.equals("token_menor") || 
   tokenActual.nombreToken.equals("token_mayor") || tokenActual.nombreToken.equals("token_menor_o_igual")  || tokenActual.nombreToken.equals("token_mayor_o_igual") ||
    tokenActual.nombreToken.equals("token_igual_igual") || tokenActual.nombreToken.equals("token_diferente") || tokenActual.nombreToken.equals("token_punto_y_coma") || tokenActual.nombreToken.equals("mientras") || tokenActual.nombreToken.equals("repetir") || tokenActual.nombreToken.equals("desde") || tokenActual.nombreToken.equals("eval") || tokenActual.nombreToken.equals("si") || tokenActual.nombreToken.equals("token_id") || tokenActual.nombreToken.equals("fin") || tokenActual.nombreToken.equals("token_llave_der") ||tokenActual.nombreToken.equals("retorna") || tokenActual.nombreToken.equals("sino") || tokenActual.nombreToken.equals("caso")) {
      LVALUE_PRIMA();
      SENTENCIA_PRIMA_PRIMA();
    }
  else {
  errorSintaxis("token_parent_izq", "token_coma", "token_corch_der", "token_punto", "token_igual", "token_suma","token_resta", "token_asterisco", "token_division", "token_modulo", "token_exponente", "token_and", "token_or" ,"token_not", "token_menor", "token_mayor", "token_menor_o_igual", "token_mayor_o_igual", "token_igual_igual", "token_diferente", "token_punto_y_coma", "mientras", "repetir", "desde", "eval", "si", "token_id", "fin","token_llave_der", "retorna", "sino", "caso");
  }
}
void SENTENCIA_PRIMA_PRIMA() {System.out.println("SENTENCIA_PRIMA_PRIMA");
  if (tokenActual.nombreToken.equals("token_igual")) {
    emparejar("token_igual"); EXPRESION(); }
  else if(tokenActual.nombreToken.equals("token_suma") || tokenActual.nombreToken.equals("token_coma") || tokenActual.nombreToken.equals("token_resta") || tokenActual.nombreToken.equals("token_asterisco") || tokenActual.nombreToken.equals("token_division") 
  ||  tokenActual.nombreToken.equals("token_modulo") || tokenActual.nombreToken.equals("token_exponente") ||
   tokenActual.nombreToken.equals("token_and") || tokenActual.nombreToken.equals("token_or") || tokenActual.nombreToken.equals("token_not") || tokenActual.nombreToken.equals("token_menor") || 
   tokenActual.nombreToken.equals("token_mayor") || tokenActual.nombreToken.equals("token_menor_o_igual")  || tokenActual.nombreToken.equals("token_mayor_o_igual") ||
    tokenActual.nombreToken.equals("token_igual_igual") || tokenActual.nombreToken.equals("token_diferente") || tokenActual.nombreToken.equals("token_punto_y_coma") || tokenActual.nombreToken.equals("mientras") || tokenActual.nombreToken.equals("repetir") || tokenActual.nombreToken.equals("desde") || tokenActual.nombreToken.equals("eval") || tokenActual.nombreToken.equals("si") || tokenActual.nombreToken.equals("token_id") || tokenActual.nombreToken.equals("fin") || tokenActual.nombreToken.equals("token_llave_der") ||tokenActual.nombreToken.equals("retorna") || tokenActual.nombreToken.equals("sino") || tokenActual.nombreToken.equals("caso")) {
      CUERPO_OPERADORES();
    }
  else {
	  
    errorSintaxis("token_igual", "token_suma", "token_coma", "token_resta", "token_asterisco", "token_division", "token_modulo", "token_exponente", "token_and", "token_or" ,"token_not", "token_menor", "token_mayor", "token_menor_o_igual", "token_mayor_o_igual", "token_igual_igual", "token_diferente", "token_punto_y_coma", "mientras", "repetir", "desde", "eval", "si", "token_id", "fin","token_llave_der", "retorna", "sino", "caso");
    
  }
  }
void BUCLES() { System.out.println("BUCLES");
  if(tokenActual.nombreToken.equals("mientras"))
    MIENTRAS();
  else if(tokenActual.nombreToken.equals("desde"))
    DESDE();
  else if(tokenActual.nombreToken.equals("repetir"))
    REPETIR();
  else {
	 
    errorSintaxis("mientras", "desde", "repetir"); System.out.println("BUCLES");}
}
void MIENTRAS() {System.out.println("MIENTRAS");
  if(tokenActual.nombreToken.equals("mientras")) {
    emparejar("mientras");
    emparejar("token_parent_izq");
    EXPRESION();
    emparejar("token_parent_der");
    emparejar("token_llave_izq");
    CUERPO_MAIN();
    emparejar("token_llave_der");
  }
  else { 
    errorSintaxis("mientras"); System.out.println("MIENTRAS");}
}
void REPETIR(){System.out.println("REPETIR");
  if(tokenActual.nombreToken.equals("repetir")) {
    emparejar("repetir");
    CUERPO_MAIN();
    emparejar("hasta");
    emparejar("token_parent_izq");
    EXPRESION();
    emparejar("token_parent_der");
  }
  else {
	  errorSintaxis("repetir");
	  
  }
}
void DESDE() {System.out.println("DESDE");
  if(tokenActual.nombreToken.equals("desde"))  {
    emparejar("desde");
    ASIGNACIONES();
    emparejar("hasta");
    EXPRESION();
    PASO();
    emparejar("token_llave_izq");
    CUERPO_MAIN();
    emparejar("token_llave_der");
  }
  else {
    errorSintaxis("desde");  }
}

void ASIGNACIONES(){System.out.println("ASIGNACIONES");
if(tokenActual.nombreToken.equals("token_id") ){
  LVALUE();emparejar("token_igual");EXPRESION();

}else {   errorSintaxis("token_id"); }

}
void PASO() {System.out.println("PASO");
  if (tokenActual.nombreToken.equals("paso")) {
    emparejar("paso");
    EXPRESION();
  }
  else if(tokenActual.nombreToken.equals("token_llave_izq")) {}
  else {
	  
    errorSintaxis("paso");
    
  }
}
void CONDICIONAL() {System.out.println("CONDICIONAL");
  if(tokenActual.nombreToken.equals("si")) {
      emparejar("si");
      emparejar("token_parent_izq");
      EXPRESION();
      emparejar("token_parent_der");
      emparejar("token_llave_izq");
      CUERPO_MAIN();
      SINO_SI();
      SINO();
      emparejar("token_llave_der");
  }
  else {    
    errorSintaxis("si");

  }
}
void SINO_SI() {System.out.println("SINO_SI");
  if(tokenActual.nombreToken.equals("sino") && tokens.size() >= pp+1 && tokens.get(pp).nombreToken.equals("si")) {
    emparejar("sino");
    emparejar("si");
    emparejar("token_parent_izq");
    EXPRESION();
    emparejar("token_parent_der");
    CUERPO_MAIN();
    SINO_SI();
  }

  else if(tokenActual.nombreToken.equals("sino") || tokenActual.nombreToken.equals("token_llave_der")) {}

  else {    
    errorSintaxis("sino", "token_llave_der");

  }
}
void SINO() {System.out.println("SINO");
  if(tokenActual.nombreToken.equals("sino")) {
    emparejar("sino");
    CUERPO_MAIN();
  }
  else if(tokenActual.nombreToken.equals("token_llave_der")){}
  else {  
    errorSintaxis("sino", "token_llave_der");
  
  }
}
void EVAL() {System.out.println("EVAL");
  if(tokenActual.nombreToken.equals("eval")) {

    emparejar("eval");
    emparejar("token_llave_izq");
    CASO();
    emparejar("token_llave_der");
  }
  else { 
    errorSintaxis("eval");  }
}

void CASO() {System.out.println("CASO");
  if(tokenActual.nombreToken.equals("caso")) {
    emparejar("caso");
    emparejar("token_parent_izq");
    EXPRESION();
    emparejar("token_parent_der");
    CUERPO_MAIN();
    CASO_PRIMA();
  }
  else { 
    errorSintaxis("caso"); }
  
}
void CASO_PRIMA(){System.out.println("CASO_PRIMA");

  if(tokenActual.nombreToken.equals("caso")) {
    CASO();
  }
  else if(tokenActual.nombreToken.equals("sino") || tokenActual.nombreToken.equals("token_llave_der")) {
    SINO();
  }
  else {  
    errorSintaxis("caso", "sino", "token_llave_der");
  
  }
}

void SUBRUTINAS() {System.out.println("SUBRUTINAS");

  if(tokenActual.nombreToken.equals("subrutina")) {
    emparejar("subrutina");
    emparejar("token_id");
    emparejar("token_parent_izq");
    LISTASUB();
    emparejar("token_parent_der");
    RETORNO();
    SUBRUTINAS();
  }
  else if(tokenActual.nombreToken.equals("$")) {}
  else { 
    errorSintaxis("subrutina", "$");
    
  }
}


void LISTASUB() {System.out.println("LISTASUB");
  if(tokenActual.nombreToken.equals("ref") || tokenActual.nombreToken.equals("token_id")) {
    REF();
    emparejar("token_id");
    LISTA();
    emparejar("token_dos_puntos");
    TIPO_DECLARACION_VAR();
    LISTASUBSEPARADOR();
  }
  else if(tokenActual.nombreToken.equals("token_parent_der")) {}
  else {
    errorSintaxis("ref", "token_id", "token_parent_der");
    
  }

}
void LISTASUBSEPARADOR(){System.out.println("LISTA_SUB_SEPARADOR");
  if(tokenActual.nombreToken.equals("token_coma")) {
      emparejar("token_coma");
      LISTASUB();
  }
  else if(tokenActual.nombreToken.equals("token_parent_der")) {}
  else {
    errorSintaxis("token_coma", "token_parent_der");
    
  }
}

void REF() {
System.out.println("REF");
  if(tokenActual.nombreToken.equals("ref")) {

    emparejar("ref");
  }
  else if(tokenActual.nombreToken.equals("token_id")) {}
  else {
     errorSintaxis("ref", "token_id");
     
  }
}
void RETORNO() {
System.out.println("RETORNO");
    if(tokenActual.nombreToken.equals("retorna")) {
        emparejar("retorna");
        TIPO_DATO_VAR();
        CTV();
        emparejar("inicio");
        CUERPO_MAIN();
        emparejar("retorna");
        emparejar("token_parent_izq");
        EXPRESION();
        emparejar("token_parent_der");
        emparejar("fin");
    }

    else if(tokenActual.nombreToken.equals("const") || tokenActual.nombreToken.equals("var") ||
     tokenActual.nombreToken.equals("tipos") || tokenActual.nombreToken.equals("inicio")) {
        CTV();
        MAIN();
     }

    else { 
      errorSintaxis("retorna", "const", "var", "tipos" , "inicio");
     
    }
}






}

/*
FUENTE
TITULO_PROGRAMA
CTV
CONST
VAR
TIPOS
MAIN
DECLARAR_CONST
LVALUE
LVALUE_PRIMA
EXPRESION
CUERPO_OPERADORES
OPERADOR
TK_GENERAL
LVALUE_OR_LLAMADO_SUB
LVALUE_OR_LLAMADO_SUB_PRIMA
LLAMADO_SUB
ARG
ARG_MULT
ATRIBUTO
SEPARADOR
DECLARAR_TIPOS
LISTA
TIPO_DECLARACION_TIPO
EXP_VECTOR
DIM
LISTA_DIM
EXP_MATRIZ
EXP_REGISTRO
TIPO_DATO_TIPO
DECLARAR_VAR
TIPO_DECLARACION_VAR
EXP_VECTOR_VAR
DIM_VAR
LISTA_DIM_VAR
EXP_MATRIZ_VAR
EXP_REGISTRO_VAR
TIPO_DATO_VAR
CUERPO_MAIN
SENTENCIA
SENTENCIA_PRIMA
SENTENCIA_PRIMA_PRIMA
BUCLES
MIENTRAS
REPETIR
DESDE
PASO
CONDICIONAL
SINO_SI
SINO
EVAL
CASO
CASO_PRIMA
SUBRUTINAS
LISTASUB
LISTASUBSEPARADOR
REF
RETORNO*/
