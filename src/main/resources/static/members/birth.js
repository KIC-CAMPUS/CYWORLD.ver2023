$(document).ready(function () {
    // 년도, 월, 일 선택 목록을 초기화합니다.
    $('#year').append('<option value="" selected>선택</option>');
    $('#month').append('<option value="" selected>선택</option>');
    $('#day').append('<option value="" selected>선택</option>');

    for (var i = 2023; i > 1920; i--) {
        $('#year').append('<option value="' + i + '">' + i + '</option>');
    }
    
    for (var i = 1; i < 13; i++) {
        $('#month').append('<option value="' + i + '">' + i + '</option>');
    }
    
    for (var i = 1; i < 32; i++) {
        $('#day').append('<option value="' + i + '">' + i + '</option>');
    }
});

