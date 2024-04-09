def RemoveWhitespace(filename,newfilename):
    NewData =[]
    with open(filename, 'r') as obj:
        line = obj.readline()
        while line:
            newline = CleanLine(line)
            if newline!='':
                NewData.append(newline+"\n")
            line=obj.readline()
    WriteData(newfilename,NewData)



def CleanLine(line):
    if line == "\n":
        return ''
    else:
        line = line.strip()
        if "//" in line:
            if line[0:2] == '//':
                return ''
            else:
                line = line[0:line.find('//')]
                line.lstrip()
    return line



def WriteData(filename,Data):
    with open(filename,"w") as obj:
        obj.writelines(Data)



def SeperateLabel(filename,newfilename,SymbolDict):
    NewData = []
    with open(filename, 'r') as obj:
        FileIndex = 0
        line = obj.readline()
        while line:
            if line[0] == '(':
                SymbolDict[line[1:-2]] = FileIndex
            else:
                FileIndex+=1
                NewData.append(line)
            line= obj.readline()

    WriteData(newfilename,NewData)
    return SymbolDict