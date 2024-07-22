dosseg
.MODEL SMALL
.STACK 100h

.DATA
    arr1 DW 10, 2, 8, 9, 26  ; Array declaration
    max DW ?                 ; Variables to store max and min
    min DW ?
    newline DB 0Ah, 0Dh, '$'  ; Newline character

.CODE
MAIN PROC
    MOV AX, @DATA
    MOV DS, AX

    ; Initialize max and min with the first element
    MOV AX, arr1[0]
    MOV max, AX
    MOV min, AX

    ; Loop through the array to find max and min
    MOV CX, 4                 ; Array length - 1 (since we already checked the first element)
    MOV SI, 2                 ; Start from the second element

LoopStart:
    MOV AX, arr1[SI]
    CMP AX, max
    JG UpdateMax
    CMP AX, min
    JL UpdateMin

    ADD SI, 2                 ; Move to the next element
    LOOP LoopStart

    JMP PrintResults

UpdateMax:
    MOV max, AX
    JMP Continue

UpdateMin:
    MOV min, AX
    JMP Continue

Continue:
    JMP LoopStart

PrintResults:
    ; Print "Maximum value: "
    LEA DX, msg1
    MOV AH, 9
    INT 21h

    ; Print the maximum value
    MOV AX, max
    CALL PrintNum

    ; Print newline
    LEA DX, newline
    MOV AH, 9
    INT 21h

    ; Print "Minimum value: "
    LEA DX, msg2
    MOV AH, 9
    INT 21h

    ; Print the minimum value
    MOV AX, min
    CALL PrintNum

    MOV AH, 4Ch
    INT 21h

PrintNum PROC
    MOV CX, 0
    MOV BX, 10

PrintLoop:
    MOV DX, 0
    DIV BX
    PUSH DX
    INC CX
    CMP AX, 0
    JG PrintLoop

PrintDigits:
    POP DX
    ADD DX, 30h
    MOV AH, 2
    INT 21h
    LOOP PrintDigits

    RET
PrintNum ENDP

.DATA
    msg1 DB "Maximum value: $"
    msg2 DB "Minimum value: $"
	
	main endp

END MAIN
