package replitQ;

public class Validatetask175 {
    /*
    We have a to do list app, every time a user adds a task - a few things needed to be checked.
It should not be empty. boolean parameter needs to be true
taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7)
 so the next task id is 8 , it can't be 10.
     */
    public static void main(String[] args) {

        boolean notEmpty = true;
        int testId = 2;
        int currentId=1;
        int result = testId-currentId;
        if(result == 1 && notEmpty){

            System.out.println(true);
        }else {
            System.out.println(false);
        }

        System.out.println("=======================");













    }

}
