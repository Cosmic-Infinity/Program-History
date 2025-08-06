`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 01.11.2024 20:16:49
// Design Name: 
// Module Name: jk_ff
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


module jk_ff(input j,input k,input clk, input pre, output reg q,output reg qnot);
     
     always @ (posedge clk) begin
        if(pre == 1) begin
            q = 1;
            qnot = 0;
        end
        else begin
            if(j==0 && k==0) begin
                q = q;
                qnot = qnot;
            end 
            else if(j==0 && k==1) begin
                q = 0;
                qnot = 1;
            end
            else if(j==1 && k==0) begin
                q = 1;
                qnot = 0;
            end
            else if(j==1 && k==1) begin
                q = ~q;
                qnot = ~qnot;
            end
        end
/*        case ({j,k})  
           2'b00 :  q <= q;  
           2'b01 :  q <= 0;  
           2'b10 :  q <= 1;  
           2'b11 :  q <= ~q;  
        endcase   
        qnot <= ~q;     
*/
   end
endmodule
