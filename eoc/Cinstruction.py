def C2Hack(line,CompDict,DestDict,JumpDict):
    if '=' in line and ';' in line:
        return CompNdJump(line,CompDict,DestDict,JumpDict)
    if '=' in line:
        return Comp(line,CompDict,DestDict)
    elif ';' in line:
        return Jump(line,JumpDict,CompDict)



def Comp(line,CompDict,DestDict):
    binary = '111'
    line = line.split('=')
    if 'M' in line[1]:
        binary = binary + '1'
        line[1] = line[1].replace('M','A')
    else:
        binary = binary + '0'
    binary = binary + CompDict.get(line[1])
    binary = binary + DestDict.get(line[0])
    binary = binary + '000'
    print(binary)
    return binary


def Jump(line,JumpDict,CompDict):
    binary = '111'
    line = line.split(';')
    if 'M' in line[0]:
        binary = binary + '1'
    else:
        binary = binary + '0'
    binary = binary + CompDict.get(line[0])
    binary = binary + '000'
    binary = binary + JumpDict.get(line[1])
    return binary

def CompNdJump(line,CompDict,DestDict,JumpDict):
    binary = '111'
    line = line.split('=')
    line.append(0)
    line[1],line[2]=line[1].split(';')
    if 'M' in line[1]:
        binary = binary + '1'
    else:
        binary = binary + '0'
    binary = binary + CompDict.get(line[1])
    binary = binary + DestDict.get(line[0])
    binary = binary + JumpDict.get(line[2])
    return binary