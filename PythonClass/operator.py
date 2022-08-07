# #Operater overloading means giving an operator more meaning beyond their predefined meaning 

# class A:
#     def __int__(self, a):
#         self.a = a
#     #is a new method which gives the addition of two objects
#     def __add__(self, o):
#         return self.a+self.o
# ob1 = A(2)
# ob2 = A(1)
# ob3 = A("Greek")
# obj4 = A("for")
# print(ob1+ob2)

# class A:
#     def __init__(self, a):
#         self.a = a
 
#     # adding two objects
#     def __add__(self, o):
#         return self.a + o.a
# ob1 = A(1)
# ob2 = A(2)
# ob3 = A("Geeks")
# ob4 = A("For")
 
# print(ob1 + ob2)
# print(ob3 + ob4)
class child:
    name = "Scott"
class prents(child):
    name = "David"
obj1 = child()
obj2 = prents()
print(obj1.name)
print(obj2.name)
