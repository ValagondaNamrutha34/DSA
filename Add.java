class Add {
    
    public void add(int... numbers) {
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i]);
            
            if (i < numbers.length - 1) {
                System.out.print("+");
            }
        }
        
        System.out.println("=" + sum);
    }
}
