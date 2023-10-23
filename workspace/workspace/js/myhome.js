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


$(document).ready(function(){
  var editMode = false;

  // 수정하기 버튼 클릭 이벤트 처리
  $('#insert_btn').click(function(){
    var textarea = $('.info_board textarea');
    
    if (editMode) {
      textarea.prop('readonly', true);
      textarea.css('border', 'none'); // 비활성화 상태의 border 스타일
      $(this).val('수정하기');
    } else {
      textarea.prop('readonly', false);
      textarea.css('border', '1px solid #ccc'); // 활성화 상태의 border 스타일
      $(this).val('수정 완료');
    }

    editMode = !editMode;
  });
});

