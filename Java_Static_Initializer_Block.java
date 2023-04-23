/*Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
*/
static Scanner scan=new Scanner(System.in);
 
static int B = scan.nextInt();
static int H = scan.nextInt();
static boolean flag=true;
static
{
    if(B<=0 || H<=0)
    {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        System.exit(0);
    }
}

