package day0318;
// 날짜를 관리하는 Calendar 클래스
// 예전에는 Date, 혹은 DateTime 클래스를 사용했으나
// 이제는 Calendar를 더 많이 쓰는 추세이다. 
// Calendar는 사실 DataTime 클래스를 상속 받아서
// 좀 더 사용자가 쓰기 편하게 만들어놓은 것이다.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Ex02Calendar {
    public static void main(String[] args) {
        
        // 캘린더 객체의 초기화는
        // 우리가 생성자를 부르는 것이 아니라
        // 캘린더 클래스 안의 getInstance() 라는 스테틱 메소드를 통해서 한다. 
        Calendar cal = Calendar.getInstance();
        
        // cal를 직접 찍어보자
        System.out.println("cal: " + cal);
        
        // Calendar 객체를 직접 찍어보면 우리가 알기 쉽게 볼 수 있는 것이 아니라
        // 내부의 필드 이름과 해당 필드의 값이 출력된다.
        // 우리가 그것을 보고 실제 우리가 필요한 정보를 한눈에 알아보기는 매우 어렵다.
        // 따라서 우리는 저기서 time 필드값을 이용하여
        // 예쁘게 출력해주어야 한다.
        // 이때는 SimpleDateformat 클래스가 필요하다.
        
        // SimpleDateFormat 객체의 생성자는 
        // 비어있는 생성자로 만들어줄수도 있지만
        // 그 안에 우리가 직접
        // 어떤 형식으로 날짜를 포멧팅 해줄지를 결정해 줄 수 있다. 
        
        // y: 년
        // M: 월
        // d: 일
        // E: 요일 
        
        // H: 0~23 기준 시
        // h: 0~12 기준 시
        // a: AM/PM
        // m: 분
        // s: 초
        
        // 위의 글자들을 조합하여 우리가 원하는 형식으로 날짜를 출력하게 셋팅을 하게 되는 것이다.
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초"); 
        
        // 위의 sdf를 사용해서 시간을 출력하면
        // "2021년 03월 18일 화요일 PM 03시 36분 30초"의 형식대로 출력이 된다.
        
        System.out.println(sdf.format(cal.getTime()));
        
        // Calendar 객체에 원하는 시간을 넣는 방법
        // 1. 1970년 01월 01일 0시 0분 부터 원하는 시간까지를 1/1000 초 단위로 구해서 직접 값을 넣는다. -> 딱 봐도 하기 싫어짐.
        // 2. 원하는 연월일 시분초에 직접 setter를 통해서 값을 넣어준다. 
        //    단 연월일시분초를 각각 넣어주는 것이 아니라
        //    (연, 월, 일) 혹은 (연, 월, 일, 시, 분, 초)를 묶어서 해주거나
        //    (저장할 필드, 값) 의 형태로 넣어주게 된다. 
        
        // A. set(int, int, int)
        cal.set(2020, 7, 25);
        System.out.println(sdf.format(cal.getTime()));
        
        // B. set(int, int, int, int, int)
        cal.set(2021, 0, 31, 20, 4);
        System.out.println(sdf.format(cal.getTime()));
        
        // C. set(int, int, int, int, int, int)
        cal.set(1999, 12, 31, 8, 28, 14);
        System.out.println(sdf.format(cal.getTime()));
        
        // D. set(int, int)
        cal.set(Calendar.MONTH, Calendar.APRIL);
        System.out.println(sdf.format(cal.getTime()));
        
        // 만약 우리가 값을 넣지 않은 필드에 현재 시간 기준의 값이 나오는 것을 원치 않으면
        // 먼저현재 저장된 값들을 싹 비워주고
        // 그 다음에 값을 넣어주면 된다.
        // 저절로 값들을 비워줄 때에는 clear() 메소드를 호출해주면 된다.
        
        cal.clear();
        cal.set(Calendar.YEAR, 2002);
        System.out.println(sdf.format(cal.getTime()));
        
        // 사용자가 입력한 스트링값도 
        // 우리가 Calendar 객체에 넣어줄 수 있다. 
        // 단 이때에는 SimpleDateFormat을 사용하여 
        // 특정 형식의 스트링 값만 바꾸도록 해야한다. 
        String str = "으하하하하하하";
        sdf = new SimpleDateFormat("yyyy.MM.dd");
        // 어떤 종류던 간에 
        // parse는 한가지 잠재적 위험요소가 존재한다. 
        // 바로 parse가 안되는 값을 바꿀려고 할때가 그 잠재적 위험요소가 된다.
        // 예시: 만약 우리가 형식을yyyy.MM.dd 라고 정해놨는데 
        //      사용자가"으하하하하하"를 바꿔달라고 요청한다면?
        // 그렇기 때문에 parse의 경우, 반드시 우리가 try/catch 라는 것을 사용해서
        // parse를 시도해보고, 만약 해당 parse가 불가능해서 에러가 발생할 시에는 
        // 이러한 코드를 대신 실행하라고 자바에게 직접 적어주어야 한다!
        
        try {
            cal.setTime(sdf.parse(str));
            System.out.println("cal.get(calendar.YEAR): " + cal.get(Calendar.YEAR));
        } catch (ParseException e) {
           System.out.println("해당 String 값은 변환할 수 없습니다!!!!");
        }
        
        // 또한 사용자가 입력한 String 값을 변환할 때 말이 안되는 경우
        // 우리가 2가지 방법으로 처리가 가능한데
        // 1. 가능한 날짜 기준으로 하여 해당 날짜 시간을 더하거나 뺀다.
        str = new String("2020.12.32");
        try {
            cal.setTime(sdf.parse(str));
            System.out.println("parse 성공");
            System.out.println(sdf.format(cal.getTime()));
        }catch(ParseException e) {
            System.out.println("parse 실패");
        }
        
        // 2. 오류를 발생시킨다. 
        //    이때에는 sdf 객체의 "유연한 모드"를 꺼야한다. 
        sdf.setLenient(false);
        str = new String("2020.12.32");
        try {
            cal.setTime(sdf.parse(str));
            System.out.println("parse 성공");
            System.out.println(sdf.format(cal.getTime()));
        }catch(ParseException e) {
            System.out.println("parse 실패");
            System.out.println("lenient 모드가 꺼져있습니다.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
