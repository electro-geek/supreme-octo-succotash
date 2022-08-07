# #first example of python
# def facto(n):
#     if(n == 1):
#         return 1
#     nm1 = facto(n-1)
#     result = n*nm1
#     return result
# n = int(input("Enter the value of n \n"))
# r = int(input("Enter the value of r \n"))
# comb = facto(n)/(facto(r)*facto(n-r))
# print(comb)
import numpy as np
import pandas as pd
data = pd.read_csv('Transformed_Housing_Data2.csv')
def sumxmxb(arr, idx, xb):
    if(idx == len(arr)-1):
        return arr[idx]-xb
    nm1 = sumxmxb(arr, idx+1, xb)
    sumsq = ((arr[idx] - xb)**2)+nm1
    return sumsq
def meanfunc(arr, idx):
    if(idx == len(arr)-1):
        return arr[idx]
    nm1 = meanfunc(arr, idx+1)
    result = arr[idx]+nm1
    return result
arr = data['Sale_Price']
mean = meanfunc(arr, 0)/2
print(mean)
s = (((sumxmxb(arr, 0, mean))/(len(arr)-1))**0.5)

print(arr)