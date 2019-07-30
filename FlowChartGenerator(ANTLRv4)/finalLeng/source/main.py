from antlr4 import *
from graLexer import graLexer
from graParser import graParser
from listener import listener
import sys

def ini():

    #Editar ruta input de acuerdo a ubicacion de archivo txt de entrada -------

    ruta_input = "C:\\Users\\juamp\Desktop\\finalLengV2\\finalLeng\\input3.txt"

    # ----------------------------------------------------------------------

    lexer = graLexer(FileStream(ruta_input))

    #print(lexer)
    tokens = CommonTokenStream(lexer)
    parser = graParser(tokens)
    tree = parser.translationunit()
    walker = ParseTreeWalker()
    walker.walk(listener(),tree)

ini()