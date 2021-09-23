import java.io.*;
import java.util.*;
public class Build
{
public static void main(String args[])
{
StringBuilder st=new StringBuilder("");
st.append("Hello");
st.append("world");
System.out.println(st);
st.insert(5,"_Oracle");
System.out.println(st);
st.replace(5,6," ");
System.out.println(st);
}
}
