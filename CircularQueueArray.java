//A programm implements Circular Queue using array
class CircularQueue {
	int size;
	int rear;
	int front;
	int qArray[];

	CircularQueue(int size) {
		this.size = size;
		this.qArray = new int[size];
		this.rear = -1;
		this.front = -1;
	}

	void enQueue(int item) {
		if (((rear + 1) % size) == front) {
			System.out.println("Queue is full");
		} else {
			if (rear == front && front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			qArray[rear] = item;
		}
	}

	void deQueue() {
		if (rear == front && rear == -1) {
			System.out.println("Queue is empty.");
		} else {
			int item = qArray[front];
			qArray[front] = 0;//reset data
			if (rear == front) {//Queue is empty
				rear = -1;
				front = -1;
			} else {
				front = (front + 1) % size;
			}
			System.out.println(item + " is dequeued from the Queue");
		}
	}

    
    public String toString(){
         StringBuffer buf = new StringBuffer();
	     for (int item: qArray){
            if (item !=0){
               buf.append(item);
               buf.append(",");
            }
         }
   return buf.toString();
   }	
    // Display the queue
	void display() {
		int tmpfront = front;
		if (rear == front && rear == -1) {
			System.out.println("Queue is empty.");
		} else {
		    System.out.println(toString());
		}
	}

	public static void main(String[] args) {
		int size = 3;
		CircularQueue queue = new CircularQueue(size);

		queue.enQueue(5);
		queue.display();
		queue.enQueue(10);
		queue.display();
		queue.enQueue(20);
		queue.display();
		queue.enQueue(40);
		queue.display();
		queue.deQueue();
		queue.display();

	}
}
