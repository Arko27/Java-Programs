while (number > 0 || sum > 9) 
        { 
            if (number == 0) 
            { 
                number = sum; 
                sum = 0; 
            } 
            sum += number % 10; 
            number /= 10; 
        } 
 
        // If sum = 1, it is magic number 
        if(sum == 1)