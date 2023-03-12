import re

def combineMethod(methodName: str) -> str:
    return combineVariable(methodName) + "()"

def combineClass(className: str)-> str:
    return className.title().replace(" ", "").strip()

def combineVariable(varName: str)-> str:
    temp = varName.title().replace(" ", "").strip()
    return temp[0].lower() + temp[1:]

def split(s: str)-> str:
 
    s = re.sub(r'\([^)]*\)', '', s)
    s = re.sub(r'[^\w\s]', '', s)
    s = re.sub(r'([A-Z])', r' \1', s).strip()
    
    return s.lower()

functionMap = {
    ('M', 'C'): combineMethod,
    ('M', 'S'): split,
    ('C', 'C'): combineClass,
    ('C', 'S'): split,
    ('V', 'C'): combineVariable,
    ('V', 'S'): split
}

#List sẽ bị biến đổi
def createOrSplit(inputs):

    for i in range(len( inputs)):

        op, typ, nms = inputs[i].split(";")
        inputs[i] = functionMap[(typ, op)](nms)

    return inputs
    

if __name__ == "__main__":

    lines = []
    while True:
        try:
            line = input()
        except EOFError:
            break
        lines.append(line)

   
    results = createOrSplit(lines)

    for line in results:
        print(line)