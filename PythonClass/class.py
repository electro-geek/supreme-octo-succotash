class Employee:
    def __init__(self, id, name):
        self.id = id
        self.name = name
E1 = Employee(123, 'harsh')
setattr(E1, 'Salary',3000)
print(getattr(E1, 'Salary'))