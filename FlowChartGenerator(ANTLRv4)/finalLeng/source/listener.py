from antlr4 import *
import turtle
from graListener import graListener
from graParser import graParser
from random import randrange

window = turtle.Screen()
window.screensize(5000, 5000)
#window.setup(width=1.0, height=1.0, startx=None, starty=None)

a = turtle.Turtle()
a.pensize(2)
x_inicial = a.pos()[0]
y_inicial = a.pos()[1]

coors = []
coors_antes = []
coors_ciclo = []
for_expresions = []

a.speed('fastest')

hay_ciclo = False;
sigue_switch = False;
primer_case = False;
mas_de_segundo_case = False;


primera_vez = True;

class listener(graListener):

    def enterTranslationunit(self, ctx:graParser.TranslationunitContext):
        a.rt(90)

    def exitTranslationunit(self, ctx:graParser.TranslationunitContext):
        #Detener tortuga y desaparecerla
        a.hideturtle()
        turtle.done()




    def enterDeclarationstatement(self, ctx:graParser.DeclarationstatementContext):
        a.forward(20)
        rectangulo(ctx)

    def enterExpressionstatement(self, ctx:graParser.ExpressionstatementContext):
        a.forward(20)
        rectangulo(ctx)

    def enterJumpstatement(self, ctx:graParser.JumpstatementContext):
        a.forward(20)
        rectangulo(ctx)

    def enterCondition(self, ctx: graParser.ConditionContext):
        print("Voy en condition")
        global sigue_switch

        if(not sigue_switch):
            a.forward(20)
            rombo(ctx)
            a.forward(30)

        sigue_switch = False

    def enterParaelse(self, ctx:graParser.ParaelseContext):
        volverFlechaFalse()

    def exitParaelse(self, ctx:graParser.ParaelseContext):
        darVuelta()


    def exitMi_if(self, ctx:graParser.Mi_ifContext):
        volverFlechaFalse()
        darVuelta()

    def exitMi_while(self, ctx:graParser.Mi_whileContext):
       darVueltaCiclo()

    def enterPara_mi_while(self, ctx:graParser.Para_mi_whileContext):
        lar = len(ctx.condition().getText()) * 12
        a.forward(20)
        coors_ciclo.append(a.pos()[0] - lar / 2)
        coors_ciclo.append(a.pos()[1] - lar / 2)
        a.back(20)

    def enterPara_mi_for(self, ctx:graParser.Para_mi_forContext):
        if (ctx.expression() != None):
            for_expresions.append(ctx.expression())

        if(ctx.condition() != None):
            lar = len(ctx.condition().getText()) * 12
            a.forward(20)
            coors_ciclo.append(a.pos()[0] - lar / 2)
            coors_ciclo.append(a.pos()[1] - lar / 2)
            a.back(20)

    def enterMidowhile(self, ctx:graParser.MidowhileContext):
        coors_ciclo.append(a.pos()[0])
        coors_ciclo.append(a.pos()[1]-20)


    def enterExpresion_do_while(self, ctx:graParser.Expresion_do_whileContext):
        a.forward(20)
        rombo_do_while(ctx)

    def enterForinitstatement(self, ctx:graParser.ForinitstatementContext):
        a.forward(20)
        rectangulo(ctx)


    def exitMifor(self, ctx:graParser.MiforContext):
        a.forward(20)
        if(len(for_expresions)>0):
            rectangulo(for_expresions.pop())

        darVueltaCiclo()

    def enterMi_switch(self, ctx:graParser.Mi_switchContext):
        global sigue_switch, primer_case
        sigue_switch = True
        primer_case = True
        a.forward(20)
        rectangulo(ctx.switchtemp())


    def enterMi_case(self, ctx:graParser.Mi_caseContext):
        global primer_case

        if(not primer_case):
            volverFlechaFalse()

        a.forward(20)
        rombo(ctx.caseconstant())

        primer_case = False

    def enterMi_default(self, ctx:graParser.Mi_defaultContext):
        volverFlechaFalse()

    def exitMi_default(self, ctx:graParser.Mi_defaultContext):
        numero = len(coors_antes)//2
        for _ in range(numero):  # or xrange if you are on 2.X
            darVuelta()


    def enterFunctiondefinition(self, ctx:graParser.FunctiondefinitionContext):

        global x_inicial, y_inicial

        # Empieza una nueva funcion, mover a un lugar adecuado
        colocar(x_inicial, y_inicial)


        #Moverse a la derecha de funcion anterior para iniciar un nuevo diagrama de flujo
        a.rt(270)
        a.pen({'pendown': False})

        global  primera_vez

        if(not primera_vez):
            a.forward(500)

        primera_vez = False

        # Actualizar x_inicial, Y_inicial
        x_inicial = a.pos()[0]
        y_inicial = a.pos()[1]
        a.rt(90)


        #Escribir nombre de la funcion encima
        a.back(40)
        a.write(ctx.declarator().getText()+":", move=False, align='right', font=("Arial", 10, "bold"))
        a.forward(40)
        a.pen({'pendown': True})
        a.rt(270)

        # ---- Dibujar simbolo de inicio de diagrama de flujo ------- #
        a.fillcolor('blue')
        a.begin_fill()
        a.circle(16)
        a.end_fill()
        a.rt(90)
        # ------------------------------------------------------------#

    def exitFunctiondefinition(self, ctx:graParser.FunctiondefinitionContext):

        # --------- Dibujar simbolo final de diagrama de flujo ------------ #
        a.forward(50)
        a.rt(270)
        a.fillcolor('blue')
        a.begin_fill()
        a.circle(16)
        a.end_fill()
        a.rt(270)
        a.pen({'pendown': False})
        a.forward(10)
        a.rt(90)
        a.fillcolor('black')
        a.begin_fill()
        a.circle(6)
        a.end_fill()
        a.rt(90)
        a.forward(10)
        a.pen({'pendown': True})
        # --------------------------------------------------------- #




