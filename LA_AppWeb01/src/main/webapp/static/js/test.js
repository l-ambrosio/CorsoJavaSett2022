$(document).ready(function() {
	
	$("#tabella_impiccato td").hide();
    
    
    $(".btn-info").click(
	 function(){
		$("#c1").show();
	}
	
	
)
    //bind 
    $(".btn").dblclick(
		function() {
			  alert("è stato premuto un qualsiasi pulsante");
			 }	
  );
  
  //bind
  $("#pulsante_verde, #pulsante_nero").click(
  function() {
  $("#pulsante_rosso").hide();
 });


//bind.
$( "#pulsante_giallo" ).click(
	function() {
	  $("#pulsante_rosso").show();
	  $("#validationCustom01").val("ciaooooo");
	  var testo=$("#validationCustom01").val();
	  alert(testo);
	});
  
  
});
