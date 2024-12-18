# Proyek_SD_FileCompression
Proyek SD:
Theme : File Compression
Data Structure used : Heap Tree dan HashMap
Objective : Reduce the size of a file for a faster data transmission and saving storage. And for certain context,it can also be used for encryption.

Basic Concept : ASCII Characters from 1-127 are represented in 8 bits/1 byte. The assigned values for each bits in the byte,needs chart/encoder/mapping to be converted as character,otherwise it just stays as an 8 bit integer. In this assignment,we are gonna shorten the size of bits from each characters,based on the frequency of each characters.

Job desk :
- Assigning Byte Nodes with the string or array of bytes input (getByteNodes method),creating MinPriorityQueue class,creating ByteNode class,
Example : Input : AABBBCCCCC
The task : 
Assign Byte with its frequency
A : 2
B : 3
C : 5
Yang mengerjakan : 1 orang(Mike) 

- Creating HuffmanTree ()
- Traverse the HuffmanTree to assign new bits to the characters,Assign HuffmanCode as HashMap
Yang mengerjakan : 1 orang(Kenenza)


- Assign the original bytes with the HuffmanCode into HuffCodeBytes
- Give an output to the HuffmanBytes or the Bytes that has been compressed
Yang mengerjakan : 1 orang(Sherleen)

- Decompress the HuffmanBytes to the original form ( decomp method and convertByteInBit method)
Yang mengerjakan : 2 orang(Jason & Joshua)

# Class Diagram


![FileCompression_CD (1)](https://github.com/user-attachments/assets/b22dec96-6f26-4746-b10d-a195997e7a07)
