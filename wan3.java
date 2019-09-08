public class wan3 {
  public static void main(String args[]) {

int wa[]={2,5,10,15,20,33,87};
int max=0;
int min=999;
int total=0;
for(int k=0;k<wa.length;k++){
 if(max<wa[k]) max=wa[k];
 if(min>wa[k]) min=wa[k];
total+=wa[k];
}
    System.out.println("max="+max);
    System.out.println("min="+min);
    System.out.println("total="+total);
}
}