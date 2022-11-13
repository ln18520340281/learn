import matplotlib.pyplot as plt
import numpy as np


x = np.arange(-10,10)
y = np.exp(x)+x# $e^{x}+x$
fig, ax = plt.subplots()
ax.plot(x,y)
ax.grid()
ax.set(ylim=(-10,10),xlim=(-10,10))
plt.show()