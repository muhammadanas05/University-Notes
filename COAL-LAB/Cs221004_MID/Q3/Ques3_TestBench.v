module tb();

reg A, B, C, clk, reset;
wire Z;

gates dut(
    .A(A),
    .B(B),
    .C(C),
    .clk(clk),
    .reset(reset),
    .Z(Z)
);

always begin
  clk<=1'b1;
  #50;
  clk<=1'b0;
  #50;
end

initial begin
  reset<=1'b1;
  #100;
  reset<=1'b0;
  #100;

  A<=1'b0;
  B<=1'b0;
  C<=1'b0;
  #25
   A<=1'b0;
  B<=1'b0;
  C<=1'b1;
  #25
   A<=1'b0;
  B<=1'b1;
  C<=1'b0;
  #25
   A<=1'b0;
  B<=1'b1;
  C<=1'b1;
  #25
   A<=1'b1;
  B<=1'b0;
  C<=1'b0;
  #25
   A<=1'b1;
  B<=1'b0;
  C<=1'b1;
  #25
   A<=1'b1;
  B<=1'b1;
  C<=1'b0;
  #25
   A<=1'b1;
  B<=1'b1;
  C<=1'b1;
  #25
  
  $finish;
end

initial begin
  $dumpfile("dumpQues3.vcd");
  $dumpvars(0);
end


endmodule