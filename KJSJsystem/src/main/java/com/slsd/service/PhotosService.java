package com.slsd.service;

import java.util.List;
import java.util.Map;

import com.slsd.entity.Photos;

/**
 * 照片
 * @author Administrator
 *
 */
public interface PhotosService {
	
	/**
	 * 添加照片
	 * @param photos
	 * @return
	 */
	public boolean addPhotos(Photos photos);
	
	/**
	 * 删除照片
	 * @param pid
	 * @return
	 */
	public boolean delPhotos(int pid);
	
	/**
	 * 更新照片
	 * @param photos
	 * @return
	 */
	public boolean editPhotos(Photos photos);
	
	/**
	 * 通过pid得到单条照片信息
	 * @param pid
	 * @return
	 */
	public Photos getPhotoByPid(int pid);
	
	/**
	 * 通过puid得到该用户的所有照片
	 * @param puid
	 * @return
	 */
	public List<Photos> getPhotosByPuid(int puid);
	
	/**
	 * 通过ptid得到该说说的所有照片
	 * @param ptid
	 * @return
	 */
	public List<Photos> getPhotosByPtid(int ptid);
	
	/**
	 * 通过puid和Pgroup得到该用户的某个相册的照片
	 * @param map 0.puid 1.pgroup
	 * @return
	 */
	public List<Photos> getPhotosByPuidAndPgroup(Map<String, Object> map);
	
	/**
	 * 得到该用户的所有pgroup
	 * @param map 0.Pgroup 1.puid
	 * @return
	 */
public List<String> getPgroupByPuid(int puid);
}
