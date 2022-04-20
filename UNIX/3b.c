// write a c program to avoid a zombie process by forking twice 

 #include<stdio.h> 
 #include<unistd.h>
 #include<stdlib.h>
 int main()
 {
     int pid;
     pid=fork();
     if(pid==0)
     {
         //first child
        pid = fork();
        if(pid==0)
        {
            //second child
            sleep(1);
            printf("Second child: My parent PID is %d\n",getppid());
        }
     }
     else
     {
         //parent process
        wait(NULL); // we r not waiting for child process to finish 
        sleep(2);
        system("ps -o pid,ppid,state,tty,command");
     }
    return 0;
 }


/*
Zombie state: When a process is created in UNIX using fork() system call, 
the address space of the Parent process is replicated. 
If the parent process calls wait() system call, 
then the execution of the parent is suspended until the child is terminated. 
At the termination of the child, a ‘SIGCHLD’ signal is generated which is delivered 
to the parent by the kernel. Parent, on receipt of ‘SIGCHLD’ reads the status 
of the child from the process table. Even though the child is terminated, 
there is an entry in the process table corresponding to the child where the status 
is stored. When the parent collects the status, this entry is deleted. 
Thus, all the traces of the child process are removed from the system. 
If the parent decides not to wait for the child’s termination and executes
its subsequent task, then at the termination of the child, 
the exit status is not read. Hence, there remains an entry in the process 
table even after the termination of the child. 
This state of the child process is known as the Zombie state. 
*/