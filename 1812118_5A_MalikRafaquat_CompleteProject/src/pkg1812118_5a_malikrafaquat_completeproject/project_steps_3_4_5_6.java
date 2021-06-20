/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1812118_5a_malikrafaquat_completeproject;

/**
 *
 * @author rafaq
 */
public class project_steps_3_4_5_6 {
    Token token;
    project_step_7 list = new project_step_7();
    int ROW_NUM;
    public int get_serial_no(){
        return ROW_NUM;
    }
    public void set_serial_no(int serial_no){
        this.ROW_NUM = serial_no;
    }
    
    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public int relop(String data, int c_count,int line_counter) {
        int state = 0;
        char c;
        token = new Token("RELOP");
        while (true) {
            switch (state) {
                case 0:
                    c = data.charAt(c_count);
                    if (c == '<') state = 1;
                    else if (c == '=') state = 5;
                    else if (c == '>') state = 7;
                    else {
                        token.settoken_name(null);
                        return c_count;
                    }
                    break;

                case 1:
                    c = data.charAt(++c_count);
                    if (c == '=') state = 2;
                    else if (c == '>') state = 3;
                    else state = 4;
                    break;

                case 2:
                    ROW_NUM++;
                    System.out.print("=");
                    token.setattribute("LE");
                    token.setlexeme("<");
                    list.add(ROW_NUM,line_counter,"<=","RELOP","LE");
                    return ++c_count;

                case 3:
                    ROW_NUM++;
                    System.out.print(">");
                    token.setattribute("NE");
                    token.setlexeme("<>");
                    list.add(ROW_NUM,line_counter,"<>","RELOP","NE");
                    return c_count;

                case 4:
                    ROW_NUM++;
                    c_count--;
                    token.setattribute("LT");
                    token.setlexeme("<");
                    list.add(ROW_NUM,line_counter,"<","RELOP","LT");
                    return c_count;

                case 5:
                    c = data.charAt(++c_count);
                    if (c == '=') state = 6;
                    else {
                        c_count--;
                        token.settoken_name(null);
                        return c_count;
                    }
                    break;

                case 6:
                    ROW_NUM++;
                    System.out.print("=");
                    token.setattribute("EQ");
                    token.setlexeme("==");
                    list.add(ROW_NUM,line_counter,"==","RELOP","EQ");
                    return ++c_count;

                case 7:
                    c = data.charAt(++c_count);
                    if (c == '=') state = 8;
                    else state = 9;
                    break;

                case 8:
                    ROW_NUM++;
                    System.out.print("=");
                    token.setattribute("GE");
                    token.setlexeme(">=");
                    list.add(ROW_NUM,line_counter,">=","RELOP","GE");
                    return ++c_count;

                case 9: {
                    ROW_NUM++;
                    c_count--;
                    token.setattribute("GT");
                    token.setlexeme(">");
                    list.add(ROW_NUM,line_counter,">","RELOP","GT");
                    return c_count;
                }

            }
        }
    }

