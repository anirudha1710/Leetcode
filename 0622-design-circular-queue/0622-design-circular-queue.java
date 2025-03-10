class MyCircularQueue {
  public MyCircularQueue(int k) {
    this.k = k;
    this.q = new int[k];
    this.rear = k - 1;
  }

  public boolean enQueue(int value) {
    if (isFull())
      return false;

    rear = ++rear % k;
    q[rear] = value;
    ++size;
    return true;
  }

  public boolean deQueue() {
    if (isEmpty())
      return false;

    front = ++front % k;
    --size;
    return true;
  }

  /** Get the front item from the queue. */
  public int Front() {
    return isEmpty() ? -1 : q[front];
  }

  /** Get the last item from the queue. */
  public int Rear() {
    return isEmpty() ? -1 : q[rear];
  }

  /** Checks whether the circular queue is empty or not. */
  public boolean isEmpty() {
    return size == 0;
  }

  /** Checks whether the circular queue is full or not. */
  public boolean isFull() {
    return size == k;
  }

  private final int k;
  private int[] q;
  private int size = 0;
  private int front = 0;
  private int rear;
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */