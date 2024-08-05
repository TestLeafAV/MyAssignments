package week3.HomeAssignments;

public class JavaChallenge1LengthOfLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Luffy is Still joyboy";
		String[] split = text.split(" ");
		int last=split.length-1;
		int length = split[last].length();
		System.out.println(split[last]);
		System.out.println(length);
	}
}
