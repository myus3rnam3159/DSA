def breakingRecords(scores):

    res = [0, 0]

    if len(scores) < 2:
        return res

    min_score = scores.pop(0)
    max_score = min_score
    
    while len(scores) > 0:
        score = scores.pop(0)

        if score > max_score:
            max_score = score
            res[0] += 1
        elif score < min_score:
            min_score = score
            res[1] += 1
        
    return res

if __name__ == '__main__':
    scores = [10, 5, 20, 20, 4, 5, 2, 25, 1]
    print(breakingRecords(scores))