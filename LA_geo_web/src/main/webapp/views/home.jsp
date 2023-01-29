<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Template</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&amp;display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="static/js/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="static/css/adminlte.min.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
</head>
<body class="hold-transition sidebar-mini">
	<!-- Site wrapper -->
	<div class="wrapper">
		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a
					href="index3.html" class="nav-link">Home</a></li>
			</ul>

			<!-- Right navbar links -->
			<ul class="navbar-nav ml-auto">

			</ul>
		</nav>
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a class="brand-link"> <span class="brand-text font-weight-light">neotech</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">
				<!-- Sidebar user (optional) -->

				<!-- SidebarSearch Form -->

				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
						<li class="nav-item"><a href="#" class="nav-link"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Home <i class="right fas fa-angle-left"></i>
								</p>
						</a>
							
					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>METEO</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Meteo</li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>
			<div class="container">
				<div class="row">
				<div class="col-sm-6">
					<div class="form-group text-center">
						<label>REGIONE:</label><select id="reg_select"
							class="form-control select2 select2-hidden-accessible">
							<option></option></select>
							<label>PROVINCIA:</label>
							<select
							id="pro_select" class="form-control select2 select2-hidden-accessible">
							<option></option>
							</select>
							<label>COMUNE:</label>
							<select id="com_select"
							class="form-control select2 select2-hidden-accessible">
							<option></option></select>
				<div class="rox-sm-6">
				</div>
				</div>
					</div>
				</div>
			</div>
		<section class="content">

      <!-- Default box -->
      <div class="card">
        <div class="card-header">
          <h3 class="card-title">Comune</h3>

          <div class="card-tools">
            <button type="button" class="btn btn-tool" data-card-widget="collapse" title="Collapse">
              <i class="fas fa-minus"></i>
            </button>
            <button type="button" class="btn btn-tool" data-card-widget="remove" title="Remove">
              <i class="fas fa-times"></i>
            </button>
          </div>
        </div>
        <div class="card-body">
        <!-- OGGETTO AUTOCOMPLETE -->
         <input id="comune" name="comune" class="form-control basicAutoComplete" type="text" autocomplete="off">
         </br>
         <button type="button" id="button" class="btn btn-lg btn-primary">Previsioni</button>
       
       <table class="table table-light table-striped">
		<tr><th>Giorno</th>
		<th>Previsioni</th>
		<th>Temp max</th>
		<th>Temp min</th>
		<th>Precipitazioni</th>
		<th>Alba</th>
		<th>Tramonto</th></tr>
		<tbody id="bodyMeteo">
		</tbody>
		</table>
       
        </div>
        

    </section>
    <!-- /.content -->
  </div>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="static/js/plugins/jquery/jquery.min.js"
		type="text/javascript"></script>
	<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
	<!-- Bootstrap 4 -->
	<script src="static/js/plugins/bootstrap/js/bootstrap.bundle.min.js"
		type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="static/js/adminlte.min.js" type="text/javascript"></script>
	<!-- Demo Template -->
	<script src="static/js/fireAjax.js" type="text/javascript"></script>
	<script src="static/js/demoTemplate.js" type="text/javascript"></script>
	

<script>

$(document).ready(function(){
    $("#btnPrevisioni").prop("disabled", true);
    var listaReg;
    listaReg=fire_ajax_get("http://localhost:8080/LA_geo_ms/getListaRegioni");
    listaReg.simpleData.forEach(function(regione) {
        $("#reg_select").append(new Option(regione.idRegione, regione.regione));
    });
});


$("#reg_select").change(function(){
	    var idReg=$("#reg_select").val();
	    var listaProv;
	    $("#pro_select").empty();
	    $("#pro_select").append(new Option("Seleziona una provincia", null));
	    listaProv=fire_ajax_get("http://localhost:8080/LA_geo_ms/getListaProvince?id_regione="+idReg)
	    listaProv.simpleData.forEach(function(provincia) {
	        $("#pro_select").append(new Option(provincia.provincia, provincia.idProvincia));
	    });
	});
	
	
$("#pro_select").change(function(){
	    var idPro=$("#pro_select").val();
	    var listaProv;
	    $("#com_select").empty();
	    $("#com_select").append(new Option("Seleziona un comune", null));
	    listaCom=fire_ajax_get("http://localhost:8080/LA_geo_ms/getListaComuni?id_provincia="+idPro)
	    listaCom.simpleData.forEach(function(comune) {
	        $("#com_select").append(new Option(comune.comune, comune.idComune));
	    });
	});
	
$("#comune").autocomplete({
    source: function( request, response ) {
      $.ajax({
        url: "http://localhost:8080/LA_geo_ms/getComuneAutocomplete?text="+request.term,
        dataType: "json",
        
        success: function( data ) {
          response( data.simpleData );
        }
      });
    },
    minLength: 3,
    open: function() {
      $( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
    },
    close: function() {
      $( this ).removeClass( "ui-corner-top" ).addClass( "ui-corner-all" );
    }
  });
  

/*
 
 $("#button").click(function(){
	
	var previsioni=fire_ajax_get("http://localhost:8080/LA_geo_ms/getMeteo?istat="+istat);
	
});	
	});
	
	*/
	
</script>

</body>
</html>
