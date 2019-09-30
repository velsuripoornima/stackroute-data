
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KeepNote</title>
</head>
<body>
	<!-- Create a form which will have text boxes for Note ID, title, content and status along with a Send 
		 button. Handle errors like empty fields -->


        <form action="saveNote" method="POST">

       <p>NoteId:<input type="number" name="noteId"><p>

       <p>NoteContent:
        <input type="text" name="noteContent"><p>

      <p>NoteTitle:
        <input type="text" name="noteTitle"><p>

      <p>NoteStatus:
        <select name="noteStatus">
                   <option></option>
                   <option>Completed</option>
                   <option>Not-Completed</option>
                   </select></p>

       <input type="submit" value="submit"><br>

         </form>

	<!-- display all existing notes in a tabular structure with Id, Title,Content,Status, Created Date and Action -->

    <table border="1">
           <tbody>
           <tr>
           <th>noteId</th>
           <th>noteTitle</th>
           <th>noteContent</th>
           <th>noteStatus</th>
           <th>Date</th>
           </tr>
            <c:forEach var="note" items="${notes}">
              <tr>
              <td>${note.noteId}</td>
              <td>${note.noteTitle}</td>
              <td>${note.noteContent}</td>
              <td>${note.noteStatus}</td>
              <td>${note.createdAt}</td>

              <td>
           <form action="deleteNote" method="GET"><input type="hidden" name="noteId" value="${note.noteId}">
           <input type="submit" value="Delete">
           </form>
           </td>
           </tr>

           </c:forEach>
           </tbody>
           </table>

       <h1>${error}<h1>

</body>
</html>