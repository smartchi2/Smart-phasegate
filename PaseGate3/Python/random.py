import random

correct = 0
wrong = 0
for user in range(10):
	firstNumbers_entered = random.randint(-100, 100)
	secondNumbers_entered = random.randint(-100, 100)
operand = "+"
if operand == "+":
	answer = firstNumbers_entered + secondNumbers_entered

	answer =	firstNumbers_entered + secondNumbers_entered
	print(firstNumber_entered ," operand" ,secondNumber_entered, end="" )
	user = int(input())
if answer == user:
	correct += 1
else:
      wrong += 1

print("The correct numbers entered", correct)
print("The wrongt numbers entered", wrong)