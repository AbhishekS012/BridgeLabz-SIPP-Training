
// DSA - Easy: Online Quiz Timer
class OnlineQuizTimer {
    private int[] slots;
    private int currentIndex;

    OnlineQuizTimer(int n) {
        slots = new int[n];
        for (int i = 0; i < n; i++) slots[i] = i + 1;
        currentIndex = 0;
    }

    void nextSlot() {
        System.out.println("Time for question: " + slots[currentIndex]);
        if (slots[currentIndex] == slots.length) {
            System.out.println("Warning: Last question!");
        }
        currentIndex = (currentIndex + 1) % slots.length;
    }

    public static void main(String[] args) {
        OnlineQuizTimer timer = new OnlineQuizTimer(5);
        for (int i = 0; i < 7; i++) {
            timer.nextSlot();
        }
    }
}
