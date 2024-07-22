dosseg
.model small
.stack 100
.data
num1 db ?
num2 db ?
msg db 'Enter Number:  $'
msg_sub db 'subtraction= $'
msg_add db 'addition= $'
.code
main proc
    mov ax,@data
    mov ds,ax
    mov ah,9
    mov dx,offset msg
    int 21h
    mov ah,1
    int 21h
    sub al,48
    mov bl,al
    mov ah,2
    mov dl,0ah
    int 21h
    mov dx,offset msg
    int 21h
    mov ah,1
    int 21h
    sub al,48
    mov cl,al
    mov ah,2
    mov dl,0ah
    int 21h
    cmp bl,cl
    jg subtract

    mov dx,offset msg_sub
    int 21h
    sub cl,bl
    add cl,48
    mov dl,cl
    mov ah,2
    int 21h
    mov ah,4ch
    int 21h

subtract:
    mov dx,offset msg_add
    int 21h
    add bl,cl
    add bl,48
    mov dl,bl
    mov ah,2
    int 21h
    mov ah,4ch
    int 21h

main endp
end main
