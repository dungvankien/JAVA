package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void testTriangleClassifierTest0(){
        int a=2;
        int b=2;
        int c=2;
        String expected="Tam giác điều";
        String result=TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifierTest1(){
        int a=2;
        int b=2;
        int c=3;
        String expected="Tam giác cân";
        String result=TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifierTest2(){
        int a=3;
        int b=4;
        int c=5;
        String expected="Tam giác vuông";
        String result=TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifierTest3(){
        int a=8;
        int b=2;
        int c=3;
        String expected="Không phải là tam giác";
        String result=TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifierTest4(){
        int a=-1;
        int b=2;
        int c=1;
        String expected="Không phải là tam giác";
        String result=TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifierTest5(){
        int a=0;
        int b=1;
        int c=1;
        String expected="Không phải là tam giác";
        String result=TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }
}
