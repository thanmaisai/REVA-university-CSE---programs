# PATTERN PROGRAMS IN PYTHON

# printing a simple square
def simplesquare(n):
    for i in range(1,n+1):      # n+1 is used because to consider tha last value as the staring value is 1
        for j in range(1,n+1):  # n+1 is used because to consider tha last value as the staring value is 1
            print("{0}".format("*"),end="") # by canging the value in format we can get different symboled patterns
        print("\r") # write something to an output, 
                    # and the instead of going down to a new line (linke in \n ) and writing something else, 
                    # write something over what i already wrote ( \r ).

n=int(input("enter your number: "))
simplesquare(n)

# printing a right half prymid
def right_half_pry(n):
    for i in range(0,n):    # since the starting value if 0 thus we dont consider n+1
        for j in range(0,i+1):
            if(j<=i):
                print("{}".format("*"),end="") # by canging the value in format we can get different symboled patterns
            else:
                print(" ")
        print("\r")

n=int(input("enter the number: "))
right_half_pry(n)


# printing a left half prymid
def left_half_pry(n):
    for i in range(1,n+1):      # n+1 is used because to consider tha last value as the staring value is 1
        for j in range(1,n+1):  # n+1 is used because to consider tha last value as the staring value is 1
            if(j<=n-i):
                print(" ",end="")
            else:
                print("{}".format("*"),end="") # by canging the value in format we can get different symboled patterns
        print("\r")

n=int(input("enter the number: "))
left_half_pry(n)

# printing a inverted left Half Pyramid
def inverted_left_half_pry(n):
    for i in range(1,n+1):            # n+1 is used because to consider tha last value as the staring value is 1
        for j in range(1,(n+1)-i+1): #(n+1) is used because to consider tha last value  as the staring value is 1
            print("{}".format("*"),end="")
        print("\r")
            
n=int(input("enter the number: "))
inverted_left_half_pry(n)


# printing a inverted right Half Pyramid
def inverted_right_half_pry(n):
    for i in range(1,n+1):           # n+1 is used because to consider tha last value as the staring value is 1
        for j in range(1,n+1):       # n+1 is used because to consider tha last value as the staring value is 1
            if(j<i):
                print(" ",end="")
            else:
                print("{}".format("*"),end="")
        print("\r")
            
n=int(input("enter the number: "))
inverted_right_half_pry(n)

# printing a full Pyramid


















