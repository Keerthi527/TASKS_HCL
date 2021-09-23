import java.io.*;
import java.util.*;
public class Buffer
{
public static void main(String args[])
{
StringBuffer st=new StringBuffer("");
st.append("Hello");
st.append("world");
st.insert(5,"_Oracle");
st.replace(5,6," ");
System.out.println(st.charAt(6));
st.deleteCharAt(6);
System.out.println(st);
System.out.println(st.capacity());
System.out.println(st.reverse());
}
}
