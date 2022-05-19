#include <stdio.h>

void swap(int *px, int *py) {
  int aux = *px;
  *px = *py;
  *py = aux; 
}

int main(){
  int vector[7] = {90, 23, 12, 45, 50, 87, 9};
  int isThereSwap = 1;

  while(isThereSwap){
    isThereSwap = 0;
    for (int i = 0; i < 6; i++) {
      if (vector[i] > vector[i + 1])
      {
        isThereSwap = 1;
        swap(&vector[i], &vector[i + 1]);
      }
    }
  }
  
  printf("\n Result: \n");
  for (int i = 0; i < 7; i++) {
    printf("%d ", vector[i]);
  }
}
