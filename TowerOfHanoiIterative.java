import java.util.Stack;

public class TowerOfHanoiIterative {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        // Create a stack and push initial values
        Stack<Step> stack = new Stack<>();
        stack.push(new Step(n, from_rod, to_rod, aux_rod));

        // Iterate until the stack is empty
        while (!stack.empty()) {
            Step currentStep = stack.pop();

            if (currentStep.n == 1) {
                System.out.println("Move disk 1 from the rod " + currentStep.from_rod + " to rod " + currentStep.to_rod);
            } else {
                // Push the next steps onto the stack
                stack.push(new Step(currentStep.n - 1, currentStep.aux_rod, currentStep.to_rod, currentStep.from_rod));
                stack.push(new Step(1, currentStep.from_rod, currentStep.to_rod, currentStep.aux_rod));
                stack.push(new Step(currentStep.n - 1, currentStep.from_rod, currentStep.aux_rod, currentStep.to_rod));
            }
        }
    }
    // Driver method
    public static void main(String args[]) {
        int n = 4; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
    }
    // A class to represent each step of the algorithm
    static class Step {
        int n;
        char from_rod, to_rod, aux_rod;

        public Step(int n, char from_rod, char to_rod, char aux_rod){
            this.n = n;
            this.from_rod = from_rod;
            this.to_rod = to_rod;
            this.aux_rod = aux_rod;
}
}
}
