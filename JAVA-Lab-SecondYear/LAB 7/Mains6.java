/*
6. **Default Method Conflicts:**
Define two interfaces `Worker` and `Manager` with conflicting default methods `work()`.
 Create a class `TeamLeader` that implements both interfaces.
 Resolve the conflict by overriding one of the methods.
 Demonstrate how conflicts are resolved when multiple default methods are inherited.
*/
class Mains6{
    public static void main(String[] args){
        TeamLeader t = new TeamLeader();
        t.work();
    }
}
interface Worker{
    public abstract void work();
}
interface Manager{
    public abstract void work();
}
class TeamLeader implements Worker, Manager{
    public void work(){
        System.out.println("Either Worker or Manager is Team Leader");
    }
}
