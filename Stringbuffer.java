public class Stringbuffer {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("world");
		String message = sb.toString();
		System.out.println(message);



//append
        StringBuffer ab = new StringBuffer("Hello ");
		ab.append("Java");
		System.out.println(ab);


//insert

		StringBuffer cb = new StringBuffer("Hello ");
		cb.insert(1, "Java");
		// Now original string is changed
		System.out.println(cb);


//replace

		StringBuffer db = new StringBuffer("Hello");
		db.replace(1, 3, "Java");
		System.out.println(db);
	
//delete

		StringBuffer eb = new StringBuffer("Hello");
		eb.delete(1, 3);
		System.out.println(eb);
	
//reverse

		StringBuffer fb = new StringBuffer("Hello");
		fb.reverse();
		System.out.println(fb);

//capacity

		StringBuffer gb = new StringBuffer();
		System.out.println(gb.capacity());
		sb.append("Hello");
		System.out.println(gb.capacity());
		sb.append("java is my favourite language");
		System.out.println(gb.capacity());
		
    }
}