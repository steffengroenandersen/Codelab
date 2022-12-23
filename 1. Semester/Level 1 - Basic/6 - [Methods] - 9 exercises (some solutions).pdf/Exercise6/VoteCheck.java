public class VoteCheck{
   
   public boolean checkVote(Person o){
      if(o.getAge() >= 18){
         return true;
      } else{
         return false;
      }
   }
   
   public boolean checkVoteObject(Object o){
      if(o instanceof Person){
         
         Person p = (Person)o;
         
         if( p.getAge() > 18){
            return true;
         }
      } else{
         return false;
      }
      return false;
   }


}