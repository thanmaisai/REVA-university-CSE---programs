'''
# few slicing tips https://youtu.be/A5N_-kMbv1o
SYNTAX: [start:end:step] 

[::] returns full list
[::-1] return reversed full list cuz step=-1
'''

# interchange first and last elements in a list

def swap_in_list1(list):
    # normal method
    size = len(list)
    temp=list[0]
    list[0]=list[size-1]
    list[size-1]=temp

    # or in one line we can modify the method as
    # list[0],list[-1]=list[-1],list[0]

    #Using * operand
    #first,*middle,last=list
    #list=last,*middle,first
    #return list

list=[]
n=int(input("number of elements in the list: "))
for i in range(0,n):
    ele=int(input())
    list.append(ele)

print("Before interchanging the list: ",list)
print("after interchaning: ",swap_in_list1(list))


# swap two elements in a list

def swap_pos_in_list(list,pos1,pos2):
    #simple swaping using comas
    list[pos1],list[pos2]=list[pos2],list[pos1]
    
    # # using pop and insert method
    # first_ele = list.pop(pos1)  
    # second_ele = list.pop(pos2-1) # why pos2-1 ?
    # # inserting in each others positions
    # list.insert(pos1, second_ele) 
    # list.insert(pos2, first_ele)
    
    return list

list=[]
n=int(input("number of elements in the list: "))
for i in range(0,n):
    ele=int(input())
    list.append(ele)
pos1=int(input("enter the first position: "))
pos2=int(input("enter the second position: "))

print("Before interchanging: ",list)
#we use the pos-1 and pos2-1 cuz in indexing od list it starts from 0 
print("after interchaning: ",swap_pos_in_list(list,pos1-1,pos2-1))


# Reversing a List in Python

def reverse_list(list):
    # in-built reverse function 
    # rev_list=list.reverse()

    # using slising method 
    #[::] full list and [::-1] full list in reverse order cuz here the sep is -1 this it reverses the list
    rev_list=list[::-1]

    return rev_list

list=[]
n=int(input("number of elements in the list: "))
for i in range(0,n):
    ele=int(input())
    list.append(ele)

print("original list:",list)
print("reversed list",reverse_list(list))


# result = numpy.prod(list) gives the multiplication of all the elements in the list
# result = math.prod(list) gives product of list and we need to import math module to use math.prod()

# find smallest

# uning min(list) by inbuilt method or by list.sort() and printing the first elemnet or 
l=[ int(l) for l in input("List:").split(",")]
print("The list is ",l)

# Assign first element as a minimum.
min1 = l[0]
for i in range(len(l)):
	# If the other element is min than first element
	if l[i] < min1:
		min1 = l[i] #It will change

print("The smallest element in the list is ",min1)


# find largest

# uning max(list) by inbuilt method or by list.sort() and then printing the last element or 
l=[ int(l) for l in input("List: ").split(",")]
print("The list is ",l)

# Assign first element as a minimum.
max1 = l[0]
for i in range(len(l)):
	# If the other element is min than first element
	if l[i] > max1:
		max1 = l[i] #It will change

print("The largest element in the list is: ",max1)


# find second largest 

# list.sort() and the returning the second last element list[-2] or the below logic
def second_largest(arr):
	secondLargest = arr[0]
	largest = arr[0]
	for i in range(len(arr)):
		if arr[i] > largest:
			largest = arr[i]

	for i in range(len(arr)):
		if arr[i] > secondLargest and arr[i] != largest:
			secondLargest = arr[i]

	return secondLargest


list=[]
n=int(input("number of elements in the list: "))
for i in range(0,n):
    ele=int(input())
    list.append(ele)

print("The second largest number in %s is: %d "%(list,second_largest(list)))



# cumultive sum 

def cumultive_sum(list):
    new_list=[]
    j=0
    for i in range(0,len(list)):
        j=j+list[i]
        new_list.append(j)
    return new_list

list=[]
n=int(input("number of elements in the list: "))
for i in range(0,n):
    ele=int(input())
    list.append(ele)
print("the cumulative list is: ",cumultive_sum(list))

# sort one list based on another list

# syntax for zipping and unzipping
# zipping 2 lists-->    zip_file=zip(list1,list2)
# unzipping a list-->   list1_after_unzipped,list2_after_unzipped=zip(*zip_file)

def sort_list(list1, list2):
    # while zipping we need to get the indexes as the first preferance as it will help to use the sorted() function
    # because they will be considered as keys and thus return as [list2,list1] format 
    # ex:[0,a] i.e for 0 key the value is a 
    zip_file=zip(list2,list1)
    # always the sorted() sorts only keys in dictionary's and by default in acending order  
    xyz = sorted(zip_file)
    # now unziping the list
    sorted_list1,sorted_list2=zip(*xyz)
    #after unzipping the list2 stores the values(alphabets) as the list1 stores the keys(numbers/index)
    return sorted_list2      

# driver code
list1 = ["a", "b", "c", "d", "e", "f", "g", "h", "i"]
list2 = [ 0, 1, 1, 0, 1, 2, 2, 0, 1]

print(sort_list(list1, list2))

list1 = ["g", "e", "e", "k", "s", "f", "o", "r", "g", "e", "e", "k", "s"]
list2 = [ 0, 1, 1, 0, 1, 2, 2, 0, 1]

print(sort_list(list1, list2))

# Break a list into chunks of size N
list=[1,2,3,4,5,6,7,8,9]
n=int(input("Enter the number of elements per list: "))
for i in range(0,len(list),n):

    x = list[i:i + n]
    print(x,end=" ")







































