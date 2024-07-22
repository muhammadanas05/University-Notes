module gate (Q,P,R,F);
input Q, P,R;
output F;

wire Q_or_P;
wire P_or_R;
wire Q_or_P_AND_P_or_R;

assign Q_or_P = Q|P;
assign P_or_R = P|R;
assign  Q_or_P_AND_P_or_R = (Q_or_P)&(P_or_R);
assign F = Q_or_P_AND_P_or_R;



endmodule