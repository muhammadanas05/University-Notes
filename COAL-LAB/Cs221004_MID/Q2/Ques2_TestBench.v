module tb;
reg P,Q,R;
wire F;
gate dut(
    .P(P),
    .Q(Q),
    .R(R),
    .F(F)
);
 initial begin 
P<=1'b0;
  Q<=1'b0;
  R<=1'b0;
  #25
   P<=1'b0;
  Q<=1'b0;
  R<=1'b1;
  #25
   P<=1'b0;
  Q<=1'b1;
  R<=1'b0;
  #25
   P<=1'b0;
  Q<=1'b1;
  R<=1'b1;
  #25
   P<=1'b1;
  Q<=1'b0;
  R<=1'b0;
  #25
   P<=1'b1;
  Q<=1'b0;
  R<=1'b1;
  #25
   P<=1'b1;
  Q<=1'b1;
  R<=1'b0;
  #25
   P<=1'b1;
  Q<=1'b1;
  R<=1'b1;
  
  
  $finish;

end
initial begin 
         $dumpfile("dumpQues2.vcd");
         $dumpvars(0);
         end
endmodule