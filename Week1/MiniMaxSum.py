def heapify(arr, n, i):

    largest = i

    l = 2 * i + 1  
    r = 2 * i + 2  

    if l < n and arr[i] < arr[l]:
        largest = l

    if r < n and arr[largest] < arr[r]:
        largest = r

    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]  

        heapify(arr, n, largest)

def heapSort(arr):
    n = len(arr)
    
    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)

    for i in range(n - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]  
        heapify(arr, i, 0)

    return arr

def miniMaxSum(arr):

    n = len(arr)

    if n < 4:
        print("array length is less than 4")

    elif n == 4:
        Sum = sum(arr)
        print(Sum, Sum)

    sortedArray = heapSort(arr)
    
    print(sum(sortedArray[:4], sum(sortedArray[-4:])))