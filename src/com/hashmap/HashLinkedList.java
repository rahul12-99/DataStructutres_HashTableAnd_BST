package com.hashmap;

import java.util.Objects;

public class HashLinkedList {
    HashNode head;

    /**
     * Method to search for a particular key
     */
    public HashNode search(String key)
    {
        HashNode temp = head;
        while(temp != null)
        {
            if(temp.key.equals(key))
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }
    /**
     * Method to insert new key,value pair to hash table
     */
    public void add(String key, Integer value)
    {
        HashNode newNode = new HashNode(key,value,null);
        newNode.next = head;
        head = newNode;
    }
    /**
     * Method to delete node from linked list
     */
    public void deleteNode(String key)
    {
        HashNode tempNode = head;
        HashNode prevNode = head;
        while(!Objects.equals(tempNode.key, key))
        {
            prevNode = tempNode;
            tempNode = tempNode.next;
        }
        prevNode.next = tempNode.next;
    }
}
