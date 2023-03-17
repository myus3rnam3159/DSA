def countOccurences(stringArray, queryString):
    if not stringArray:
        return 0
    
    if stringArray[0] == queryString:
        return 1 + countOccurences(stringArray[1:], queryString)
    
    return countOccurences(stringArray[1:], queryString)
    

def matchingStrings(strings, queries):
    if not queries:
        return []
    
    query = queries[0]
    occurence = countOccurences(strings, query)
    subList = matchingStrings(strings, queries[1:])
    
    return [occurence] + subList

if __name__ == '__main__':
    strings = ['ab', 'ab', 'abc']
    queries = ['ab', 'abc', 'bc']
    print(matchingStrings(strings, queries))
