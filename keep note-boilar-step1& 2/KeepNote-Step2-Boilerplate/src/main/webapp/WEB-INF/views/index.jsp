<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">

<head>

<title>Keep-Board</title>

</head>
<body>

    <form action="add" modelAttribute="note" method="POST">

        <h4>Note Title:</h4>

        <input type="text" name="noteTitle">

        <h4>Content: </h4>

        <input type="text" name="noteContent">

        <h4>Status: </h4>

        <input type="text" name="noteStatus">

        <input type="submit" value="submit">

    </form>
    <br>
    <table border=2>

                <tr>

                    <th>ID</th>

                    <th>Note Title</th>

                    <th>Note Content</th>

                    <th>Note Status</th>

                    <th>Date of Created</th>

                    <th>Action</th>

                </tr>
                <c:forEach var="note" items="${noteList}">

                                <tr>

                                    <td>${note.getNoteId()}</td>

                                    <td>${note.getNoteTitle()}</td>

                                    <td>${note.getNoteContent()}</td>

                                    <td>${note.getNoteStatus()}</td>

                                    <td>${note.getCreatedAt()}</td>

                                    <td><a href="delete.html?noteId=${note.getNoteId()}"><button>Delete</button></a>/<a href="update.html?noteId=${note.getNoteId()}"><button>update</button></a></td>

                                </tr>

                            </c:forEach>

            </table>

</body>



</html>
