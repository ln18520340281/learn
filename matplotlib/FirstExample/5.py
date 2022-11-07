import matplotlib.pyplot as plt
import numpy as np
t = np.arange(0., 5., 0.2)
line = plt.plot(t,t**2,'x')
plt.show()