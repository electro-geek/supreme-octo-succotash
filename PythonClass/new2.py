
fadd = input("Enter the file_address\n")
try:
    fhand = open('fadd','r')
except:
    print("File not found")
    exit()
# for line in fhand:
#     word = line.split()
#     d = dict()
#     for words in word:
#         if words in d:
#             d[words] = 1
#         else:
#             d[words] += 1
#     print(d)