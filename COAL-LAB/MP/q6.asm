.MODEL SMALL
.STACK 100h

.DATA
prompt DB 'Enter a number: $'
result DW 0
ascii_result DB 5 DUP('$')
newline DB 13, 10, '$'

.CODE
MAIN PROC
    MOV AX, @DATA
    MOV DS, AX

    LEA DX, prompt
    MOV AH, 09h
    INT 21h

    CALL GET_INPUT
    MOV CX, AX

    MOV AX, 0001h
    MOV DX, 0000h

CALC_LOOP:
    MUL CX
    LOOP CALC_LOOP

    MOV CX, 0
CONVERSION_LOOP:
    MOV DX, 0
    MOV BX, 10
    DIV BX
    ADD DX, '0'
    PUSH DX
    INC CX
    CMP AX, 0
    JNE CONVERSION_LOOP

    MOV SI, 0
STORE_LOOP:
    POP AX
    MOV ascii_result[SI], AL
    INC SI
    LOOP STORE_LOOP

    LEA DX, newline
    MOV AH, 09h
    INT 21h

    MOV AH, 09h
    LEA DX, ascii_result
    INT 21h

    MOV AH, 4Ch
    INT 21h
MAIN ENDP

GET_INPUT PROC
    MOV AH, 01h
    INT 21h
    SUB AL, '0'
    MOV AH, 0
    RET
GET_INPUT ENDP

END MAIN
