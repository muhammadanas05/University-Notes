.MODEL SMALL

.STACK 64

.DATA
        VAL1    DB      01
        VAL2    DB      01
        LP      DB      00
        V1      DB      00
        V2      DB      00
        NL      DB      0DH,0AH,'$'

.CODE

MAIN PROC
        MOV AX,@DATA
        MOV DS,AX

        MOV AH,01
        INT 21H
        MOV CL,AL
        SUB CL,48
        SUB CL,2

        MOV AH,09
        LEA DX,NL
        INT 21H

        MOV AH,02
        MOV DL,VAL1
        ADD DL,48
        INT 21H

        MOV AH,09
        LEA DX,NL
        INT 21H

        MOV AH,02
        MOV DL,VAL2
        ADD DL,48
        INT 21H

        MOV AH,09
        LEA DX,NL
        INT 21H


DISP:
        MOV BL,VAL1
        ADD BL,VAL2

        MOV AH,00H
        MOV AL,BL
        MOV LP,CL
        MOV CL,10
        DIV CL
        MOV CL,LP

        MOV V1,AL
        MOV V2,AH

        MOV DL,V1
        ADD DL,30H
        MOV AH,02H
        INT 21H

        MOV DL,V2
        ADD DL,30H
        MOV AH,02H
        INT 21H

        MOV DL,VAL2
        MOV VAL1,DL
        MOV VAL2,BL

        MOV AH,09
        LEA DX,NL
        INT 21H


        LOOP DISP

        MOV AH,4CH
        INT 21H

MAIN ENDP
END MAIN
