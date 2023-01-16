<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
					href="index3.html" class="nav-link">Cerca Auto</a></li>
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
						<li class="nav-item"><a href="home" class="nav-link"> <i
								class="nav-icon fas fa-th"></i>
								<p>Home</p>
						</a></li>
						<li class="nav-item"><a href="listaAuto" class="nav-link">
								<i class="nav-icon fas fa-th"></i>
								<p>Lista Automobili</p>
						</a></li>
						<li class="nav-item"><a href="aggiungiAuto" class="nav-link">
								<i class="nav-icon fas fa-th"></i>
								<p>Aggiungi Auto</p>
						</a></li>
						<li class="nav-item"><a href="cercaAuto" class="nav-link">
								<i class="nav-icon fas fa-th"></i>
								<p>Cerca Auto</p>
						</a></li>
						<li class="nav-item"><a href="dettaglioAuto" class="nav-link">
								<i class="nav-icon fas fa-th"></i>
								<p>Dettaglio Auto</p>
						</a></li>
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
							<h1>Cerca Automobile</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="clearfix">
					<div class="row">
						<div class="md-col-12 text-center">

							<form:form action="searchAuto" method="POST"
								modelAttribute="requestCercaAuto">

								<label>Targa</label>
								<form:input type="text" id="targa" name="targa" path="targa" />
								<br></br>
								<label>Costo</label>
								<form:input type="text" id="costo" name="costo" path="costo" />
								<br></br>
								<br></br>
								<form:select id="colore" name="colore" path="colore"
									class="form-control">
									<option value="">Selezionare un colore</option>
									<form:options items="${auto.colore}" />
									<option value="NERO">NERO</option>
									<option value="BIANCO">BIANCO</option>
									<option value="ROSSO">ROSSO</option>
									<option value="BLU">BLU</option>
								</form:select>
								<form:select id="costruttore" name="costruttore"
									path="costruttore" class="form-control">
									<option value="">Selezionare un costruttore</option>
									<form:options items="${auto.costruttore}" />
									<option value="BUGATTI">BUGATTI</option>
									<option value="FERRARI">FERRARI</option>
									<option value="PORSCHE">PORSCHE</option>
									<option value="LAMBORGHINI">LAMBORGHINI</option>
									<option value="MASERATI">MASERATI</option>
								</form:select>
								<form:select id="alimentazione" name="alimentazione"
									path="costruttore" class="form-control">
									<option value="">Selezionare un tipo di alimentazione</option>
									<form:options items="${auto.alimentazione}" />
									<option value="BENZINA">BENZINA</option>
									<option value="ELETTRICO">ELETTRICO</option>
									<option value="DIESEL">DIESEL</option>
									<option value="IBRIDO">IBRIDO</option>
								</form:select>
								<form:select id="modello" name="modello" path="modello"
									class="form-control">
									<option value="">Selezionare un modello</option>
									<form:options items="${auto.modello}" />
									<option value="VEYRON">VEYRON</option>
									<option value="ROMA">ROMA</option>
									<option value="MACAN">MACAN</option>
									<option value="HURACAN">HURACAN</option>
									<option value="LEVANTE">LEVANTE</option>
								</form:select>
								<br>
								<form:button class="btn btn-primary">Cerca</form:button>
							</form:form>

						</div>

					</div>
					</br>
					<table width="100%"
						class="table table-bordered table-hover dataTable dtr-inline">
						<thead>
							<td>Id</td>
							<td>Targa</td>
							<td>Costruttore</td>
							<td>Modello</td>
							<td>Anno</td>
							<td>Costo</td>
							<td>Azioni</td>
						</thead>
						<c:forEach var="auto" items="${listaAuto}">
							<tr>
								<td>${auto.id}</td>
								<td>${auto.targa}</td>
								<td>${auto.costruttore}</td>
								<td>${auto.modello}</td>
								<td>${auto.annoCostruzione}</td>
								<td>${auto.costo}</td>
								<td><a href="dettaglioAuto?id=${auto.id}"><button
											class="btn btn-primary" type="button">Dettaglio</button></a> <a
									href='rimuoviAuto?id=${auto.id}'><button
											class="btn btn-danger" type="button">Rimuovi</button></a></td>
							</tr>
						</c:forEach>

					</table>


				</div>


			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<footer class="main-footer">
			<div class="float-right d-none d-sm-block">
				<a href="www.neotech.srl">www.neotech.srl</a>
			</div>
			<strong>template</strong>
		</footer>

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
	<!-- Bootstrap 4 -->
	<script src="static/js/plugins/bootstrap/js/bootstrap.bundle.min.js"
		type="text/javascript"></script>
	<!-- AdminLTE App -->
	<script src="static/js/adminlte.min.js" type="text/javascript"></script>
	<!-- Demo Template -->
	<script src="static/js/fireAjax.js" type="text/javascript"></script>
	<script src="static/js/demoTemplate.js" type="text/javascript"></script>

</body>
</html>
