//Gate Level description of AND Gate
module gate(A,B,Y);
input A,B;
output Y;
nand(Y,A,B);

endmodule