import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np

fig = plt.figure()  # 没有轴的空图
fig, ax = plt.subplots()  # 具有单轴的图形
fig, axs = plt.subplots(2, 2)  # 具有 2x2 轴网格的图形

plt.show()