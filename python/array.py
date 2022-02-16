'''Python doesn't have a native array data structure, 
    but it has the list which is much more general and can 
    be used as a multidimensional array quite easily.'''


# find the sum of elements in a array
'''
# creat an empty list as array
arr=[]
# user input of elements into the list
n=int(input("Number of elements in the array: "))
for i in range(0,n):
    ele=int(input())
    arr.append(ele)

#adding elemnts in the list
def arr_sum(arr):
    x=len(arr)
    sum=0
    # for i in arr means i will iterate in the list and have the value of the elemnt at that index
    for i in arr:
        sum=sum+i
    return sum

print("the sum of %s is %d"%(arr,arr_sum(arr)))
'''

# find largest element in an array
'''
# creat an empty list as array
arr=[]
# user input of elements into the list
n=int(input("Number of elements in the array: "))
for i in range(0,n):
    ele=int(input())
    arr.append(ele)

# give the length of the array
x=len(arr)
def largest_num_arr(arr,x):
  
    # Initialize maximum element
    max = arr[0]
    # Traverse array elements from second and compare every element with current max
    for i in range(1, n):
        if arr[i] > max:
            max = arr[i]
    return max
    
# by using inbuilt methods
# def largest_num_arr(arr):
#     y=max(arr)
#     return y

print("the largest number in %s is %d"%(arr,largest_num_arr(arr,x)))
'''

# array rotation or Split the array and add at last part to the end
'''
# def split_arr(arr,x,pos): #using list methods
#    b = arr[:pos]
#    return (arr[pos::]+b[::])

def split_arr(arr, x, pos): 
   for i in range(0, pos): 
       y = arr[0]
       for j in range(0, x-1):
           arr[j] = arr[j + 1]
        
       arr[n-1] = y

arr=[]
n=int(input("Number of elements in the array: "))
for i in range(0,n):
    ele=int(input())
    arr.append(ele)

x=len(arr)

pos=int(input("enter tghe position to split at: "))

split_arr(arr, x, pos)
for i in range(0,x):
    print(arr[i],end=" ")
'''

# Find remainder of array multiplication divided by n
'''
arr=[]
# user input of elements into the list
n=int(input("Number of elements in the array: "))
for i in range(0,n):
    ele=int(input())
    arr.append(ele)

#adding elemnts in the list
def arr_mul_div(arr):
    x=len(arr)
    mul=1
    # for i in arr means i will iterate in the list and have the value of the elemnt at that index
    for i in arr:
        mul=mul*i
    return mul

div_num=int(input("enter the number to divide: "))
mul_sum=arr_mul_div(arr)
xyz=mul_sum%div_num
print("output: ",xyz)
'''

# check if given array is Monotonic
'''
# An array is monotonic if it is either monotone increasing or monotone decreasing
# An array A is monotone increasing if for all i <= j, A[i] <= A[j] 
# An array A is monotone decreasing if for all i <= j, A[i] >= A[j]

def isMontonic(arr):
    return(all(arr[i] <= arr[i+1] for i in range(len(arr)-1)) or all(arr[i] <= arr[i+1] for i in range(len(arr)-1)))

arr=[]
n=int(input("Number of elements in the array: "))
for i in range(0,n):
    ele=int(input())
    arr.append(ele)
print("%s is Montonic %s"%(arr,isMontonic(arr)))
'''










