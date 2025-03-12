import math

class FigurasGeometricas:

    def area_circulo(self, radio):
        return math.pi * radio * radio

    def area_rectangulo(self, base, altura):
        return base * altura

    def area_triangulo(self, base, altura):
        return (base * altura) / 2

    def area_trapecio(self, base_mayor, base_menor, altura):
        return ((base_mayor + base_menor) * altura) / 2

    def area_poligono(self, lado, numLados, apotema):
        perimetro = numLados * lado
        return (perimetro * apotema) / 2


figuras = FigurasGeometricas()
print("area del circulo =", figuras.area_circulo(5))
print("area del rectangulo =", figuras.area_rectangulo(4, 6))
print("area del triangulo =", figuras.area_triangulo(4, 6))
print("area del trapecio =", figuras.area_trapecio(8, 4, 5))
print("area del hexagono =", figuras.area_poligono(6, 6, 7))
