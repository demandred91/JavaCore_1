This program is a queue holder.
You can add elements to the end of the queue, but when you try to add an element when the queue is full (added element should make the queue bigger than its size) the first element is removed.
Initial queue size is 16. You can change it, but only once.
If you change the size of the queue and it makes it overfilled, the program removes as many elements from the head as it is needed to fot the queue into its allowed size.
Since version 0.1.2, program does not allow to change queue size to a lesser value (for example, if queue already has 5 elements, you can't change its size to 4).
USE ONLY INTEGER VALUES!!!!!