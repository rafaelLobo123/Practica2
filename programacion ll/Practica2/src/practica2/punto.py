import math
import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return self.x, self.y

    def coord_polares(self):
        radio = math.sqrt(self.x ** 2 + self.y ** 2)
        angulo = math.atan2(self.y, self.x) 
        angulo = math.degrees(angulo)
        return radio, angulo

    def __str__(self):
        return "({:.2f}, {:.2f})".format(self.x, self.y)

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def dibujaLinea(self, ax):
        ax.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], 'b-', label="Línea")
        ax.scatter([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], color='blue', zorder=3)

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def dibujaCirculo(self, ax):
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, color='red', fill=False, label="Círculo")
        ax.add_patch(circulo)
        ax.plot([self.centro.x, self.centro.x + self.radio], [self.centro.y, self.centro.y], 'g-', label="Radio")

# Crear puntos
p1 = Punto(2, 2)
p2 = Punto(8, 6)

# Crear línea y círculo
linea = Linea(p1, p2)
circulo = Circulo(p1, 3)

# Configuración de la gráfica
fig, ax = plt.subplots()
ax.set_aspect('equal')
ax.set_xlim(0, 10)
ax.set_ylim(0, 10)
ax.grid(True)

# Dibujar los objetos
linea.dibujaLinea(ax)
circulo.dibujaCirculo(ax)

# Mostrar gráfico
plt.legend()
plt.show()
