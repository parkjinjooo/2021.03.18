package board;
// User, Reply, Board 모두 활용한

// 로그인 기능, 댓글 기능이 있는 게시판 프로그램 

import java.util.ArrayList;
import java.util.Scanner;

import util.ScannerUtil;

public class BoardEx01 {
    // 댓글을 관리할 ArrayList<> 객체 replyList;
    private final static ArrayList<Reply> replylist = new ArrayList<>();
    // 회원을 관리할 ArrayList<> 객체 userList;
    private final static ArrayList<User> userlist = new ArrayList<>();
    // 게시글을 관리할 ArrayList<> 객체 boardList;
    private final static ArrayList<Board> boardlist = new ArrayList<>();
    // 입력을 담당할 Scanner 객체 scanner
    private final static Scanner scanner = new Scanner(System.in);
    // 현재 게시글 번호를 저장할 int 변수 currentBoardId
    private final static int boardId = 1;
    // 현재 댓글 번호를 저장할 int 변수 currentReplyId
    private final static int replyId = 1;
    // 현재 회원 번호를 저장할 int 변수 currentUserId
    private final static int userId = 1;
    // 현재 로그인한 회원의 정보를 저장할 user 객체 logIn
    private final static User LogIn = null;

    // 1. 맨 처음 로그인 혹은 회원 가입을 안내할
    //    index() 메소드
    private void index() {
        while (true) {
            System.out.println("===================================");
            System.out.println("       비트캠프 게시판 관리 프로그램      ");
            System.out.println("===================================");
            String message = new String("1. 로그인 2. 회원가입 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if (userChoice == 1) {
                // 로그인 메소드 실행
            } else if (userChoice == 2) {
                // 회원가입 메소드 실행
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
    }
    
    private static void logIn() {
        // 임시로 id 와 비밀번호를 저장할 User 객체 u
        User u = new User();
        // 아이디와 비밀번호를 입력 받아서
        // u에 저장한다.
        String message = new String("아이디를 입력해주세요.");
        u.setUserName(ScannerUtil.nextLine(scanner, message));
        
        message = new String("비밀번호를 입력해주세요.");
        u.setPassword(ScannerUtil.nextLine(scanner, message));
                
        // 리스트에서 id와 비밀번호가 일치하는 객체를 찾아서
        // 그 객체의 정보를 그대로 logInUser에 할당한다.
        
        
        
        
        
        
    }
    
    
    
    
    
    
    

}