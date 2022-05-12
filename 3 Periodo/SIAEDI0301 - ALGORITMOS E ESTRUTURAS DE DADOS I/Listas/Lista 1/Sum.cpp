#include <stdio.h>

int sumRecursive (int number) {
	if (number < 1) {
		return 0;
	}
	
	if (number == 1) {
		return 1;
	}
	
	return number + sumRecursive(number - 1);
}

int sumInteractive (int number) {
	if (number < 1) {
		return 0;
	}
	
	if (number == 1) {
		return 1;
	}
	
	int total = 0;
	for (int n = number; n > 0; n--) {
		total = total + n;
	}
	
	return total;
}

int main () {
	int number;
	
	printf("To calculate the summation, enter the desired number: \n");
	
	scanf("%d",  &number);
	
	printf("Calculating with sumRecursive: %d \n", sumRecursive(number));
	
	printf("Calculating with sumInteractive: %d \n", sumInteractive(number));
}
