#include <stdio.h>
#include <stdlib.h>
#include <sys/timeb.h>

#include <time.h>
 
void sleep(unsigned int mseconds)
{
    clock_t goal = mseconds + clock();
    while (goal > clock());
}

int main(int argc, char *argv[])
{
  // Definindo variaveis de tempo inicial e final
  struct timeb tini, tfim;
  // Variavel para armazenar tempo de processamento (tfim - tini)
  int tempototal_milisec;
  
  // Salva e exibe timestamp inicial
  ftime(&tini);
  printf("Timestamp inicial: %d.%d\n", tini.time, tini.millitm);
  
  // Código qualquer para causar uma certa demora 
  // para percebermos o resultado
  sleep(3000);
  int i = 0;
  while (i++ < 100043434) {
    int a = rand();
    
  }
  
  // Salva e exibe timestamp final
  ftime(&tfim);
  printf("Tempo  final: %d.%d\n", tfim.time, tfim.millitm);
  
  // Calcula e exibe diferenca em milisegundos
  tempototal_milisec = (int) (1000.0 * (tfim.time - tini.time)
     + (tfim.millitm - tini.millitm));
  printf("Tempo total em milisegundos: %d\n", tempototal_milisec);
  
  system("PAUSE"); 
  return 0;
}

