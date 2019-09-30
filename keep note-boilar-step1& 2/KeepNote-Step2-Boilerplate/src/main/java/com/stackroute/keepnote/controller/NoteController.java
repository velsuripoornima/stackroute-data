package com.stackroute.keepnote.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.keepnote.dao.NoteDAO;
import com.stackroute.keepnote.model.Note;



/*
 * Annotate the class with @Controller annotation.@Controller annotation is used to mark
 * any POJO class as a controller so that Spring can recognize this class as a Controller
 */
@Controller
public class NoteController {
	/*
	 * From the problem statement, we can understand that the application requires
	 * us to implement the following functionalities.
	 *
	 * 1. display the list of existing notes from the persistence data. Each note
	 * should contain Note Id, title, content, status and created date.
	 * 2. Add a new note which should contain the note id, title, content and status.
	 * 3. Delete an existing note
	 * 4. Update an existing note
	 *
	 */

	/*
	 * Autowiring should be implemented for the NoteDAO.
	 *  Create a Note object.
	 *
	 */

	@Autowired
	private NoteDAO dao;

	public NoteController(NoteDAO dao) {
		this.dao = dao;
	}

	/*
	 * Define a handler method to read the existing notes from the database and add
	 * it to the ModelMap which is an implementation of Map, used when building
	 * model data for use with views. it should map to the default URL i.e. "/index"
	 */
	@RequestMapping("/")
	public String getAllNotes(ModelMap modelMap) {
		modelMap.addAttribute("noteList", dao.getAllNotes());
		return "index";
	}

	/*
	 * Define a handler method which will read the NoteTitle, NoteContent,
	 * NoteStatus from request parameters and save the note in note table in
	 * database. Please note that the CreatedAt should always be auto populated with
	 * system time and should not be accepted from the user. Also, after saving the
	 * note, it should show the same along with existing messages. Hence, reading
	 * note has to be done here again and the retrieved notes object should be sent
	 * back to the view using ModelMap This handler method should map to the URL
	 * "/add".
	 */
	@RequestMapping("/add")
	public String addNote(ModelMap modelMap, @RequestParam String noteTitle, @RequestParam String noteContent, @RequestParam String noteStatus) {

		if(noteTitle.isEmpty() || noteContent.isEmpty() || noteStatus.isEmpty()){
			modelMap.addAttribute("errorMessage", "Fields should not be empty");
			return "index";
		} else {
			Note note = new Note();
			note.setNoteTitle(noteTitle);
			System.out.println(noteTitle);
			note.setNoteContent(noteContent);
			note.setNoteStatus(noteStatus);
			note.setCreatedAt(LocalDateTime.now());
			dao.saveNote(note);
			modelMap.addAttribute("noteList", dao.getAllNotes());
			return "redirect:/";
		}

	}

	/*
	 * Define a handler method which will read the NoteId from request parameters
	 * and remove an existing note by calling the deleteNote() method of the
	 * NoteRepository class.This handler method should map to the URL "/delete".
	 */
	@RequestMapping("/delete")
	public String deleteNote(ModelMap modelMap, @RequestParam int noteId) {
		dao.deleteNote(noteId);
		modelMap.addAttribute("noteList", dao.getAllNotes());
		return "redirect:/";
	}

	/*
	 * Define a handler method which will update the existing note. This handler
	 * method should map to the URL "/update".
	 */

	@RequestMapping("/update")
	public String updateNote(ModelMap modelMap, @RequestParam int noteId, @RequestParam String noteTitle, @RequestParam String noteContent, @RequestParam String noteStatus) {
		Note note = new Note();
		note.setNoteId(noteId);
		note.setNoteContent(noteContent);
		note.setNoteStatus(noteStatus);
		note.setNoteTitle(noteTitle);
		note.setCreatedAt(LocalDateTime.now());
		dao.UpdateNote(note);
		modelMap.addAttribute("noteList", dao.getAllNotes());
		return "redirect:/";
	}

//	@RequestMapping("/updateNote")
//	public String update(ModelMap modelMap,@RequestParam int noteId) {
//		modelMap.addAttribute("noteList", dao.getNoteById(noteId));
//		return "redirect:/";
//
//	}
}