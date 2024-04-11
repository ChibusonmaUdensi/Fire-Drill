import math
print("a       b    pow(a   b)")

b = 1
n = 6

for i in range(1, n):
	print(math.pow (i, b))
	b = b + 1
	print(str(i) + "       " + str(b)  + "          " +str(math.pow(i, b)))





