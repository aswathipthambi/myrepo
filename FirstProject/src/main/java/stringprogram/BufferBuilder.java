package stringprogram;

public class BufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb=new StringBuffer("hello");
		StringBuilder sbl=new StringBuilder("hi");
		System.out.println(sb);
		System.out.println(sbl);

		//insert-to insert a new value to the index position
		
		System.out.println(sb.insert(5, " welcome"));
		System.out.println(sb);
		//append-new string added to existing string s last position
		
		System.out.println(sbl.append(" meenu"));
		
		//replace-to replace the string based on string and end position
		
		System.out.println(sbl.replace(3, 7, "how r u ?"));
		
		//delete-to delete the index position word or character
		
		System.out.println(sbl.delete(3, 7));
		
		//reverse-to reverese the string
		
		System.out.println(sbl.reverse());


		
		
		
		




		
		
	}

}
