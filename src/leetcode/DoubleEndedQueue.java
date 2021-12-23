package leetcode;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DoubleEndedQueue {
	private class Node implements Comparable<Node> {
		String data;
		Node nextNode;
		Node previousNode;

		Node(String data) {
			this.data = data;
			this.nextNode = this.previousNode = null;
		}

		@Override
		public int hashCode() {
			return this.data.hashCode();
		}

		@Override
		public boolean equals(Object o) {
			if ((o instanceof Node)) {
				if (((Node) (o)).data == (this.data)) {
					return true;
				}
			}
			return false;
		}

		@Override
		public int compareTo(Node o) {
			return ((Node) (o)).data.hashCode() - this.data.hashCode();
		}

	}

	TreeSet<Node> orderSet = new TreeSet<Node>();
	Node root = null;
	Node head = null;
	Node tail = null;

	DoubleEndedQueue() {

	}

	Node addToHead(Node node) {
		if (this.root == null) {
			this.root = node;
			this.head = this.tail = this.root;
			this.
			orderSet.add(this.root);
		} else {
			node.nextNode = this.head;
			node.previousNode = null;
			this.head.previousNode=node;
			head = node;
			orderSet.add(node);
		}
		return head;
	}

	Node addToTail(Node node) {
		node.previousNode = this.tail;
		node.nextNode = null;
		this.tail.nextNode = node;
		tail = node;
		orderSet.add(node);
		return tail;
	}

	Node removeFromHead() {
		Node temp = this.head.nextNode;
		this.head.nextNode.previousNode = null;
		orderSet.remove(this.head);
		head = temp;
		return head;
	}

	Node removeFromTail() {
		Node temp = this.tail.previousNode;
		this.tail.previousNode.nextNode = null;
		orderSet.remove(this.tail);
		tail = temp;
		return tail;
	}

	Node peekHighest() {
		return this.orderSet.first();
	}

	Node peekLowest() {
		return this.orderSet.last();
	}

	public static void main(String[] args) {
		DoubleEndedQueue dequeue = new DoubleEndedQueue();
		DoubleEndedQueue.Node root = dequeue.new Node("1");
		DoubleEndedQueue.Node node1 = dequeue.new Node("2");
		DoubleEndedQueue.Node node2 = dequeue.new Node("3");
		dequeue.addToHead(root);
		dequeue.addToHead(node1);
		dequeue.addToHead(node2);
		dequeue.removeFromTail();s
		dequeue.removeFromHead();
		System.out.println(dequeue.peekHighest().data);
		System.out.println(dequeue.peekLowest().data);

	}
}
