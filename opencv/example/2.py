import numpy as np
import cv2 as cv

gray_img = cv.imread('opencv\img\cantontower.png', 0)  # 加载灰度图像
color_img = cv.imread('opencv\img\cantontower.jpg', 1)  # 加载彩色图像
cv.namedWindow('zsa',cv.WINDOW_AUTOSIZE)
cv.imshow('zsa', gray_img)
b = cv.waitKey()  # 0或无参数则窗口一直等待，如果不为0或空，则n毫秒后消失