DATAP SEGMENT  ;数据段
           x  DW  125,378
       sum  DW ?
DATAP ENDS 

CODEP SEGMENT   ；代码段
        MAIN PROC FAR
           ASSUME CS:CODEP,DS:DATAP
  START:              PUSH DS
                      XOR AX,AX
                      PUSH AX
                      MOV AX,DATAP
                      MOV DS,AX
                      
                      MOV  SI,OFFSET x
                      CALL PROCDP
                      RET  ;弹出给cs和ip  
         MAIN  ENDP 
                       ;求和、显示子程序

PROCDP PROC NEAR
         PUSH  DX
         PUSH  BX
         PUSH  AX
         PUSH  SI
         PUSH  CX
         
         MOV  AX,[SI]
         ADD  AX,[SI+2]
         MOV sum,AX
         CALL PROCDX
           POP  CX
           POP  SI
           POP  AX
           POP  BX
           POP  DX
           
           RET
PROCDP ENDP
PROCDX PROC NEAR
         MOV  BX,sum
         MOV  CH,4
 T1:   MOV  CL,4
         ROL   BX,CL
         MOV  AL,BL
         AND   AL,0FH
         ADD  AL,30H
         CMP  AL,3AH
         JL  T2
         ADD  AL,07H
 T2: MOV  DL,AL
       MOV  AH,2
       INT 21H
       
        DEC CH
       JNZ  T1
           
        RET
PROCDX ENDP   
CODEP ENDS 
            END START
