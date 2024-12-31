public class packages {
    public static void main(String[] args) {
        
    }
}

// java packages
// we can call the folder as package in java
// one package can be a part of another package
// under a folder we can create multiple files and assign each file package as the name of the folder
// we generally put the main file outside all the packages so that we can access each of the other class in the file
// to use the class in main we can import package.ClassName
// to import all the classes of a project we can use import package.*
// by default each java program has import java.lang.*
// package.* only import all the files and not other packages inside it




// access modifiers
/*
 * Private: same class
 * default: same class, same package subclass, same package non-subclass
 * Protected: same class, same package subclass, same package non-subclass, different package subclass
 * Public: same class, same package subclass, same package non-subclass, different package subclass, different package non-subclass
 * 
 */