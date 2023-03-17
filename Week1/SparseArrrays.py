# Đệ quy
# def countOccurences(arrayIndex: int, stringArray, queryString):

#     if arrayIndex < 0:
#         return 0
    
#     count = 0
#     if stringArray[arrayIndex] == queryString:
#         count = 1
                                   
#     return count + countOccurences(arrayIndex - 1, stringArray, queryString)
    
    
# def matchingStrings(strings, queries):

#     if len(queries) == 0:
#         return None
    
#     query = queries.pop(0)
#     occurence = countOccurences(len(strings) - 1, strings, query)
    

#     subList = matchingStrings(strings, queries)

#     if subList is not None:

#         subList.insert(0, occurence) #Nguy Hiểm
#         return subList
    
#     return [occurence]

def matchingStrings(strings, queries):

    for i in range(len(queries)):
        count = 0

        for s in strings:
            if s == queries[i]:
                count += 1
        
        queries[i] = count
    return queries


if __name__ == '__main__':

    strings = ['ab', 'ab', 'abc']
    queries = ['ab', 'abc', 'bc']

    print (matchingStrings(strings, queries))