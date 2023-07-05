package StacksAndQueues;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Problem: An animal shelter, which holds only dogs and cats, operates on a
 * strictly FIFO basis. People must adopt either the "oldest" (based on arrival
 * time) of all animals at the shelter, or they can select whether they would
 * prefer a dog or a cat (and recieve the oldest animal of that type). They
 * cannot select which specific animal they would like. Create the data
 * structures to maintain this system and implement operations such as enqueue,
 * dequeueAny, dequeueDog, and dequeueCat. You may use the built-in LinkedList
 * data structure.
 */
public class Q6_AnimalShelter {
    /**
     * Solution 1:
     * Use a single linked list of Shelter Animals.
     * Time Complexity:
     *      dequeueAny      0(1)
     *      dequeueDog      O(N)
     *      dequeueCat      O(N)
     * Space Complexity:    O(N) where N is the number of animals.
     *
     * CTCI improves upon this by maintaing two LinkedLists, one for cats and
     * one for dogs. This makes dequeueDog and dequeueCat O(1).
     */
    private static class ShelterAnimal {
        private String name;
        private boolean isDog;
        private Date arrivalTime;
        public ShelterAnimal(boolean isDog, String name) {
            this.name = name;
            this.isDog = isDog;
            this.arrivalTime = new Date();
        }

        public String toString() {
            return name;
        }
    }


    public static class ShelterQueue {
        private LinkedList<ShelterAnimal> queue;

        public ShelterQueue() {
            this.queue = new LinkedList<>();
        }

        public void enqueue(boolean isDog, String name) {
            queue.addLast(new ShelterAnimal(isDog, name));
        }

        public ShelterAnimal dequeueAny() {
            return queue.pollFirst();
        }

        public ShelterAnimal dequeueDog() {
            for (ShelterAnimal current : queue) {
                if (current.isDog) {
                    return current;
                }
            }
            return null;
        }

        public ShelterAnimal dequeueCat() {
            for (ShelterAnimal current : queue) {
                if (!current.isDog) {
                    return current;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ADOPTION ORDER: ");
            ListIterator<ShelterAnimal> itr = queue.listIterator();
            while (itr.hasNext()) {
                stringBuilder.append(itr.next());
                if (itr.hasNext()) {
                    stringBuilder.append(", ");
                }
            }
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        ShelterQueue queue = new ShelterQueue();
        queue.enqueue(true, "Bilbo");
        queue.enqueue(false, "SewerCat");
        queue.enqueue(false, "Gandalf");
        queue.enqueue(true, "Pippin");
        queue.enqueue(true, "Merry");
        queue.enqueue(false, "Galadriel");
        queue.enqueue(true, "Aragorn");
        System.out.println(queue);
        System.out.printf("First (ANY) to be adopted: %s\n", queue.dequeueAny());
        System.out.printf("First (DOG) to be adopted: %s\n", queue.dequeueDog());
        System.out.printf("First (CAT) to be adopted: %s\n", queue.dequeueCat());
    }

}
