package FileCompression;


//This class is used to keep the characters inside the text input file
//It implements the concept of tree so we can do Heap operations in order to create the Huffman Tree

public class ByteNode implements Comparable<ByteNode>{
    Byte data;
    int frequency;
    ByteNode left;
    ByteNode right;

    public ByteNode(Byte data, int weight)
    {
        this.data=data;
        this.frequency=weight;
    }
    public int compareTo(ByteNode other)
    {
        //Comparing the frequency of this ByteNode with the input ByteNode
        return this.frequency - other.frequency;
    }
}
