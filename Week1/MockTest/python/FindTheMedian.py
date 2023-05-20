def find_median(arr):
    n = len(arr)
    left = 0
    right = n - 1
    k = n // 2

    while left <= right:
        pivot_index = partition(arr, left, right)
        if pivot_index == k:
            return arr[pivot_index]
        elif pivot_index < k:
            left = pivot_index + 1
        else:
            right = pivot_index - 1

    return None

def partition(arr, low, high):
    pivot_value = arr[low]
    left = low + 1
    right = high

    done = False
    while not done:
        while left <= right and arr[left] <= pivot_value:
            left = left + 1
        while arr[right] >= pivot_value and right >= left:
            right = right - 1
        if right < left:
            done = True
        else:
            arr[left], arr[right] = arr[right], arr[left]

    arr[low], arr[right] = arr[right], arr[low]

    return right
