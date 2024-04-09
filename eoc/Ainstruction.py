from FileHandling import WriteData


def UserDefinedSymbols(filename,newfilename,SymbolDict,SymbolValue):
    NewData =[]
    with open(filename, 'r') as obj:
        line = obj.readline()
        while line:
            line = line.strip()
            if '@' in line:
                Value = SymbolDict.get(line[1:],'none')
                if Value == 'none':
                    SymbolDict[line[1:]] = SymbolValue
                    line = f'@{SymbolValue}'
                    SymbolValue+=1
                else:
                    line = f'@{Value}'
            NewData.append(line+'\n')
            line=obj.readline()
    WriteData(newfilename,NewData)

    return SymbolDict,SymbolValue





def A2Hack(line):
    binary =''
    num = int(line[1:])
    binary = bin(num).replace("0b", "") 
    for i in range(16 - len(binary)):
        binary = '0'+binary

    return binary


print(A2Hack("@1"))