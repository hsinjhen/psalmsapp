<!-- Content Header (Page header) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section class="content-header">
	<h1>
		Agent Status <small>maintenance table for Agent Status</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
		<li><a href="#">Maintenance</a></li>
		<li class="active">Agent Status</li>
	</ol>
</section>

<!-- Main content -->
<section class="content">
	<div class="row">
		<div class="col-xs-12">
			<div class="box-body table-responsive">
				<table id="tblAgentStatus" class="table table-bordered table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>STATUS</th>
							<th>ACTIONS</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="as" items="${agentStatusList}">
							<tr id="${as.id}">
								<td>${as.id}</td>
								<td>${as.status}</td>
								<td><button type="button" class="btn btn-default"
										onclick="editAgentStatus('${as.id}');">Update</button>
									<button type="button" class="btn btn-default"
										onclick="deleteAgentStatus('${as.id}');">Delete</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<br />
			<button type="button" class="btn btn-default"
				onclick="addAgentStatus();">Add Status</button>
			<button type="button" class="btn btn-default"
				onclick="reportAgentStatus();">View Report</button>
		</div>
	</div>
</section>


<!-- MODAL FOR ADD -->
<div class="modal fade" id="modalAddAgentStatus" data-keyboard="false"
	data-backdrop="static">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button class="close" data-dismiss="modal">×</button>
				<h3 class="modal-title" id="title"></h3>
			</div>
			<div class="modal-body">
				<form action="addAgentStatus" method="POST" id="frmAddAgentStatus"
					class="form-horizontal" role="form">
					<div class="row">
						<label class="col-md-6">ID</label>
						<div class="col-md-12">
							<input type="text" class="form-control" id="id" name="id"
								placeholder="Enter Agent Status Id" disabled>
						</div>
					</div>
					<div class="row">
						<label class="col-md-6">Status</label>
						<div class="col-md-12">
							<input type="text" class="form-control" id="status" name="status"
								placeholder="Enter Status">
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					onclick="submitNewAgentStatus();">Save</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
			</div>
		</div>
	</div>
</div>

<!-- MODAL FOR EDIT -->
<div class="modal fade" id="modalEditAgentStatus" data-keyboard="false"
	data-backdrop="static">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button class="close" data-dismiss="modal">×</button>
				<h3 class="modal-title" id="title"></h3>
			</div>
			<div class="modal-body">
				<form action="editAgentStatus" method="POST" id="frmEditAgentStatus"
					class="form-horizontal" role="form">
					<div class="row">
						<label class="col-md-6">ID</label>
						<div class="col-md-12">
							<input type="text" class="form-control" id="id" name="id"
								placeholder="Enter Agent Status Id" >
						</div>
					</div>
					<div class="row">
						<label class="col-md-6">Status</label>
						<div class="col-md-12">
							<input type="text" class="form-control" id="status" name="status"
								placeholder="Enter Status">
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					onclick="submitEditAgentStatus();">Save</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
			</div>
		</div>
	</div>
</div>
<!-- /.content -->
