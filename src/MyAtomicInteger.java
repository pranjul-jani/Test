public final class MyAtomicInteger {

    private volatile int i;

    public MyAtomicInteger(int i) {
        this.i = i;
    }

    // get, increment and get, decrement and get


    public int getI() {
        return i;
    }

    public synchronized int incrementAndGet() {
        synchronized (this) {
            this.i = this.i + 1;
        }

        return this.i;
    }

    public synchronized int decrementAndGet() {
        synchronized (this) {
            this.i = this.i - 1;
        }

        return this.i;
    }

    public synchronized int operationAndGet(boolean flag) {
        synchronized (this) {
            if (flag) {
                this.i = this.i - 1;
            } else {
                this.i = this.i + 1;
            }
        }
        return this.i;
    }


}
