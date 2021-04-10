class Solution {
    interface Book{
        public int getRentalPrice(int day);
    }
    
    class ComicBook implements Book {
        public int getRentalPrice(int day){
            int cost = 500;
            day -= 2;
            if(day > 0)
                cost += day*200;
            return cost;
        }
    }
    
    class Novel implements Book {
        public int getRentalPrice(int day){
            int cost = 1000;
            day -= 3;
            if(day > 0)
                cost += day*300;
            return cost;
        }
    }

    public int solution(String[] bookTypes, int day) {
        Book[] books = new Book[50];
        int length = bookTypes.length;
        for(int i = 0; i < length; ++i){
            if(bookTypes[i].equals("comic"))
                books[i] = new ComicBook();
            else if(bookTypes[i].equals("novel"))
                books[i] = new Novel();   
        }
        int totalPrice = 0;
        for(int i = 0; i < length; ++i)
            totalPrice += books[i].getRentalPrice(day);
        return totalPrice;
    }
}