package com.slsd.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.PhotosDao;
import com.slsd.entity.Photos;
import com.slsd.service.PhotosService;

@Service("PhotosService")
public class PhotosServiceImpl implements PhotosService {

	@Resource
	private PhotosDao photosdao;
	
	public boolean addPhotos(Photos photos) {
		return (photosdao.addPhotos(photos)>0)?true:false;
	}

	public boolean delPhotos(int pid) {
		return (photosdao.delPhotos(pid)>0)?true:false;
	}

	public boolean editPhotos(Photos photos) {
		return (photosdao.editPhotos(photos)>0)?true:false;
	}

	public Photos getPhotoByPid(int pid) {
		Photos photos=photosdao.getPhotoByPid(pid);
		return photos;
	}

	public List<Photos> getPhotosByPuid(int puid) {
		List<Photos> plist=photosdao.getPhotosByPuid(puid);
		return plist;
	}

	public List<Photos> getPhotosByPtid(int ptid) {
		List<Photos> plist=photosdao.getPhotosByPtid(ptid);
		return plist;
	}

	public List<Photos> getPhotosByPuidAndPgroup(Map<String, Object> map) {
		List<Photos> plist=photosdao.getPhotosByPuidAndPgroup(map);
		return plist;
	}

	public List<String> getPgroupByPuid(int puid) {
		List<String> slist=photosdao.getPgroupByPuid(puid);
		return slist;
	}

}
