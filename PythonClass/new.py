#copying function
import copy
class yes:
    p1 = yes()
    p1.x = 2
    p1.y = 3
p2 = copy.copy(p1)
print(p1.x)
print(p2.x)