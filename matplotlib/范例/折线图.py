import matplotlib.pyplot as plt
import numpy as np

x = np.linspace(0, 10, 100)#[0,100]之间取100个点包括端点
y = 4 + 2 * np.sin(2 * x)# y=4+2sin2x

fig, ax = plt.subplots() #创建一个画布fig和图形ax

ax.plot(x, y, linewidth=2.0)#传递x和y，设置线宽2

ax.set(xlim=(0, 8), xticks=np.arange(1, 8),# 设置x范围[0,8] 刻度为1到8之间均匀的整数值
       ylim=(0, 8), yticks=np.arange(1, 8))# 设置x范围[0,8] 刻度为1到8之间均匀的整数值

plt.show() #展示