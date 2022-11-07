from sympy import plot_implicit, Eq, symbols
x, y = symbols('x y')
plot_implicit(Eq(x**2 + y**2, 0.5), adaptive=False, points=400)
plot_implicit(Eq(x**2 + y**2, 1.0), adaptive=False, points=400)
plot_implicit(Eq(x**2       , 1.2 - y**2), adaptive=False, points=400)#Eq(x**2, 1.2-y**2)等价于Eq(x**2+y**2, 1.2)
plot_implicit(Eq(x**2 + y**2, 1.5), adaptive=False, points=400)
