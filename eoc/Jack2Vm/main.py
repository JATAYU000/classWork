import re

def tokenize_jack_code(filename):
    # Define the token types
    token_types = [
        ('KEYWORD', r'class|constructor|function|method|field|static|var|int|char|boolean|void|true|false|null|this|let|do|if|else|while|return'),
        ('SYMBOL', r'[{}()\[\].,;+\-*/&|<>=~]'),
        ('INTEGER_CONSTANT', r'\d+'),
        ('STRING_CONSTANT', r'"[^"\n]*"'),
        ('IDENTIFIER', r'[a-zA-Z_]\w*'),
        ('COMMENT', r'//.*|/\*.*?\*/'),
        ('SPACE', r'\s+')
    ]

    # Compile the regular expressions
    token_regex = '|'.join('(?P<%s>%s)' % pair for pair in token_types)
    token_pattern = re.compile(token_regex)

    # Read the file and tokenize the code
    with open(filename, 'r') as file:
        code = file.read()
        tokens = []
        for match in re.finditer(token_pattern, code):
            token_type = match.lastgroup
            token_value = match.group()
            if token_type != 'SPACE' and token_type != 'COMMENT':
                tokens.append((token_type, token_value))
    return tokens

print(tokenize_jack_code("main.jack"))