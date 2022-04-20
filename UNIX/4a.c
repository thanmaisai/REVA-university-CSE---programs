//write a c program that outputs the content for its environment list.

#include<stdio.h>
int main(int argc,char *argv[],char* envp[])
{
    int i;
    for(i=0;envp[i] != NULL; i++)
    {
        printf("\n %s",envp[i]);
    }
    return 0;
}
