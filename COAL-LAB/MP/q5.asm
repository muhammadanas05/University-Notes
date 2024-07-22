dosseg
.model small
.stack 100h
.data
msg1 db 'enter two digit number: $'
.code
main proc
mov ax,@data
mov ds,ax
mov ah,9
mov dx,offset MSG1
int 21h
mov ah,1
int 21h

sub al,48
mov bh,al

mov ah,1
int 21h
sub al,48
mov bl,al

mov CH,1
MOV CL,0

MOV AH,2
MOV DL,0AH
INT 21H
add bl,cl
mov al,bl
mov ah,0
AAA

mov cl,al
mov bl,ah

add Bl,bh
add bl,ch

mov al,bl
mov ah,0
AAA

MOV BX,AX

MOV DL,BH
ADD DL,48
MOV AH,2
INT 21H

MOV DL,BL
ADD DL,48
MOV AH,2
INT 21H

MOV DL,CL
ADD DL,48
MOV AH,2
INT 21H

mov ah,4ch
int 21h
main endp
end main



