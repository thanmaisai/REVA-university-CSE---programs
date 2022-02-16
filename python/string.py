# split and join a string

string="thanmai sai"
string_split=string.split()
print(string_split)
new_string='-'.join(string_split) # whatever you put in the ' ' will be used as a delimiter
print(new_string)



# check if a string is palindrome or not

def check_palandrome(str):
    if(str==str[::-1]):
        return print("yes the string %s is a palandrome"%str)
    else:
        return print("No the string %s is not a palandrome"%str)

str="malayalam"
check_palandrome(str)

# check whether the string is Symmetrical or Palindrome

string = 'amaama'
half = int(len(string) / 2)

if len(string) % 2 == 0: # even
	first_str = string[:half]
	second_str = string[half:]
else: # odd
	first_str = string[:half]
	second_str = string[half+1:]

# symmetric
if first_str == second_str:
	print(string, 'string is symmertical')
else:
	print(string, 'string is not symmertical')

# palindrome
if first_str == second_str[::-1]: # ''.join(reversed(second_str)) [slower]
	print(string, 'string is palindrome')
else:
	print(string, 'string is not palindrome')



# Reverse words in a given String in Python

str1 = "geeks quiz practice code"
str_split=str1.split()
# join--> It merges the strings representation of the given sequence. 
# reverse() method edits the list to be in a reversed order. 
# However, reversed() method takes a list and returns an iterator of it in reverse order.
new_str=' '.join(reversed(str_split))
print(new_str)


# Check if a Substring is Present in a Given String

str1=" this is a string written by me"
sub_str="written"

# usning the in keyword
# if(sub_str in str1):
#     print(True)
# else:
#     print(False)

# using count() keyword 
if(str1.count(sub_str)>0):
    print(True)
else:
    print(False)


# remove i’th character from string in Python

str1="thanmai"
pos=int(input("Enter the i th charater to be removed: ")) #3
new_str=str1[:pos] +str1[pos+1:] #[0,1] to [3,4,5,6] and thus index 2 i.e(n) from thanmai is removed 
print(new_str)


# print even length words in a string

def even_length_str(x):
    for i in x:
        if(len(i)%2==0):
            print(i)
        else:
            pass


str1="hi my name is thanmai sai i am from reva university"
x=str1.split()
even_length_str(x)


# length of a string can be found in two ways  1) len() or  2) itirate and increment the count variable and the print count 


# Convert Snake case to Pascal case

test_str = 'geeksforgeeks_is_best'
# replace()-->It replaces the old sequence of characters with the new sequence. SYNTAX: replace(old,new[,count])
# title()--> It is used to convert the string into the title-case i.e., The string meEruT will be converted to Meerut.
new_str=test_str.replace("_","").title().replace(" ","")
# here first we r replacing _ with space then title() converds all the saperate words in title-case then again we are replacing space with no space.
print(new_str)


# Words Frequency in String 

# logic method1
# words will be keys and number of times its repeted is the value thus {key:value} i.e,{'hello':2} 
def word_feq(x):
    # create an empty dictionary 
    new_dict ={}
    # itterate through each word in str1(after split) 
    for i in x:
        # if i not found in new dictionary then make the value = 0 and if found then increment by 1
        if i not in new_dict:
            new_dict[i] = 0
        new_dict[i] += 1
    return new_dict


str1="Gfg is best . Geeks are good and Geeks like Gfg"
print("The original string is : " + str(str1))
x=str1.split()
print("The words frequency is : ", word_feq(x))

# method2 by Using dictionary comprehension + count() + split()
res1 = {key: str1.count(key) for key in str1.split()}

# method3 by using counter() keyword
from collections import Counter
res2 = Counter(str1.split()) 
# to use the counter method we need to import it from collections 
# # using of counter keyword will creat a dictionary with keys as words or letters and value as the number of times the word is repeated
print("The words frequency is : " + str(res1))
print("The words frequency is : " + str(res2))



# Remove all duplicates from a given string

# method1 convert string to set
def remove_dublicate1(str2):
    # a set never contains dublicates thus by coverting a string to set will remove the repeted charaters in the string 
    str2=set(str1)
    # now use the join keyword to join each and every element in the set to a new sring and print it
    Str2=''.join(str2)
    print("after removing dublicates in the string: ",Str2)

str1="geeksforgeeks"
remove_dublicate1(str1)

# method 2 by using a new empty string and joining characters to it if its not present in new string 
def remove_duplicate2(str):
	t=""
	for i in str:
		if(i in t):
			pass
		else:
			t=t+i
    # while printing these we get the elemets arranges in order of the string and without dublicates 
	print("after removing dublicates in the string: ",t)
	
str="geeksforgeeks"
remove_duplicate2(str)

#Find words which are greater than given length k

str = "hello geeks for geeks is computer science portal" 
k = 4
str_1=str.split()
str2=[]
for i in str_1:
    if(len(i)>k):
        str2.append(i)

print(' '.join(str2))


# Check if a given string is binary string or not

str="01000111100a1"
str2=set(str)
bset={'0','1'}
if(bset==str2 or str2=={'0'} or str2=={'1'}):
    print(True)
else:
    print(False)

# find uncommon words from two Strings

def uncommon_words(a,b):
    set1=a.split()
    set2=b.split()
    set3=''
    for i in set1:
        if i not in set2:
            set3=set3+" "+i

    for j in set2:
        if j not in set1:
            set3=set3+" "+j

    return set3

# method using summetric differemce 
# def uncommon_words(a,b):
#   a=a.split()
#   b=b.split()
#   k=set(a).symmetric_difference(set(b))
#   return k


a = "Geeks for Geeks" 
b = "Learning from Geeks for Geeks"
print(uncommon_words(a, b))


# https://www.geeksforgeeks.org/python-replace-duplicate-occurrence-in-string/
# https://www.geeksforgeeks.org/python-replace-multiple-words-with-k/
# https://www.geeksforgeeks.org/python-permutation-given-string-using-inbuilt-function/
# https://www.geeksforgeeks.org/python-check-url-string/


# Execute a String of Code in Python
'''
the exec() function to solve the code contained inside a variable. 
exec() function is used for the dynamic execution of Python code. 
It can take a block of code containing Python statements like loops,
function/method definitions  and even try/except block. 
This function doesn't return anything.
'''


# function illustrating how exec() functions.
def exec_code():
    LOC = 
def factorial(num):
    fact=1
    for i in range(1,num+1):
        fact = fact*i
    return fact
print(factorial(5))

    exec(LOC)
     
# Driver Code
exec_code() # this prints the output 120


# String slicing in Python to rotate a string

str = "GeeksforGeeks"
d = 2
def rotaion_str(Str,d):
    # left rotation
    # case1: a_left will store from 0 to d-1
    # acse2: b_left will store from d to last 
    a_left=Str[0:d]
    b_left=Str[d:]

    # right rotation
    # case1:a_right will store from 0 to 2(examle str len is 5 and d=2 as 5-2=3 and 3 will not be included thsi 3-1 = 2)
    # case2:b_right will store from 3 to last 
    a_right=str[0:len(Str)-d]
    b_right=str[len(Str)-d:]

    print("Left rotation: ", (b_left+a_left))
    print("right rotation: ", (b_right+a_right))

rotaion_str(str, d)
