/*
/**
 *
 * @author Aibek Imanov *email: aybaexe@gmail.com date: 2022/06/21 purpose:
 * Arrays
 */
// a005_june2022 com.mthree
public class MyArrays {

    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////
// theory example 
        /*
        int [] teamScores= {2,45,4,8,99};
        int [] golScores= {72,74,68,71};
        
        int currentGolScore = golScores[0];
        for (int i = 0; i < golScores.length; i++) {
            System.out.println(golScores[i]);
        }
        //for each
        for(int currentScore : golScores){
            System.out.println(currentScore);
        }
         */
////////////////////////////////////////////////////////////////////////////////
/*
//Armstrong number 1^3 + 5^3 + 3^3 = 153(3 number) (1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407)
        
        int sum=0, number, realnumber, remaindr;
		
		for(int i=100;i<=500;i++){
			number=i;
			realnumber=i;
			sum=0;
			//System.out.println(i);
			while(number>0){
				remaindr=number%10;
				sum=sum+(remaindr*remaindr*remaindr);
				number=number/10;
			}
			if(realnumber==sum)
				System.out.println("the value "+ sum + " is armstrong number");
		}
         */
////////////////////////////////////////////////////////////////////////////////
/*        
int j;
        for (int i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                //break loop
                if (i == 2 && j == 2) {
                    continue;
                }
                System.out.println(i + "  " + j);
            }
            
        }
         */
////////////////////////////////////////////////////////////////////////////////
//Java Labeled for Loop
/*
aa:
			for(int i=1;i<=4;i++){
				for(int j=1;j<=4;j++){
					if(i==3&&j==3){
						break aa;
					}
					System.out.println(i+ " " +j);
				}
			}
         */

 /*
        int i = 0;
        whilelabel:
        while (i < 5) {
            System.out.println("outer value of i= " + i);
            i++;
            forlabel:
            for (int j = 0; j < 5; j++) {
                if (j > 0) {
//execution transfer to the for loop      
                    continue forlabel;
                }  //end of if  
                if (i > 1) {
//execution transfer to the while loop      
                    continue whilelabel;
                }  //end of if  
                System.out.println("inner value of i= " + i + ", j= " + j);
            }  //end of for  
        }  //end of while  
         */
////////////////////////////////////////////////////////////////////////////////
//NestedforLoopCascad
/*
int k=1;
		
                char ch= 65;
		int ascci= ch;
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++)
				System.out.print("*"+    " ");
		System.out.println();	
		}
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++)
				System.out.print(k+j+    " ");
		System.out.println();	
		}
		
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++)
				{System.out.print(k+    " ");
				k++;
				}
		System.out.println();	
		}
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++){
				System.out.print(ch+    " ");
                                ch++;
                        }
                      ch= 65;         
                 
                        
		System.out.println();	
		}
                ch= 65;
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++)
				{
				System.out.print(ch+    " ");
                                ++ch;
                                }
		System.out.println(); 	
		}
         */
////////////////////////////////////////////////////////////////////////////////
//sort array using Loops
/*
int a[]={33,3,4,5,0,-5,12,-15};
		int temp=0;

                for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			 }
				
		}

		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
         */
////////////////////////////////////////////////////////////////////////////////
//Initializing a Jagged Array
/*
int[][] jagged = new int[3][];

jagged[0] = new int[] { 1, 2 };
jagged[1] = new int[] { 3, 4, 5, 6 };
jagged[2] = new int[] { 7, 8, 9 };
 System.out.println(jagged[1][3]);
*/
/*
int arr[] = new int[6];

int arr[];
arr = new int[6];

int [] arr = new int[6];
*/

        String[][] jagged = {
            {"Cleveland", "Browns", "Cavas", "Indians"},
            {"Columbus", "Bluejaskets", "Buckeyes"},
            {"Pittsburg", "Steelers", "Pirates", "Penguins"}
        };

        //System.out.println(jagged[1][2]);
        for(int i=0;i<jagged.length;i++ ){
            for(int j=0;j<jagged[i].length;j++ ){
                System.out.print(jagged[i][j]+ ", ");
            }
            System.out.println(jagged.length);
            }
        

////////////////////////////////////////////////////////////////////////////////
//min max  averg sum
/*
        int a[]={33,3,4,5,0,-5,12,-15};
        
	methodArray("Min", a);
}  //end of main  
public static void methodArray(String str, int [] arr){
    if(arr==null)    }
         */
    }

}
