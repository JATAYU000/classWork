def AssemberlyFromAssembly(assemblyfilemname,binaryfilename):
    # open the assembly file
    assemblyfile = open(assemblyfilemname, 'r')
    # open the binary file
    binaryfile = open(binaryfilename, 'w')
    # read the assembly file line by line
    for line in assemblyfile:
        # remove the leading and trailing whitespaces
        line = line.strip()
        # split the line into tokens
        tokens = line.split()
        # if the line is empty
        if len(tokens) == 0:
            continue
        # if the line is a comment
        if tokens[0][0] == '#':
            continue
        # if the line is a label
        if tokens[0][-1] == ':':
            continue
        # if the line is an instruction
        if tokens[0] == 'add':
            binaryfile.write('0000')
        elif tokens[0] == 'sub':
            binaryfile.write('0001')
        elif tokens[0] == 'and':
            binaryfile.write('0010')
        elif tokens[0] == 'or':
            binaryfile.write('0011')
        elif tokens[0] == 'ld':
            binaryfile.write('0100')
        elif tokens[0] == 'st':
            binaryfile.write('0101')
        elif tokens[0] == 'jmp':
            binaryfile.write('0110')
        elif tokens[0] == 'beq':
            binaryfile.write('0111')
        elif tokens[0] == 'slt':
            binaryfile.write('1000')
        elif tokens[0] == 'sll':
            binaryfile.write('1001')
        elif tokens[0] == 'srl':
            binaryfile.write('1010')
        elif tokens[0] == 'sra':
            binaryfile.write('1011')
        elif tokens[0] == 'jr':
            binaryfile.write('1100')
        elif tokens[0] == 'nop':
            binaryfile.write('1101')
        elif tokens[0] == 'halt':
            binaryfile.write('1110')
        elif tokens[0] == 'ldi':
            binaryfile.write('1111')
        else:
            print('Unknown instruction: ' + tokens[0])
            binaryfile.close()
            assemblyfile.close()
            return
        # if the instruction has 1 operand
        if len(tokens) == 2:
            binaryfile.write('0000')
            binaryfile.write(format(int(tokens[1]), '04b'))
        # if the instruction has 2 operands
            
        elif len(tokens) == 3:
            binaryfile.write(format(int(tokens[1]), '04b'))
            binaryfile.write(format(int(tokens[2]), '04b'))
        binaryfile.write('\n')
    binaryfile.close()
    assemblyfile.close()
    return

AssemberlyFromAssembly('assembly.asm','binary.txt')