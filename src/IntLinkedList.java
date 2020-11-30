public class IntLinkedList
{
   //variables
    private Node head;

    //constructors
    public IntLinkedList()
    {
        head = null;
    }//end head constructor

    public void addANodeToStart(int addData)
    {
        head = new Node(addData, head);
    }

    //delete
    public void deleteANodeFromStart()
    {
        if (head != null)
        {
            head = head.getLink();
        }//end if head not null
        else
        {
            System.out.println("Deleting from an empty list");
            System.exit(0);
        }//end else
    }//end delete Node

    //length
    public int length()
    {
        int count = 0;
        Node position = head;
        while (position  != null)
        {
            count++;
            position = position.getLink();

        }//end while

        return count;
    }//end length method

    //hasNext
    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }//end method hasNext


    //setData
    public void setData(int oldData, int updateData)
    {
        Node position = head;
        while ( position != null)
        {
            if (position.getData() == oldData)
            {
                position.setData(updateData);
            }
            position = position.getLink();
        }
    }

    public void showList()
    {
        Node position =  head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }//end method to output list


    private class Node
    {
        //instance variables
        private int data;
        private Node link;

        //constructor
        public Node(int data, Node link)
        {
            this.data = data;
            this.link = link;
        }//end Node constructor

        //getters & setters
        public int getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }

        public void setData(int data)
        {
            this.data = data;
        }


        //toString
        public String toString()
        {
            return "data: " + data + " links to: " + link;
        }//end toString
    }// end class Node


}//end public class
