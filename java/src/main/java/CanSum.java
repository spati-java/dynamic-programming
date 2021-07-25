
public class CanSum {

    public boolean canSum(int target, int [] numbers ) {

        if(target == 0)
            return true;

        for(int i = 0; i < numbers.length; i++) {
            int reminder = target - numbers[i];
            if(canSum(reminder, numbers) == true) {
                return true;
            }
        }

        return false;
    }
}
