#include <stdio.h>

int factorialRecursive (int number) {
	if (number == 0 || number == 1) {
		return 1;
	}
	
	return number * factorialRecursive(number - 1);
}

int factorialInteractive (int number) {
	if (number < 0) {
		return 0;
	}
	
	int total = 1;
	for (int n = number; n > 1; n--) {
		total = total * n;
	}
	
	return total;
}

int main () {
	int number;
	
	printf("To calculate the factorial, enter the desired number: \n");
	
	scanf("%d",  &number);
	
	printf("Calculating with factorialRecursive: %d \n", factorialRecursive(number));
	
	printf("Calculating with factorialInteractive: %d \n", factorialInteractive(number));
}
