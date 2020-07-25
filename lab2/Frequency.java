public class Frequency  
{  
    public static void Main()  
    {  
           
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
        
        int [] fr = new int [arr.Length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.Length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.Length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                     
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        
        Console.WriteLine("---------------------");  
        Console.WriteLine(" Elmnt | Freq");  
        Console.WriteLine("---------------------");  
        for(int i = 0; i < fr.Length; i++){  
            if(fr[i] != visited)  
                Console.WriteLine("    " + arr[i] + "    |    " + fr[i]);  
        }  
        Console.WriteLine("---------------------");  
    }  
}             