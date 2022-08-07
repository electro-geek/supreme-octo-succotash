b = list()
n = int(input('Enetr the length of b'))
for i in range(0,n):
  x = int(input("> "))
  b.append(x)
max = b[0]
for i in range (0,n):
  if max < b[i]:
    max = b[i]
print(max) 
