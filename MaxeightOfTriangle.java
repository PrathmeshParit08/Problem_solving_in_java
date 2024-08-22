public class MaxeightOfTriangle{


    static int maxHeight(int red,int blue){
    
                // int height =0;
        
                //     if(red==1 && (blue>1 || blue==1)){
                //         height=1;
                //     }else if(red>1 && (blue==1)){
                //         return 1;
                //     }
                //     return height;          
        
                // int height=0;
                // int rowNo=1;
                // boolean usingRed=true;
                // while(true){
                //     if(usingRed){
                //     if(red>=rowNo){
                //         red=red-rowNo;
                //     }else{
                //         break;
                //     }
                //     }
                //     else{
                //      if(blue>=rowNo){
                //         blue=blue-rowNo;
                //     }else{
                //         break;
                //     }
                //     } height++;
                //     rowNo++;
                // }return height;
        
                // if((red==1 && blue>1) || (blue==1 && (red>1))){
                //     height=2;
                // }else if(red==1 && blue==1){
                //     height=1;
                // }else if(red==blue){
                //     height=(red+blue)/2;
                // }else{
                //     height=((red+blue)/2)+1;
                // }
        
        
                // return height;
            
          int count1 =0;
                int count2=0;
              int r1=red,b1=blue;
              int r2=red,b2=blue;
                int rowNo=1;
                boolean usedBlue=true;
                boolean usedRed=true;            
                    while(r1>=0 && b1>=0){
                        count1++;
                        if(usedBlue){
                        if(b1>=count1){
                            b1=b1-count1;
                        }else{
                            break;
                        }
                    }else{
                        if(r1>=count1){
                            r1=r1-count1;
                        }else{
                            break;
                        }
                    } usedBlue=!usedBlue;
        
                }   
                    while(r2>=0 && b2>=0){
                        count2++;
                        if(usedRed){
                        if(r2>=count2){
                            r2=r2-count2;
                        }else{
                            break;
                        }
                    }else{
                        if(b2>=count2){
                            b2=b2-count2;
                        }else{
                            break;
                        }
                    } usedRed=!usedRed;
                    }
        
        
                return Math.max(count1-1, count2-1);
            }
        }