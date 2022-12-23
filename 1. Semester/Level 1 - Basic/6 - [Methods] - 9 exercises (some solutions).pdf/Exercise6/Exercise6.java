//A person is elligible to vote if his/her age is
//greater than or equal to 18. Define a method to find out if
//he/she is elligible to vote.

public class Exercise6{
   public static void main(String[] args){
      //construct persons
      Person p17 = new Person(17);
      Person p21 = new Person(21);
      
      VoteCheck vc = new VoteCheck();
      
      
      System.out.println(vc.checkVote(p17));
      System.out.println(vc.checkVote(p21));
      
      System.out.println(vc.checkVoteObject(p21));      
      
   }
}
