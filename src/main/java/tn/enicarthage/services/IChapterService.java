package tn.enicarthage.services;

import java.util.List;


import tn.enicarthage.entities.chapter;

public interface IChapterService {
	
	public chapter creatChap();
	public List<chapter> getAllChapter();
	public boolean delete(long chapter_id);
	public boolean update(chapter chap);
	public List<String> getChapterNameByCourse(long id_course);
}
