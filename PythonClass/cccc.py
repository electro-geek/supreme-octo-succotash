import math
class point:

  def __init__(self,a,b):
    self.x = a
    self.y = b
  def dist(self, p):
        d = math.sqrt((self.x-p.x)**2+(self.y-p.y)**2)
        return d
  def __str__(self):
        return "%d,%d"%(self.x,self.y)
p1 = point(2.0,3.0)
p2 = point(4.0,5.0)
d = p1.dist(p2)
print(d)
print(p1)
