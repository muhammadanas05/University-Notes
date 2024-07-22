dosseg
.model small
.stack 100h
.data
prompt db 'Enter an alphabet: $'
same db 'Characters are same$'
not_same db 'Characters are not same$'

.code
main proc
    mov ax, @data
    mov ds, ax

    mov ah, 9
    mov dx, offset prompt
    int 21h

    mov ah, 1
    int 21h

    cmp al, 'A'
    je print_same
    jmp print_not_same

print_same:
    mov dx, offset same
    jmp print_message

print_not_same:
    mov dx, offset not_same

print_message:
    mov ah, 9
    int 21h

    mov ah, 4ch
    int 21h

main endp
end main
