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
    $("#thema").attr("href", "/util/thema/basic.css");
  } else if (data === "블랙"){
    $("#thema").attr("href", "/util/thema/black.css");
  } else if (data === "화이트"){
    $("#thema").attr("href", "/util/thema/white.css");
  }
}

// 배경 CSS변경 
function changeBackground(data) {
  if (data === "bg") {
    $("#bg").attr("href", "/util/bg/bg.css");
  } else if (data === "bg3") {
    $("#bg").attr("href", "/util/bg/bg3.css");
  } else if (data === "bg4") {
    $("#bg").attr("href", "/util/bg/bg4.css");
  } else if (data === "bg5") {
    $("#bg").attr("href", "/util/bg/bg5.css");
  } else if (data === "bg6") {
    $("#bg").attr("href", "/util/bg/bg6.css");
  } else if (data === "bg7") {
    $("#bg").attr("href", "/util/bg/bg7.css");
  } else if (data === "bg8") {
    $("#bg").attr("href", "/util/bg/bg8.css");
  } else if (data === "bg9") {
    $("#bg").attr("href", "/util/bg/bg9.css");
  } else if (data === "bg10") {
    $("#bg").attr("href", "/util/bg/bg10.css");
 }
}

// 폰트 CSS변경

function changeFont(data){
  if(data === "coffee"){
    $("#font").attr("href","/util/font/coffee.css");
  } else if (data === "dovemayo"){
    $("#font").attr("href","/util/font/dovemayo.css");
  } else if (data === "hoonjunglebook"){
    $("#font").attr("href","/util/font/hoonjunglebook.css");
  } else if (data === "malgungothic"){
    $("#font").attr("href","/util/font/malgungothic.css");
  } else if (data === "maplestory"){
    $("#font").attr("href","/util/font/maplestory.css");
  } else if (data === "typocrayon"){
    $("#font").attr("href","/util/font/typocrayon.css");
  } else if (data === "unigothic"){
    $("#font").attr("href","/util/font/unigothic.css");
   }
  }


  //미니룸 변경
function changeRoom(data){
 if(data === "basic_room"){
  $("#miniroom, #use-miniroom").attr("src","/util/room/basic_room.png");
  }else if(data === "con_room"){
  $("#miniroom, #use-miniroom").attr("src","/util/room/con_room.gif");
  }else if(data === "forest_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/forest_room.gif");
  }else if(data === "musium_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/musium_room.gif");
  }else if(data === "my_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/my_room.gif");
  }else if(data === "park_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/park_room.jpg");
  }else if(data === "park2_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/park2_room.gif");
  }else if(data === "pink_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/pink_room.png");
  }else if(data === "pink2_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/pink2_room.gif");
  }else if(data === "pocha_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/pocha_room.gif");
  }else if(data === "road_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/road_room.jpg");
  }else if(data === "store_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/store_room.gif");
  }else if(data === "study_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/study_room.gif");
  }else if(data === "winter_room"){
    $("#miniroom, #use-miniroom").attr("src","/util/room/winter_room.gif");
    }
}


  // 미니미 변경
  function changeMini(data){
    if(data === "basic_girl"){
     $("#minmi, #use-minimi").attr("src","/util/minimi/basic_girl.png");
    }else if(data === "basic_man"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/basic_man.png");
    }else if(data === "test1"){
     $("#minimi, #use-minimi").attr("src","/util/minimi/test1.gif");
    }else if(data === "test2"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test2.gif");
    }else if(data === "test3"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test3.gif");
    }else if(data === "test4"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test4.gif");
    }else if(data === "test5"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test5.gif");
    }else if(data === "test6"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test6.gif");
    }else if(data === "test7"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test7.gif");
    }else if(data === "test8"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test8.gif");
    }else if(data === "test9"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test9.gif");
    }else if(data === "test10"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test10.gif");
    }else if(data === "test11"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test11.gif");
    }else if(data === "test12"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test12.gif");
    }else if(data === "test13"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test13.gif");
    }else if(data === "test14"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test14.gif");
    }else if(data === "test15"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test15.gif");
    }else if(data === "test16"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test16.gif");
    }else if(data === "test17"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test17.gif");
    }else if(data === "test18"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test18.gif");
    }else if(data === "test19"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test19.gif");
    }else if(data === "test20"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test20.gif");
    }else if(data === "test21"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test21.gif");
    }else if(data === "test22"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test22.gif");
    }else if(data === "test23"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test23.gif");
    }else if(data === "test24"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test24.gif");
    }else if(data === "test25"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test25.gif");
    }else if(data === "test26"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test26.gif");
    }else if(data === "test27"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test27.gif");
    }else if(data === "test28"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test28.gif");
    }else if(data === "test29"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test29.gif");
    }else if(data === "test30"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test30.gif");
    }else if(data === "test31"){
      $("#minimi, #use-minimi").attr("src","/util/minimi/test31.gif");
     alert("변경되었습니다.")
   }
  }

  // 음악 변경
