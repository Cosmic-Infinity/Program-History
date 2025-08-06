`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 14.08.2024 13:29:53
// Design Name: 
// Module Name: full_subtractor_test
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////


module full_subtractor_test();

reg x,y,z;
wire d, b;
full_subtractor fs(x,y,z,d,b);

initial begin
#10
x=0; y=0; z=0;
#10
x=0; y=0; z=1;
#10
x=0; y=1; z=0;
#10
x=0; y=1; z=1;
#10
x=1; y=0; z=0;
#10
x=1; y=0; z=1;
#10
x=1; y=1; z=0;
#10
x=1; y=1; z=1;
#10
$finish;
end

endmodule
