import numpy as np
a = np.arange(12).reshape(3,2,2)
print("数组",a)
print("维度: ",a.ndim) # a数组的维度
print("形状: ",a.shape,end="\n\n") # b的形状

sum0 = a.sum(axis=0)
sum1 = a.sum(axis=1)
sum2 = a.sum(axis=2)
'''
sum0 = a.sum(axis=0,keepdims=True)
sum1 = a.sum(axis=1,keepdims=True)
sum2 = a.sum(axis=2,keepdims=True)

如果设置了keepdims=True,就不会自动删除括号
[[[0,1],[2,3]],[[4,5],[6,7]],[[8,9],[10,11]]]
sum的结果
axis0       [[[12,15],[18,21]]]
axis1       [[[2,4],[10,12],[[18,20]]]
axis2       [[[1],[5]],[[9],[13]],[[17],[21]]]

sum0 = a.sum(axis=0)
sum1 = a.sum(axis=1)
sum2 = a.sum(axis=2)

如果keepdims是默认，则会把多余的括号删掉
[[[0,1],[2,3]],[[4,5],[6,7]],[[8,9],[10,11]]]
sum的结果
axis0       [[12,15],[18,21]]
axis1       [[2,4],[10,12],[[18,20]]
axis2       [[1,5],[9,13]],[17,21]]
'''


print(sum0,end="\n\n")
print(sum1,end="\n\n")
print(sum2,end="\n\n")