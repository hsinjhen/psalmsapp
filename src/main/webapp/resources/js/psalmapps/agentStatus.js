$(document).ready(function() {
	var agentStatusTable = $("#tblAgentStatus").dataTable();
});

function clearAgentStatusForm() {
	$(".modal-body input[name='id']").val("");
	$(".modal-body input[name='status']").val("");
}

function addAgentStatus() {
	$('#modalAddAgentStatus').modal('show');
	$("#modalAddAgentStatus .modal-header #title").html('Add Agent Status');
	var lastId = $('#tblAgentStatus tr:last').attr('id');
	var addLastId = ++lastId;
	$(".modal-body input[name='id']").val(addLastId);
	$('#modalAddAgentStatus .modal-footer').css('display', 'block');
	clearAgentStatusForm();
}

function submitNewAgentStatus() {
	$
			.ajax({
				type : "POST",
				url : $("#frmAddAgentStatus").attr("action"),
				data : $("#frmAddAgentStatus").serialize(),
				dataType : 'json',
				success : function(result) {
					$("#tblAgentStatus tbody tr:last")
							.after(
									'<tr id="'
											+ result.id
											+ '">'
											+ '<td>'
											+ result.id
											+ '</td>'
											+ '<td>'
											+ result.status
											+ '</td>'
											+ '<td><button type="button" class="btn btn-default" onclick="editAgentStatus(\''
											+ result.id
											+ '\');">Update</button>'
											+ '<button type="button" class="btn btn-default" onclick="deleteAgentStatus(\''
											+ result.id
											+ '\');">Delete</button></td>'
											+ '</tr>');
				}
			});
}

function editAgentStatus(id) {

	$.ajax({
		url : "getAgentStatus/" + id,
		type : "GET",
		success : function(result) {
			$("#modalEditAgentStatus .modal-body input[name='id']").prop(
					'disabled', true);
			$("#modalEditAgentStatus .modal-body input[id='id']")
					.val(result.id);
			$("#modalEditAgentStatus .modal-body input[id='status']").val(
					result.status);
			$("#modalEditAgentStatus").modal('show');
		}
	});
	event.preventDefault();
}

function submitEditAgentStatus() {
	$("#modalEditAgentStatus .modal-body input[name='id']").prop('disabled',
			false);
	$.ajax({
		type : "POST",
		url : $("#frmEditAgentStatus").attr("action"),
		data : $("#frmEditAgentStatus").serialize(),
		dataType : "json",
		success : function(result) {
			$("#modalEditAgentStatus").modal('toggle');
			$("#tblAgentStatus tbody #" + result.id).find("td:nth-child(1)")
					.html(result.id);
			$("#tblAgentStatus tbody #" + result.id).find("td:nth-child(2)")
					.html(result.status);
			$("#modalEditAgentStatus").modal('hide');
		},
	});
	event.preventDefault();
}

function deleteAgentStatus(id) {
	$.ajax({
		url : "deleteAgentStatus/" + id,
		type : "POST",
		success : function(result) {
			$("#tblAgentStatus tbody #" + result.id).remove();
		}

	});
}

function reportAgentStatus() {
	alert("function to view the report.")
}