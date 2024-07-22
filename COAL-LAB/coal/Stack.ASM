dosseg
.model small
.stack 100h
.data
.code
main proc
mov ax,5
push ax

mov ax,4
push ax

mov ax,8
push ax

mov ax,5
push ax

pop dx
add dx,48
mov ah,2
int 21h

mov ah,4ch
int 21h

main endp
end main
