#include<bits/stdc++.h>

using namespace std;

/*String en el que se guardaran valores temporales para conformar tokens
(identificadores, palabras reservadas, literales)*/
string temp = "";

//Fila y columna actual
int fila = 1;
int columna = 1;

//Archivo de salida
ofstream salida;
//Archivo de entrada
ifstream entrada;

//Funcion de transicion que procesa caracter a caracter y retorna un nuevo estado
int funcion_transicion(int estado, char c);
//Funcion para registrar un error lexico en una fila y columna determinados
void registrar_error(int fila, int columna);

int tamanio_cadena = 0;

//Diccionario de palabras reservadas, tipos de datos y funciones predefinidas
unordered_set<string> pal_reservadas = {"and", "constantes", "hasta", "matriz", "paso",
                                       	"registro", "sino", "vector", "archivo", "desde",
                                       "inicio", "mientras", "subrutina", "repetir", "tipos",
                                       	"caso", "eval", "lib", "not", "programa",
                                       "retorna", "var", "const", "fin", "libext",
                                       	"or", "ref", "si", "variables", "imprimir", "leer",
                                        "dim", "cls", "set_ifs", "abs", "arctan", "ascii",
                                        "cos", "dec", "eof", "exp", "get_ifs", "inc", "int",
                                        "log", "lower", "mem", "ord", "paramval", "pcount", "pos",
                                        "random", "sec", "set_stdin", "set_stdout", "sin",
                                        "sqrt", "str",  "strdup", "strlen", "substr", "tan",
                                        "upper", "val", "numerico", "cadena", "logico"};

//Diccionario para literales logicos
unordered_set<string> val_logico = {"SI", "NO", "TRUE", "FALSE"};

//Diccionario de simbolos y operadores
unordered_map<char, string> map_simbolo({
                                        {'+',"suma"}, {'-', "resta"}, {'*', "multiplicacion"}, {'/', "division"},
                                        {'^' ,"op_potencia"}, {'%', "op_modulo"}, {'<', "op_menorque"},
                                        {'>',"op_mayorque"}, {',' ,"coma"}, {':', "dos_puntos"},
                                        {'(', "par_izq"}, {')' ,"par_der"}, {'[', "cor_izq"}, {']', "cor_der"},
                                        {'{' ,"llave_izq"}, {'}', "llave_der"},{'=',"asignacion"},{'.', "punto"},
                                        {';', "punto_y_coma"}
                                        });

//Diccionario de operadores con doble simbolo
unordered_map<string, string> map_doble_operador({
                                                  {">=","mayor_o_igual"},{"<=","mayor_o_igual"},
                                                  {"==","igual_igual"},{"<>","diferente_de"}
                                                  });

int main () {

  //Abrir archivo con codigo fuente
  entrada.open ("input.txt");

  //Abrir archivo donde se registraran los tokens
  salida.open ("output.txt", ios::trunc);

  //estado y caracter leido en un momento determinado
  char c;
  int estado = 0;

  //Empezar a leer caracter por caracter hasta EOF y llamar funcion de transicion
  while(!entrada.eof()) {

    entrada.get(c);

    if(c != -61){
       estado = funcion_transicion(estado, c);

       if(estado == -1)
         return -1;
    }

  }

  return 0;
}

