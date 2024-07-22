dosseg
.model small
.stack 100h
.data
prompt db 'Enter a number: $'
notZeroMsg db 'Number is not equal to zero$'
zeroMsg db 'Number is equal to zero$'

.code
main proc
    mov ax, @data
    mov ds, ax

    mov ah, 9
    mov dx, offset prompt
    int 21h

    mov ah, 1
    int 21h
    sub al, 48
    mov bl, al

    mov ah, 2
    mov dl, 0ah
    int 21h

    cmp bl, 0
    jne notZero

    mov ah, 9
    mov dx, offset zeroMsg
    int 21h

    jmp exit

notZero:
    mov ah, 9
    mov dx, offset notZeroMsg
    int 21h

exit:
    mov ah, 4ch
    int 21h

main endp
end main
