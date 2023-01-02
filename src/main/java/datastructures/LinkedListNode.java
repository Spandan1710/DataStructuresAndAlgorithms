package datastructures;

import java.util.Objects;

/**
 * A custom Node class for linked list.
 *
 * @param <T> type of payload
 * @author Spandan Dey
 */
public class LinkedListNode<T> {

    private T payload;

    private LinkedListNode<T> next;

    private LinkedListNode(T payload) {
        this.payload = payload;
        this.next = null;
    }

    /**
     * A static method to create a linked list node.
     *
     * @param payload payload for a linked list node
     * @param <T>     type of payload
     * @return a linked list node
     */
    public static <T> LinkedListNode<T> of(T payload) {
        return new LinkedListNode<>(payload);
    }

    /**
     * Checks if current node has a next or it is the last node of the linked list.
     *
     * @return true if their exist a next node.
     */
    public boolean hasNext() {
        return Objects.nonNull(this.next);
    }

    /**
     * @return the next node in the linked list. Can be null if current node is the last node.
     */
    public LinkedListNode<T> next() {
        return this.next;
    }
}
