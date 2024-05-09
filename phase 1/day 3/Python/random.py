import random

Get_Lucky = random.randrange(1,10)
 
sum = 0
win = 0
Number = 0

while(Numbers != Get_Lucky):

	Number = int(input("Enter Get_Lucky Number"))
	sum = sum + 1
if (Number == Get_Lucky):
	print("Incorrect Number")
if (Number != Get_Lucky):
	print("You are correct")
elif(Number == 0):
	print("wrong try")
print(sum)
