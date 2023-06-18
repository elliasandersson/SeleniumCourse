package pl.coderslab.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    public void FirstTest() {
        System.out.println("Pierwszy Test Odpalony");
    }

    @Test
    public void SecondTest() {
        System.out.println("Drugi Test Odpalony");
    }

    @Test
    public void BeforEach() {
        System.out.println("Uruchomiony przed każdym testem");
    }

    @Test
    public void  AfterEach(){
        System.out.println("Uruchomiony po każdym teście");
    }

    @Test
    public void BeforeAll() {
        System.out.println("Uruchomiony przed wszystkimi");
    }

    @Test
    public void AfterAll() {
        System.out.println("Uruchomiony po wszystkich");
    }
}
