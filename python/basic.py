# factorial of given numbers 
'''
# ------->   using recurssion method (where the factorial_num method is called every time at the time of execution)
def factorial_num(n):
    return 1 if (n==1 or n==0) else n * factorial_num(n-1) ;

num=int(input("enter the number: " ))
print("The factorial of %d is %d \n" % (num,factorial_num(num)))
'''


# -------->   using iteration method 
def factorial_num1(n):
    if(n<0):
        return 0
    elif(n==1 or n==0):
        return 1
    else:
        x=1
        while(n>1):
            x=x*n
            n=n-1
        return x

num=int(input("enter the number: " ))
print("The factorial of %d is %d \n" % (num,factorial_num1(num)))


# simple_intrest = (principle_amount*time*rate_of_intrest)/100 #logic 

# compound intrest (logic)

# amount = principle_amount(1+rate_of_intrest/100)^time
# compunt_intrest = amount - principle_amount
import math
def CPI(p,r,t):
    amount = p*(pow((1+r/100),t))
    cp=amount-p
    return cp

p=int(input("enter the principle amount: " ))
t=int(input("enter the time period: " ))
r=int(input("enter the rate of intrest: " ))
print("the compunt intrest is %d" %CPI(p,r,t))


# Armstrong Number 
# abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + .... or abcd = a^n + b^n + c^n + d^n

#general method (worng progrm--some error)

import math
 
# check the number of digjits in the given number
def num_of_digjis(n):
    x = 0
    while(n>0):
        x=x+1
        n=n/10
    return(x)

# check wether the give number is amstrong or not 
def isamstrong(num):
    x = num_of_digjis(num)
    temp=num
    sum=0
    while(temp>0):
        reminder = temp%10
        sum= sum+ pow(reminder, x)
        temp=temp/10
    return(sum==num)

num=int(input("enter the number: " ))
print("The number %d is amstrong %d \n" % (num,isamstrong(num)))


# or Using Strings check amstrongof a number

def isamstrong(n):
    number=str(n)
    x=len(n)
    output=0
    for i in number:
        output=output+int(i)**x
    
    if(output==int(number)):
        return True
    else:
        False
    
z= input("Enter the number: ")
print("The number %s is amstrong %s"%(z,isamstrong(z))) 


# check if a number is prime

num=int(input("Enter the number to check: "))
# for numbers grater than 1
if num > 1:
    # since i ranges from 2 to num/2 gives a range of numbers through which it will iterate
    for i in range(2,int(num/2)+1):
        if(num%i)==0:
            # since the number is divided by 2 and reminder is 0 
            print(num,"is not a prime number")
            break
        else: # since it was not divided by i its a prime number
            print(num,"is a prime number")
else: # for numbers less than 1
    print(num,"is not a prime number")


# ord( ) method is used to a string length of 1 and return a unicode value(there is no character datatype in python) 

# Python Program for Sum of squares of first n natural numbers

def squaring(num):
    sum=0
    for i in range(1,n+1):
        sum=sum+(i*i)
    return x
num=int(input("Enter the nth number: "))
print(squaring(num))


#  Python Program for Sum of cube of first n natural numbers

def cubing(n):
    sum=0
    for i in range(1,n+1):
        sum=sum=(i*i*i)
    return sum

num=int(input("Enter the nth number: "))
print("The cube of %d is %d "%(num,cubing(num)))



# prime number in an interval (didnt get logic)

def prime(x, y):
    #empty list 
	prime_list = []
    #x=starting, y= ending range 
	for i in range(x, y):
		if i == 0 or i == 1: 
			continue
		else:
			for j in range(2, int(i/2)+1): 
				if i % j == 0:
					break
			else:
				prime_list.append(i)
	return prime_list

# Driver program
starting_range = int(input("num1"))
ending_range = int(input("num2"))
lst = prime(starting_range, ending_range)
if len(lst) == 0:
	print("There are no prime numbers in this range")
else:
	print("The prime numbers in this range are: ", lst)













