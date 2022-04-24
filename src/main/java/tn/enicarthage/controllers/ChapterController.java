package tn.enicarthage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.chapter;
import tn.enicarthage.services.ChapterServiceImpl;

@RestController
@RequestMapping("/Chapter")
public class ChapterController {

	@Autowired
	ChapterServiceImpl CHS;
	
	@GetMapping("/All_Chapters")
	public List<chapter> Find_All_Chapter(){
		List<chapter> list=CHS.getAllChapter();
		return list;
	}
	@DeleteMapping("/delete/{id_chap}")
	@ResponseBody
	public boolean delete(@PathVariable("id_chap") long chapter_id) {
		return CHS.delete(chapter_id);
	}
	@PutMapping("/modify_Chapter")
	@ResponseBody
	public boolean modifyChap(@RequestBody chapter chap) {
		return CHS.update(chap);
	}
	@GetMapping("/Chapters_Name/{id_course}")
	public List<String> FindChapterNameByCourse(@PathVariable("id_course") long id_course){
		List<String> list=CHS.getChapterNameByCourse(id_course);
		return list;
	}
	@PostMapping("/Add_Chapter")
	@ResponseBody
	public chapter addChap() {
		 return CHS.creatChap();
	}
	
}
