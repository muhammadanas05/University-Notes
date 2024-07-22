dosseg
.model small
.stack 100h
.data
num db 0
t1 db 'enter a number greter then 9: $'
t2 db 'invalid$'
t3 db 'number is greter then 9$'
.code
main proc
mov ax,@data
mov ds,ax
mov ah,9
mov dx,offset t1
int 21h
mov ah,01
int 21h
cmp al,09
jbe number
number:
mov cl,04
rol al,cl
mov ah,01
int 21h
sub al,48
mov ah,2
mov dl,0ah
int 21h

cmp al,09
jge h1

mov ah,9
mov dx,offset t2
int 21h
mov ah,4ch
int 21h

h1:
mov ah,9
mov dx,offset t3
int 21h
mov ah,4ch
int 21h

main endp
end main



