package day0318;
// 숙제: 정규표현식(RegEx)에 대해 조사하고 또 익숙해지세요

// String 안에 있는 다양한 메소드들을 알아보자!

public class Ex01String {
    public static void main(String[] args) {
        // 스트링이란 여러개의 문자를 한번에 관리하는 클래스이다. 
        // 스트링 클래스 안에는 여러개의 문자를 다루거나 비교하거나 확인하는데 유효한 다양한 메소드가 미리 구현되어 있다.
        
        String str1 = new String("abcDEF");
        
        // 1. charAt()
        //    스트링에 특정 인덱스에 있는 글자가 무엇인지 알려준다. 
        //    스트링은 내부적으로 일종의 char 배열이 존재하기 때문에 
        //    인덱스가 따로 존재하게 되는것이다. 
        //    다른 인덱스를 다루는 메소드 처럼 잘못된 인덱스는
        //    ArrayIndexOutOfBoundsException이 발생한다. 
        System.out.println("1. charAt()");
        System.out.println("str1.charAt(2): "+str1.charAt(2));
        System.out.println();
        
        // 2. concat()
        //    concat()은 파라미터로 들어온 글자들을 이 메소드를 실행시키는
        //    String의 뒤에 연결한다. 
        //    즉 += 연산자와 똑같다. 
        System.out.println("2. concat()");
        System.out.println("str1 " + str1);
        str1 = str1.concat("12345");
        System.out.println("str1: " + str1);
        System.out.println();
        
        // 3. endsWith()
        //    endsWith()는 파라미터로 들어온 글자(들)이 해당 스트링의 끝과 같은지 확인한다. 
        System.out.println("3. endsWith()");
        str1 = new String("abcDEF");
        System.out.println("str1.endsWith(\"F\"): " + str1.endsWith("F"));
        System.out.println("str1.endsWith(\"G\"): " + str1.endsWith("G"));
        System.out.println("str1.endsWith(\"EF\"): " + str1.endsWith("EF"));
        System.out.println("str1.endsWith(\"EG\"): " + str1.endsWith("EG"));
        
        // 4. matches()
        //    matches()는 정규표현식을 사용하여 해당 패턴과 일치하는지 확인한다. 
        System.out.println("4. matches()");
        String pattern = new String ("\\d+");
        // \\d+ 는 가장 대표적이고 흔하게 쓰이는 정규표현식인데
        // 모든 글자가 숫자로만 이루어져있는지 확인한다. 
        
        str1 = new String("12345");
        System.out.println("str1: " + str1);
        System.out.println("str1.matches(pattern): " + str1.matches(pattern));
        
        str1 = new String("abc12345");
        System.out.println("str1: " + str1);
        System.out.println("str1.matches(pattern): " + str1.matches(pattern));
        
        str1 = new String("abc");
        System.out.println("str1: " + str1);
        System.out.println("str1.matches(pattern): " + str1.matches(pattern));
        
        // 5. subString()
        //    subString()은 파라미터로 들어온 숫자부터 끝까지를 분리해서 또 다른 스트링을 만든다. 
        //    subString()은 subString(int start) 와 subString(int start, int end) 두가지가 있는데
        //    subString(int)는 해당 숫자 인덱스부터 끝까지, subString(int, int)는 해당 숫자부터 뒤에 숫자까지만 분리한다. 
        //    원본은 변하지 않는다. 
        
        str1 = new String("0123456789");
        System.out.println("5. subString()");
        System.out.println("str1.subString(3): " + str1.substring(3));
        System.out.println("str1.subString(1, 8): " + str1.substring(1, 8));
        
        // 6. toLowCase()
        //    toLowCase() 는 현재 문자열을 모두 소문자로 바꾼 문자열을 return 해준다.
        //    원본은 변하지 않는다. 
        
        str1 = new String("ABCDEfghi");
        System.out.println("6. toLowerCase()");
        System.out.println("str1.toLowerCase(): " + str1.toLowerCase());
        
        // 7. toUpperCase()
        //    toUpperCase()는 현재 문자열을 모두 대문자로 바꾼 문자열을 return 해준다.
        //    원본은 변하지 않는다. 
        System.out.println("7. toUpperCase()");
        System.out.println("str1.toUpperCase(): " + str1.toUpperCase());
        System.out.println();
        
        // 8. trim()
        //    trim()은 앞이나 뒤에 있는 공백문자를 모두 제거한 문자열을 return 해준다.
        System.out.println("8. trim()");
        str1 = new String("\t\t\t123456\t78910       \n\n");
        System.out.println("str1: " + str1);
        System.out.println("str1.trim(): " + str1.trim());
        
    }
}
