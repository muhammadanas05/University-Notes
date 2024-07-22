module MyAlu (
input [31:0] A, B,
input [2:0] ALUControl, 
output reg [31:0] Z
);
assign Z = (ALUControl == 3'b010) ? (A & B) : 
(ALUControl == 3'b011) ? (A | B) : (ALUControl == 3'b101) ? {31'b0, A[31]} :
(A + (ALUControl[0] ? ~B : B)); 
endmodule
