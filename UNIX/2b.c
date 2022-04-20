#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    // fork() Create a child process
    int pid = fork();

    if (pid > 0) 
    {
        printf("Parent process\n");
        printf("ID : %d\n\n", getpid());
    }
    else if (pid == 0) 
    {
        printf("Child process\n");
        //pid of child - getpid()
        printf("ID: %d\n", getpid());
        //pid of parent - getppid()
        printf("Parent -ID: %d\n\n", getppid());

        // making the process sleep so that the patent process gets finished
        sleep(10);

        //when the parent process if done and try to print the child process then we et ppid as 1 wihch means the child process is an orphan process
        printf("\nChild process \n");
        printf("ID: %d\n", getpid());
        printf("Parent -ID: %d\n", getppid());
    }
    else  // if fork() returns -1 then no child process is created 
    {
        printf("Failed to create child process");
    }

    return 0;
}