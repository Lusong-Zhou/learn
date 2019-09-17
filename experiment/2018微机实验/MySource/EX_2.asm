DATAP SEGMENT  ;数据段
           x  DW  125,378
       sum  DW ?
       ASCC  DB  6 DUP(0) 
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
         CALL PROCDX2
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
PROCDX2 PROC NEAR
         PUSH  DX
         PUSH  BX
         PUSH  AX
         PUSH  DI
         PUSH  CX
     MOV  CX ,5
            LEA  DI ,ASCC
            XOR  DX ,DX
            MOV  AX ,sum
            MOV  BX ,0AH 
            
  AGAIN:    DIV  BX
            ADD  DL ,30H 
            MOV  [DI],DL
            INC  DI
            AND  AX ,AX
            JZ   STO
            MOV  DL ,0
            LOOP AGAIN

  STO:      MOV  [DI], '$'
            MOV  DX,OFFSET ASCC
            MOV  AH, 09H
            INT  21H 
                   POP  CX
           POP  CX
           POP  SI
           POP  AX
           POP  BX
           POP  DX   
        RET
PROCDX2 ENDP

CODEP ENDS 
            END START
