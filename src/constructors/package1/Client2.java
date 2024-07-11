package constructors.package1;

import constructors.Student;

public class Client2 {
   // Student s = new Student();  -- cannot be accessed if constructor is default

}

class Client3 extends Student {
   // Student s = new Student(); -- cannot be accessed in diff package if constructor is protected
}


