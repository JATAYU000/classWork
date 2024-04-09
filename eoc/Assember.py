from FileHandling import RemoveWhitespace,SeperateLabel
from Ainstruction import UserDefinedSymbols,A2Hack
from Cinstruction import C2Hack

SymbolTable = {
    'SP': 0, 'LCL': 1, 'ARG': 2, 'THIS': 3, 'THAT': 4,
    'R0': 0, 'R1': 1, 'R2': 2, 'R3': 3, 'R4': 4, 'R5': 5, 'R6': 6, 'R7': 7,
    'R8': 8, 'R9': 9, 'R10': 10, 'R11': 11, 'R12': 12, 'R13': 13, 'R14': 14, 'R15': 15,
    'SCREEN': 0x4000, 'KBD': 0x6000
}

Computation={
    '0':'101010', '1':'111111', '-1':'111010', 'D':'001100', 'A':'110000', '!D':'001101', '!A':'110001','-D':'001111', '-A':'110011',
    'D+1':'011111', 'A+1':'110111', 'D-1':'001110', 'A-1':'110101','D+A':'000010', 'D-A':'010011', 'A-D':'000111', 'D&A':'000000', 'D|A':'010101'
}

Destination = {
    'M':'001', 'D':'010', 'MD':'011', 'A':'100', 'AM':'101', 'AD':'110', 'AMD':'111',
}

JumpSymbol = {
    'JGT':'001', 'JEQ':'010', 'JGE':'011', 'JLT':'100', 'JNE':'101', 'JLE':'110', 'JMP':'111',
}

NewSymbolValue = 16

Symbol = {

}

#Removing the whiteSpace
RemoveWhitespace("assembly.asm","noWalterWhite.asm")

#Updating the symbol table with label symbols
SymbolTable = SeperateLabel("noWalterWhite.asm","noLabel.asm",SymbolDict=SymbolTable)

#A Instruction Symbols
SymbolTable,NewSymbolValue = UserDefinedSymbols('noLabel.asm','ainst.asm',SymbolTable,NewSymbolValue)


with open('ainst.asm', 'r') as obj:
    NewHack = []
    line = obj.readline()
    line = line.strip()

    while line:
        if '@' in  line:
            NewHack.append(A2Hack(line)+'\n')
        else:
            NewHack.append(C2Hack(line,Computation,Destination,JumpSymbol)+'\n')
        
        line = obj.readline()
        line =line.strip()
    

with open('FinalHack.hack','w') as obj:
    obj.writelines(NewHack)

