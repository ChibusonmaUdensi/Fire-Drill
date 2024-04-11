def display_bars(numbers):
    for num in numbers:
        print('*' * num)

numbers = []
for i in range(5):
    while True:
        num = int(input(f"Enter number {i + 1} (between 1 and 30): "))
        if 1 <= num <= 30:
            numbers.append(num)
            break
        else:
            print("Number must be between 1 and 30.")

print("\nDisplaying bars of asterisks:")
display_bars(numbers)