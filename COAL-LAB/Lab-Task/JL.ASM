dosseg
.model small
.stack 100h
.data
limit equ 10
.code
main proc
mov ax,@data
mov ds,ax
mov cx,0
mov dx,48
L1:
mov ah,2
int 21h
inc cx
inc dx
cmp cx,limit
jl L1

mov ah,4ch
int 21h

main endp
end main


