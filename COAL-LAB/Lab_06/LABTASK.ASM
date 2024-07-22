org 100h
section .data
        m1 db 'Enter 1st num: $'
        m2 db 'Enter 2nd Num: $'
        m3 db 'Sum: $'

section .bss
        num1 resb 1
        num2 resb 1
        sum resb 1

section .text
        jmp start

input:
        mov ah, 9
        lea dx, [m1]
        int 21h

        mov ah, 1
        int 21h
        sub al, '0'
        mov [num1], al
        ret

start:
        call input

        mov ah, 9
        lea dx, [m2]
        int 21h

        mov ah, 1
        int 21h
        sub al, '0'
        mov [num2], al

        mov al, [num1]
        add al, [num2]
        mov [sum], al

        mov ah, 9
        lea dx, [m3]
        int 21h

        mov ah, 2
        mov dl, [sum]
        add dl, '0'
        int 21h

        mov ah, 4Ch
        int 21h