int funcion_transicion(int estado, char c){

  //char auxiliar para almacenar la lecutura adicional de caracteres del archivo de entrada
  char caracter;

  switch(estado) {

    //Estado inicial, significa que empieza a leer el archivo o que acaba de procesar un token
    case 0:

        //Podria ser una identificador o palabra reservada
        if(regex_match(string(1,c), regex("^([a-z]|[A-Z]|\\_)$"))
         || (int)c == -79 || (int)c == -111) {

            tamanio_cadena = 1;

            //Manejo de letras latinas ñ y Ñ
            if((int)c == -79)
              temp = "ñ";
            else if((int)c == -111)
              temp = "Ñ";
            else {
              temp = "";
              temp += c;
            }

            columna++;
            return 1;
        }else if(regex_match(string(1,c), regex("^(\\*|\\%|\\^|\\:|\\,|\\(|\\)|\\[|\\]|\\{|\\}|\\.|\\;)$"))) {  //Operadores y simbolos
            salida << "<" << map_simbolo[c] << "," << fila << "," << columna << ">\n";
            columna++;
            return 0;
        }else if(c == ' '){//Ignorar espacios y saltos de linea
            columna++;
            return 0;
        }else if(c == '\n') {
            columna = 1;
            fila++;
            return 0;
        }else if(c=='\"' || c == '\'') {//Identificar cadenas con comillas dobles y simples
          temp =c;
          columna++;
          tamanio_cadena = 1;
            char caracter_temp ;
          while(!entrada.eof()) {
            entrada.get(caracter);

            if((int)caracter != -61 && (int)caracter != -62) {

              tamanio_cadena++;

              if(caracter == '\n') {
                registrar_error(fila,columna);
                return -1;
              }else if(caracter == c){
                columna++;
                temp += c;
                salida<<"<cadena,"<<temp<<","<<fila<<","<<columna-tamanio_cadena<<">\n";
                temp = "";
                return 0;
              }else{


                if((int)caracter == -79)
                  temp += "ñ";
                else if((int)caracter == -111)
                  temp += "Ñ";
                else if((int)caracter == -83)
                  temp += "í";
                else if((int)caracter == -95 && (int)caracter_temp == -61)
                  temp += "á";
                else if((int)caracter == -95 && (int)caracter_temp == -62)
                  temp += "¡";
                else if((int)caracter == -87)
                  temp += "é";
                else if((int)caracter == -77)
                  temp += "ó";
                else if((int)caracter == -70)
                  temp += "ú";
                else if((int)caracter == -115)
                  temp += "Í";
                else if((int)caracter == -127)
                  temp += "Á";
                else if((int)caracter == -119)
                  temp += "É";
                else if((int)caracter == -109)
                  temp += "Ó";
                else if((int)caracter == -102)
                  temp += "Ú";
                else if((int)caracter == -65)
                  temp += "¿";
                else if((int)caracter == -68)
                  temp += "ü";
                else if((int)caracter == -74)
                  temp += "ö";
                else {
                  temp += caracter;
                }

                columna++;
              }
            } else {
              caracter_temp = caracter;
            }
          }
        //la cadena no se termino por lo tanto no se puede formar ningun token
        registrar_error(fila, --columna);
        return -1;
        }else if(c=='<'||c=='>'||c=='='){//Posibles simbolos dobles
          columna++;
          temp = "";
          temp+=c;
          return 3;
        }else if(c=='/'){//Posiblemente es un comentario
          columna++;
          temp = "/";
          return 4;
        }else if(c=='0'){//Deteccion de literales numericos
          columna++;
          temp = "0";
          return 8;
        }else if(regex_match(string(1,c), regex("^([1-9])$"))){
          temp = "";
          temp += c;
          columna++;
          return 9;
        }else if(c=='+'||c=='-'){
          temp = "";
          temp += c;
          columna++;
          return 12;
        }else{
          registrar_error(fila, columna);
          return -1;
        }
        break;
    case 1:
        if(regex_match(string(1,c), regex("^([0-9]|[a-z]|[A-Z]|\\_)$"))
          || (int)c == -79 || (int)c == -111){

            tamanio_cadena++;
            //Manejo de letras latinas ñ y Ñ
           if((int)c == -79)
              temp += "ñ";
            else if((int)c == -111)
              temp += "Ñ";
            else {
              temp += c;
            }

            columna++;
            return 1;
        }else {

          //Termina identificacion de token id o palabra reservada

            if (pal_reservadas.find(temp) != pal_reservadas.end())
              salida<<"<"<<temp<<","<<fila<<","<<columna-tamanio_cadena<<">\n";
            else if(val_logico.find(temp) != val_logico.end())
              salida<<"<logico,"<<temp<<","<<fila<<","<<columna-tamanio_cadena<<">\n";
            else
              salida<<"<id,"<<temp<<","<<fila<<","<<columna-tamanio_cadena<<">\n";


            entrada.seekg(-1, ios::cur);

              //Ya se registro token, por lo tanto se reinicia el string temporal de tokens
            temp = "";

            return 0;

        }

    case 3:

            temp +=c;
            //Es un operador de dos simbolos
            if(map_doble_operador.find(temp) != map_doble_operador.end()) {
                columna++;
                salida << "<" << map_doble_operador[temp] << "," << fila << "," << columna - temp.length()<< ">\n";
            }
            //Es un operador de un solo simbolo
            else {
                salida << "<" << map_simbolo[temp[0]] << "," << fila << "," << columna-1<< ">\n";
                entrada.seekg(-1, ios::cur);
            }


            temp =  "";
           return 0;
        break;
    case 4:
        if(c == '/'){//Es un comentario de una linea
            columna++;
            temp ="";
            return 5;
        }else if(c == '*'){//Es un comentario multilinea

            columna++;

        while(true) {
            bool paso = false;
        while(!entrada.eof()) {
            entrada.get(caracter);
            if((int)caracter != -61 && (int)caracter != -62) {
              columna++;
              if(caracter == '*') {
                paso = true;
                break;
              }else if(caracter == '\n'){
                fila++;
                columna=1;
              }

            }
        }

        //El comentario no se termino

        if(!paso) {
            registrar_error(fila, --columna);
            return -1;
        }

        paso = false;

        if(!entrada.eof()) {
            entrada.get(caracter);

            if(caracter != -61 && (int)caracter != -62) {
              columna++;
              if(caracter == '/') {
                paso = true;
              }else if(caracter == '\n'){
                fila++;
                columna = 1;
              }
           }
        }

        if(paso)
            return 0;

        }


      }else {//No es comentario, sino operador de division

            salida << "<" << map_simbolo[temp[0]] << "," << fila << "," << columna-1<< ">\n";
            temp ="";
            entrada.seekg(-1, ios::cur);
            return 0;
        }
    case 5:
      //Termina el comentario solamente cuando encuentre un salto de linea, ignora todo lo demas
        if(c == '\n'){

            fila++;
            columna = 1;
            return 0;
        }else {
            columna++;
            return 5;
        }

      case 8:
        if(c=='.'){
            temp += '.';
            columna++;
            return 10;
        } else {
            salida<<"<numero,"<<temp<<","<<fila<<","<<columna-1<<">\n";
            temp = "";
            entrada.seekg(-1, ios::cur);
            return 0;
        }

      case 9:
        if(c=='.'){
          temp += c;
          columna++;
          return 10;
        }else if(regex_match(string(1,c), regex("^([0-9])$"))){
          temp +=c;
          columna++;
          return 9;
        }else if(c == 'e' || c == 'E') {
          temp +=c;
          columna++;
          return 11;
        }else {
            salida<<"<numero,"<<temp<<","<<fila<<","<<columna-temp.length()<<">\n";
            entrada.seekg(-1, ios::cur);
            temp = "";
            return 0;
        }
      case 10:
        if(regex_match(string(1,c), regex("^([0-9])$"))){
          temp +=c;
          columna++;
          return 15;
        }else if(c == 'e' || c == 'E') {
          temp +=c;
          columna++;
          return 11;
        }else {
          salida<<"<numero,"<<temp.substr(0, temp.length()-1)<<","<<fila<<","<<columna-temp.length()<<">\n";
          temp ="";
          columna--;
          entrada.seekg(-2, ios::cur);
          return 0;
        }
      case 15:
        if(regex_match(string(1,c), regex("^([0-9])$"))){
          temp +=c;
          columna++;
          return 15;
        }else if(c == 'e' || c == 'E') {
          temp +=c;
          columna++;
          return 11;
        }else {
          salida<<"<numero,"<<temp<<","<<fila<<","<<columna-temp.length()<<">\n";
          temp ="";
          entrada.seekg(-1, ios::cur);
          return 0;
        }

      case 11:
      if(c == '+' || c== '-') {
        columna++;
        temp+=c;
        return 13;
      }else {
        salida<<"<numero,"<<temp.substr(0,temp.length()-1)<<","<<fila<<","<<columna-temp.length()<<">\n";
        salida<<"<id,"<<temp[temp.length()-1]<<","<<fila<<","<<columna-1<<">\n";
        temp ="";
        entrada.seekg(-1, ios::cur);
        return 0;
      }
      case 13:
      if(regex_match(string(1,c), regex("^([1-9])$"))){
          temp +=c;
          columna++;
          return 14;
      } else {
        salida<<"<numero,"<<temp.substr(0,temp.length()-2)<<","<<fila<<","<<columna-temp.length()<<">\n";
        salida<<"<id,"<<temp[temp.length()-2]<<","<<fila<<","<<columna-2<<">\n";
        salida << "<" << map_simbolo[temp[temp.length()-1]] << "," << fila << "," << columna-1<< ">\n";
        temp ="";
        entrada.seekg(-1, ios::cur);
        return 0;
      }
     case 14:
     if(regex_match(string(1,c), regex("^([0-9])$"))){
          temp +=c;
          columna++;
          return 14;
      } else {
        salida<<"<numero,"<<temp<<","<<fila<<","<<columna-temp.length()<<">\n";
        temp ="";
        entrada.seekg(-1, ios::cur);
        return 0;
      }

     case 12:
        if(regex_match(string(1,c), regex("^([1-9])$"))){//es un numero
          temp += c;
          columna++;
          return 9;
        }else {//Se trata del operador suma o resta
          salida << "<" << map_simbolo[temp[0]] << "," << fila << "," << columna-temp.length()<< ">\n";
          entrada.seekg(-1, ios::cur);
          temp ="";
          return 0;
        }

    }//llave switch
}
void registrar_error(int fila, int columna) {
    salida << ">>>Error lexico(linea:" << fila <<  ",posicion:" << columna << ")\n";
}