    public int arop(String data, int c_count,int line_counter) {
        int state = 0;
        char c;
        token = new Token("AROP");
       
        while (true) {
            switch (state) {
                case 0:
                    c = data.charAt(c_count);
                    if (c == '+') state = 1;
                    else if (c == '-') state = 2;
                    else if (c == '*') state = 3;
                    else if (c == '/') state = 4;
                    else {
                        token.settoken_name(null);
                        return c_count;
                    }
                    break;
                case 1:
                    ROW_NUM++;
                    token.setattribute("ADD");
                    token.setlexeme("+");
                    list.add(ROW_NUM,line_counter,"+","AROP","ADD");
                    return c_count;

                case 2:
                    ROW_NUM++;
                    token.setattribute("SUB");
                    token.setlexeme("-");
                    list.add(ROW_NUM,line_counter,"-","AROP","SUB");
                    return c_count;

                case 3:
                    ROW_NUM++;
                    token.setattribute("MUL");
                    token.setlexeme("*");
                    list.add(ROW_NUM,line_counter,"*","AROP","MUL");
                    return c_count;

                case 4:
                    ROW_NUM++;
                    token.setattribute("DIV");
                    token.setlexeme("/");
                    list.add(ROW_NUM,line_counter,"/","AROP","DIV");
                    return c_count;
            }
        }
    }
    public int otop(String data, int c_count,int line_counter) {
        int state = 0;
        char c;
        token = new Token("OTOP");
        while (true) {
            switch (state) {
                case 0:
                    c = data.charAt(c_count);
                    if (c == '=') state = 1;
                    else if (c == '(') state = 2;
                    else if (c == ')') state = 3;
                    else if (c == '{') state = 4;
                    else if (c == '}') state = 5;
                    else if (c == ';') state = 6;
                    else {
                        token.settoken_name(null);
                        return c_count;
                    }
                    break;
                case 1:
                    ROW_NUM++;
                    token.setattribute("ASN");
                    token.setlexeme("=");
                    list.add(ROW_NUM,line_counter,"=","OTOP","ASN");
                    return c_count;

                case 2:
                    ROW_NUM++;
                    token.setattribute("LPRN");
                     token.setlexeme("(");
                     list.add(ROW_NUM,line_counter,"(","OTOP","LPRN");
                    return c_count;

                case 3:
                    ROW_NUM++;
                    token.setattribute("RPRN");
                     token.setlexeme(")");
                     list.add(ROW_NUM,line_counter,")","OTOP","RPRN");
                    return c_count;

                case 4:
                    ROW_NUM++;
                    token.setattribute("LBRC");
                     token.setlexeme("{");
                     list.add(ROW_NUM,line_counter,"{","OTOP","LBRC");
                    return c_count;

                case 5:
                    ROW_NUM++;
                    token.setattribute("RBRC");
                     token.setlexeme("}");
                     list.add(ROW_NUM,line_counter,"}","OTOP","RBRC");
                    return c_count;

                case 6:
                    ROW_NUM++;
                    token.setattribute("LNTR"); 
                    token.setlexeme(";");
                    list.add(ROW_NUM,line_counter,";","OTOP","LNTR");
                    return c_count;
            }
        }
    }
   
      
    public int recognize_identifier(String data, int c_count,int line_counter) {
        String id_lexeme ="";
        int state = 0;
        char c;
        token = new Token("ID");
        while (true) {
            switch (state) {
                case 0:
                    c = data.charAt(c_count);
                    if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)||(c == '_') ) state = 1;
                    else {
                        token.settoken_name(null);
                        return c_count;
                    }
                    break;
                case 1:
                    id_lexeme=id_lexeme+data.charAt(c_count);
                    c = data.charAt(++c_count);
                    if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                        System.out.print(data.charAt(c_count));
                        state = 1;
                    }
                    else {
                          //c_count--;  
                          state=2;}
                    break;
                case 2:
                       ROW_NUM++;
                       token.setattribute(""+ROW_NUM);
                     //token.setattribute("10");
                       token.setlexeme(id_lexeme);
                       list.add(ROW_NUM,line_counter,id_lexeme,"ID",""+ROW_NUM);
                       return c_count;
            }
        }
    }

       
    
    public int recognize_keywords(String data, int c_count,int line_counter) {
        int state = 0;
        char c;
        token = new Token("KEYWORD");
        while (true) {
            switch (state) {
                case 0:
                    c = data.charAt(c_count);
                    if (c == 'b') state = 1;
                    else if (c == 'e') state = 6;
                    else if (c == 'i') state = 12;
                    else if (c == 't') state = 16;
                    else if (c == 'f') state = 20;
                    else if (c == 'c') state = 25;
                    else if (c == 's') state = 29;
                    else {
                        token.settoken_name(null);
                        return c_count;
                    }
                    break;
                case 1:
                    c = data.charAt(++c_count);
                    if (c == 'e') state = 2;
                    else {
                        token.settoken_name(null);
                        return --c_count;
                    }
                    break;
                case 2:
                    c = data.charAt(++c_count);
                    if (c == 'g') state = 3;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 3:
                    c = data.charAt(++c_count);
                    if (c == 'i') state = 4;
                    else {
                        token.settoken_name(null);
                        return c_count-3;
                    }
                    break;
                case 4:
                    c = data.charAt(++c_count);
                    if (c == 'n') state = 5;
                    else {
                        token.settoken_name(null);
                        return c_count-4;
                    }
                    break;
                case 5:
                    
                    System.out.print("\bbegin");
                    token.setattribute("begin");
               //   token.setAttributeValue("1");
                    token.setlexeme("begin");
                    return ++c_count;
                case 6:
                    c = data.charAt(++c_count);
                    if (c == 'n') state = 7;
                    else if (c == 'l') state = 9;
                    else {
                        token.settoken_name(null);
                        return --c_count;
                    }
                    break;
                case 7:
                    c = data.charAt(++c_count);
                    if (c == 'd') state = 8;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 8:
                    
                    System.out.print("\bend");
                    token.setattribute("end");
               //   token.setAttributeValue("2");
                    token.setlexeme("end");
                    return ++c_count;
                case 9:
                    c = data.charAt(++c_count);
                    if (c == 's') state = 10;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 10:
                    c = data.charAt(++c_count);
                    if (c == 'e') state = 11;
                    else {
                        token.settoken_name(null);
                        return c_count-3;
                    }
                    break;
                case 11:
                    System.out.print("\belse");
                    token.setattribute("else");
               //   token.setAttributeValue("3");
                    token.setlexeme("else");
                    return ++c_count;
                case 12:
                    c = data.charAt(++c_count);
                    if (c == 'f') state = 13;
                    else if(c == 'n') state = 14;
                    else {
                        token.settoken_name(null);
                        return --c_count;
                    }
                    break;
                case 13:
                    
                    System.out.print("\bif");
                    token.setattribute("if");
               //   token.setAttributeValue("4");
                    token.setlexeme("if");
                    return ++c_count;
                case 14:
                    c = data.charAt(++c_count);
                    if (c == 't') state = 15;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 15:
                    System.out.print("\bint");
                    token.setattribute("int");
               //   token.setAttributeValue("5");
                    token.setlexeme("int");
                    return ++c_count;
                case 16:
                    c = data.charAt(++c_count);
                    if (c == 'h') state = 17;
                    else {
                        token.settoken_name(null);
                        return --c_count;
                    }
                    break;
                case 17:
                    c = data.charAt(++c_count);
                    if (c == 'e') state = 18;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 18:
                    c = data.charAt(++c_count);
                    if (c == 'n') state = 19;
                    else {
                        token.settoken_name(null);
                        return c_count-3;
                    }
                    break;
                case 19:
                    System.out.print("\bthen");
                    token.setattribute("then");
               //   token.setAttributeValue("6");
                    token.setlexeme("then");
                    return ++c_count;
                case 20:
                    c = data.charAt(++c_count);
                    if (c == 'l') state = 21;
                    else {
                        token.settoken_name(null);
                        return --c_count;
                    }
                    break;
                case 21:
                    c = data.charAt(++c_count);
                    if (c == 'o') state = 22;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 22:
                    c = data.charAt(++c_count);
                    if (c == 'a') state = 23;
                    else {
                        token.settoken_name(null);
                        return c_count-3;
                    }
                    break;
                case 23:
                    c = data.charAt(++c_count);
                    if (c == 't') state = 24;
                    else {
                        token.settoken_name(null);
                        return c_count-4;
                    }
                    break;
                case 24:
                    System.out.print("\bfloat");
                    token.setattribute("float");
               //   token.setAttributeValue("7");
                    token.setlexeme("float");
                    return ++c_count;
                case 25:
                    c = data.charAt(++c_count);
                    if (c == 'h') state = 26;
                    else {
                        token.settoken_name(null);
                        return --c_count;
                    }
                    break;
                case 26:
                    c = data.charAt(++c_count);
                    if (c == 'a') state = 27;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 27:
                    c = data.charAt(++c_count);
                    if (c == 'r') state = 28;
                    else {
                        token.settoken_name(null);
                        return c_count-3;
                    }
                    break;
                case 28:
                    System.out.print("\bchar");
                    token.setattribute("char");
               //   token.setAttributeValue("8");
                    token.setlexeme("char");
                    return ++c_count;
                case 29:
                    c = data.charAt(++c_count);
                    if (c == 't') state = 30;
                    else {
                        token.settoken_name(null);
                        return --c_count;
                    }
                    break;
                case 30:
                    c = data.charAt(++c_count);
                    if (c == 'r') state = 31;
                    else {
                        token.settoken_name(null);
                        return c_count-2;
                    }
                    break;
                case 31:
                    c = data.charAt(++c_count);
                    if (c == 'i') state = 32;
                    else {
                        token.settoken_name(null);
                        return c_count-3;
                    }
                    break;
                case 32:
                    c = data.charAt(++c_count);
                    if (c == 'n') state = 33;
                    else {
                        token.settoken_name(null);
                        return c_count-4;
                    }
                    break;
                case 33:
                    c = data.charAt(++c_count);
                    if (c == 'g') state = 34;
                    else {
                        token.settoken_name(null);
                        return c_count-5;
                    }
                    break;
                case 34:
                    System.out.print("\bstring");
                    token.setattribute("string");
               //   token.setAttributeValue("9");
                    token.setlexeme("string");
                    return ++c_count;
            }
        }
    }
     
    public int recognize_usigned_int(String data,int c_count,int line_counter){
        token = new Token("UINT");
        int state = 0;
        char c;
        String uint_lexeme = "";
        while(true){
            switch(state){
                case 0: c = data.charAt(c_count);
                        if(c >= 48 && c <= 57) 
                            state = 1;
                        else{
                            token.settoken_name(null);
                            return c_count;
                        }
                        break;
                case 1: uint_lexeme=uint_lexeme+data.charAt(c_count);
                        c = data.charAt(++c_count);
                        if(c >= 48 && c <= 57){
                        System.out.print(data.charAt(c_count));
                        state = 1;  
                        }else state = 2;
                        break;
                 
                case 2: 
                        ROW_NUM++;
                        token.setattribute(""+ROW_NUM);
                      //token.setattribute("11");
                        token.setlexeme(uint_lexeme);
                        list.add(ROW_NUM,line_counter,uint_lexeme,"UNIT",""+ROW_NUM);
                        return c_count;
                
            }
        }
    }
public int recognize_string_literal(String data,int c_count,int line_counter){
       token = new Token("SLITERAL");
        int state = 0;
        char c;
        String s_lexeme = "";
        s_lexeme = s_lexeme+data.charAt(c_count);
        c_count++;
            while(data.charAt(c_count)!= '"'){
                System.out.print(data.charAt(c_count));
                s_lexeme =s_lexeme+data.charAt(c_count);
                c_count++;
            }
            
            s_lexeme =s_lexeme+data.charAt(c_count);
            System.out.print(data.charAt(c_count));
          //token.setattribute("12");
            ROW_NUM++;
            token.setattribute(""+ROW_NUM);
            token.setlexeme(s_lexeme);
            list.add(ROW_NUM,line_counter,s_lexeme,"SLITERAL",""+ROW_NUM);
            return c_count;
            
       
        
    }
    
}