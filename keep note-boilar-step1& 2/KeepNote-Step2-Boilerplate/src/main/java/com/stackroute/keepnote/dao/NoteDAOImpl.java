package com.stackroute.keepnote.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stackroute.keepnote.model.Note;

/*
 * This class is implementing the NoteDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database
 * 					transaction. The database transaction happens inside the scope of a persistence
 * 					context.
 * */
@Repository
@Transactional
public class NoteDAOImpl implements NoteDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */

	@Autowired
	SessionFactory sessionFactory;

	public NoteDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * Save the note in the database(note) table.
	 */

	public boolean saveNote(Note note) {
	    try{
			Session session = sessionFactory.getCurrentSession();

		session.save(note);
		return true;
	    }
	    catch (Exception e){
	        return false;
        }

	}

	/*
	 * Remove the note from the database(note) table.
	 */

	public boolean deleteNote(int noteId) {
		if(getNoteById(noteId)==null) {
			return false;
		}else {
			Session session = sessionFactory.getCurrentSession();
			session.delete(getNoteById(noteId));
			return true;

		}
	}

	/*
	 * retrieve all existing notes sorted by created Date in descending
	 * order(showing latest note first)
	 */
	public List<Note> getAllNotes() {

		String hqlQuery = "FROM Note note ORDER BY note.createdAt DESC";
		List<Note> result = getSessionFactory().getCurrentSession().createQuery(hqlQuery).list();
		return result;


	}

	/*
	 * retrieve specific note from the database(note) table
	 */
	public Note getNoteById(int noteId) {
		Session session = sessionFactory.getCurrentSession();
		Note note =session.get(Note.class, noteId);
		return note;

	}

	/* Update existing note */

	public boolean UpdateNote(Note note) {

		try {
			Session session = sessionFactory.getCurrentSession();
			session.update(getNoteById(note.getNoteId()));
			return true;
		}catch (Exception exception)
		{
			exception.printStackTrace();
			return false;
		}

	}

}
