package levelone;

/**
 * @category Đếm số từ xuất hiện trong một chuỗi
 * @author vuongluis
 * {@code
 * 	 Input: "Nguyen Van Vuong"
 * 	 Output: 3
 *   => Logic: Gặp khoảng trống => đếm một từ
 * 
 *   Input: "Truong Trung   Hoc   Pho Thong  Van Tuong";
 *   Output: 3
 *   => Logic: Gặp khoảng trống và ký tự tiếp theo khác trống => đếm một từ
 *   
 *   Input: " Truong THPT  Van Tuong";
 *   Output: 3
 *   => Logic: Gặp khoảng trống và ký tự tiếp theo khác trống => đếm một từ
 *   
 * }
 */
public class Algorithzm {
	
	public static int getResultProcess(String temp){
		int wordCount = 0;
		for(int index = 0; index < temp.length(); index++){
			if(index == 0){
				wordCount = 0;
			}else{
				char c = temp.charAt(index);
				if(c == ' ' && temp.charAt(index+1) != ' '){
					wordCount++;
				}
			}
		}
		return wordCount+1;
	}
	
	public static void main(String[]args){
		System.out.print("Word count: "+getResultProcess(" Truong THPT  Van Tuong"));
	}
}
