// 생년월일 리스트
$(document).ready(
  function () {
      for (var i = 2023; i > 1920; i--) {
          $('#year').append('<option value="' + i + '">' + i + '</option>');
      }
      for (var i = 1; i < 13; i++) {
          $('#month').append('<option value="' + i + '">' + i + '</option>');
      }
      for (var i = 1; i < 32; i++) {
          $('#day').append('<option value="' + i + '">' + i + '</option>');
      }
  }
);

//로그아웃 메세지 출력
function logout(){
  alert("로그아웃 되었습니다.")
  location.href="login.html";
}

// 홈페이지 탭 메뉴
$(document).ready(function(){
  $('ul.tabs li').click(function(){
    var tab_id = $(this).attr('data-tab');

    $('ul.tabs li').removeClass('current');
    $('.tab-content').removeClass('current');

    $(this).addClass('current');
    $("#"+tab_id).addClass('current');
  })

  // 페이지 로드시 home_tab 활성화
  $('ul.tabs li[data-tab="home_tab"]').addClass('current');
  $('#home_tab').addClass('current');
})

// 관리 페이지 탭 메뉴
$(document).ready(function(){
  $('ul.setup_tabs li').click(function(){
      var tab_id = $(this).attr('data-tab');

      $('ul.setup_tabs li').removeClass('active');
      $('.setup-content').removeClass('active');

      $(this).addClass('active');
      $("#"+tab_id).addClass('active');
  })

  $('ul.setup_tabs li[data-tab="home_info"]').addClass('active');
  $('#home_info').addClass('active');
})




// 프로필 페이지 글 수정 작성
$(document).ready(function(){
  var editMode = false;

  $('#insert_btn').click(function(){
    var textarea = $('.info_board textarea');
    
    if (editMode) {
      textarea.prop('readonly', true);
      textarea.css('border-top', '2px solid #cacaca');
      textarea.css('border-bottom', '2px solid #cacaca');
      textarea.css('border-left', 'none');
      textarea.css('border-right', 'none');
      $(this).val('수정하기');
    } else {
      textarea.prop('readonly', false);
      textarea.css('border', '1px solid #000000');
      textarea.css('text-align', 'none')
      $(this).val('수정 완료');
    }
    editMode = !editMode;
  });
});

function autoResize(textarea) {
  textarea.style.height = 'auto';
  textarea.style.height = textarea.scrollHeight + 'px';
}

document.addEventListener('DOMContentLoaded', function() {
  var textarea = document.querySelector('.info_board textarea');
  autoResize.call(textarea);
});


// 친구신청 팝업창
  function showPopup() {
     window.open("member_List.html", "a", "width=330, height=400, left=100, top=50");
     };

//게시판 글작성
function Write(){
  var iframe = document.querySelector('.board_page iframe');
  iframe.style.display = 'block';
}

//게시판 글 작성 취소
function CloseWrite(){
  var iframe = document.querySelector('.board_page iframe');
  iframe.style.display = 'none';
}


//페이지 새로고침
function Refresh(){
  location.reload();
}

// 수정 알람창 출력
function Alert(){
  alert("수정되었습니다.")
  location.reload();
}

// 저장 알람창 출력
function Save(){
  alert("저장되었습니다.")
  location.reload();
}




// 프로필 이미지 미리보기
function readURL(input) {
  if (input.files && input.files[0]) {
    var reader = new FileReader();
    reader.onload = function(e) {
      document.getElementById('preview').src = e.target.result;
    };
    reader.readAsDataURL(input.files[0]);
  } else {
    document.getElementById('preview').src = "";
  }
}


// 게시판 공개

function Profileview() {
  var f = document.forms["form_profile"];
  var selectedValue = getSelectedRadioValue(f);

  if (selectedValue === "1") {
    document.getElementById("profile").style.display = "none";
  } else if (selectedValue === "2") {
    document.getElementById("profile").style.display = "";
  }
}

function Boardview() {
  var f = document.forms["form_board"];
  var selectedValue = getSelectedRadioValue(f);

  if (selectedValue === "1") {
    document.getElementById("board").style.display = "none";
  } else if (selectedValue === "2") {
    document.getElementById("board").style.display = "";
  }
}

function Visitview() {
  var f = document.forms["form_visit"];
  var selectedValue = getSelectedRadioValue(f);

  if (selectedValue === "1") {
    document.getElementById("visit").style.display = "none";
  } else if (selectedValue === "2") {
    document.getElementById("visit").style.display = "";
  }
}

function Setupview() {
  var f = document.forms["form_setup"];
  var selectedValue = getSelectedRadioValue(f);

  if (selectedValue === "1") {
    document.getElementById("setup").style.display = "none";
  } else if (selectedValue === "2") {
    document.getElementById("setup").style.display = "";
  }
}

function getSelectedRadioValue(form) {
  if (form && form.type) {
    for (var i = 0; i < form.type.length; i++) {
      if (form.type[i].checked) {
        return form.type[i].value;
      }
    }
  }
  return null;
}


// 테마 CSS변경
function changeThema(data){
  if(data === "기본"){
    $("#thema").attr("href", "./util/thema/basic.css");
  } else if (data === "블랙"){
    $("#thema").attr("href", "./util/thema/black.css");
  } else if (data === "화이트"){
    $("#thema").attr("href", "./util/thema/white.css");
  }
  alert("변경되었습니다.")
}

// 배경 CSS변경 
function changeBackground(data) {
  if (data === "기본") {
    $("#bg").attr("href", "./util/bg/bg.css");
  } else if (data === "배경5") {
    $("#bg").attr("href", "./util/bg/bg5.css");
  }else if (data === "배경9") {
    $("#bg").attr("href", "./util/bg/bg9.css");
 }
 alert("변경되었습니다.")
}

// 폰트 CSS변경

function changeFont(data){
  if(data === "커피"){
    $("#font").attr("href","./util/font/coffee.css");
    } else if (data === "둘기마요"){
      $("#font").attr("href","./util/font/dovemayo.css");
    }
    alert("변경되었습니다.")
  }
