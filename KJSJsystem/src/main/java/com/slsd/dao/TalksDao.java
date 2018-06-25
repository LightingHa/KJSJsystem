package com.slsd.dao;

import java.util.List;
import java.util.Map;

import com.slsd.entity.Talks;

/**
 * 说说表
 * @author Administrator
 *
 */
public interface TalksDao {
	
	/**
	 * 添加说说信息
	 * @param talks 说说信息
	 * @return 被操作的行数
	 */
	public int addTalks(Talks talks);
	
	/**
	 * 删除说说
	 * @param tid 
	 * @return 被操作的行数
	 */
	public int delTalks(int tid);
	
	/**
	 * 更新说说信息
	 * @param talks
	 * @return 被操作的行数
	 */
	public int editTalks(Talks talks);
	
	/**
	 * 通过tuid得到该用户的所有说说
	 * @param tuid
	 * @return list集合
	 */
	public List<Talks> getTalksByTuid(int tuid);
	
	/**
	 * 通过tid得到单条说说信息
	 * @param tid
	 * @return 
	 */
	public Talks getTalksByTid(int tid);
	
	/**
	 * 分页得到该用户的所有说说（按发表时间）
	 * @param map  0.tuid 1.pageStart 2.pageSize
	 * @return
	 */
	public List<Talks> getTalksByPageAndTuidOrderByTdate(Map<String, Integer> map);
	
	
}
