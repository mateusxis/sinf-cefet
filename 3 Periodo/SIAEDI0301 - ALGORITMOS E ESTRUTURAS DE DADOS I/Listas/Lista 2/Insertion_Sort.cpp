#include <stdio.h>

void swap(int *px, int *py) {
  int aux = *px;
  *px = *py;
  *py = aux;
}

int main() {
  int vector[7] = {90, 23, 12, 45, 50, 87, 9};

  for (int i = 0; i < 6; i++)
  {
    if (vector[i] > vector[i + 1])
    {
      swap(&vector[i], &vector[i + 1]);
    }
    for (int j = i; j > 0; j--)
    {
      if (vector[j] < vector[j - 1])
      {
        swap(&vector[j], &vector[j - 1]);
      }
    }
  }

  printf("\n Final \n");

  for (int i = 0; i < 7; i++) {
    printf("%d ", vector[i]);
  }
}