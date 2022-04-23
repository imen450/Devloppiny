package tn.enicarthage.services;

import java.util.List;


import tn.enicarthage.entities.chapter;

public interface IChapterService {
	
	public chapter creatChap(chapter chap);
	public List<chapter> getAllChapter();
	public boolean delete(long chapter_id);
	public boolean update(chapter chap);
	public List<String> getChapterNameByCourse(Long id_course);
}
