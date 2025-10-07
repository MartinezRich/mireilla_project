# Programming System

## Week 1

### Git and Github

```bash
创建文件夹
mdkir

切换目录
cd

初始化，创建git仓库
git init

关联远程github仓库
git remote add origin 仓库地址

将文件添加至暂存区
git add 

提交文件
git commit -m 'Initial commit'

推送文件至github
git push -u origin main




```





### Conda

```
conda install
conda activate
conda env list
conda 
```



## Week 2

### Python

```python
import math
# round()并非向下取整，四舍六入五成双, 负数同理
print(round(4.5))
print(round(5.5))
print(round(-2.1))
print(round(-2.6))
print(round(-2.5))
# floor()才是向下取整
print(math.floor(2.5))
print(math.floor(2.9))
print(math.floor(-2.1))
print(math.floor(-1.9))
```

```python
'''
	sort()的使用
'''

nums_list = [2, 3, 1]
# sorted函数是直接对原列表操作,返回值为None
sorted_list1 = nums_list.sort()
print(sorted_list1)  # 输出None
print(nums_list)  #输出排序后的列表[1, 2, 3]


'''
	sorted()的使用
'''
sorted_list2 = sorted(nums_list)
print(sorted(nums_list))
print(nums_list)
```



## Week 3

### Numpy

```python
import numpy as np

zeros = np.zeros(8)
ones = np.ones((2, 2))
fives1 = np.full((10,), 5)
fives2 = np.full(10 ,5)
print(fives1)
print(fives2)
```

```python
import numpy as np

a = np.array([[1, 2], [3, 4]])  # 形状(2, 2)
b = np.array([[5, 6]])  # 形状(1, 2)
ans1 = np.concatenate((a, b), axis=0)
print('ans1:\n', c)

ans2 = np.vstack((a, b))  # 垂直堆叠(按行堆叠), 列数必须保持一致, 相当于np.concatenate((), axis=0)的简洁版
print('ans2:\n', d)

c = np.array([[7, 8 ,9], [1, 2, 3]])
ans3 = np.hstack((a, c))  # 相当于np.concatenate((), axis=1)的简洁版
print('ans3:\n', ans3)

a = np.array([1, 2, 3])  # 形状 (3,)
b = np.array([4, 5, 6])  # 形状 (3,)
ans4 = np.stack((a, b), axis=0)  # 新增“行维度”，结果形状 (2, 3)
ans5 = np.stack((a, b), axis=1)  # 新增“列维度”，结果形状 (3, 2)
print('ans4:\n', ans4)
print('ans5:\n', ans5)
```

