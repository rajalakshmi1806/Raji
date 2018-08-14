
public class LearningStrings {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String name= "Raji";
		char[] namechar = name.toCharArray();
		int length = name.length();
		int count=0;
		for(int i=0;i<=length;i++) {
			for(int j=length;j<=length;j--)
			{
				if(namechar[i]==namechar[j])
				{
					count++;
				}
			}
			
		}
		
	}

}
