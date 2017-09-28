<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<%@ include file="/WEB-INF/include/include-header.jspf"%>
</head>
<body>
	<form id="frm">
		<table class="board_view">
			<colgroup>
				<col width="15%" />
				<col width="35%" />
				<col width="15%" />
				<col width="35%" />
			</colgroup>
			<caption>�Խñ� ��</caption>
			<tbody>
				<tr>
					<th scope="row">�� ��ȣ</th>
					<td>${map.IDX }<input type="hidden" id="IDX" name="IDX"
						value="${map.IDX }">
					</td>
					<th scope="row">��ȸ��</th>
					<td>${map.HIT_CNT }</td>
				</tr>
				<tr>
					<th scope="row">�ۼ���</th>
					<td>${map.CREA_ID }</td>
					<th scope="row">�ۼ��ð�</th>
					<td>${map.CREA_DTM }</td>
				</tr>
				<tr>
					<th scope="row">����</th>
					<td colspan="3"><input type="text" id="TITLE" name="TITLE"
						class="wdp_90" value="${map.TITLE }" /></td>
				</tr>
				<tr>
					<td colspan="4" class="view_text"><textarea rows="20"
							cols="100" title="����" id="CONTENTS" name="CONTENTS">${map.CONTENTS }</textarea>
					</td>
				</tr>
			</tbody>
		</table>
	</form>

	<a href="#this" class="btn" id="list">�������</a>
	<a href="#this" class="btn" id="update">�����ϱ�</a>
	<a href="#this" class="btn" id="delete">�����ϱ�</a>

	<%@ include file="/WEB-INF/include/include-body.jspf"%>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#list").on("click", function(e) { //������� ��ư
				e.preventDefault();
				fn_openBoardList();
			});

			$("#update").on("click", function(e) { //�����ϱ� ��ư
				e.preventDefault();
				fn_updateBoard();
			});

			$("#delete").on("click", function(e) { //�����ϱ� ��ư
				e.preventDefault();
				fn_deleteBoard();
			});
		});

		function fn_openBoardList() {
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/sample/list' />");
			comSubmit.submit();
		}

		function fn_updateBoard() {
			var comSubmit = new ComSubmit("frm");
			comSubmit.setUrl("<c:url value='/sample/update' />");
			comSubmit.submit();
		}

		function fn_deleteBoard() {
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/sample/delete' />");
			comSubmit.addParam("IDX", $("#IDX").val());
			comSubmit.submit();

		}
	</script>
</body>
</html>