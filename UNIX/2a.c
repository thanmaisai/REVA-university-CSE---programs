#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
int main()
{
    // creating 3 variables for storing the id of the parent asnd the child 
    int pid,pid1,pid2;
    // using the fork() for creatiing the child process
    pid = fork();

    // if fork() returns 0 then its a child process 
    // if fork() returns -1 then no child is created

    if(pid==0)
    {
        sleep(3);
        printf("child[1]--> pid=%d and ppid=%d\n",getpid(),getppid());
    }
    else
    {
        pid1=fork();
        if(pid1==0)
        {
            sleep(2);
            printf("child[2]-->pid=%d and ppid=%d\n",getpid(),getppid());
        }
        else
        {
            pid2=fork();
            if(pid2==0)
            {
                sleep(2);
                printf("child[3]-->pid=%d and ppid=%d\n",getpid(),getppid());
            }
            else
            {
                sleep(3);
                printf("parent-->pid=%d\n",getpid());
            }
        }
    }
    return 0;
}
