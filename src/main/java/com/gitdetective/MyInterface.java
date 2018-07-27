package com.gitdetective;

public interface MyInterface {

    default boolean isUncommitted() {
        return !isCommitted();
    }

    boolean isCommitted();

    String getName();

    void remove(boolean doThing);

}
