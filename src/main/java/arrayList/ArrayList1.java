package arrayList;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();  //----------(1)

        System.out.println("arraylist size : " + number.size()); //----------(4)
        System.out.printf("\n");

        //add elements to ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50); //----------(2)

        System.out.println("ArrayList contains : " + number); //----------(3)
        System.out.println("arraylist size : " + number.size());
    }
    /*
        Some methods related to ArrayList
        size();
        add();
        remove();
        removeAll();
        clear();
        isEmpty();
        contains();
        index();
        set();
        get();
        equals();
        addAll();
           
    1নং সমীকরণে ArrayList এর size নির্ধারণ করে দেওয়া হয় নাই, আপনি যা elements দিবেন, তা auto add হবে।।
    2নং সমীকরণে নির্ধারণ করে দেওয়া হয়েছে, যে এই element -কে এতো নাম্বারে সেট করে দাও।।
        কোনো element কত নাম্বার স্থানে দেখতে চাও, তা নির্ধারণ করে দেওয়া যায়।।
    3নং সমীকরণের এ line ব্যবহার করলে elements কি কি আছে, তা result এ show করে।।
    4নং সমীকরণকে প্রথমেই print করে দেখানো হয়েছে, তার আগে কোন কাজ করা হয় নাই এবং ফলাফল শূন্য দেখানো হয়েছে।।
        array declare করার পর print করলে result show করবে।।
    
    বি.দ্র.: ArrayList নামে same class create করতে পারবেন না।। যদি এখানে সমস্যা না ও করে, তবে app crush করবে।।
    
    Difference between Array & ArrayList
        1. Array static হিসেবে কাজ করে, ArrayList dynamic হিসেবে কাজ করে।।
        2. Array -কে resize করা যায় না, ArrayList -কে resize করা যায় ।। 
           Array -তে size নির্ধারণ করে দিতে হয়, ArrayList -এ size নির্ধারণ করে দিতে হয় না।। 
        3. Array -এ (for, for each) loop ব্যবহার করা হয়, ArrayList -এ for each loop, iterator ব্যবহার করা হয়, ।। 
        4. Array দ্রুত কাজ করে, ArrayList অপেক্ষাকৃত slow কাজ করে।।
        5. Array -এর ক্ষেত্রে array.length ব্যবহার করা হয়,  ArrayList-এর ক্ষেত্রে array.size ব্যবহার করা হয়,
    
    ArrayList এর ক্ষে্ত্রে iterator ব্যবহার করার প্রয়োজন পড়বে, তাই iterator এর বৈশিষ্ট্য তুলে ধরা হলো;
        Iteration -কে loop(for loop, while loop, do-while loop) এর মাধ্যমে কাজ করা হয়,
        Iteration-এর ক্ষেত্রে result false হলে run থেমে যাবে,
        Iteration দ্রুত কাজ করে।।
        Code is bigger.
    
    iterator এর সাথে আরেকটি method এর বৈসাদৃশ্য আছে, নিচে তা আলোচিত হলো।।
        Iteration vs Rcursion
        Iteration -কে loop(for loop, while loop, do-while loop) এর মাধ্যমে কাজ করা হয়,
        Iteration-এর ক্ষেত্রে result false হলে run থেমে যাবে,
        Iteration দ্রুত কাজ করে।।
        Code is bigger.

        Rcursion -কে condition (if-else, switch) এর মাধ্যমে কাজ করা হয়,
        Rcursion-এর ক্ষেত্রে result true হলে run থেমে যাবে, আর false হলে পরর্বতী condition খুঁজতে থাকবে।।
        Rcursion ধীর গতিতে কাজ করে।।
        Code is smaller.
    
     */
}
