module MyTestbench; reg [31:0] A, B;
reg [2:0] ALUControl;
wire [31:0] Z;
MyAlu myDut (
.A(a),
.B(b),
.ALUControl(alucontrol),
.Z(z)
);
initial begin
$dumpfile("myDump.vcd");
$dumpvars(0, MyTestbench); end
initial begin
ALUControl <= 3'b010;A <= 32'h00000000; B <= 32'h00000016; #50;
ALUControl <= 3'b011; A <= 32'h00000012; B <= 32'h00000015; #50;
ALUControl <= 3'b101; A <= 32'h00000008; B <= 32'h00000009; #50;
ALUControl <= 3'b001; A <= 32'h0000000A; B <= 32'h0000000B; #50;
$finish; end
endmodule