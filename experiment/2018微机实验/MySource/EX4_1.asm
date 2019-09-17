DSEG SEGMENT   
         DATA1 DW  0F865H
         DATA2 DW   360CH
DSEG ENDS
ESEG SEGMENT   
         SUM DW  2 DUP(?)
ESEG ENDS

CSEG SEGMENT
         ASSUME CS: CSEG,DS: DSEG ,ES: ESEG
START:     MOV AX,  DSEG
               MOV DS,  AX         
               MOV AX,  ESEG
               MOV ES,  AX
               LEA SI,SUM
               MOV AX, DATA1 
               ADD AX, DATA2
               JNC ADDNCF
               MOV ES:[SI+2] ,  1
               ADDNCF:MOV ES:[SI] ,  AX
               
               MOV AH, 4CH
               INT  21H

CSEG ENDS
                END START