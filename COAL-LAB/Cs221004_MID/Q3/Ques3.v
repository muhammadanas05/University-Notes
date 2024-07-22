module gates(A,B,C,clk,reset,Z);

input A, B, C, clk, reset, result;
output Z;

wire A_or_B_and_C;
 
assign A_or_B_and_C = (A | B) & C;

reg Z;
assign result = A_or_B_and_C;

always @(posedge clk)begin
  if(reset==1'b1)begin
    // result <= 1'b0;
    Z <= 1'b0;
  end
  else begin
    // result <= A_or_B_and_C;
    Z <= result;
  end
end

// assign Z = result;

endmodule

