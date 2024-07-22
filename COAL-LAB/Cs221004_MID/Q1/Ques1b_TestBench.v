module tb();
reg A; reg B; wire Y;
gate dut (.A(A), .B(B), .Y(Y));

initial begin
A <= 1'b0;
B <= 1'b0;
#100;
A <= 1'b0;
B <= 1'b1;
#100;
A <= 1'b1;
B <= 1'b0;
#100;
A <= 1'b1;
B <= 1'b1; 
#100;
$finish;
end

initial
begin
$dumpfile("Dump1b.vcd");
$dumpvars(0);
end

endmodule