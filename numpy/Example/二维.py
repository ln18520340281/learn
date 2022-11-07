import numpy as np
a = np.arange(4).reshape(4,1)
print("数组",a)
print("维度: ",a.ndim) # a数组的维度
print("形状: ",a.shape,end="\n\n") # b的形状

sum0 = a.sum(axis=0)
sum1 = a.sum(axis=1)

print(sum0,end="\n\n")
print(sum1,end="\n\n")