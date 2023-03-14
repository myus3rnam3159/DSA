# VÒNG LẶP #
# def divisbleSumPairs(k:int , ar) -> int:
#     n_pairs = 0

#     while len(ar) > 2:
#         ar_i = ar.pop(0)

#         n = len(ar)
#         j = n - 1

#         while j >= 0:

#             if (ar_i + ar[j]) % k == 0:
#                 n_pairs += 1

#             j -= 1
    
#     if (ar[0] + ar[1]) % k == 0:
#         n_pairs += 1

#     return n_pairs

def divisible_sum_pairs_helper(k, ar_i, ar_tail):

    if len(ar_tail) == 0:
        return 0
    
    elif (ar_i + ar_tail[0]) % k == 0:
        return 1 + divisible_sum_pairs_helper(k, ar_i, ar_tail[1:])
    
    return divisible_sum_pairs_helper(k, ar_i, ar_tail[1:])

def divisible_sum_pairs(k, ar):
    if len(ar) == 2:
        if (ar[0] + ar[1]) % k == 0:
            return 1
        return 0
    
    else:
        ar_i = ar[0]
        ar_tail = ar[1:]
        return divisible_sum_pairs_helper(k, ar_i, ar_tail) + divisible_sum_pairs(k, ar_tail) # Đẳng cấp là dòng này
