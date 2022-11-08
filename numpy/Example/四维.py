import numpy as np

a = np.arange(36).reshape(3,3,2,2)

# print(a,end="\n\n")

# sum0 = a.sum(axis=0)
sum1 = a.sum(axis=1)
# sum2 = a.sum(axis=2)
# sum3 = a.sum(axis=3)


# print(sum0,end="\n\n")
print(sum1,end="\n\n")
# print(sum2,end="\n\n")
# print(sum3,end="\n\n")