#--------------- Funciones De Utilidad para pintar ------------------------ #


def flechaTrue():
    a.fd(20)
    a.color('red')
    a.write("verdadero", move=False, align='right', font=("Arial", 9, "bold"))
    a.color('black')
    return None
def flechaFalse(lar,coorXf,coorYf,coorXv,coorYv):

    colocar(coorXf,coorYf)
    a.lt(90)
    a.fd(100)
    a.rt(90)
    # a.color('red')
    # a.write("falso", move=False, align='right', font=("Arial", 9, "bold"))
    # a.color('black')
    coors.append(a.pos()[0])
    coors.append(a.pos()[1])

    colocar(coorXv,coorYv)

    return None

def rombo(ctx):
    print ("Estoy en el rombo")
    lar = len(ctx.getText())*12
    a.color('green')
    a.setposition(a.pos()[0]-lar/2 , a.pos()[1]-lar/2)
    a.setposition(a.pos()[0]+lar/2 , a.pos()[1]-lar/2)
    a.setposition(a.pos()[0] + lar / 2 , a.pos()[1] + lar/2)
    xf = a.pos()[0]
    yf = a.pos()[1]
    a.setposition(a.pos()[0] - lar / 2 , a.pos()[1] + lar/2)
    a.color('black')
    colocar(a.pos()[0], a.pos()[1] - lar/2 - 5)
    a.write(ctx.getText(), move=False, align='center', font=("Arial", 9, "bold"))
    colocar(a.pos()[0], a.pos()[1] - lar/2 + 5)
    xv = a.pos()[0]
    yv = a.pos()[1]
    flechaTrue()
    flechaFalse(lar,xf,yf,xv,yv)

def rombo_do_while(ctx):
    print ("Estoy en el rombo")
    lar = len(ctx.getText())*12

    a.color('green')
    xv = a.pos()[0]
    yv = a.pos()[1]
    a.setposition(a.pos()[0]-lar/2 , a.pos()[1]-lar/2)
    a.setposition(a.pos()[0]+lar/2 , a.pos()[1]-lar/2)
    a.setposition(a.pos()[0] + lar / 2 , a.pos()[1] + lar/2)
    a.setposition(a.pos()[0] - lar / 2 , a.pos()[1] + lar/2)

    a.color('black')
    colocar(a.pos()[0], a.pos()[1] - lar/2 - 5)
    text = ctx.getText()
    subs = text[0:len(text)-2]
    a.write(subs, move=False, align='center', font=("Arial", 9, "bold"))
    colocar(a.pos()[0], a.pos()[1] - lar/2 + 5)

    a.fd(20)
    a.color('red')
    a.write("falso", move=False, align='right', font=("Arial", 9, "bold"))
    a.color('black')
    a.back(20)

    x_primero = a.pos()[0]
    y_primero = a.pos()[1]

    colocar(xv - lar / 2,yv - lar / 2 )
    a.color('red')
    a.write("verdadero", move=False, align='right', font=("Arial", 9, "bold"))
    a.color('black')
    a.rt(90)
    a.fd(100)
    a.rt(90)
    a.forward(coors_ciclo.pop()-a.pos()[1]+10)
    a.rt(90)
    a.forward(coors_ciclo.pop()-a.pos()[0])
    a.rt(90)
    colocar(x_primero, y_primero)
    a.forward(30)


def rectangulo(ctx):
    a.color('blue')
    lar = len(ctx.getText())*6 + 5
    a.rt(90)
    a.fd(lar/2)
    a.lt(90)
    a.fd(30)
    a.lt(90)
    a.fd(lar)
    a.lt(90)
    a.fd(30)
    a.lt(90)
    a.fd(lar/2)#cierra rectangulo
    a.lt(90)#gira mirar abajo
    a.color('black')
    colocar(a.pos()[0],a.pos()[1]-15)
    a.write(ctx.getText(), move=False, align='center',font=("Arial", 9, "bold"))
    colocar(a.pos()[0], a.pos()[1]-15)

    return None
def colocar(coorX,coorY):
    a.pen({'pendown': False})
    a.setposition(coorX, coorY)
    a.pen({'pendown': True})

    return None


def volverFlechaFalse():
    coors_antes.append(a.pos()[0])
    coors_antes.append(a.pos()[1])
    y = coors.pop()
    x = coors.pop()
    colocar(x, y)
    movement = 70*(len(coors)//2)
    a.rt(270)
    a.forward(movement)
    a.rt(90)
    a.color('red')
    a.write("falso", move=False, align='right', font=("Arial", 9, "bold"))
    a.color('black')


def darVuelta():

    y_antes = coors_antes.pop()
    x_antes = coors_antes.pop()

    if(( a.pos()[1] - y_antes + 10) < 0):
        a.forward(10)
        a.rt(90)
        a.forward(60)
        a.rt(270)

    a.forward(a.pos()[1] - y_antes + 10)
    a.rt(90)
    a.forward(a.pos()[0] - x_antes)
    a.rt(270)
    a.back(10)

def darVueltaCiclo():
    x_original = a.pos()[0]
    y_original = a.pos()[1]

    a.rt(90)
    a.forward(100)

    a.forward(15 - len(coors_ciclo) * 2)
    a.rt(90)

    y_ciclo = coors_ciclo.pop()
    x_ciclo = coors_ciclo.pop()

    a.forward(y_ciclo - a.pos()[1])
    a.rt(90)
    a.forward(x_ciclo - a.pos()[0])

    colocar(x_original, y_original)
    a.rt(90)
    volverFlechaFalse()
    darVuelta()