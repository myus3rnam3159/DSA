def countElements(array):
    p, n, z = 0, 0, 0

    if len(array) == 0:
        return 0, 0, 0

    e = array.pop(0)

    if e > 0:
        p += 1

    elif e < 0:
        n += 1
    
    elif e == 0:
        z += 1 
    
    
    sum = countElements(array)

    return p + sum[0], n + sum[1], z + sum[2]



def printRatio(numerator: int, denominator: int):

    if numerator > 0 and denominator > 0:
        result = "{:.6f}".format(numerator/denominator)
        print(result)

    elif numerator == 0 and denominator > 0:
        print(0)

def plusMinus(arr):
    
    n = len(arr)
    positiveElements, negativeElements, zeros = countElements(arr)

    printRatio(positiveElements, n)
    printRatio(negativeElements, n)
    printRatio(zeros, n)