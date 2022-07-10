
bject q4 extends App{
    
    def calcprofit(ticketPrice:Double,audienceCount:Double):Double={
          var _audienceCount:Double=0;
              if(ticketPrice<15){
                       _audienceCount=audienceCount+((audienceCount)*((15-ticketPrice)/5)*0.2)
                           
                           }  
                               else{
                                        _audienceCount=audienceCount-((audienceCount)*((ticketPrice-15)/5)*0.2)
                                            }
                                                (_audienceCount*ticketPrice)-500-(_audienceCount*3)
                                                    
                                                  }
     def optimize(ticketPrice:Double):Double={
           def go(tikcketPrice:Double):Double={
                   if(calcprofit(ticketPrice,120)>calcprofit(ticketPrice+5,120))  ticketPrice 
                         else optimize(ticketPrice+5)
                             }
               go(ticketPrice)
                 }

       print("You can get the maximum profit by fixing price of the ticket to ")
         print( optimize(0))
           
}   
  
