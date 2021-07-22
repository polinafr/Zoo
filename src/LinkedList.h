#pragma once
class LinkedList
{
	class Node
	{
	public:
		int znacheniye;
		Node* adres;
	public:
		Node(int val)
		{
			znacheniye = val;
			adres = 0;
		}
	};
private:
	Node* head;
public:
	void add(int val)
	{
		Node newNode = Node(val);
		newNode.adres = head;
		head = &newNode;

	}
	void deleteValue(int val)
		;

};

