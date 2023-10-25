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

  }