function changeMusic(data) {
  var audio = document.getElementById("music");

  if (data === "FT아일랜드 - 사랑앓이") {
    audio.src = "/util/music/FT아일랜드 - 사랑앓이.mp3";
  } else if(data === "프리스타일-Y"){
    audio.src = "/util/music/프리스타일-Y.mp3";
  } else if(data === "전람회 - 취중진담"){
    audio.src = "/util/music/전람회 - 취중진담.mp3";
  } else if(data === "M TO M - 세 글자"){
    audio.src = "/util/music/M TO M - 세 글자.mp3";
  } else if(data === "MCSniper-BK Love"){
    audio.src = "/util/music/MCSniper-BK Love.mp3";
  } else if(data === "PK헤만 - Evergreen"){
    audio.src = "/util/music/PK헤만 - Evergreen.mp3";
  } else if(data === "Take - 나비무덤"){
    audio.src = "/util/music/Take - 나비무덤.mp3";
  } else if(data === "Tei-사랑은 향기를 남기고"){
    audio.src = "/util/music/Tei-사랑은 향기를 남기고.mp3";
  } else if(data === "The Nuts (더 넛츠) - 사랑의 바보"){
    audio.src = "/util/music/The Nuts (더 넛츠) - 사랑의 바보.mp3";
  } else if(data === "V.One-면도"){
    audio.src = "/util/music/V.One-면도.mp3";
  } else if(data === "가비엔제이 - 해바라기"){
    audio.src = "/util/music/가비엔제이 - 해바라기.mp3";
  } else if(data === "김동희-Someday"){
    audio.src = "/util/music/김동희-Someday.mp3";
  } else if(data === "나얼 - 귀로"){
    audio.src = "/util/music/나얼 - 귀로.mp3";
  } else if(data === "러브홀릭-butterfly"){
    audio.src = "/util/music/러브홀릭-butterfly.mp3";
  } else if(data === "루그-죄"){
    audio.src = "/util/music/루그-죄.mp3";
  } else if(data === "마골피 - 비행소녀"){
    audio.src = "/util/music/마골피 - 비행소녀.mp3";
  } else if(data === "바이브 - 사진을 보다가"){
    audio.src = "/util/music/바이브 - 사진을 보다가.mp3";
  } else if(data === "박지헌 - 보고싶은날엔"){
    audio.src = "/util/music/박지헌 - 보고싶은날엔.mp3";
  } else if(data === "박효신 - 추억은 사랑을 닮아"){
    audio.src = "/util/music/박효신 - 추억은 사랑을 닮아.mp3";
  } else if(data === "백지영-사랑안해"){
    audio.src = "/util/music/백지영-사랑안해.mp3";
  } else if(data === "버즈 - 남자를 몰라"){
    audio.src = "/util/music/버즈 - 남자를 몰라.mp3";
  } else if(data === "버즈-가시"){
    audio.src = "/util/music/버즈-가시.mp3";
  } else if(data === "브라운 아이드걸스 - LOVE"){
    audio.src = "/util/music/브라운 아이드걸스 - LOVE.mp3";
  } else if(data === "브라운아이즈 - 벌써 일년"){
    audio.src = "/util/music/브라운아이즈 - 벌써 일년.mp3";
  } else if(data === "신혜성 린 - 사랑후에"){
    audio.src = "/util/music/신혜성 린 - 사랑후에.mp3";
  } else if(data === "싸이 - 낙원"){
    audio.src = "/util/music/싸이 - 낙원.mp3";
  } else if(data === "씨야 - 미친사랑의노래"){
    audio.src = "/util/music/씨야 - 미친사랑의노래.mp3";
  } else if(data === "씨야 -사랑의 인사"){
    audio.src = "/util/music/씨야 -사랑의 인사.mp3";
  } else if(data === "양정승 - 밤하늘의 별을"){
    audio.src = "/util/music/양정승 - 밤하늘의 별을.mp3";
  } else if(data === "양파 - 사랑... 그게 뭔데"){
    audio.src = "/util/music/양파 - 사랑... 그게 뭔데.mp3";
  } else if(data === "에이트-심장이없어"){
    audio.src = "/util/music/에이트-심장이없어.mp3";
  } else if(data === "에픽하이-Fly"){
    audio.src = "/util/music/에픽하이-Fly.mp3";
  } else if(data === "원투 - 못된여자2"){
    audio.src = "/util/music/원투 - 못된여자2.mp3";
  } else if(data === "윤도현 - 사랑했나봐"){
    audio.src = "/util/music/윤도현 - 사랑했나봐.mp3";
  } else if(data === "이기찬 - 또 한번 사랑은 가고"){
    audio.src = "/util/music/이기찬 - 또 한번 사랑은 가고.mp3";
  } else if(data === "이승기 - 삭제"){
    audio.src = "/util/music/이승기 - 삭제.mp3";
  } else if(data === "이지 - 응급실"){
    audio.src = "/util/music/이지 - 응급실.mp3";
  } else if(data === "장나라 - 나도 여자랍니다"){
    audio.src = "/util/music/장나라 - 나도 여자랍니다.mp3";
  } else if(data === "전람회 - 취중진담"){
    audio.src = "/util/music/전람회 - 취중진담.mp3";
  } else if(data === "정재욱 - 들리나요"){
    audio.src = "/util/music/정재욱 - 들리나요.mp3";
  } else if(data === "지아-술한잔해요"){
    audio.src = "/util/music/지아-술한잔해요.mp3";
  } else if(data === "진원 - 고칠게"){
    audio.src = "/util/music/진원 - 고칠게.mp3";
  } else if(data === "쿨 - 아로하"){
    audio.src = "/util/music/쿨 - 아로하.mp3";
  } else if(data === "팀 - 사랑합니다"){
    audio.src = "/util/music/팀 - 사랑합니다.mp3";
  } else if(data === "휘성 - 가슴 시린 이야기"){
    audio.src = "/util/music/휘성 - 가슴 시린 이야기.mp3";
  }
  audio.load();
  audio.play();
  var marquee = document.getElementById("music-title");
  marquee.textContent = data;
}




  