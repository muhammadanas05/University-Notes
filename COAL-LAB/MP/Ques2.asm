dosseg
.model small
.stack 100h
.data
msg1 db 'enter a character: $'
msg2 db 10,13,'vowel$'
msg3 db 10,13,'not vowel$'      
.code
main proc
mov ax,@data
mov ds,ax
mov ah,9
mov dx,offset msg1
int 21h
mov ah,1
int 21h
cmp al,'A'
je v1
cmp al,'a'
je v1
cmp al,'E'
je v1
cmp al,'e'
je v1
cmp al,'I'
je v1
cmp al,'i'
je v1
cmp al,'O'
je v1
cmp al,'o'
je v1
cmp al,'U'
je v1
cmp al,'u'
je v1

mov ah,9
mov dx,offset msg3
int 21h
mov ah,4ch
int 21h

v1:
mov ah,9
mov dx,offset msg2
int 21h
mov ah,4ch
int 21h

main endp
end main
