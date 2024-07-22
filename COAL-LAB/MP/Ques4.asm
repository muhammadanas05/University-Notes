dosseg
.model small
.stack 100h
.data
.code
main proc
mov bx,1
mov cx,5
loop1:          
push cx
mov ah,2
mov dl,'*'
mov cx,bx
loop2:
int 21h
Loop loop2

mov ah,2
mov dl,10
int 21h
mov dl,13
int 21h

inc bx
pop cx
Loop loop1

mov ah,4ch
int 21h
main endp
end main
        
        

