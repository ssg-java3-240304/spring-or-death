// 비밀번호가 비밀번호 확인과 동일한지 검사
document.addEventListener('submit',(e) => {
    if($("#password").val() !== $("#confirmPassword").val()){
        alert("비밀번호가 일치하지 않습니다.");
        $("#confirmPassword").focus();
        e.preventDefault(); // 입력값이 잘못되어 폼제출을 막는다
    }
});





