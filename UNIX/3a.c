 //3a) write a c program to create a zombie 
 //process and then call system t execute
 //the ps command to verify that the process is zombie.
 #include<stdio.h> 
 #include<unistd.h>
 #include<stdlib.h>
   int main()
     {
        int pid=fork();
        if(pid<0)
                printf("fork error\n");
        else if(pid==0)
                exit(0);
        sleep(2);
        system( "ps -o pid,ppid,state,tty,command");
        exit(0);
    }

    /*
    A zombie process is a process whose execution 
    is completed but it still has an entry in the process table.
    Zombie processes usually occur for child processes, 
    as the parent process still needs to read its child’s exit status.
    If the parent decides not to wait for the child’s termination and executes 
     its subsequent task, then at the termination of the child, 
     the exit status is not read. Hence, there remains an entry in the process 
     table even after the termination of the child. 
     This state of the child process is known as the Zombie state. 
    Zombie processes don't use any system resources but they do retain their process ID.
     
    */
