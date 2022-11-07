import numpy as np
np_array_2d = np.arange(0, 6).reshape([2,3])
print(np_array_2d)
result = np.sum(np_array_2d, axis = 1)
print(result)