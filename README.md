error# myjobs
C:\Users\USER\Desktop\myjobs\app\src\main\java\com\example\myjobs\AllJobActivity.java:57: error: constructor FirebaseRecyclerAdapter in class FirebaseRecyclerAdapter<T,VH> cannot be applied to given types;
        FirebaseRecyclerAdapter<Data,AllJobPostViewHolder>adapter=new FirebaseRecyclerAdapter<Data, AllJobPostViewHolder>
                                                                  ^
  required: FirebaseRecyclerOptions<Data>
  found: Class<Data>,int,Class<AllJobPostViewHolder>,DatabaseReference
  reason: actual and formal argument lists differ in length
  where T,VH are type-variables:
    T extends Object declared in class FirebaseRecyclerAdapter
    VH extends ViewHolder declared in class FirebaseRecyclerAdapter
C:\Users\USER\Desktop\myjobs\app\src\main\java\com\example\myjobs\AllJobActivity.java:73: error: cannot find symbol
                RecyclerView.ViewHolder.setJobTitle(model.getTitle());
                                                    ^
  symbol: variable model
C:\Users\USER\Desktop\myjobs\app\src\main\java\com\example\myjobs\AllJobActivity.java:74: error: cannot find symbol
                RecyclerView.ViewHolder.setJobDate(model.getDate());
                                                   ^
  symbol: variable model
C:\Users\USER\Desktop\myjobs\app\src\main\java\com\example\myjobs\AllJobActivity.java:75: error: cannot find symbol
                RecyclerView.ViewHolder.setJobDescription(model.getDescription());
                                                          ^
  symbol: variable model
C:\Users\USER\Desktop\myjobs\app\src\main\java\com\example\myjobs\AllJobActivity.java:76: error: cannot find symbol
                RecyclerView.ViewHolder.setJobSkills(model.getSkills());
                                                     ^
  symbol: variable model
C:\Users\USER\Desktop\myjobs\app\src\main\java\com\example\myjobs\AllJobActivity.java:77: error: cannot find symbol
                RecyclerView.ViewHolder.setjobSalary(model.getSalary());
                                                     ^
  symbol: variable model
