package tn.enicarthage.services;

import java.util.ArrayList;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.enicarthage.Repository.ChapterRepository;
import tn.enicarthage.Repository.CourseRepository;
import tn.enicarthage.entities.chapter;
@Service
public class ChapterServiceImpl implements IChapterService{
	
	@Autowired
	ChapterRepository CR;
	
	@Autowired
	CourseRepository cor;
	
	private static final Logger L = LogManager.getLogger(ChapterServiceImpl.class);

	@Override
	public List<chapter> getAllChapter() {
		return CR.findAll();
	}

	@Override
	public boolean delete(long chapter_id) {
		CR.deleteById(chapter_id);
		return true;
	}

	@Override
	public boolean update(chapter chap) {
		CR.save(chap);
		return true;
	}

	@Override
	public List<String> getChapterNameByCourse(long id_course) {
		List<String> chap_nom = new ArrayList<String>();
		List<chapter> chapters =cor.findById( id_course).get().getChapitres();
		for(chapter chp : chapters) {
			chap_nom.add(chp.getLabel_chap());
			L.info ("Chapter : "+ chp.getLabel_chap());
		}
		return chap_nom;
		

}

	@Override
	public chapter creatChap() {
		chapter c=new chapter();
		return CR.save(c);
		
	}}
