let isEmailChecked =false; // 이메일 중복확인 버튼 클릭여부

// 이메일 중복체크
$("#checkEmailBtn").click(function () {
    let email = $("#memberEmail").val();

    $.ajax({
        url:"/app/member/emailCheck",
        type: "get",
        data: {email: email}, // key,value형태로 {email: 입력된 email값}이 서버에 전달됨
        success: function(response){
            console.log(response);
            if(response) { // 이메일이 중복인 경우
                alert("중복된 아이디입니다");
                isEmailChecked=false;
            }else {// 이메일 중복 아닌경우
                alert("사용 가능한 이메일입니다.");
                isEmailChecked = true;
            }
        },
        error: function() {
            alert("이메일 중복 체크 중 오류가 발생했습니다.");
            isEmailChecked = false;
        }
    })
})

// 제출 타당성 검사
document.querySelector("#memberRegistForm").addEventListener('submit',(e) => {
    // 이메일 중복 체크
    if(!isEmailChecked){
        alert("이메일 중복체크를 하십시오.")
        e.preventDefault() // 폼 제출 막기
        return ; // 추가 검사 중단
    }
    // 비밀번호가 비밀번호 확인과 동일한지 검사
    if($("#password").val() !== $("#confirmPassword").val()){
        alert("비밀번호가 일치하지 않습니다.");
        $("#confirmPassword").focus();
        e.preventDefault(); // 입력값이 잘못되면 폼제출을 막는다
        return;
    }
    alert("회원가입을 완료했습니다.")
});





