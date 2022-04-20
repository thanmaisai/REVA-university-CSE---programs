#include<stdio.h>
int main()
{
    char cmd[20];
    printf("enter the command:");
    scanf("%s",&cmd);
    system(cmd);
    return 0;
}