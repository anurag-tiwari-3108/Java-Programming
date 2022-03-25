package com.codex.lang.java.oops;

import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCache {
	int capacity;
	Set<Integer> cache;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.cache = new LinkedHashSet<Integer>(capacity);

	}

	public static void main(String[] args) {
		LRUCache ca = new LRUCache(4);
		ca.refer(1);
		ca.refer(1);
		ca.refer(1);
		ca.refer(1);
		ca.refer(1);
		ca.refer(1);
		ca.refer(1);
		ca.display();
	}

	private void display() {
		// TODO Auto-generated method stub

	}

	private void refer(int key) {
		if (!get(key)) {
			put(key);
		}
	}

	public boolean get(int key) {
		if (!cache.contains(key)) {
			return false;
		}
		cache.remove(key);
		cache.add(key);

		return true;
	}

	public void put(int key) {
		if (cache.size() == capacity) {
			int firstKey = cache.iterator().next();
			cache.remove(firstKey);
		}

		cache.add(key);
	}
}
