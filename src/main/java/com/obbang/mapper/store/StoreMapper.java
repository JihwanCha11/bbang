package com.obbang.mapper.store;

import java.util.List;
import java.util.Map;

import com.obbang.model.Criteria;
import com.obbang.model.store.StoreVO;


public interface StoreMapper {
	
	//점포 목록
	public List<StoreVO> StoreList(Map<String, Object> map);
	/* 상품 리스트 */
	public List<StoreVO> StoreGetList(Criteria cri);
	
	/* 점포,상품 총 개수 */
	public int StoreGetTotal(Criteria cri);
	/* 점포,상품 총 개수 */
	public int StoreGetTotaladmin(Criteria cri);
	/* 점포,상품 총 개수 */
	public int StoreGetTotalMenu(Criteria cri);
	/* 상품 조회 페이지 */
	public StoreVO StoreGetDetail(int store_id);
	//상품 받기
	public List<StoreVO> storeGet(Criteria cri);
	//카테고리
	public StoreVO categoryGet(StoreVO vo);
	//점포 관리자리스트
	public List<StoreVO> StoreGetListAdmin(Criteria cri);
	//상품 조회
	public List<StoreVO> menuGet(Criteria cri);
	/* 상품 조회 페이지 */
	public StoreVO menuGetDetail(int menu_id);
	/* 점포 id 이름 */
	public StoreVO getStoreIdName(int store_id);
	//상품 조회
	public List<StoreVO> menuGetimage(Criteria cri);
	//점포 이미지
	public List<StoreVO> StoreGetimage(Criteria cri);
}
