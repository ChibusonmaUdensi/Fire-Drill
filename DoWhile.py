while True:
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))

    sum = num1 + num2
    print("The sum is:", sum)

    choice = input("Do you want to perform the operation again? (yes/no): ")
    if choice.lower() != 'yes':
        break